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
        int N = Integer.parseInt(in.nextLine());
        ArrayList<Integer> x = new ArrayList<Integer>();
        for (String s : in.nextLine().split(" ")){
            x.add(Integer.parseInt(s));
        }
        int cost = 0;
        while(x.size() > 1){
            Collections.sort(x);
            int minSum = x.get(0) + x.get(1);
            cost += minSum;
            x.remove(0);
            x.remove(0);
            x.add(minSum);
        }
        System.out.println(cost);
    }
}