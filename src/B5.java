class Book {
    String bookId;
    String title;
    String author;
    double price;

    Book(String bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("----------------------");
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + title);
        System.out.println("Tác giả: " + author);
        System.out.println("Giá bán: " + price);
        System.out.println("----------------------");
    }
}

public class B5 {
    public static void main(String[] args) {
        Book firstBook = new Book("IT01", "Harry Potter", "Voldemort", 120000);
        Book secondBook = new Book("IT02", "Doraemon", "Aoyama", 150000);

        firstBook.displayInfo();
        secondBook.displayInfo();
    }
}
