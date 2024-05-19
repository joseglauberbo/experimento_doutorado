package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Person person = new Person("John", "Doe", 30);
        person.printDetails(); // Chama o método na instância de Person
    }
}
