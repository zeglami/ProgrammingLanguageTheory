package me.zegit.regex.part08Examples;

import me.zegit.regex.utils.Utils;

public class Examples {

  public static void main(String[] args) {

    String text;
    String regex;

    System.out.println("Email");
    text="test@mail.com";
    /*
^ and $ are anchors that match the start and end of the line, ensuring that the whole string is an email address.

[a-zA-Z0-9._%+-]+ matches one or more characters that can be in the local part of the email address. This includes
letters, numbers, dots, underscores, percent signs, plus signs, and hyphens.

@ matches the at symbol, which is a required character in an email address.

[a-zA-Z0-9.-]+ matches one or more characters that can be in the domain part of the email
address. This includes letters, numbers, dots, and hyphens.

\. matches the dot that separates the domain from the top-level domain (TLD).

[a-zA-Z]{2,} matches the TLD, requiring at least two alphabetical characters.
     */
    regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    Utils.finder(text,regex);




    System.out.println("Phone");
    text="+3361122334499";//to be implmented
    regex = "^\\d{10}$";
    Utils.finder(text,regex);
    text="0611223344";
    Utils.finder(text,regex);


    System.out.println("UserName");
    text="Tseta12";
    /*
    ^ and $ are anchors that match the start and end of the line, ensuring that the whole string is the username.
[a-zA-Z0-9] matches any letter (uppercase or lowercase) or digit.
{5,12} specifies that the preceding character class [a-zA-Z0-9] should appear between 5 and 12 times, inclusive.
     */
    regex = "^[a-zA-Z0-9]{5,12}$";
    Utils.finder(text,regex);













  }
}
