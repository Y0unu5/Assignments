package com.java;
class Animal{
    void eat(){
        System.out.println("Eat method from Animal");
    }
}

class Cat extends Animal{
    @Override
    void eat() {
        super.eat();
        System.out.println("Eat method fromCat....");
    }
}
class Lion extends Animal{

    void roar(){
        System.out.println("Lion roars...");
    }
}
public class InheritanceEx {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();
        animal=new Lion();
        animal.eat();
        Lion lion=new Lion();
        lion.eat();
        lion.roar();

    }
}

