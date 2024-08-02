import java.util.*;

public class CollectionDetails {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // Duplicate, will not be added

        // Iterating through the set
        System.out.println("Numbers in the set:"+numbers.size());
        for (Integer number : numbers) {
            System.out.println(number);
        }

        HashMap<String, Integer> ages = new HashMap<>();
        // Adding key-value pairs
        ages.put("Alice", 30);
        ages.put("Bob", 25);
        ages.put("Charlie", 35);

        // Accessing values
        System.out.println("Alice's age: " + ages.get("Alice")); // Output: 30

        // Iterating through the map
        System.out.println("All entries in the map:");
        for (String name : ages.keySet()) {
            System.out.println(name + ": " + ages.get(name));
        }

        //
        Queue<String> queue = new LinkedList<>();
        // Adding elements
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Accessing the head of the queue
        System.out.println("Head of the queue: " + queue.peek()); // Output: Alice

        // Removing elements
        System.out.println("Removed: " + queue.poll()); // Output: Alice
        System.out.println("Removed: " + queue.poll()); // Output: Bob

        // Iterating through the queue
        System.out.println("Remaining queue:");
        for (String name : queue) {
            System.out.println(name);
        }

        //

        // Creating a stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Displaying the elements in the stack
        System.out.println("Stack: " + stack); // Output: [10, 20, 30, 40]

        // Peeking at the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement); // Output: 40

        // Popping elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement); // Output: 40
        System.out.println("Stack after pop: " + stack); // Output: [10, 20, 30]

        // Checking if the stack is empty
        boolean isEmpty = stack.empty();
        System.out.println("Is stack empty? " + isEmpty); // Output: false

        // Searching for an element in the stack
        int position = stack.search(20);
        System.out.println("Position of element 20: " + position); // Output: 2 (1-based index)

        // Popping all elements to empty the stack
        while (!stack.empty()) {
            System.out.println("Popped element: " + stack.pop());
        }
        System.out.println("Is stack empty after popping all elements? " + stack.empty()); // Output: true


//
    }
}
