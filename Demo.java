import java.util.*;
class book
{
    String name;
    String author;
    float price;
    int num_pages;
    public book(String name, String author, float price, int num_pages)
    {
        this.name=name;
        this.author=author;
        this.price=price;
        this.num_pages=num_pages;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public void setPrice(float price)
    {
        this.price=price;
    }
    public void setNumPages(int num_pages)
    {
        this.num_pages=num_pages;
    }
    public String getName()
    {
        return name;
    }
    public String getAuthor()
    {
        return author;
    }
    public float getPrice()
    {
        return price;
    }
    public int getNumPages()
    {
        return num_pages;
    }
    public String toString()
    {
        return "Book Details:\n" +"Name: " + name + "\n" +"Author: " + author + "\n" +"Price: $" + price + "\n" +"Number of Pages: " + num_pages + "\n";
    }
}
public class Demo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        book[] books = new book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter author: ");
            String author = sc.nextLine();

            System.out.print("Enter price: ");
            float price = sc.nextFloat();

            System.out.print("Enter number of pages: ");
            int numPages = sc.nextInt();
            sc.nextLine(); // consume newline

            books[i] = new book(name, author, price, numPages);
        }

        System.out.println("\n--- Book Details ---");
        for (book b : books) {
            System.out.println(b);
        }
        sc.close();
    }
}