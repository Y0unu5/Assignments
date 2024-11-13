package com.solid;

/**
 * Interface Segregation Principle
 * Clients shouldn’t be forced to depend on methods they do not use.
 * ISP aims to reduce the dependencies between classes and interfaces, making systems more maintainable,
 * adaptable, and scalable. It discourages “fat” interfaces with many methods that may not be relevant
 * to all implementing classes.
 */
public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        // Step 3: Demonstrate the Use of Interfaces
        // Create instances of Bird and Fish.
        Bird bird = new Bird();
        Fish fish = new Fish();

        // Show how Bird can fly and walk.
        bird.fly();
        bird.walk();

        // Show how Fish can swim.
        fish.swim();
    }
}
// Step 1: Define Focused Interfaces
// Define a Flyable interface for entities that can fly
interface Flyable{
    void fly();
}
// Define a Swimmable interface for entities that can swim
interface Swimmable {
    void swim();
}
// Define a Walkable interface for entities that can walk
interface Walkable {
    void walk();
}
// Step 2: Implement Classes Using Relevant Interfaces
// Create a Bird class that implements Flyable and Walkable
class Bird implements Flyable, Walkable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void walk() {
        System.out.println("Bird is walking.");
    }
}

// Create a Fish class that implements Swimmable
class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}
/**
 * In this example:
 *
 * We start by defining focused interfaces: Eatable and Drinkable. Each interface represents
 * a specific behavior relevant to certain entities.
 * We implement classes (Fruit and Juice) using the relevant interfaces. Fruit implements Eatable,
 * while Juice implements Drinkable. This adheres to the Interface Segregation Principle, as each
 * class implements only the interfaces that are relevant to its behavior.
 * In the main method, we demonstrate how the interfaces are used. We create instances of Fruit and
 * Juice and invoke methods specific to their behaviors. Fruit can be eaten, while Juice can be drunk.
 */