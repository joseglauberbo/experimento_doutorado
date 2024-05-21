package com.example;

public class Product {
    private String name;
    private double price;
    private int quantitySold;

    public Product(String name, double price, int quantitySold) {
        this.name = name;
        this.price = price;
        this.quantitySold = quantitySold;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public double getTotalRevenue() {
        return price * quantitySold;
    }

    // Novo método
    public String getSummary() {
        return name + ": " + quantitySold + " sold, Total revenue: $" + getTotalRevenue();
    }
}
