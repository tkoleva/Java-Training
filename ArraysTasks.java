package com.company;

import java.util.Scanner;

public class ArraysTasks {

    public static void main(String[] args) {
//        *firstTwentyMultipliedToFive(); - correct
//        *areTwoArraysEqual(); - correct

//        *lexArrays(); - you are comparing only the first element, where you should be comparing all of the array elements

//        *getMaxEqualNumsInRow(); - it is sort of working, but if there are for ex. 
//        - [1,1,1,2,2,2,3,3,3,10,10] it will say that the [3,3,3] are the answer.
//        - Also not working if there are 0 equal elements.

//        *getMaxIncreasingNumsInRow(); - when I enter [1, 2, 3, -5, -4, -3, -2, -1, 10] it says 5 numbers, but they are 6 from -5 to 10.
//        - it also throws "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -3"

    }

    private static void getMaxIncreasingNumsInRow() {
        Scanner input = new Scanner(System.in);

        int[] firstArray = new int[10];
        int count = 1;
        int element = 0;
        int maxCount = 1;

        for (int i = 1; i < firstArray.length; i++) {
            System.out.printf("Enter the array element[%d]: ", i);
            firstArray[i] = input.nextInt();
        }

        for (int i = 0; i < firstArray.length - 1; i++) {
            if (firstArray[i] + 1 == firstArray[i + 1]) {
                count += 1;

                if (count >= maxCount) {
                    maxCount = count;
                    element = i;
                }
            } else {
                count = 1;
            }
        }

        System.out.println("The count of numbers increasing with 1 in a row is: " + maxCount);
        System.out.print("{");
        for (int i = 1; i <= maxCount; i++) {
            System.out.print(firstArray[maxCount - element - 1] + " ");
            element--;
        }
        System.out.print("}");

        input.close();
    }

    private static void getMaxEqualNumsInRow() {
        Scanner input = new Scanner(System.in);

        int[] firstArray = new int[10];
        int count = 1;
        int number;
        int maxCount = 1;
        int maxNumber = 0;
        int row = 0;

        for (int i = 0; i < firstArray.length; i++) {
            System.out.printf("Enter the array element[%d]: ", i);
            firstArray[i] = input.nextInt();
        }

        System.out.println(java.util.Arrays.toString(firstArray));

        for (int i = 0; i < firstArray.length - 1; i++) {
            if (firstArray[i] == firstArray[i + 1]) {
                count += 1;
                number = firstArray[i];

                if (count >= maxCount) {
                    maxCount = count;
                    maxNumber = number;
                    row = i;
                }
            } else {
                count = 1;
            }
        }
        System.out.println("The count of equal numbers in a row is: " + maxCount + " for number " + maxNumber);
        System.out.print("{");
        for (int i = 1; i <= maxCount; i++) {
            System.out.print(firstArray[row + 1] + " ");
            row--;
        }
        System.out.print("}");

        input.close();
    }

    private static void lexArrays() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the first array: ");
        int n = input.nextInt();
        System.out.print("Enter the length of the second array: ");
        int k = input.nextInt();

        char[] firstArray = new char[n];
        char[] secondArray = new char[k];

        for (int i = 0; i < firstArray.length; i++) {
            System.out.printf("Enter %d char element of the first array with %d elements: ", i, n);
            firstArray[i] = input.next().charAt(0);
        }

        for (int i = 0; i < secondArray.length; i++) {
            System.out.printf("Enter %d char element of the second array with %d elements: ", i, k);
            secondArray[i] = input.next().charAt(0);
        }

        System.out.println(java.util.Arrays.toString(firstArray));
        System.out.println(java.util.Arrays.toString(secondArray));

        boolean areEqual = true;
        if (firstArray.length < secondArray.length){
            for (int i = 0; i < firstArray.length - 1; i++) {
                if (firstArray[i] != secondArray[i]){
                    areEqual = false;
                    System.out.println("The first array is lexicosomething before the second one.");
                    break;
                } else {
                    System.out.println("The elements are equal, but the first array is before the second one.");
                }
            }
        } else if (firstArray.length > secondArray.length){
            for (int i = 0; i < secondArray.length - 1; i++) {
                if (firstArray[i] != secondArray[i]) {
                    areEqual = false;
                    System.out.println("The second array is lexicosomething before the first one.");
                    break;
                } else {
                    System.out.println("The elements are equal, but the second array is before the first.");
                }
            }
        } else {
            for (int i = 0; i < secondArray.length - 1; i++) {
                if (firstArray[i] != secondArray[i]) {
                    areEqual = false;
                    if (firstArray[i] < secondArray[i]){
                        System.out.println("The first array is lexicosomething before the second array.");
                    } else if (firstArray[i] > secondArray[i]){
                        System.out.println("The second array is lexicosomething before the first one.");
                    } else {
                        System.out.println("The arrays are equal and are lexicosomething are at one and same place/value.");
                    }
                    break;
                }
            }
        }
        System.out.println("The arrays are equal: " + areEqual);

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
