package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 7;
        boolean prime = true;

        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= n / 1; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime");
                    prime = false;
                    break;
                }
            }
        }

        if (prime == true) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
