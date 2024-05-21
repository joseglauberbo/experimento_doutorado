package com.example;

public class Order {
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void getShippingDetails() {
        String details = customer.getName() + ": " + customer.getFullAddress();
        System.out.println(details);
    }
}
