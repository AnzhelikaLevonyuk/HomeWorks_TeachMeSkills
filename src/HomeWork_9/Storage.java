package HomeWork_9;

import java.util.*;

public class Storage
{
    public static Map <String, List<Book>> storage = new HashMap<>();

    public static void saveBook (Book book)
    {
        String author = book.getAuthor();
        if (storage.containsKey(author))
        {
            storage.get(author).add(book);
            System.out.println("Книга успешно добавлена в хранилище");
        }
        else
        {
            storage.computeIfAbsent(author,k-> new ArrayList<>()).add(book);
            System.out.println("Книга успешно добавлена в хранилище");
        }
    }

    public static void deleteBook (Book book)
    {
        String author = book.getAuthor();
        int countBooks = 0;
        if (storage.containsKey(author))
        {
            List<Book> books = storage.get(author);

//            long countBooks = books.stream()
//                    .map(Book :: getName)
//                    .count();

            for (Book listBooks : books)
            {
                countBooks++;
            }

            if (countBooks > 1)
            {
                storage.get(author).remove(book);
                System.out.println("Книга успешно удалена из хранилища");
            }
            else
            {
                storage.remove(author);
                System.out.println("Книга успешно удалена из хранилища");
            }
        }
        else
        {
            System.out.println("Такой книги нет в хранилище");
        }
    }

    public static void getBooks (String author)
    {
        if (storage.containsKey(author))
        {
            List<Book> books = storage.get(author);
            System.out.println("У этого автора, есть книги: ");
            for (Book book : books)
            {
                System.out.println(book.getName());
            }
        }
        else
        {
            System.out.println("Книг этого автора нет в хранилище");
        }

    }
    public static void getInfoAboutBook(Book book)
    {
        System.out.println(book);
    }

    public static void getAuthors()
    {
        System.out.println("Список всех имеющихся авторов: " + storage.keySet());
    }
}
