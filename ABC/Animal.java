public class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

 class Main {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.sound(); // Output: Meow
    }
}
