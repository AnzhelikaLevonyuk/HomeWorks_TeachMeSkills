package HomeWork_9;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {

        Book book1 = new Book();
        book1.fillInfoAboutBook();
        Book book2 = new Book();
        book2.fillInfoAboutBook();
        Book book3 = new Book();
        book3.fillInfoAboutBook();
        Book book4 = new Book();
        book4.fillInfoAboutBook();

        Storage.saveBook(book1);
        Storage.saveBook(book2);
        Storage.saveBook(book3);
        Storage.saveBook(book4);

        Storage.getAuthors();

        Storage.getInfoAboutBook(book1);

        Storage.deleteBook(book2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите автора, чтобы просмотреть его список книг:");
        String author = sc.next();
        Storage.getBooks(author);

    }
}
