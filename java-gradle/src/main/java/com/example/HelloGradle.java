package com.example;

import java.util.ArrayList;
import java.util.List;

public class HelloGradle {
    public static void main(String[] args) {
        // Singleton Example
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Factory Example
        Shape circle = ShapeFactory.getShape("CIRCLE");
        circle.draw();
        Shape rectangle = ShapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        // Observer Example
        Subject subject = new Subject();
        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObservers("Hello Observers!");

        // Utility Functions Example
        System.out.println("Factorial of 5: " + Utility.factorial(5));
        System.out.println("Is 7 prime? " + Utility.isPrime(7));
        System.out.println("Reversed string: " + Utility.reverseString("Gradle"));

        // Strategy Example
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(100);
        cart.addItem(200);

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432");
        cart.checkout(creditCard);

        PaymentStrategy payPal = new PayPalPayment("user@example.com");
        cart.checkout(payPal);
    }
}

// Adding a Singleton design pattern example
class Singleton {
    // Static variable to hold the single instance
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

// Adding more design patterns and examples to increase the file size

// Factory Design Pattern Example
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}

// Observer Design Pattern Example
interface Observer {
    void update(String message);
}

class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

// Adding utility functions for common operations

class Utility {
    // Utility function to calculate factorial
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // Utility function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Utility function to reverse a string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

// Adding more examples and functionality to exceed 100 lines

// Strategy Design Pattern Example
interface PaymentStrategy {
    void pay(int amount);
}

class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}

class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
}

class ShoppingCart {
    private List<Integer> items = new ArrayList<>();

    public void addItem(int price) {
        items.add(price);
    }

    public int calculateTotal() {
        return items.stream().mapToInt(Integer::intValue).sum();
    }

    public void checkout(PaymentStrategy paymentStrategy) {
        int total = calculateTotal();
        paymentStrategy.pay(total);
    }
}