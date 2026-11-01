public class BookTester {
    public static void main(String[] args) {
        Book book1 = new Book ("Java Guide Java", 450, 49.99, true);
        Book book2 = new Book ("Python Programming", 250, 29.99, false);
        Book book3 = new Book ("Advanced Java Programming", 600, 59.99, true);

        System.out.println(book1.toString()); // Title: Java Guide Java, Pages: 450, Price: $49.99, Hardcover: true

        System.out.println(book1.containsWord("Guide")); // true
        System.out.println(book1.containsWord("C++"));   // false

        System.out.println(book1.hasRepeatedPrefix()); // true
        System.out.println(book2.hasRepeatedPrefix()); // false

        System.out.println(book3.hasExactTitle("Advanced Java Programming")); // true
        System.out.println(book3.hasExactTitle("Python Basics"));           // false

        System.out.println(book1.applyDiscount(50.0)); // 24.995
        System.out.println(book2.applyDiscount(0.0));  // 29.99

        System.out.println(book3.isExpensive()); // true
        System.out.println(book2.isExpensive()); // false

        System.out.println(book1.wordCount("Java")); // 2
        System.out.println(book3.wordCount("Java")); // 1
    }
}
