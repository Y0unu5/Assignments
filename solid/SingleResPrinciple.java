package com.solid;

import java.util.ArrayList;
import java.util.List;

/**
 * Single Responsibility Principle
 * A class should have just one reason to change, meaning that it should have only one responsibility or job.
 *
 * This principle encourages designing classes that are focused and cohesive, making the code easier
 * to understand, maintain, and extend. When a class has multiple responsibilities, it becomes harder
 * to change, test, and reason about. By adhering to SRP, we ensure that each class has a clear
 * and well-defined purpose. The main goal of this principle is reducing complexity. You don’t need to
 * invent a sophisticated design for a program that only has about 200 lines of code. Make a dozen methods
 * pretty, and you’ll be fine. There’s more: if a class does too many things, you have to change it every
 * time one of these things changes. While doing that, you’re risking breaking other parts of the class
 * which you didn’t even intend to change.
 */
public class SingleResPrinciple {
    public static void main(String[] args) {
        Product laptop=new Product("HP",49999.00);
        Product headPhones=new Product("Boat", 12220);

        ShoppingCart cart= new ShoppingCart();
        cart.addProduct(laptop);
        cart.addProduct(headPhones);

        OrderProcessor processor= new OrderProcessor();
        processor.processOrder(cart, "Credit Card");
        System.out.println("Total Cost: "+ cart.calcTotal());
    }
}
class Product{
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
class ShoppingCart{
    private List<Product> productList= new ArrayList<>();
    public void addProduct(Product product){
        productList.add(product);
    }
    public double calcTotal(){
       return productList.stream().mapToDouble(Product::getPrice).sum();
    }
}
class OrderProcessor{
    public void processOrder(ShoppingCart cart, String payment){
        System.out.println("Order processed: "+ payment);
    }
}
