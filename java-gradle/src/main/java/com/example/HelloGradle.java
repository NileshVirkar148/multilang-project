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

        // Complex Logic Example
        ComplexLogic.executeComplexLogic(15);
        ComplexLogic.executeComplexLogic(-8);
        ComplexLogic.executeComplexLogic(0);

        // Advanced Logic Example
        AdvancedLogic.processAdvancedLogic("HelloGradle");
        AdvancedLogic.processAdvancedLogic("Java");
        AdvancedLogic.processAdvancedLogic("");

        // Nested Logic Example
        NestedLogic.evaluateNestedConditions(10, 5, 2);
        NestedLogic.evaluateNestedConditions(3, 7, 9);
        NestedLogic.evaluateNestedConditions(4, 4, 4);
    }

    // Adding 50 more methods to the HelloGradle class
    public void method1() {
        System.out.println("Method 1 executed.");
    }

    public void method2() {
        System.out.println("Method 2 executed.");
    }

    public void method3() {
        System.out.println("Method 3 executed.");
    }

    public void method4() {
        System.out.println("Method 4 executed.");
    }

    public void method5() {
        System.out.println("Method 5 executed.");
    }

    public void method6() {
        System.out.println("Method 6 executed.");
    }

    public void method7() {
        System.out.println("Method 7 executed.");
    }

    public void method8() {
        System.out.println("Method 8 executed.");
    }

    public void method9() {
        System.out.println("Method 9 executed.");
    }

    public void method10() {
        System.out.println("Method 10 executed.");
    }

    public void method11() {
        System.out.println("Method 11 executed.");
    }

    public void method12() {
        System.out.println("Method 12 executed.");
    }

    public void method13() {
        System.out.println("Method 13 executed.");
    }

    public void method14() {
        System.out.println("Method 14 executed.");
    }

    public void method15() {
        System.out.println("Method 15 executed.");
    }

    public void method16() {
        System.out.println("Method 16 executed.");
    }

    public void method17() {
        System.out.println("Method 17 executed.");
    }

    public void method18() {
        System.out.println("Method 18 executed.");
    }

    public void method19() {
        System.out.println("Method 19 executed.");
    }

    public void method20() {
        System.out.println("Method 20 executed.");
    }

    public void method21() {
        System.out.println("Method 21 executed.");
    }

    public void method22() {
        System.out.println("Method 22 executed.");
    }

    public void method23() {
        System.out.println("Method 23 executed.");
    }

    public void method24() {
        System.out.println("Method 24 executed.");
    }

    public void method25() {
        System.out.println("Method 25 executed.");
    }

    public void method26() {
        System.out.println("Method 26 executed.");
    }

    public void method27() {
        System.out.println("Method 27 executed.");
    }

    public void method28() {
        System.out.println("Method 28 executed.");
    }

    public void method29() {
        System.out.println("Method 29 executed.");
    }

    public void method30() {
        System.out.println("Method 30 executed.");
    }

    public void method31() {
        System.out.println("Method 31 executed.");
    }

    public void method32() {
        System.out.println("Method 32 executed.");
    }

    public void method33() {
        System.out.println("Method 33 executed.");
    }

    public void method34() {
        System.out.println("Method 34 executed.");
    }

    public void method35() {
        System.out.println("Method 35 executed.");
    }

    public void method36() {
        System.out.println("Method 36 executed.");
    }

    public void method37() {
        System.out.println("Method 37 executed.");
    }

    public void method38() {
        System.out.println("Method 38 executed.");
    }

    public void method39() {
        System.out.println("Method 39 executed.");
    }

    public void method40() {
        System.out.println("Method 40 executed.");
    }

    public void method41() {
        System.out.println("Method 41 executed.");
    }

    public void method42() {
        System.out.println("Method 42 executed.");
    }

    public void method43() {
        System.out.println("Method 43 executed.");
    }

    public void method44() {
        System.out.println("Method 44 executed.");
    }

    public void method45() {
        System.out.println("Method 45 executed.");
    }

    public void method46() {
        System.out.println("Method 46 executed.");
    }

    public void method47() {
        System.out.println("Method 47 executed.");
    }

    public void method48() {
        System.out.println("Method 48 executed.");
    }

    public void method49() {
        System.out.println("Method 49 executed.");
    }

    public void method50() {
        System.out.println("Method 50 executed.");
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

// Adding complex logic with multiple nested if statements
class ComplexLogic {
    public static void executeComplexLogic(int input) {
        if (input > 0) {
            if (input % 2 == 0) {
                if (input > 10) {
                    System.out.println("Input is a positive even number greater than 10.");
                } else {
                    if (input == 2) {
                        System.out.println("Input is the smallest positive even number.");
                    } else {
                        System.out.println("Input is a positive even number less than or equal to 10.");
                    }
                }
            } else {
                if (input > 10) {
                    System.out.println("Input is a positive odd number greater than 10.");
                } else {
                    if (input == 1) {
                        System.out.println("Input is the smallest positive odd number.");
                    } else {
                        System.out.println("Input is a positive odd number less than or equal to 10.");
                    }
                }
            }
        } else {
            if (input < 0) {
                if (input % 2 == 0) {
                    System.out.println("Input is a negative even number.");
                } else {
                    System.out.println("Input is a negative odd number.");
                }
            } else {
                System.out.println("Input is zero.");
            }
        }
    }
}

// Adding more complex logic to increase file size
class AdvancedLogic {
    public static void processAdvancedLogic(String input) {
        if (input != null && !input.isEmpty()) {
            if (input.length() > 5) {
                if (input.contains("Gradle")) {
                    System.out.println("Input contains the word 'Gradle' and is longer than 5 characters.");
                } else {
                    if (input.startsWith("Hello")) {
                        System.out.println("Input starts with 'Hello' and is longer than 5 characters.");
                    } else {
                        System.out.println("Input is longer than 5 characters but does not contain 'Gradle' or start with 'Hello'.");
                    }
                }
            } else {
                if (input.equals("Java")) {
                    System.out.println("Input is exactly 'Java'.");
                } else {
                    System.out.println("Input is shorter than or equal to 5 characters and is not 'Java'.");
                }
            }
        } else {
            System.out.println("Input is null or empty.");
        }
    }
}

// Adding more nested logic to further increase file size
class NestedLogic {
    public static void evaluateNestedConditions(int a, int b, int c) {
        if (a > b) {
            if (b > c) {
                if (a - b > b - c) {
                    System.out.println("a is greater than b, b is greater than c, and the difference between a and b is greater than the difference between b and c.");
                } else {
                    System.out.println("a is greater than b, b is greater than c, but the difference between a and b is not greater than the difference between b and c.");
                }
            } else {
                if (c > a) {
                    System.out.println("c is the largest number.");
                } else {
                    System.out.println("a is greater than b, but c is not the smallest number.");
                }
            }
        } else {
            if (b < c) {
                System.out.println("b is less than c.");
            } else {
                if (a == b) {
                    System.out.println("a is equal to b.");
                } else {
                    System.out.println("a is less than b, and b is greater than or equal to c.");
                }
            }
        }
    }
}