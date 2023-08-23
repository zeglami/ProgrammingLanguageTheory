package me.zegit.regex.part03;
//Part 3
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Repeating {
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
        text="1235 756454 9874";
        /*[0-7]+: Character class that matches any digit from 0 to 7. The + quantifier
        indicates that there should be one or more of these digits.
         */
        regex = "\\b[0-7]+\\b";
        finder(text,regex);



        System.out.println("Example2");
        text="1235 756454 9874";
        //[0-7]{4}: Character class that matches any digit from 0 to 7, repeated exactly four times.
        regex = "\\b[0-7]{4}\\b";
        finder(text,regex);

        System.out.println("Example2");
        text="aaab aaa aaaz";
        //[a-k]{4}: Character class that matches any lowercase letter from "a" to "k", repeated exactly four times.
        regex = "\\b[a-k]{4}\\b";
        finder(text,regex);

        System.out.println("Example3");
        text="aaab aaa ab aaaz";
        //[a-k]{2,4}: Character class that matches any lowercase letter from "a" to "k", repeated between 2 and 4 times.
        regex = "\\b[a-k]{2,4}\\b";
        finder(text,regex);

        System.out.println("Example3");
        text="aaab aaa ab aaaz";
        //[a-k]{2,}: Character class that matches any lowercase letter from "a" to "k", repeated at least 2 or more times
        regex = "\\b[a-k]{2,}\\b";
        finder(text,regex);



    }
}
