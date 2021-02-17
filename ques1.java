import java.io.*;
import java.util.*;


class Book implements Serializable{

    private int isbn;
    private String title, author;
    private double price;

    public Book(){
        isbn = 0;
        title = null;
        author = null;
        price = 0;
    }

    public Book(int isbn, String title, String author, double price){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString(){
        return "\nTitle: " + title + "\nAuthor: " + author +
                "\nISBN: " + isbn + "\nPrice: " + price + "\n";
    }

}


class Library implements Serializable {

    private List<Book> collection;

    public Library(){
        collection = new ArrayList<Book>();
    }

    public void addBook(Book book){
        collection.add(book);
    }

    @Override
    public String toString() {
        String total = "\n";
        Iterator<Book> i = collection.iterator();
        while(i.hasNext()){
            Book b = (Book) i.next();
            total = total + b.toString();
        }
        return total;
    }

}




public class ques1 {

    static String fileName = null;
    static Library lib = new Library();
    static Scanner in = new Scanner(System.in);
    static Boolean running = true;

    public static void main(String[] args) {
        while (running) {
            System.out.println("\nEnter 0 for load a library."
                    + "\nEnter 1 for save and quit"
                    + "\nEnter 2 for list all books in library"
                    + "\nEnter 3 for add book to library");

            int answer = in.nextInt();
            switch (answer) {
                case 0:
                    System.out.println("Enter the file name to load");
                    loadScript(in.next());
                    break;

                case 1:
                    saveAndQuit();
                    break;
                case 2:
                    System.out.println(lib.toString());
                    break;
                case 3:
                    addBook();
                    break;
                default:
                    System.out.println("You enter wrong choice.");
                    break;
            }
        }
        System.exit(0);
    }

    static void addBook() {
        int isbn;
        String title, author;
        double price;

        System.out.println("\nEnter Title: ");
        title = in.next();

        System.out.println("\nEnter Author: ");
        author = in.next();

        System.out.println("\nEnter ISBN: ");
        isbn = in.nextInt();

        System.out.println("\nEnter Price: ");
        price = in.nextDouble();

        Book b = new Book(isbn, title, author, price);
        lib.addBook(b);
    }

    static void saveAndQuit() {
        System.out.println("Enter file name: ");
        fileName = in.next() + ".txt";
        running = false;
        FileOutputStream fos;
        ObjectOutputStream out;
        try {
            fos = new FileOutputStream(fileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(lib);
            fos.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void loadScript(String name) {
        File file = new File(name + ".txt");
        if (file.exists()) {
            try {
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream in = new ObjectInputStream(fis);
                lib = (Library) in.readObject();
                fis.close();
                in.close();

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("\nThe file does not exist!");
        }
    }

}
