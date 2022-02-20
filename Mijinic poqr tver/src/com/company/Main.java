package com.company;

public class Main {

    public static void main(String[] args) {

        int minimumLength = Integer.MAX_VALUE;
        String minimumNumber = args[0];
        int count = 0;
        int length = 0;
        for (int i = 0; i < args.length; i++){
            int number = Integer.parseInt(args[i]);
            int numbersLength = 0;
            while (number !=0){
                number /= 10;
                length++;
                numbersLength++;
            }
            if (numbersLength < minimumLength){
                minimumLength = numbersLength;
                minimumNumber = args[i];
                count++;
            }
        }
        int middleLength = length / args.length;
        System.out.println("Mijinic poqr tver " + count);
        System.out.println("Tveri erkarutyan mijin " + middleLength);
        System.out.println("minimumLength " + minimumLength);
        System.out.println("minimumNumber " + minimumNumber);

    }
}
