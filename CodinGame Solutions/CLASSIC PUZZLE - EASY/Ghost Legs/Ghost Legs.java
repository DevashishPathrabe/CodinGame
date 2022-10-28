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
        String[] line = in.nextLine().split(" ");
        int W = Integer.parseInt(line[0]);
        int H = Integer.parseInt(line[1]);
        String[] T = in.nextLine().split("  ");
        int[] Ti = new int[T.length];
        
        for(int i=0; i<Ti.length; i++){
            Ti[i] = i;
        }
        for(int i=0; i<H-2; i++){
            line = in.nextLine().split("\\|");
            for(int j=0; j<line.length; j++){
                if(line[j].equals("--")){
                    for(int k=0; k<Ti.length; k++){
                        if(Ti[k] == j-1){
                            Ti[k] += 1;
                        }
                        else if(Ti[k] == j){
                            Ti[k] -= 1;
                        }
                    }
                }
            }
        }
        String[] B = in.nextLine().split("  ");
        for(int i=0; i<T.length; i++){
            System.out.println(T[i] + B[Ti[i]]);
        }
    }
}