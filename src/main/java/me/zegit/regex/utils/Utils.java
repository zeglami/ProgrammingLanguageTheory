package me.zegit.regex.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static void finder(String text,String regex){
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // Find and print all matching
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }

    }
}
