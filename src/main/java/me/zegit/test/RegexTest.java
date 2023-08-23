package me.zegit.test;
import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String text = "test* ti* example* foo*";

        // Define the regular expression pattern
        String regex ="[a-zA-Z]+\\*";

        // Create a Pattern object
        Pattern pattern = Pattern.compile(regex);

        // Create a Matcher object
        Matcher matcher = pattern.matcher(text);

        // Find and print all matching words
        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());
        }
    }
}
