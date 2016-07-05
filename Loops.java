package com.company;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
//        printNumbersToN(); - correct
//        numDividedToThreeOrSeven(); - not correct, the requirement is different
//        guessTheNumber(); - correct
//        minMaxNumber(); - correct
//        playingCards(); - not correct, not displaying J, Q, K, A
//        sumFibonacciNums(); - correct
//        nDividedKFactorial(); - correct, but you can print better hints
//        nMultiKFactorial(); - correct
//        nDivKPowNFactorial(); - seems to be correct as the requirement is not very clear
//        catalansNumbers(); - correct, but n can be 0 and 1 while you are saying "Enter number N > 1:"
//        numberMatrix(); - correct, but doesn't look like matrix when double digit numbers are printed
//        lastZerosFactorial(); - correct
//        decimalToBinary(); - not correct, no check for negative numbers and bad results for bigger numbers
//        decimalToHex(); - 50% correct, not working for negative numbers
//        binaryToDecimal(); - not correct, input requirement is wrong (you want int as an input where it should be binary), also not working correct
//        hexToDecimal(); - 50% correct, not working for negative numbers
//        randomNumber(); - correct
//        Even though there are small mistakes your homework is eGGcelent!
    }

    private static void randomNumber() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int randomNum = (int)(Math.random() * n);
        System.out.println("Your random number is: " + randomNum);

        input.close();
    }

    private static void hexToDecimal() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a HEX number: ");
        String n = input.next();

        int hexLength = n.length() - 1;
        int hexResultNumber = 0;
        int charToInt = 0;
        char hexChar;

        for (int i = 0; (hexLength >= 0) && (i <= n.length()); i++) {
            hexChar = n.charAt(hexLength);
            switch(hexChar){
                case '1':
                    charToInt = 1;
                    break;
                case '2':
                    charToInt = 2;
                    break;
                case '3':
                    charToInt = 3;
                    break;
                case '4':
                    charToInt = 4;
                    break;
                case '5':
                    charToInt = 5;
                    break;
                case '6':
                    charToInt = 6;
                    break;
                case '7':
                    charToInt = 7;
                    break;
                case '8':
                    charToInt = 8;
                    break;
                case '9':
                    charToInt = 9;
                    break;
                case 'A':
                    charToInt = 10;
                    break;
                case 'B':
                    charToInt = 11;
                    break;
                case 'C':
                    charToInt = 12;
                    break;
                case 'D':
                    charToInt = 13;
                    break;
                case 'E':
                    charToInt = 14;
                    break;
                case 'F':
                    charToInt = 15;
                    break;
            }
            hexResultNumber += (Math.pow(16, i) * charToInt);
            hexLength--;
        }
        System.out.println("The actual decimal number is: " + hexResultNumber);

        input.close();
    }

    private static void binaryToDecimal() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int n = input.nextInt();
        System.out.println("The number in binary is: " + Integer.toBinaryString(n));

        //Transform the binary number to String so we can take its length
        String number = Integer.toBinaryString(n);
        int length = number.length();
        System.out.println("The length of the binary number is: " + length);

        int binaryResult;
        int resultNumber = 0;

        //The mask should be equal to the length - 1 because for binary we start to count from 0
        int mask = 1 << length - 1;
        System.out.println("The mask is: " + Integer.toBinaryString(mask));

        //Check each bit of the binary number
        for (; length >= 0; length--) {
            binaryResult = n & mask;
            System.out.println("The binary result is: " + Integer.toBinaryString(binaryResult));

            //If n & mask != 0 then the bit on this position is positive
            if (binaryResult != 0 ){
                resultNumber += Math.pow(2, (length - 1));
                System.out.println("The result number is: " + Integer.toBinaryString(resultNumber));
            }
            //Move the mask one bit to the right
            mask >>= 1;
            System.out.println("The new mask is: " + Integer.toBinaryString(mask));
        }
        System.out.println("The actual number is: " + resultNumber);

        input.close();
    }

    private static void decimalToHex() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int divResult;
        int divRemainder;
        String hexChar;
        String hexNumber = "";

        for (int i = 0; i <= n; i++) {
            //Each remainder of n % 16 is one digit of the HEX number
            divResult = n % 16;

            if (divResult >= 10) {
                switch (divResult) {
                    case 10:
                        hexChar = "A";
                        hexNumber += hexChar;
                        break;
                    case 11:
                        hexChar = "B";
                        hexNumber += hexChar;
                        break;
                    case 12:
                        hexChar = "C";
                        hexNumber += hexChar;
                        break;
                    case 13:
                        hexChar = "D";
                        hexNumber += hexChar;
                        break;
                    case 14:
                        hexChar = "E";
                        hexNumber += hexChar;
                        break;
                    case 15:
                        hexChar = "F";
                        hexNumber += hexChar;
                        break;
                }
            } else{
                hexNumber += divResult;
            }

            //n should be divided in 16 until n = 1;
            divRemainder = n / 16;
            n = divRemainder;
        }

        // The actual HEX number is hexNumber written backwards
        System.out.printf("The number in HEX is: ");
        System.out.println(new StringBuffer(hexNumber).reverse().toString());

        input.close();
    }

    private static void decimalToBinary() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.println(Integer.toBinaryString(n));

        int divResult;
        int divRemainder = 0;
        int result;
        String binaryNumber = "";


        for (int i = 0; i <= n; i++) {
            //Each remainder of n % 2 is one bit of the binary number
            divResult = n % 2;
            result = divResult;
            System.out.println(result);

            //n should be divided in 2 until n = 1;
            divRemainder = n / 2;
            n = divRemainder;

            binaryNumber += divResult;
        }
        // Check for the last division remainder
        if (divRemainder == 1){
            result = 1;
            binaryNumber += result;
            System.out.println(result);
        } else {
            result = 0;
            binaryNumber += result;
            System.out.println(result);
        }

        // The actual binary number is binaryNumber written backwards
        System.out.printf("The number in binary is: ");
        System.out.println(new StringBuffer(binaryNumber).reverse().toString());

        input.close();
    }

    private static void lastZerosFactorial() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number N > 0 and N < 20: ");
        int n = input.nextInt();
        long nFactorial = 1;
        int count = 0;

        for (; n > 1; n--) {
            nFactorial *= n;
        }
        System.out.println("n factorial is: " + nFactorial);

        for (int i = 0; i < nFactorial; i++) {
            if (nFactorial % 10 == 0){
                count++;
                nFactorial = nFactorial / 10;
            } else {
                break;
            }
        }
        System.out.println("The count of the last zeros is: " + count);

        input.close();
    }

    private static void numberMatrix() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number N > 0 and N < 20: ");
        int n = input.nextInt();
        int number = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(number);
                number++;
            }
            System.out.println(number);
            number = i + 2;
        }

        input.close();
    }

    private static void catalansNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number N > 1: ");
        double n = input.nextDouble();

        double nFactorial = 1.0;
        double nPlusOneFact = 1.0;
        double twoMultiNFact = 1.0;

        double nPlusOne = n + 1.0;
        double twoMultiN =  2.0 * n;
        double result;

        for (; n > 1; n--) {
            nFactorial *= n;
            System.out.println("n factorial is: " + nFactorial);
        }
        for (; nPlusOne > 1; nPlusOne--) {
            nPlusOneFact *= nPlusOne;
            System.out.println("(n + 1) factorial is: " + nPlusOneFact);
        }
        for (; twoMultiN > 1 ; twoMultiN--) {
            twoMultiNFact *= twoMultiN;
            System.out.println("(2 * n) factorial is: " + twoMultiNFact);
        }

        result = twoMultiNFact / (nPlusOneFact * nFactorial);
        System.out.println("The result of (2 * n)! / ((n + 1)! * n!) is: " + result);
        input.close();
    }

    private static void nDivKPowNFactorial() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number N > 1: ");
        double n = input.nextDouble();
        System.out.print("Enter number K > 1: ");
        double k = input.nextDouble();

        double sum;
        double nFactorial = 1.0;
        double kFactorial = 1.0;
        double division = 0.0;

        for (; (n >= 1) && (k > 1); n--) {
            nFactorial *= n;
            kFactorial *= Math.pow(k, n);
            division += (nFactorial / kFactorial);

            System.out.println(division);
            kFactorial = 1.0;
            nFactorial = 1.0;
        }

        sum = 1.0 + division;
        System.out.println("The sum of 1 + 1!/k(pow)1 + 2!/k(pow)2 + ... + n!/k(pow)n is: " + sum);

        input.close();
    }

    private static void nMultiKFactorial() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number N > 1: ");
        int n = input.nextInt();
        System.out.print("Enter number K < N: ");
        int k = input.nextInt();

        long nFactorial = 1;
        long kFactorial = 1;
        long subFactorial = 1;
        double multFactorial;
        double result;

        int sub = n - k;
        for (; sub >  1; sub--) {
            subFactorial *= sub;
        }
        System.out.println("(N - K)! is: " + subFactorial);

        for (; n > 1; n--) {
            nFactorial *= n;
        }
        System.out.println("N! is: " + nFactorial);

        for (; k > 1; k--){
            kFactorial *= k;
        }
        System.out.println("K! is: " + kFactorial);

        multFactorial = nFactorial * kFactorial;
        System.out.println("N! * K! is: " + multFactorial);

        result = multFactorial / subFactorial;
        System.out.println("(N! * K!) / ((N - K)!) is: " + result);

        input.close();
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
