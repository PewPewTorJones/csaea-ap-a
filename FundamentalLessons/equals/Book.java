public class Book {
    private String title;
    private int pages;
    private double price;
    private boolean isHardCover;
}
public Book(String title, int pages, double price, boolean isHardCover) {
    this.title = title;
    this.pages = pages;
    this.price = price;
    this.isHardCover = isHardCover;
}
public String toString() {
    return "Title: " + title + ", Pages: " + pages + ", Price: $" + price + ", Hardcover: " + isHardCover;
    }
}

