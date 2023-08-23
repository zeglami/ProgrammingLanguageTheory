package me.zegit.regex.part02;
//Part 2
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ranges {
    public static void finder(String text,String regex){
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // Find and print all matching
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }

    }

    public static void main(String[] args) {
        String text;
        String regex;

        System.out.println("Example1");
        text="a000 b000 c00 d000 d00 e000 F000 p000 e000 x000 z000";
        //[b-x]: Character class that matches any character from "b" to "x".
        regex = "\\b[b-x]000\\b";
        finder(text,regex);

        System.out.println("Example2");
        text="a000 b000 c00 d000 d00 e000 p000 F000 x000 z000";
        //the (?i) at the beginning of the regular expression makes the rest of the pattern match in a case-insensitive manner
        regex = "(?i)\\b[b-x]000\\b";
        finder(text,regex);

        System.out.println("Example3");
        text="a000 b000 c00 d000 d00 e000 F000 p000 e000 x000 z000";
        //[b-x]: Character class that matches any character from "b" to "x".
        regex = "\\b[b-x B-X]000\\b";
        finder(text,regex);

        System.out.println("Example4");
        text="1test 8test 9test";
        //[b-x]: Character class that matches any character from "b" to "x".
        regex = "\\b[0-8]test\\b";
        finder(text,regex);






    }
}
