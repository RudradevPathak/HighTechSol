import java.util.ArrayList;
import java.util.List;

public class Person {

    enum sex{
MALE, FEMALE;

    }
    String name;
    Integer age;
    String email;
    sex gender;

    @Override
    public String toString() {

        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    public Person() {
    }

    public Person(String name, Integer age, String email, sex gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public sex getGender() {
        return gender;
    }

    public void setGender(sex gender) {
        this.gender = gender;
    }

    public  void  printPerson(){
        System.out.println("person:"+ this.toString());
    }

    public static List<Person> createList(){

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("abc", 12, "abc@gm.com", sex.MALE));
        personList.add(new Person("pqr", 14, "pqr@gm.com", sex.MALE));
        personList.add(new Person("xyz", 20, "abc@gm.com", sex.FEMALE));
        return  personList;
    }

}
