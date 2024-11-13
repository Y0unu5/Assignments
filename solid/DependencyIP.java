package com.solid;

/**
 * Dependency Inversion Principle
 * High-level classes shouldn’t depend on low-level classes. Both should depend on abstractions.
 * Abstractions shouldn’t depend on details. Details should depend on abstractions.
 *
 * Usually when designing software, you can make a distinction between two levels of classes.
 *
 * Low-level classes implement basic operations such as working with a disk, transferring data
 * over a network, connecting to a database, etc.
 * High-level classes contain complex business logic that directs low-level classes to do something.
 * Abstraction: An abstract interface or class that defines a contract or common behavior.
 * Dependency: A relationship between modules where one module relies on another.
 */
public class DependencyIP {
    public static void main(String[] args) {
        Switchable bulb = new LightBulb2();
        Switchable fan = new Fan();

        Switch2 switcher1 = new Switch2(bulb);
        Switch2 switcher2 = new Switch2(fan);

        switcher1.operate();
        switcher2.operate();
    }
}
interface Switchable {
    void turnOn();
}

class Switch2 {
    private Switchable device;

    public Switch2(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}

class LightBulb2 implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light bulb is on.");
    }
}

class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan is on.");
    }
}
/**
 * In this revised example, we have applied the Dependency Inversion Principle. The Switch2 class
 * depends on the Switchable interface (abstraction), not on concrete implementations. This allows for
 * flexibility in adding new devices that implement the Switchable interface.
 */