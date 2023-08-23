package me.zegit.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TODO to verfiy if it works;DONE
//RegEx for format: 0X XX XX XX XX +33 X XX XX XX XX



public class PhoneNumber {

    public static void phoneNumberCheck(String phone){
        String newPhone=null;
        Pattern pattern = Pattern.compile("^(0|\\+33)[1-9]([-.]?[0-9]{2}){3}([-.]?[0-9]{2})$", Pattern.CASE_INSENSITIVE);
        newPhone=phone.replace(" ","");
        Matcher matcher = pattern.matcher(newPhone);
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found for: "+phone);
        } else {
            System.out.println("Match not found: "+phone);
        }

    }

    public static void main(String[] args) {
        String num1="+33 6 42 47 44 17";
        phoneNumberCheck(num1);

        String num2="+33 6 42 47 44 177";
        phoneNumberCheck(num2);

        String num3="+33642474417";
        phoneNumberCheck(num3);


        String num4="+336424744177";
        phoneNumberCheck(num4);




    }

}


