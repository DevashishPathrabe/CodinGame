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
        int N = in.nextInt();
        List<Integer> strength = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            strength.add(pi);
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        Collections.sort(strength);
        int answer = Integer.MAX_VALUE;   
        for(int i=0; i<strength.size()-1; i++){
            int current = strength.get(i);
            int next = strength.get(i+1);
            int D = next - current;
            if(D<answer){
                answer = D;
            } 
        } 
        System.out.println(answer);
    }
}