package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = {15, 25, 76, 57, 14, 25, 15};
        boolean isPalindrome = true;
        int i = 0;
        while(i < array.length / 2){
        if(array[i] != array[array.length - 1 - i])
            isPalindrome = false;
            i++;

        }
        System.out.println(isPalindrome);

    }

}

