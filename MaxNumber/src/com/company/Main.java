package com.company;

public class Main {

    public static void main(String[] args) {
        int [] numbers = {0, 54, -235, -124, 123, 54, 999};
        int max = -1001;

        for (int i = 0; i < numbers.length; i++ ) {
            if (numbers[i] < 0) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
        }
        if (max == -1001) {
            System.out.println(0);
        } else {
            System.out.println(max);
        }
    }
}
