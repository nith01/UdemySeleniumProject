package org.example;

import java.sql.SQLOutput;

public class CoreJavaString {
    public static void main(String[] args){
        //using String literal
        String str = "My name is Nitha";
        String str1 = "My name is Nitha";
        System.out.println(str );
        System.out.println(str1 );
        //using new
        String str2 = "My name is Nitha";
        String str3 = "My name is Nitha";
//        System.out.println (str == str1); //True
//        System.out.println(str == str2);  //True
//        System.out.println(str2 == str3);  //True
//        System.out.println(str.equals(str1));  //True
//        System.out.println(str.equals(str2));  //False
//        System.out.println(str2.equals(str3)); //False
        String s = " Nitha Sonith Ajmal  ";
        String reverse = "";
        System.out.println(s.trim());
        for(int i=s.length()-1; i>0;i--){
           reverse += s.charAt(i);

        }
        System.out.println(reverse);

//        String []arr = s.split(" ");
//        for (String a:arr
//             ) {
//            System.out.println(a);
//
//        }
    }
}
