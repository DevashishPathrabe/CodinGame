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
        int n = Integer.parseInt(in.nextLine());
        String[] inputs = in.nextLine().split(" ");
        if(n <= 0){
            System.out.println(0);
            return;
        }
        int closestToZero = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int T = Integer.parseInt(inputs[i]);
            if(Math.abs(T) < Math.abs(closestToZero)){
                closestToZero = T;
            }
            else if(Math.abs(T) == Math.abs(closestToZero)){
                closestToZero = Math.max(closestToZero, T);
            }
        }
        System.out.println(closestToZero);
    }
}