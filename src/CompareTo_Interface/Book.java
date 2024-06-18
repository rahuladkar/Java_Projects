package CompareTo_Interface;

public class Book implements Comparable{

    private String bookName;
    private String author;
    private double price;

    // getter()
    public String getBookName() {
        return bookName;
    }
    public String getAuthor() {
        return bookName;
    }
    public double getPrice() {
        return price;
    }


    // no argument constructor
    Book(){}

    // constructor to initialize the data
    Book(String bookName , String author,double price){
        super();
        this.bookName = bookName;
        this.author =author;
        this.price = price;
    }

    // overridden compareTo()
    @Override
    public int compareTo(Object obj) {

        Book books = (Book)obj;

        return Double.compare(this.price, books.price);
    }

    // overridden toString() to print the data

    @Override
    public String toString() {
        return "Book Name : " + bookName +
                "\nAuthor Name : " + author +
                "\nPrice : " + price;
    }
}
