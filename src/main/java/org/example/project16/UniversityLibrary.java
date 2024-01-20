package org.example.project16;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary {

    public void addBook(String personName, Book book) {
        System.out.println("Мы добавили книгу в UniversityLibrary");
        System.out.println("---------------");
    }

    public void addMagazine() {
        System.out.println("Мы добавили журнал в UniversityLibrary");
        System.out.println("---------------");
    }

    public void getBook() {
        System.out.println("Мы взяли книгу из UniversityLibrary");
        System.out.println("---------------");
    }
}
