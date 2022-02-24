package com.company;

public class Main {
    public static void main(String[] args) {

        int a = 0, b = 100;
        for (int i = 0; i < 10; i++) {
            int randomNumber = a + (int) (Math.random() * b);
            System.out.print(" " + randomNumber);
        }
    }
}
