package com.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println("~~~~~~~~~");
        // Feature Envy -> Move Method.
        Person person = new Person("John", "Doe", 30);
        person.printDetails(); // Chama o método na instância de Person

        System.out.println("~~~~~~~~~");
        // Feature Envy -> Inline Method, Extract Method.
        Address address = new Address("Floriano Mendes", "Campina Grande", "58415575" );
        Customer customer = new Customer("Clara", address);
        Order order =  new Order(customer);
        order.getShippingDetails();

        System.out.println("~~~~~~~~~");
        // Feature Envy -> Inline Method
        List<Book> booksList = new ArrayList<>();
        Book book1 = new Book("Felicidade a vista", "Agatha", "978-65");
        Book book2 = new Book("Amor a vista", "Felipa", "879-65");
        booksList.add(book1);
        booksList.add(book2);
        Library library = new Library(booksList);
        library.generateLibraryReport();

        System.out.println("~~~~~~~~~");
        // Feature Envy -> Inline Method
        List<Product> productsList = new ArrayList<>();
        Product product1 = new Product("Carro", 20000, 1);
        productsList.add(product1);
        SalesReport salesRepost = new SalesReport(productsList);
        salesRepost.generateFullReport();
    }
}
