package com.company;


public class Main {
    public static void main(String[] args) {

        int minimumLength = Integer.MAX_VALUE;
        String minimumNumber = args[0];
        int maximumLength = -1;
        String maximumNumber = args[0];
        for (int i = 0; i < args.length; i++){
            int number = Integer.parseInt(args[i]);
            int length = 0;
            while (number!=0){
                number /= 10;
                length++;

            }
            if (length < minimumLength){
                minimumLength = length;
                minimumNumber = args[i];

            }
            if (length > maximumLength){
                maximumLength = length;
               maximumNumber = args[i];

            }

        }
        
        System.out.println("MinimumNumber " + minimumNumber + "  Length " + minimumLength);
        System.out.println("MaximumNumber " + maximumNumber + " Length " + maximumLength);


        }

    }




