package com.company;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
//        printNumbersToN();
//        numDividedToThreeOrSeven();
//        guessTheNumber();
//        minMaxNumber();
//        playingCards();
//        sumFibonacciNums();
        nDividedKFactorial();

    }

    private static void nDividedKFactorial() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number N > 1: ");
        int n = input.nextInt();
        System.out.print("Enter number K < N: ");
        int k = input.nextInt();

        long nFactorial = 1;
        long kFactorial = 1;
        double result;

        for (; n > 1; n--) {
            nFactorial *= n;
            System.out.println(nFactorial);
        }
        for (; k > 1; k--){
            kFactorial *= k;
            System.out.println(kFactorial);
        }

        result = nFactorial / kFactorial;
        System.out.println("N!/K! is: " + result);

        input.close();
    }

    private static void sumFibonacciNums() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number N: ");
        int userInput = input.nextInt();

        int totalSum = 0;
        int previousNum = 0;
        int currentNum = 1;

        System.out.print(totalSum + " ");

        for (int i = 1; i <= userInput; i++){
            int sum = previousNum + currentNum;
            System.out.print(sum + " ");
            totalSum += sum;
            currentNum = previousNum;
            previousNum = sum;
        }

        System.out.printf("The total sum of the first %d Fibonacci number is: %d", userInput, totalSum);

        input.close();
    }

    private static void playingCards() {
        for (int suits = 1; suits <= 4; suits++) {
            switch(suits){
                case 1:
                    System.out.print("Suite Clubs: ");
                    break;
                case 2:
                    System.out.printf("%n" + "Suite Tiles: ");
                    break;
                case 3:
                    System.out.printf("%n" + "Suite Hearts: ");
                    break;
                case 4:
                    System.out.printf("%n" + "Suite Spades: ");
            }

            for (int cards = 2; cards < 15; cards++) {
                System.out.print(" " + cards);
            }
        }
    }

    private static void minMaxNumber() {
        Scanner input = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i ++){
            System.out.print("Enter number: ");
            int userInput = input.nextInt();

            if (userInput < min){
                min = userInput;
            }

            if (userInput > max){
                max = userInput;
            }
        }

        System.out.println("The min number is: " + min);
        System.out.println("The max number is: " +  max);

        input.close();
    }

    private static void guessTheNumber() {
        Scanner input = new Scanner(System.in);

        int number = 45;
        boolean userIsNotRight = true;

        do {
            System.out.print("Guess the number (between 1 and 100): ");
            int userInput = input.nextInt();

            if (userInput < number){
                System.out.println("The magic number is bigger than " + userInput);
            } else if (userInput > number){
                System.out.println("The magic number is lower than " + userInput);
            } else {
                System.out.println("You guessed the number!");
                userIsNotRight = false;
            }
        } while(userIsNotRight);

        input.close();
    }

    private static void numDividedToThreeOrSeven() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your N number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            if (((i % 7) == 0) && ((i % 3) == 0)){
                System.out.println(i);
            }
        }

        input.close();
    }

    private static void printNumbersToN() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your N number: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println(i);
        }

        input.close();
    }
}
