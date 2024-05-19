package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Person person = new Person("John", "Doe", 30);
        printPersonDetails(person);
    }

    public static void printPersonDetails(Person person) {
        // Feature Envy: Acessa diretamente os campos de Person em vez de deixar Person fazer isso
        String details = "Name: " + person.getFirstName() + " " + person.getLastName() + ", Age: " + person.getAge();
        System.out.println(details);
    }
}
