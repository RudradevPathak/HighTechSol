// Define a generic class Box with a type parameter T
public class Box<T> {
    private T content;

    // Constructor
    public Box(T content) {
        this.content = content;
    }

    // Getter method to access the content
    public T getContent() {
        return content;
    }

    // Setter method to modify the content
    public void setContent(T content) {
        this.content = content;
    }

    // Method to display the content type and value
    public void displayContent() {
        System.out.println("Content: " + content + " (Type: " + content.getClass().getName() + ")");
    }

    public static void main(String[] args) {
        // Create a Box to hold an Integer
        Box<Integer> integerBox = new Box<>(123);
        integerBox.displayContent(); // Output: Content: 123 (Type: java.lang.Integer)

        // Create a Box to hold a String
        Box<String> stringBox = new Box<>("Hello");
        stringBox.displayContent(); // Output: Content: Hello (Type: java.lang.String)

        // Create a Box to hold a Double
        Box<Double> doubleBox = new Box<>(99.99);
        doubleBox.displayContent(); // Output: Content: 99.99 (Type: java.lang.Double)
    }
}
