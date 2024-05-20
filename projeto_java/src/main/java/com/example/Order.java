package com.example;

public class Order {
    private Customer customer;

    public Order(Customer customer) {
        this.customer = customer;
    }

    public void getShippingDetails() {
        Address address = customer.getAddress();
        String details = customer.getName() + ": " + address.getStreet() + ", " + address.getCity() + ", " + address.getZipCode();
        System.out.println(details);
    }
}
