package me.zegit.regex.part04;

import me.zegit.regex.utils.Utils;

//Part 4
public class Metacharacters {
    /*
. (dot): Matches any character except a newline.
^ (caret): Matches the start of a string or line.
$ (dollar sign): Matches the end of a string or line.
* (asterisk): Matches the preceding element zero or more times.
+ (plus): Matches the preceding element one or more times.
? (question mark): Matches the preceding element zero or one time.
| (pipe): Acts like an OR operator, matching either the expression before or after it.
[] (square brackets): Defines a character class, matching any single character from the specified set.
() (parentheses): Creates a capturing group or a subexpression.
\ (backslash): Escapes a metacharacter or introduces a special sequence.
{} (curly braces): Specifies a quantifier for the preceding element (e.g., {n}, {n,}, {n,m}).
\b (word boundary): Matches the position between a word character and a non-word character.
\B (non-word boundary): Matches any position that is not a word boundary.
\d (digit): Matches any digit character (equivalent to [0-9]).
\D (non-digit): Matches any character that is not a digit.
\s (whitespace): Matches any whitespace character (e.g., space, tab, newline).
\S (non-whitespace): Matches any character that is not a whitespace character.
\w (word character): Matches any word character (letters, digits, or underscore).
\W (non-word character): Matches any character that is not a word character.
[\^] (caret within square brackets): When used as the first character within square brackets, it negates the character class. It matches any character not in the specified set.
[\] (closing square bracket within square brackets): Escapes the closing square bracket within a character class.
[\-] (hyphen within square brackets): Represents a literal hyphen within a character class.
\A (start of input): Matches the start of the input string.
\Z (end of input or before a newline at the end): Matches the end of the input string, or before the newline at the end.
\z (end of input): Matches the end of the input string.
\G (end of previous match): Matches the point where the previous match ended.
\n (newline): Matches a newline character.
\t (tab): Matches a tab character.
\r (carriage return): Matches a carriage return character.
\v (vertical tab): Matches a vertical tab character.
\f (form feed): Matches a form feed character.
(?i) (case-insensitive flag): Makes the enclosed part of the pattern case-insensitive.
(?s) (dot-all flag): Makes the dot . match any character, including newlines.
(?m) (multiline flag): Changes the behavior of ^ and $ to match the start and end of lines.
(?x) (comments mode): Allows whitespace and comments within the regular expression.
(?:) (non-capturing group): Creates a group without capturing its matched text.
(?=) (positive lookahead): Specifies a position in the text followed by a certain pattern.
(?!) (negative lookahead): Specifies a position in the text not followed by a certain pattern.
(?<=) (positive lookbehind): Specifies a position in the text preceded by a certain pattern.
(?<!) (negative lookbehind): Specifies a position in the text not preceded by a certain pattern.
 */
    public static void main(String[] args) {
        String text;
        String regex;

        System.out.println("Example1");
        text="121 1 22";
        regex = "\\d";
        Utils.finder(text,regex);


        System.out.println("Example2");
        text="This just for fun 9";
        regex = "\\w";
        Utils.finder(text,regex);

        System.out.println("Example3");
        text="1a2 1aa2 2a a2";
        regex = "\\d\\w\\d";
        Utils.finder(text,regex);

        System.out.println("Example4");
        text="1a2 1aa2     2a a2";
        regex = "\\d\\s\\d";
        Utils.finder(text,regex);

        System.out.println("Example5");
        text="1a2 1aa2 2a a2";
        regex = "\\d\\s\\d";
        Utils.finder(text,regex);


        System.out.println("Example6");
        text="1a2 1aa32     2a a2";
        regex = "\\d{2}\\s{5}\\d";
        Utils.finder(text,regex);


        System.out.println("Example6");
        text="1a2 1aa32     2a a2";
        regex = "\\d{2}\\s{5}\\d";
        Utils.finder(text,regex);


        System.out.println("Example7");
        text="1a2 1aa32     2akl a2";
        regex = "\\d{2}\\s{5}\\w{3}";
        Utils.finder(text,regex);





    }
}
