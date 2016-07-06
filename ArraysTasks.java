package com.company;

import java.util.Scanner;

public class ArraysTasks {

    public static void main(String[] args) {
//        firstTwentyMultipliedToFive();
//        areTwoArraysEqual();
//        lexArrays();
//        getMaxEqualNumsInRow();
//        getMaxIncreasingNumsInRow();

    }

    private static void getMaxIncreasingNumsInRow() {
        Scanner input = new Scanner(System.in);

        int[] firstArray = new int[10];
        int count = 1;
//        int number;
        int maxCount = 1;
//        int maxNumber;

        for (int i = 0; i < firstArray.length; i++) {
            System.out.printf("Enter the %d array element: ", i);
            firstArray[i] = input.nextInt();
            System.out.println();
        }

        for (int i = 0; i < firstArray.length - 1; i++) {
            if (firstArray[i] + 1 == firstArray[i + 1]) {
                count += 1;
//                number = firstArray[i];
//                System.out.println(number);

                if (count >= maxCount) {
                    maxCount = count;
//                    maxNumber = number;
//                    System.out.println(maxNumber);
//                    System.out.println(firstArray[i + count]);
                }
            } else {
                count = 1;
            }
        }
        System.out.println("The count of numbers increasing with 1 in a row is: " + maxCount);

        input.close();
    }

    private static void getMaxEqualNumsInRow() {
        Scanner input = new Scanner(System.in);

        int[] firstArray = new int[10];
        int count = 1;
        int number;
        int maxCount = 1;
        int maxNumber = 0;

        for (int i = 0; i < firstArray.length; i++) {
            System.out.printf("Enter the %d array element: ", i);
            firstArray[i] = input.nextInt();
            System.out.println();
        }

        for (int i = 0; i < firstArray.length - 1; i++) {
            if (firstArray[i] == firstArray[i + 1]) {
                count += 1;
                number = firstArray[i];

                if (count >= maxCount) {
                    maxCount = count;
                    maxNumber = number;
                }
            } else {
                count = 1;
            }
        }
        System.out.println("The count of equal numbers in a row is: " + maxCount + " for number " + maxNumber);

        input.close();
    }

    private static void lexArrays() {
        Scanner input = new Scanner(System.in);

        char[] firstArray = {'b', 'A', '%', 'G', '4'};
        char[] secondArray = {'b', 'a', '#', 'g', '6'};
        boolean isLexBefore = false;

        for (int i = 0; (i < firstArray.length) && (i < secondArray.length); i++) {
            if(firstArray[i] < secondArray[i]){
                System.out.println(firstArray[i]);
                System.out.println(secondArray[i]);
                isLexBefore = true;
            } else if (firstArray[i] == secondArray[i]){
                continue;
            } else{
                break;
            }
        }
        System.out.println("The first array is before the second array: " + isLexBefore);

        input.close();
    }

    private static void areTwoArraysEqual() {
        Scanner input = new Scanner(System.in);

        int[] firstArray = new int[5];
        int[] secondArray = new int[5];

        for (int i = 0; i < firstArray.length; i++) {
            System.out.printf("Enter the %d array element: ", i);
            firstArray[i] = input.nextInt();
            System.out.println();
        }

        for (int i = 0; i < secondArray.length; i++) {
            System.out.printf("Enter the %d array element: ", i);
            secondArray[i] = input.nextInt();
            System.out.println();
        }

        System.out.println(java.util.Arrays.toString(firstArray));
        System.out.println(java.util.Arrays.toString(secondArray));

        boolean areNotEqual = true;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]){
                areNotEqual = false;
                break;
            }
        }
        System.out.println("The arrays are equal: " + areNotEqual);

        input.close();
    }

    private static void firstTwentyMultipliedToFive() {
        int[] array = new int[20];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
        }
        System.out.print(java.util.Arrays.toString(array));
    }
}
