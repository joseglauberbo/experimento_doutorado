package com.example;

public class Customer {
    private String name;
    private Address address;

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    // Novo método
    public String getFullAddress() {
        return address.getStreet() + ", " + address.getCity() + ", " + address.getZipCode();
    }

}
