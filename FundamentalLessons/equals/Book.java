public class Book {
    private String title;
    private int pages;
    private double price;
    private boolean isHardCover;

public Book(String title, int pages, double price, boolean isHardCover) {
    this.title = title;
    this.pages = pages;
    this.price = price;
    this.isHardCover = isHardCover;
}
public String toString() {
    return "Title: " + title + ", Pages: " + pages + ", Price: $" + price + ", Hardcover: " + isHardCover;
    }

public boolean containsWord(String word) {
    return title.indexOf(word) != -1;
}
public boolean hasExactTitle(String otherTitle) {
    return title.equals(otherTitle);
}
public double applyDiscount(double discountPercent) {
    return price - (price * discountPercent / 100.0);
}
public boolean isExpensive() {
    return isHardCover && pages > 300;
}
public boolean hasRepeatedPrefix() {
        if (title.length() >= 8) {
            return title.indexOf(title.substring(0, 4), 4) != -1;
        }
        return false;
}
public int wordCount(String target) {
    int count = 0;
    int targetLength = target.length();
    for (int i = 0; i <= title.length() - targetLength; i++) {
        String piece = title.substring(i, i + targetLength);
        if (piece.equals(target)) {
            count++;
        }
    }
    return count;
}
}