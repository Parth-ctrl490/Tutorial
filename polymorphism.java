public class Polymorphism {
    public void animal() {
        System.out.println("animal makes a sound");
    }
}

class Dog extends Polymorphism {
    @Override
    public void animal() {
        System.out.println("bow bow");
    }
}

class Cat extends Polymorphism {  // Class name should be capitalized by convention
    @Override
    public void animal() {
        System.out.println("meow");
    }
}

class Main1 {
    public static void main(String[] args) {
        Polymorphism obj1 = new Polymorphism(); // base class
        Polymorphism obj2 = new Dog();          // upcasting to base class
        Polymorphism obj3 = new Cat();          // upcasting to base class

        obj1.animal(); // Outputs: animal makes a sound
        obj2.animal(); // Outputs: bow bow
        obj3.animal(); // Outputs: meow
    }
}
