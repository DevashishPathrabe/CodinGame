import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine().toUpperCase();
        final int unknownCharIndex = 'Z' - 'A' + 1;
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
            for(int j=0; j<T.length(); j++){
                int charIndex = T.charAt(j) - 'A';
                int letterIndex = Character.isLetter(T.charAt(j)) ? charIndex : unknownCharIndex;
                String asciiPart = ROW.substring(letterIndex * L, (letterIndex + 1) * L);
                System.out.print(asciiPart);
            }
            System.out.println();
        }
    }
}