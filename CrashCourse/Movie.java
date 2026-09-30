public class Movie {
   // declare instance variables here
 	private String title;
	private double rating;
	
	
   // write the constructor here
 public Movie(String titl, double ratin) {
   title = titl;
	rating = ratin;
}
public void printInfo() {
      		System.out.println(title + " — Rating: " + rating);
   }
}
 class MovieTester {
   public static void main(String[] args) {
      Movie one = new Movie("Inception", 9);
      Movie two = new Movie("Interstellar", 8);
      Movie three = new Movie("Tenet", 7);
      one.printInfo();
      two.printInfo();
      three.printInfo();
   }
}
