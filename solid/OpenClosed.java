package com.solid;

/**
 * Open/Closed Principle
 * Software entities (classes, modules, functions, etc) should be open for extension but closed for
 * modification.
 *
 * In other words, you should be able to add new functionality to a system without changing existing code.
 *
 * Open for Extension: This part of the principle means that you can add new features or behaviors
 * to your system without modifying existing code. You achieve this by creating new classes or modules
 * that extend or build upon existing ones.
 * Closed for Modification: This part emphasizes that you should avoid altering or changing the existing
 * codebase when adding new functionality. This helps maintain the stability and reliability of the
 * existing system.
 */
public class OpenClosed {
    public static void main(String[] args) {
        PaymentProcessor processor= new PaymentProcessor();
        PaymentMethod credit= new CreditCard();
        PaymentMethod paypal= new Paypal();

        processor.process(credit, 100);
        processor.process(paypal,8900);
    }
}
abstract class PaymentMethod{
   abstract void pay(double amount);
}
class CreditCard extends PaymentMethod{

    @Override
    void pay(double amount) {
        System.out.println("Paid "+ amount + " using credit card");
    }
}
class Paypal extends PaymentMethod{

    @Override
    void pay(double amount) {
        System.out.println("Paid "+ amount + " using Paypal");
    }
}
class PaymentProcessor{
    void process(PaymentMethod paymentMethod, double amount){
        paymentMethod.pay(amount);
    }
}
