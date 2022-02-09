package com.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(solve(a));
    }
    public static String solve(int a){
        String[] month = {"","January","February","March","April","May","June","July","August","September","October","November","December"};
        if(a > 0 && a<month.length) return month[a];
        return "Month not found";
    }
}
