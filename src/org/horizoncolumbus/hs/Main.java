package org.horizoncolumbus.hs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter Array Size: ");

        int ArraySize = myObj.nextInt();


        int[] numbers = new int[ArraySize];

        //Array Literal
        //   int[] numbers = new int[] {1, 2, 3, 4, 5};

//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 4;
//        numbers[4] = 5;
        //add data to the array
        for (int i = 0; i < ArraySize; i++) {
            System.out.print("Enter Array Number: ");
            numbers[i] = myObj.nextInt();
        }


        //sum all the numbers in the array
        int sum = 0;

        for (int i = 0; i < ArraySize; i++) {
            sum = sum + numbers[i];
        }

            System.out.println(sum);

        }

    }

