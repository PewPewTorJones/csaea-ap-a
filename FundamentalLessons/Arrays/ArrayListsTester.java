package FundamentalLessons.Arrays;

import java.util.ArrayList;

// ArrayLists are dynamic lists that store multiple objects (not primitives like int, double, or boolean)

public class ArrayListsTester {

    public static void main(String[] args) {
        ArrayList<String> animals = ArrayLists.createList();
        System.out.println(animals);

        ArrayLists.ShowIndex(animals);
        int index = ArrayLists.findIndex(animals, "blobfish");
        System.out.println("Index of blobfish: " + index);
    }
}
