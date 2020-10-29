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
        long r1 = in.nextLong();
        long r2 = in.nextLong();

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        while(r1 != r2){
            if(r1 < r2){
                r1 = GetNextRiverNumber(r1);
            }
            else{
                r2 = GetNextRiverNumber(r2);
            }
        }
        System.out.println(r1);
    }
}