public abstract class Vehicle {
    // Abstract method (does not have a body)
    abstract void start();

    // Regular method
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}

 class main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start(); // Output: Car started.
        myCar.stop();  // Output: Vehicle stopped.
    }
}
