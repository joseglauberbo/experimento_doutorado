package com.example;

import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    // Exibe muitos detalhes da classe Book.
    public void generateLibraryReport() {
        StringBuilder report = new StringBuilder();
        for (Book book : books) {
            report.append(book.getTitle())
                  .append(" by ")
                  .append(book.getAuthor())
                  .append(", ISBN: ")
                  .append(book.getIsbn())
                  .append("\n");
        }
        System.out.println(report.toString());
    }
}
