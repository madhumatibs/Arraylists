//**    1b. Array List programs **//
//** 5. Write a java program for getting different colors through ArrayList interface and delete nth element from the ArrayList object by using remove by index **//


package Arraylists;

import java.util.*;

public class RemoveNthElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        int n = 2; // remove 3rd element (index = 2)

        colors.remove(n);

        System.out.println("After removing nth element: " + colors);
    }
}
