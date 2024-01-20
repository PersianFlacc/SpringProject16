package org.example.project16;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("${nameBook}")
    private String nameBook;
    @Value("${authorBook}")
    private String authorBook;
    @Value("${yearOfPublish}")
    private int yearOfPublish;

    public String getNameBook() {
        return nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }
}
