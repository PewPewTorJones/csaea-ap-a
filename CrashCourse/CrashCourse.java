import java.util.ArrayList;

public class CrashCourse {
   
    public static void main(String[] args) {

        //comment
        /*Multiline comment
        
        */


        System.out.print("Hello");
        System.out.println("World"); //Auto prints on new line
        System.out.println("Hello World");
    
    //Variable Declarations
    //Primitive Variables
    int a; //integer
    double b; //decimal
    boolean c; //True or false

    a = 4;
    b = 5.5;
    c = false;  //lowercase

    // Arithmetic operators
    // + - / * %
    // += -= /= %=

    int d = 3;
    d+= 7;

    System.out.println("d = " + d);
    
    //increment and decrement
    // -- ++
     
    d--;
    d++;
    d++;
    System.out.println("d is NOW equal to " + d);

    //COMPARISONS (always returns true or false)
    // < > <= >= == !=
    System.out.println(4 > 5);
    System.out.println(4 < 5);
    System.out.println(7 == 4);
    System.out.println(1 != 2);
    

    //Logical Operators
    // In order of precedence: Not !  And &&  Or||
    
    boolean e = false; boolean f = true;
    
    //predict output

    System.out.println("____________");

    System.out.println(!e); //true
    System.out.println(e && f); //false
    System.out.println(e || f); //true
    System.out.println(e || f && !e); //true


    System.out.println( e && f); //short circuits after checking e
    
    // CASTING (converting)
    int g = (int)5.5;
    System.out.println(g);
    double h = (double)5/6;
    System.out.println(h);
    
    //STRINGS

    String s1 = "Goodnight";
    String s2 = " and ";
    String s3 = "Goodbye";
    String result = s1 + s2 + s3;
    result += ", Cowboy.";
    System.out.println("\n" + result + "\n");
    
    //Arrays

    int[] arry1 = new int[10];
    System.out.println(arry1);
    System.out.println("length: " + arry1.length);

    arry1[0] = 11;
    arry1[1] = 2;

    System.out.println("Remainder: " + arry1[0] % arry1[1]);

    int[] arry2 = {34, 52, 3, 64, 32};
    System.out.println("arry2: "+ arry2[3]);
    
    //2d Array (grid/table)
    int[][] arryGrid1 = new int[4][3]; //[rows][columns]
    
    // 0 0 0
    // 0 0 0
    // 0 0 0
    // 0 0 0
    System.out.println("Rows: "+ arryGrid1.length);
    System.out.println("Columns: " + arryGrid1[0].length);

    int[][] arryGrid2 = { {7, 8, 9}, {4, 5, 6}, {1, 2, 3} };

    System.out.println(arryGrid2[0][1] + arryGrid2[2][2]);
    System.out.println(arryGrid2[2][2]);

    //Array List
    //Can be any size lots of bultin functions to help
    // Build primitive data types special classes for integer, double, boolean, string 
   
    //Math Class

    Math.max(5, 10); //Max value
    Math.min(7,3); //Min value 
    Math.sqrt(81); // sqrt
    Math.abs(-4); // Absolute value

    // Conditionals

    // if  else if    else 

    boolean tru = true; boolean fal = false;

    if(fal) {
        System.out.println("Reached first codition");
    } else if (fal){
        System.out.println("Reached second condition");
    } else {
        System.out.println("Reached else");
    }

    // Iteration
    // While loop
   int x = 5;

   while(x < 10) {
    System.out.println(x + " ");
    x++;
   }


   System.out.println();
   //for loop
   // initialze vairable for an index; conditional; increment/decrement
   for(int i = 0; i < 5; i++) {
    System.out.println(i);

   }

   //Enhancing for loop only for reading values
   ArrayList<String> animals = new ArrayList<>();
   animals.add("Dog");
   animals.add("Cat");
   animals.add("Bird");
   System.out.println("ArrayList: " + animals);

   for (String s : animals) {
    System.out.println("We saw a " +s);
    }

   // Printing values of an array with iteration
   double[] arry = {5.1, 6.2, 7.3, 8.4, 9.5};
   System.out.println("Memory address of arry: " + arry);

   double element = arry[2];

   for (int i = 0; i < arry.length; i++) {
    System.out.println(arry[i]);
   }
   int[][] arryMatrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
   for (int row = 0; row < arryMatrix.length; row++) {
    for (int col = 0; col < arryMatrix[row].length; col++) {
        System.out.print(arryMatrix[row][col] + " ");
    }
    System.out.println();
   }

}
}
