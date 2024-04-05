package HomeWork_9;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько книг вы хотите добавить в хранилище?");
        int count = sc.nextInt();

        while (count > 0)
        {
            Book book = fillInfoAboutBook();
            Storage.saveBook(book);
            count --;
        }

        Storage.getAuthors();

        System.out.println("\nЧтобы узнать информацию о книге");
        Storage.getInfoAboutBook(getAuthor(),getBookName());

        System.out.println("\nЧтобы удалить определенную книгу");
        Storage.deleteBook(getAuthor(),getBookName());

        System.out.println("\nЧтобы просмотреть весь список книг определенного автора");
        Storage.getBooks(getAuthor());
    }

    public static Book fillInfoAboutBook()
    {
        Book newBook = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите id книги: ");
        newBook.setId(sc.nextInt());

        sc.nextLine();

        System.out.println("Введите название книги: ");
        newBook.setName(sc.nextLine());

        System.out.println("Введите описание вашей книги: ");
        newBook.setDescription(sc.nextLine());

        System.out.println("Введите автора вашей книги: ");
        newBook.setAuthor(sc.nextLine());

        return newBook;
    }

    public static String getAuthor()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите автора книги:");
        return sc.nextLine();
    }

    public static String getBookName()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите название книги:");
        return sc.nextLine();
    }
}
