// Superclass
class Animal {
    String name;

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass
class Dog extends Animal {
    public void sleep() {
        System.out.println(name + " is barking.");
    }
}

// Another Subclass
class Cat extends Animal {
    public void meow() {
        System.out.println(name + " is meowing.");
    }
}

// Main class to test the inheritance
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.eat();         // Inherited from Animal
        dog.sleep();       // Inherited from Animal
               // Specific to Dog

        Cat cat = new Cat();
        cat.name = "Whiskers";
        cat.eat();         // Inherited from Animal
        cat.sleep();       // Inherited from Animal
        cat.meow();        // Specific to Cat
    }
}
