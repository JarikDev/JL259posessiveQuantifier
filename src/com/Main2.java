package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        //atomic group
        //X*+ - (>X*)
//         Pattern p3= Pattern.compile("(a|b)*+b");
//        Pattern p3= Pattern.compile("(?>(?:a|b)*)b");
        Pattern p3 = Pattern.compile("(?>a|b)*b");//not
        Matcher m3 = p3.matcher("b");
        while (m3.find()) {
            System.out.println(m3.start() + " " + m3.group() + " ");
        }
        System.out.println(" ");
    }
}
