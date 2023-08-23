package me.zegit.regex.part07;

import me.zegit.regex.utils.Utils;

//Part 7
public class AlternateCharacters {
    public static void main(String[] args) {
        String text;
        String regex;

        System.out.println("Example1");
        text="This just for fun and only sun";
        regex = "fun|sun|lun";
        Utils.finder(text,regex);


        System.out.println("Example1");
        text="This just for fun and only sun";
        /*
        The regular expression (f|s)un matches either "fun" or "sun". Here's how it works:
        (f|s): This is a capturing group that matches either "f" or "s".
        un: This matches the literal characters "un".
         */
        regex = "(f|s)un";
        Utils.finder(text,regex);


        System.out.println("Example3");
        text="This just for fun and only sun un";
        regex = "(f|s)?un"; //(f|s) is optional
        Utils.finder(text,regex);








    }
}
