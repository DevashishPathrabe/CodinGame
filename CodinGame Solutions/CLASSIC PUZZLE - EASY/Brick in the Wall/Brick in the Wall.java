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
        int x = Integer.parseInt(in.nextLine());
        int n = Integer.parseInt(in.nextLine());
        int[] m = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
        double w = 0;
        for(int i=0; i < n; i++){
            int l = i / x;
            w += l * .65 * m[n-i-1];
        }
        System.out.println(String.format("%.3f", Math.round(w * 1000) / 1000.0));
    }
}