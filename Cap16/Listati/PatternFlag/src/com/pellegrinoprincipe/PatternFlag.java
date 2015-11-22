package com.pellegrinoprincipe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFlag
{
    public static void main(String[] args)
    {
        // CASE_INSENSITIVE
        String c_ins = "abcdefg";
        String regex_c_ins = "ABCDEFG";
        boolean res = Pattern.compile(regex_c_ins, 
                      Pattern.CASE_INSENSITIVE).matcher(c_ins).find(); 
        System.out.println("FLAG CASE_INSENSITIVE match? " + res);

        // COMMENTS
        String comm = "<!-- css rules -->";
        String regex_comm = "<!--.*?--> # Pattern di ricerca per commenti HTML";
        res = Pattern.compile(regex_comm, Pattern.COMMENTS).matcher(comm).find();
        System.out.println("FLAG COMMENT match? " + res);

        // DOTALL
        String dotall = "Test di Touring\n";
        String regex_dotall = ".";
        Matcher m = Pattern.compile(regex_dotall, Pattern.DOTALL).matcher(dotall);
        res = m.find(15); // trova il new line
        System.out.println("FLAG DOTALL match? " + res);

        // UNICODE_CASE
        String uni_case = "АБВГ"; // lettere in cirillico MAIUSC.
        String regex_uni_case = "абвг"; // lettere in cirillico MINUSC.
        res = Pattern.compile(regex_uni_case, Pattern.CASE_INSENSITIVE | 
                              Pattern.UNICODE_CASE).matcher(uni_case).find();
        System.out.println("FLAG UNICODE_CASE match? " + res);

        // LITERAL
        String literal = "\\d...\\w";
        String regex_literal = "\\d...\\w";
        res = Pattern.compile(regex_literal, Pattern.LITERAL).matcher(literal).find();
        System.out.println("FLAG LITERAL match? " + res);
    }
}
