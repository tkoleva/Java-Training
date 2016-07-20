package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
//        helloName("Onufri");
//        maxNumbers();
//        findLastDigit();
//        findSameNumInArray();
//        checkNeighbourElements();
//        findFirstBiggerOrSmaller();
//        showReversedNum();
//        bigDecimalFactorial();
//        threeTasksSelection();
    }

    private static void threeTasksSelection() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to select one of the following tasks for execution: ");
        System.out.println("1: Reverse positive numbers;");
        System.out.println("2: AverageArraySum;");
        System.out.println("3: Solve a * x + b = 0.");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();

        switch(choice){
            case 1:
                System.out.print("Enter a positive number to be reversed: ");
                int number = input.nextInt();
                if (number > 0){
                    reversePositiveNumber(number);
                } else {
                    System.out.println("The number should be a positive one!");
                    //add the same method again
                }
                break;
            case 2:
                averageArrayElementsSum(input);
                break;
            case 3:
                simpleEquasionCalc(input);
                break;
        }

        input.close();
    }

    private static void simpleEquasionCalc(Scanner input) {
        System.out.print("Enter your 'a' number: ");
        double a = input.nextDouble();
        System.out.print("Enter your 'b' number: ");
        double b = input.nextDouble();
        if (a != 0){
            double x = - (b / a);
            System.out.println("The result for x = -(b / a) is: " + x);
        } else {
            System.out.println("Number 'a' can't be zero!");
            // enter the method name here again
        }
        return;
    }

    private static void averageArrayElementsSum(Scanner input) {
        int[] firstArray = new int[10];
        double result = 0;
        for (int i = 1; i < firstArray.length; i++) {
            System.out.printf("Enter the array element[%d]: ", i);
            firstArray[i] = input.nextInt();
            result += firstArray[i];
        }
        double averageResult = result / 10;
        System.out.println("The average result of the array is: " + averageResult);
    }

    private static void reversePositiveNumber(int number){
        int digit;
        while(number != 0){
            digit = number % 10;
            System.out.print(digit);
            number = number / 10;
        }
    }

    private static void bigDecimalFactorial() {
        BigDecimal result = new BigDecimal("1");
        BigDecimal n;

        for (int i = 100; i >= 1; i--) {
            for (int j = i; j > 1; j--) {
                n = new BigDecimal(j);
                result = result.multiply(n);
            }

            System.out.println("The " + i + "N! is: " + result);
            result = result.subtract(result.subtract(BigDecimal.ONE));
        }
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

    private static void maxNumbers() {
        int resultOne = getMax(5, 3);
        System.out.println(resultOne);

        int result = getMax(1, 2, 3);
        System.out.println(result);
    }

    static int getMax(int a, int b){
        return (a > b)? a : b;
    }

    static int getMax(int a, int b, int c){
        int maxTwo = getMax(a, b);
        return getMax(maxTwo, c);
    }


}
