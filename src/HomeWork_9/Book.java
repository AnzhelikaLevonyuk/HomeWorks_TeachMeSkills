package HomeWork_9;

import java.util.Scanner;

public class Book
{
    private int id;
    private String name;
    private String description;
    private String author;

    public Book()
    {

    }
    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public String getAuthor()
    {
        return author;
    }

    public void fillInfoAboutBook()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите id книги: ");
        id = sc.nextInt();

        sc.nextLine();

        System.out.println("Введите название книги: ");
        name = sc.nextLine();

        System.out.println("Введите описание вашей книги: ");
        description = sc.nextLine();

        System.out.println("Введите автора вашей книги: ");
        author = sc.nextLine();

    }

    @Override
    public String toString()
    {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
