package com.company;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
//        helloName("Onufri");
//        int resultOne = getMax(5, 3);
//        System.out.println(resultOne);

//        int result = getMax(1, 2, 3);
//        System.out.println(result);

//        findLastDigit();
//        findSameNumInArray();
//        checkNeighbourElements();
//        findFirstBiggerOrSmaller();
//        showReversedNum();
        
    }

    private static void showReversedNum() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your test number: ");
        int number = input.nextInt();

        reverseNumber(number);

        input.close();
    }

    private static void reverseNumber(int number) {
        int digit;
        while(number != 0){
            digit = number % 10;
            System.out.print(digit);
            number = number / 10;
        }
    }

    private static void findFirstBiggerOrSmaller() {
        Scanner input = new Scanner(System.in);

        int position = 0;
        int[] testArray = new int[10];

        enterArrayElements(input, testArray);

        for (int i = 1; i < testArray.length - 2 ; i++) {
            if (biggerThanNeighbours(testArray, i)){
                position = i;
                System.out.printf("The first element that is bigger than its neighbours is on position %d", position);
                break;
            } else if (smallerThanNeighbours(testArray, i)){
                position = i;
                System.out.printf("The first element that is smaller than its neighbours is on position %d", position);
                break;
            } else {
                position = 0;
            }
        }

        if (position == 0){
            System.out.println("-1");
        }

        input.close();
    }

    private static boolean biggerThanNeighbours(int[] testArray, int i){
        boolean isBigger = false;
        if ((testArray[i] > testArray[i + 1]) && (testArray[i] > testArray[i - 1])) {
           isBigger = true;
        }
        return isBigger;
    }
    private static boolean smallerThanNeighbours(int[] testArray, int i){
        boolean isSmaller = false;
        if ((testArray[i] < testArray[i + 1]) && (testArray[i] < testArray[i - 1])) {
            isSmaller = true;
        }
        return isSmaller;
    }

    private static void checkNeighbourElements() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array's position that you want to check: ");
        int  position = input.nextInt();

        int[] testArray = new int[10];

        enterArrayElements(input, testArray);

        if ((position != 0) && (position != testArray.length - 1)){
            biggerOrSmaller(position, testArray);
        } else if (position == testArray.length - 1){
            checkLeftElement(position, testArray);
        } else{
            checkRightElement(position, testArray);
        }

        input.close();
    }

    private static void biggerOrSmaller(int position, int[] testArray) {
        if (checkLeftElement(position, testArray) && checkRightElement(position, testArray)){
            System.out.printf("%nThe element %d is bigger than its neighbour elements.", position);
        } else if (!checkRightElement(position, testArray) && !checkLeftElement(position, testArray)) {
            System.out.printf("%nThe element %d is smaller than its neighbour elements.", position);
        } else {
            System.out.printf("%nThe element is NOT bigger or smaller simultaneously than its neighbour elements.", position);
        }
    }

    private static boolean checkRightElement(int position, int[] testArray){
        boolean isBiggerThanRight;

        if (testArray[position] > testArray[position + 1]){
            isBiggerThanRight = true;
            System.out.printf("The array element %d is bigger than the next element. ", position);
        } else if (testArray[position] < testArray[position + 1]) {
            isBiggerThanRight = false;
            System.out.printf("The array element %d is smaller than the next element. ", position);
        } else {
            isBiggerThanRight = false;
            System.out.printf("The array element %d is equal to the next element on its right. ", position);
        }

        return isBiggerThanRight;
    }

    private static boolean checkLeftElement(int position, int[] testArray){
        boolean isBiggerThanLeft;

        if (testArray[position] > testArray[position - 1]){
            isBiggerThanLeft = true;
            System.out.printf("The array element %d is bigger than the previous element.", position);
        } else if (testArray[position] < testArray[position - 1]) {
            isBiggerThanLeft = false;
            System.out.printf("The array element %d is smaller than the previous element.", position);
        } else {
            isBiggerThanLeft = false;
            System.out.printf("The array element %d is equal to the next element on its right.", position);
        }

        return isBiggerThanLeft;
    }

    private static void findSameNumInArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your test number: ");
        int  number = input.nextInt();

        int[] testArray = new int[10];

        enterArrayElements(input, testArray);

        searchForNumber(number, testArray);

        input.close();
    }

    private static void enterArrayElements(Scanner input, int[] testArray) {
        for (int i = 0; i < testArray.length; i++) {
            System.out.printf("Enter the array element[%d]: ", i);
            testArray[i] = input.nextInt();
        }
    }

    private static void searchForNumber(int number, int[] testArray) {
        int count = 0;
        for (int i = 0; i < testArray.length; i++) {
            if (number == testArray[i]){
                count ++;
            }
        }
        System.out.printf("The number %d is contained %d times in the test array.", number, count);
    }

    private static void findLastDigit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your test number: ");
        int  number = input.nextInt();

        int result = number % 10;

        showNumber(result);

        input.close();
    }

    private static void showNumber(int result) {
        switch(result){
            case 0:
                System.out.println("The last digit is zero.");
                break;
            case 1:
                System.out.println("The last digit is one.");
                break;
            case 2:
                System.out.println("The last digit is two.");
                break;
            case 3:
                System.out.println("The last digit is three.");
                break;
            case 4:
                System.out.println("The last digit is four.");
                break;
            case 5:
                System.out.println("The last digit is five.");
                break;
            case 6:
                System.out.println("The last digit is six.");
                break;
            case 7:
                System.out.println("The last digit is seven.");
                break;
            case 8:
                System.out.println("The last digit is eight.");
                break;
            case 9:
                System.out.println("The last digit is nine.");
                break;
        }
    }

    static void helloName(String name){
        System.out.println("Hello, " + name + "!");
    }

    static int getMax(int a, int b){
        return (a > b)? a : b;
    }

    static int getMax(int a, int b, int c){
        int maxTwo = getMax(a, b);
        return getMax(maxTwo, c);
    }



}
