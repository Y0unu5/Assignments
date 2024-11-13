package com.solid;

/**
 * Liskov Substitution Principle
 * Subtypes must be substitutable for their base types without altering the correctness of the program.
 *
 * In simpler terms, if you have a base class and a derived class, you should be able to use objects
 * of the derived class wherever objects of the base class are expected without causing errors or
 * unexpected behavior. This principle ensures that inheritance hierarchies are structured correctly,
 * promoting code reusability and maintainability.
 */
public class LiskovSP {
    public static void main(String[] args) {
        Client client= new Client();
        Shape circle= new Circle();
        Shape rs= new Square();

        client.drawShape(circle);
        client.drawShape(rs);
    }
}

class Shape{
    void draw(){
        System.out.println("Drawing a Shape");
    }
}
class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing the circle");
    }
}
class Square extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing the Square");
    }
}
class Client{
    void drawShape(Shape shape){
        shape.draw();
    }
}