package com.example;

import java.util.List;

public class Library {
    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }
    
    public String getBookDetails(Book book) {
        return book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getIsbn();
    }

    // Exibe muitos detalhes da classe Book.
    public void generateLibraryReport() {
        StringBuilder report = new StringBuilder();
        for (Book book : books) {
            report.append(getBookDetails(book)).append("\n");
        }
        System.out.println(report.toString());
    }
}
