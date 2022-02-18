package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Sort Args
        String str = args[0];
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        str = new String(chars);
        System.out.println("Sort " + str);

        // Increasing
       for (int i = 0; i < args.length; i++) {
           int num = Integer.parseInt(args[i]);
           int length = 0;
           while (num!=0){
               num /= 10;
               length++;
           }

           System.out.println("Length " + length);

           }



    }


}

