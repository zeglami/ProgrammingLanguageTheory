package me.zegit.regex.part01;
//Part 1
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
In regular expressions, the \b is called a "word boundary." It's a zero-width assertion that matches
the position between a word character (like a letter or digit) and a non-word character (like whitespace, punctuation, etc.),
or at the beginning or end of a string.
 */

public class CharacterSets {

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
  /*
  \\b: This matches a word boundary, ensuring that "fun" is a standalone word and not a part of another word.
  fun: This is the literal text we are searching for.
  \\b: Another word boundary.
  */
    System.out.println("Example1");
    text="This just for fun and only fun";
    regex = "\\bfun\\b";
    finder(text,regex);
    /*
    \\b: Word boundary to ensure complete words are matched.
    [ad]: Character class that matches either "a" or "d".
    000: Literal "000".
    \\b: Another word boundary.
    */
    System.out.println("Example2");
    text="a000 b000 c00 d000 d00 e000 p000";
    regex = "\\b[ad]000\\b";
    finder(text,regex);

    /*
    \\b: Word boundary to ensure complete words are matched.
  [^ap]: Negated character class that matches any character except "a" and "p".
  000: Literal "000".
  \\b: Another word boundary.
    */
    System.out.println("Example3");
    text="a000 b000 c00 d000 d00 e000 p000";
    regex = "\\b[^ap]000\\b";
    finder(text,regex);



  }
}
