package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

//        firstTask();
//        secondTask();
//        thirdTask();
//        fourthTask();
//        rectSquareParam(input);
//        trapecSquare(input);
//        moonWeightCalc();
//        pointInCircle();
//        pointInCircOutRect();
//        fourDigitsNumber();
//        eleventhTask();
//        revertNumber();
//        simpleNumbers();

    public static void main(String[] args) throws IOException {


    }

    private static void simpleNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number n < 100: ");
        int n = input.nextInt();
        double squareRootN = Math.sqrt(n);
//        int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

        for (int i = 2; i < Math.sqrt(n); i++ )
            for (int j = i * i; j <= n; j++){
                System.out.println("");
            }

        input.close();
    }

    private static void revertNumber() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number N: ");
        int number = input.nextInt();
        System.out.println("Enter position P: ");
        int position = input.nextInt();
        System.out.println("Enter bit V (select between 0 or 1): ");
        int v = input.nextInt();

        int mask = 1 << position;

        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toBinaryString(mask));

        System.out.println((((number & mask) != 0) && (v == 0))? (number & (~mask)) : (number | mask));

        input.close();
    }

    private static void eleventhTask() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number N: ");
        int number = input.nextInt();
        System.out.println("Enter position P: ");
        int position = input.nextInt();
        int i = 1; // 00000001
        int mask = i << position;

        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toBinaryString(position));
        System.out.println(Integer.toBinaryString(mask));

        // Move the 1st bit with p positions
        // If number & mask are positive then the p -th bit of number is 1
        System.out.println((number & mask) != 0 ? 1 : 0);

        input.close();
    }

    private static void fourDigitsNumber() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first digit: ");
        int firstDigit = input.nextInt();

        System.out.println("Enter the second digit: ");
        int secondDigit = input.nextInt();

        System.out.println("Enter the third digit: ");
        int thirdDigit = input.nextInt();

        System.out.println("Enter the fourth digit: ");
        int fourthDigit = input.nextInt();

        System.out.println("The number is: " + firstDigit + secondDigit + thirdDigit + fourthDigit);

        int digitSum = firstDigit + secondDigit + thirdDigit + fourthDigit;
        System.out.println("The sum of the number's digits is: " + digitSum);

        System.out.println("The digits of the number in opposite way: " + fourthDigit + thirdDigit + secondDigit +
            firstDigit);

        System.out.println("The first digit on the last place: " + fourthDigit + secondDigit + thirdDigit + firstDigit);

        System.out.println("The middle digits swapped: " + firstDigit + thirdDigit + secondDigit + fourthDigit);

        System.out.println("Enter your test number: ");
        int totalNum = input.nextInt();
        int digitOne = totalNum % 10;
        System.out.println(digitOne);

        int digitTwo = (totalNum / 10) % 10;
        System.out.println(digitTwo);

        int digitThree = (totalNum / 100) % 10;
        System.out.println(digitThree);

        int digitFour = (totalNum / 1000) % 10;
        System.out.println(digitFour);

        int secondSum = digitOne + digitTwo + digitThree + digitFour;
        System.out.println("The sum of the number's digits is: " + secondSum);

        System.out.println("The digits of the number in opposite way: " + digitOne + digitTwo + digitThree +
                digitFour);

        System.out.println("The first digit on the last place: " + digitOne + digitThree + digitTwo + digitFour);

        System.out.println("The middle digits swapped: " + digitFour + digitTwo + digitThree + digitOne);

        input.close();
    }

    private static void pointInCircOutRect() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first coordinate: ");
        double coordinateX = input.nextDouble();

        System.out.println("Enter the second coordinate: ");
        double coordinateY = input.nextDouble();

        double powerK = Math.sqrt((Math.pow(coordinateX, 2.0)) + (coordinateY * coordinateY));
        System.out.println(powerK);

        boolean outCircle = powerK < 5.0;
        System.out.println("The point is in the circle: " + outCircle);

        boolean outRectX = ((coordinateX < -1) || (coordinateX) > 5);
        boolean outRectY = ((coordinateY < 1) || coordinateY > 5);
        boolean outRectPoint = outRectX && outRectY;

        System.out.println("The point is in the circle: " + outCircle + " and the point is outside of the rectangle: " +
                outRectPoint);

        input.close();
    }

    private static void pointInCircle() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first coordinate: ");
        int coordinateX = input.nextInt();

        System.out.println("Enter the second coordinate: ");
        int coordinateY = input.nextInt();

        double powerK = Math.sqrt((coordinateX * coordinateX) + (coordinateY * coordinateY));

        System.out.println(powerK);

        boolean isInCircle = (powerK < 5);
        System.out.println("The point is in the circle: " + isInCircle);

        input.close();
    }

    private static void moonWeightCalc() {
        Scanner input = new Scanner(System.in);

        float gMoon = (0.17f * 9.8f);
        System.out.println("The Moon's acceleration is: " + gMoon);

        System.out.println("Enter your weight on Earth: ");
        float myWeight = input.nextFloat();

        float totalMasa = myWeight / 9.8f;
        float moonWeight = totalMasa * gMoon;

        System.out.println("Your weight on Moon is: " + moonWeight);

        input.close();
    }

    private static void trapecSquare(Scanner input) {
        double trapecSideA;
        double trapecSideB;
        double trapecHeight;

        System.out.println("Enter side A of a trapecium: ");
        trapecSideA = input.nextDouble();
        System.out.println("Enter side B of a trapecium: ");
        trapecSideB = input.nextDouble();
        System.out.println("Enter height H of a trapecium: ");
        trapecHeight = input.nextDouble();

        double trapecSquare = ((trapecSideA + trapecSideB) / 2) * trapecHeight;
        System.out.println("The square of a trapecium is: " + trapecSquare);
    }

    private static void rectSquareParam(Scanner input) {
        int rectSideA = 0;
        int rectSideB = 0;

        System.out.println("Enter side A of a rectangle: ");
        rectSideA = input.nextInt();

        System.out.println("Enter side B of a rectangle: ");
        rectSideB = input.nextInt();

        int rectSquare = (int) (rectSideA * rectSideB);
        System.out.println("The squear of a rectagnle is: " + rectSquare);

        int rectPerimeter = (int)(2 * (rectSideA + rectSideB));
        System.out.println("The perimerter of a rectangle is: " + rectPerimeter);
    }

    private static void fourthTask() {
        int number = 41948;
        int mask = 4;

        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toBinaryString(mask));

        int result = number + mask;
        boolean thirdIsOne = result != 0;

        System.out.println(thirdIsOne);
    }

    private static void thirdTask() {
        int number = 20100;
        boolean isThirdSeven = (((number / 100) % 10) == 7);
        System.out.println(isThirdSeven);
    }

    private static void secondTask() {
        int number = 35;
        boolean isDivByFive = ((number % 5) == 0);
        boolean isDivBySeven = ((number % 7) == 0);
        boolean isDivided = isDivByFive && isDivBySeven;
        System.out.println(number + " is divisible by 5 and 7: " + isDivided);
    }

    private static void firstTask() {
        int number = 24;
        boolean isOdd = (number % 2) !=0;
        System.out.println("Our number is odd: " + isOdd);
    }
}
