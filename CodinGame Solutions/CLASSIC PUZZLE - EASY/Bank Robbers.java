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
        int R = in.nextInt();
        int V = in.nextInt();
        int[] T = new int[R];
        for (int i=0; i<V; i++) {
            int C = in.nextInt();
            int N = in.nextInt();
            T[0] += (int)(Math.pow(10, N) * Math.pow(5, C-N));
            Arrays.sort(T);
        }
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.out.println(T[R - 1]);
    }
}