package me.zegit.regex.utils;


public class Empty {

    public static void main(String[] args) {
        String text;
        String regex;

        System.out.println("Example1");
        text="This just for fun and only fun";
        regex = "\\bfun\\b";
        Utils.finder(text,regex);

    }
}
