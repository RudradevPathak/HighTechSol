import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GitlabRbac {

    private static final String GITLAB_API_URL = "http://gitlab.hhstechgroup.com/api/v4";
    private static final String ACCESS_TOKEN = "cH2v1ycHVMnY6MUsMVpg";

    public static void main(String[] args) {
        try {
            Map<Integer, String> users = fetchUsers();
            Map<Integer, String> groups = fetchGroups();
            Map<Integer, Map<String, String>> userPermissions = fetchGroupMembers(groups);

            exportToCSV(users, groups, userPermissions);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Map<Integer, String> fetchUsers() throws UnirestException {
        Map<Integer, String> users = new HashMap<>();
        HttpResponse<JsonNode> response = Unirest.get(GITLAB_API_URL + "/users")
                .header("PRIVATE-TOKEN", ACCESS_TOKEN)
                .asJson();
        JSONArray userArray = response.getBody().getArray();
        for (int i = 0; i < userArray.length(); i++) {
            JSONObject user = userArray.getJSONObject(i);
            users.put(user.getInt("id"), user.getString("username"));
        }
        return users;
    }

    private static Map<Integer, String> fetchGroups() throws UnirestException {
        Map<Integer, String> groups = new HashMap<>();
        HttpResponse<JsonNode> response = Unirest.get(GITLAB_API_URL + "/groups")
                .header("PRIVATE-TOKEN", ACCESS_TOKEN)
                .asJson();
        JSONArray groupArray = response.getBody().getArray();
        for (int i = 0; i < groupArray.length(); i++) {
            JSONObject group = groupArray.getJSONObject(i);
            groups.put(group.getInt("id"), group.getString("name"));
        }
        return groups;
    }

    private static Map<Integer, Map<String, String>> fetchGroupMembers(Map<Integer, String> groups) throws UnirestException {
        Map<Integer, Map<String, String>> userPermissions = new HashMap<>();
        for (Map.Entry<Integer, String> entry : groups.entrySet()) {
            Integer id = entry.getKey();
            HttpResponse<JsonNode> response = Unirest.get(GITLAB_API_URL + "/groups/" + id + "/members")
                    .header("PRIVATE-TOKEN", ACCESS_TOKEN)
                    .asJson();
            JSONArray memberArray = response.getBody().getArray();
            for (int i = 0; i < memberArray.length(); i++) {
                JSONObject member = memberArray.getJSONObject(i);
                Integer userId = member.getInt("id");
                String accessLevel = Integer.toString(member.getInt("access_level"));
                userPermissions.computeIfAbsent(userId, k -> new HashMap<>()).put(groups.get(id), accessLevel);
            }
        }
        return userPermissions;
    }

    private static void exportToCSV(Map<Integer, String> users, Map<Integer, String> groups, Map<Integer, Map<String, String>> userPermissions) throws IOException {
        try (FileWriter csvWriter = new FileWriter("user_list.csv")) {
            csvWriter.append("User ID,Username,Group,Access Level\n");
            for (Map.Entry<Integer, String> userEntry : users.entrySet()) {
                Integer userId = userEntry.getKey();
                String username = userEntry.getValue();
                if (userPermissions.containsKey(userId)) {
                    for (Map.Entry<String, String> permEntry : userPermissions.get(userId).entrySet()) {
                        csvWriter.append(userId.toString()).append(",")
                                .append(username).append(",")
                                .append(permEntry.getKey()).append(",")
                                .append(permEntry.getValue()).append("\n");
                    }
                } else {
                    csvWriter.append(userId.toString()).append(",")
                            .append(username).append(",,\n");
                }
            }
        }
    }
}
