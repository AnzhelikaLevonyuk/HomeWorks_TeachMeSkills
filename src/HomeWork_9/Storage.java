package HomeWork_9;

import java.util.*;

public class Storage
{
    public static Map<String,Map<String,Book>> storage = new HashMap<>();

    public static void saveBook(Book book)
    {
        String author = book.getAuthor();
        if (storage.containsKey(author))
        {
            storage.get(author).put(book.getName(),book);
            System.out.println("Книга успешно добавлена в хранилище");
        }
        else
        {
            storage.put(author,new HashMap<>());
            storage.get(author).put(book.getName(),book);
            System.out.println("Книга успешно добавлена в хранилище");
        }
    }

    public static void deleteBook(String author, String bookTitle)
    {
        if (storage.containsKey(author))
        {
            Map<String,Book> books = storage.get(author);

            if (books.containsKey(bookTitle))
            {
                if (books.size() > 1)
                {
                    books.remove(bookTitle);
                    System.out.println("Книга удалена из хранилища");
                }
                else
                {
                    storage.remove(author);
                    System.out.println("Книга удалена из хранилища");
                }
            }
            else
            {
                System.out.println("Такой книги этого автора нет в хранилище");
            }
        }
        else
        {
            System.out.println("Книги такого автора нет в хранилище");
        }
    }

    public static void getBooks(String author)
    {
        if (storage.containsKey(author))
        {
            Map<String,Book> books = storage.get(author);
            System.out.println("У этого автора, есть " + books.size() + " книги: ");
            for (Map.Entry<String,Book> entry : books.entrySet())
            {
                System.out.println(entry.getKey());
            }
        }
        else
        {
            System.out.println("Книг этого автора нет в хранилище");
        }
    }
    public static void getInfoAboutBook(String author, String bookTitle)
    {
        if (storage.containsKey(author))
        {
            Map<String,Book> books = storage.get(author);
            if (books.containsKey(bookTitle))
            {
                System.out.println(books.get(bookTitle));
            }
        }
        else
        {
            System.out.println("Такой книги нет в хранилище");
        }
    }

    public static void getAuthors()
    {
        System.out.println("\nСписок всех имеющихся авторов: " + storage.keySet());
    }
}
