package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Feature Envy -> Move Method.
        Person person = new Person("John", "Doe", 30);
        person.printDetails(); // Chama o método na instância de Person

        // Feature Envy -> Inline Method, Extract Method.
        Address address = new Address("Floriano Mendes", "Campina Grande", "58415575" );
        Customer customer = new Customer("Clara", address);
        Order order =  new Order(customer);
        order.getShippingDetails();
    }
}
