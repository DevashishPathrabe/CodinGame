import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    private static long GetNextRiverNumber(long riverNumber){
        long nextRiverNumber = riverNumber;
        while(riverNumber > 0){
            nextRiverNumber += riverNumber % 10;
            riverNumber -= riverNumber % 10;
            riverNumber /= 10;
        }
        return nextRiverNumber;
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int r1 = in.nextInt();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        boolean riversMeetR1 = false;
        for (int i=r1-1; i>0 && !riversMeetR1; i--){
            riversMeetR1 = (GetNextRiverNumber(i) == r1);
        }
        System.out.println(riversMeetR1 ? "YES" : "NO");
    }
}