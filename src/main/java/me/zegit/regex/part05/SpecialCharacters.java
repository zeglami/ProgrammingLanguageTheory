package me.zegit.regex.part05;

import me.zegit.regex.utils.Utils;

//Part 5
public class SpecialCharacters {

  public static void main(String[] args) {
    //
      String text;
      String regex;

      System.out.println("Example1");
      text="This just for fun and only fun fur fu";
      regex = "\\bfur?\\b";
      Utils.finder(text,regex);

      System.out.println("Example2");
      text="This just for fun and only fun fur fu";
      regex = "\\bfur?";
      Utils.finder(text,regex);

      System.out.println("Example3");
      text="This just for fun and only fun fur fu ur";
      regex = "\\bf?ur?";
      Utils.finder(text,regex);


      System.out.println("Example4");
      text=",a000 a00 c00 c000 000 00";
      regex = "\\b[a-b]?000";
      Utils.finder(text,regex);


      System.out.println("Example5");
      text=",005 01 00002 0002 001";
      regex = "\\b000.";
      Utils.finder(text,regex);


      System.out.println("Example6");
      text=",005 01 00002 0002 001";
      regex = "\\b000.\\b";
      Utils.finder(text,regex);

      System.out.println("Example6");
      text=",005 01 00002 0002 001";
      regex = "\\b000.\\b";
      Utils.finder(text,regex);


      System.out.println("Example7");
      text="a00 z000 a00 a0 01 aa000 000";
      regex = "\\b[a-z]*000\\b";
      Utils.finder(text,regex);

      System.out.println("Example8");
      text="a00 z000 a00 a0 01 aa000 000";
      regex = "\\b[a-z]+000\\b";
      Utils.finder(text,regex);


      System.out.println("Example9");
      text="test* ti* example * foo*";
      regex ="[a-zA-Z]+\\*";
      Utils.finder(text,regex);







  }
}
