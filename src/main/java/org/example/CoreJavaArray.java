package org.example;

import java.util.ArrayList;

public class CoreJavaArray {
    public static void main(String[] args){
        int myNum = 5;
        char ch = 'a';
        double dec =2.5;
        boolean myCard = true;
        //System.out.println(myNum +" is the value in myNum variable");
        //Array
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10,11,12};
        //System.out.println(arr1[1]);

        int[] result = new int[10];
        for(int i=0;i<arr1.length;i++) {
            if (arr1[i] % 2 == 0) {
                System.out.println(  arr1[i]);
            }
        }
        ArrayList<String> al = new ArrayList<>();
        al.add("Junu");
        al.add("Jushna");
        al.add("Mishab");
        al.add("Amjad");

        for(int i=0;i<al.size();i++){
            System.out.println("Arraylist String is "+ al.get(i));
        }
        System.out.println(al.contains("Selvi"));
//        for (String e:al) {
//            System.out.println("Arraylist String is "+ e);
//        }


        String[] name= {"Tinnu","Sunnu","Danu"};
//        for(int i=0;i<name.length;i++){
//            System.out.println(name[i]);
//        }
        for(String n:name){
            System.out.println("Array string is "+n);
        }
    }
}
