package org.example.project16;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        Book book = context.getBean("book", Book.class);
        universityLibrary.getBook();
        universityLibrary.addBook("Artem", book);
        universityLibrary.addMagazine();

        context.close();
    }
}
