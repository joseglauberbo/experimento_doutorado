package com.example;

import java.util.List;

public class SalesReport {
    private List<Product> products;

    public SalesReport(List<Product> products) {
        this.products = products;
    }

    public void generateFullReport() {
        StringBuilder report = new StringBuilder();
        for (Product product : products) {
            report.append(product.getSummary()).append("\n");
        }

        System.out.println(report.toString());
    }
}
