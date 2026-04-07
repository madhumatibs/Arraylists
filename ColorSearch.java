 // **1b. Array List programs **//
//**1. Write a java program for getting different colors through ArrayList interface and search whether the color "Red" is available or not**//

package Arraylists;

import java.util.*;

public class ColorSearch {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        if (colors.contains("Red")) {
            System.out.println("Red is available in the list");
        } else {
            System.out.println("Red is NOT available in the list");
        }
    }
}
