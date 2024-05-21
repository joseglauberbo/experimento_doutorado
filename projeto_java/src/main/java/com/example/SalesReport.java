package com.example;

import java.util.List;

public class SalesReport {
    private List<Product> products;

    public SalesReport(List<Product> products) {
        this.products = products;
    }

    public String generateProductSummary(Product product) {
        return product.getName() + ": " + product.getQuantitySold() + " sold, Total revenue: $" + product.getTotalRevenue();
    }

    public void generateFullReport() {
        StringBuilder report = new StringBuilder();
        for (Product product : products) {
            report.append(generateProductSummary(product)).append("\n");
        }

        System.out.println(report.toString());
    }
}
