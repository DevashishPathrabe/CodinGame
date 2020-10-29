import java.util.*;
import java.io.*;
import java.math.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {
    private static String stringToPascalCase(String s){
        if(s == null || s.isEmpty()){
            return "";
        }
        char[] chars = s.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        return new String(chars);
    }
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String intext = in.nextLine().toLowerCase().trim();;

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        intext = intext.replaceAll("\\s{2,}", " ");
        Pattern regexPattern = Pattern.compile("\\s?\\p{P}\\s?");
        Matcher regexMatcher = regexPattern.matcher(intext);
        while(regexMatcher.find()){
            String match = regexMatcher.group();
            intext = intext.replaceAll(match.replace(".", "\\."), match.trim());
        }
        regexPattern = Pattern.compile("\\p{P}+");
        regexMatcher = regexPattern.matcher(intext);
        while(regexMatcher.find()){
            String match = regexMatcher.group();
            intext = intext.replaceAll(match.replace(".", "\\."), match.trim().charAt(0) + "");
        }
        intext = Arrays.stream(intext.split("\\.", -1)).map(s -> stringToPascalCase(s)).collect(Collectors.joining("."));
        intext = intext.replaceAll("\\p{P}", "$0 ");
        System.out.println(intext.trim());
    }
}