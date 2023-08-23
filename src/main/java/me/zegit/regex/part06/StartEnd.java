package me.zegit.regex.part06;

import me.zegit.regex.utils.Utils;

//Part 6
public class StartEnd {

  public static void main(String[] args) {
      String text;
      String regex;

      System.out.println("Example1");

      text="This just the for fun";
      /*
      [a-zA-Z]: Character class that matches any letter (lowercase or uppercase).
    {4}: Quantifier that specifies exactly four occurrences of the preceding element, which in this case is [a-zA-Z].
       */
      regex = "[a-z A-Z]{4}";
      Utils.finder(text,regex);


      System.out.println("Example2");
      text="This just the for fun";
      /*
      [a-zA-Z]: Character class that matches any letter (lowercase or uppercase).
      {5}: Quantifier that specifies exactly five occurrences of the preceding element, which in this case is [a-zA-Z].
      $: Anchors the pattern to the end of the string.
       */
      regex = "[a-z A-Z]{5}$";
      Utils.finder(text,regex);



      System.out.println("Example3");
      text="This just the for fun";
      /*
      ^: Anchors the pattern to the beginning of the string.
    [a-zA-Z]: Character class that matches any letter (lowercase or uppercase).
    {6}: Quantifier that specifies exactly six occurrences of the preceding element, which in this case is [a-zA-Z].
       */
      regex = "^[a-z A-Z]{6}";
      Utils.finder(text,regex);



      System.out.println("Example4");
      text="This j";
      /*
      ^[a-zA-Z]{6}$ matches sequences of exactly six letters (both lowercase and uppercase) that encompass the entire string
       */
      regex = "^[a-z A-Z]{6}$";
      Utils.finder(text,regex);

      System.out.println("Example4");
      text="This j t";
      regex = "^[a-z A-Z]{6}$";//no match
      Utils.finder(text,regex);













      //
  }
}
