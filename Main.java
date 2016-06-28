package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
//        oddOrEvenNum();
//        dividedToFiveOrSeven();
//        thirdDigitIsSeven();
//        checkThirdBit();
//        rectAreaAndPerimeter();
//        trapeziumArea();
//        moonWeightCalc();
//        pointInCircle();
//        pointInCircleOutRect();
//        fourDigitsNumber();
//        fourDigitsNumberSimple();
//        positionBitValue();
//        changeBitValue();
//        primeNumbers();

    }

    private static void primeNumbers() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number num < 100: ");
        int num = input.nextInt();
//        int[] numbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        int maxDevider = (int) Math.sqrt(num);

        for (int i = 2; i < maxDevider; i++){
            if ((num % i) == 0){
                System.out.println(i + " is not prime");
            } else {
                System.out.println(i + " is prime");
            }
        }

        input.close();
    }

    private static void changeBitValue() {
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

        // If (number * mask) == 1 and v ==0
        if (((number & mask) != 0) && (v == 0)){
            // convert mask from 1 to 0
            System.out.println(number & (~mask));
        } else {
            // in any other case (number + mask = 1)
            System.out.println(number | mask);
        }

        input.close();
    }

    private static void positionBitValue() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number N: ");
        int number = input.nextInt();
        System.out.println("Enter position P: ");
        int position = input.nextInt();
        int i = 1; // 00000001
        int mask = i << position;

        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toBinaryString(mask));

        // Move the 1st bit with p positions
        // If number & mask are positive then the p -th bit of number is 1
        System.out.println((number & mask) != 0 ? 1 : 0);

        input.close();
    }

    private static void fourDigitsNumber() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your test number: ");
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

    private static void fourDigitsNumberSimple() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first digit: ");
        int firstDigit = input.nextInt();

        System.out.print("Enter the second digit: ");
        int secondDigit = input.nextInt();

        System.out.print("Enter the third digit: ");
        int thirdDigit = input.nextInt();

        System.out.print("Enter the fourth digit: ");
        int fourthDigit = input.nextInt();

        System.out.println("The number is: " + firstDigit + secondDigit + thirdDigit + fourthDigit);

        int digitSum = firstDigit + secondDigit + thirdDigit + fourthDigit;
        System.out.println("The sum of the number's digits is: " + digitSum);

        System.out.println("The digits of the number in opposite way: " + fourthDigit + thirdDigit + secondDigit +
            firstDigit);

        System.out.println("The first digit on the last place: " + fourthDigit + secondDigit + thirdDigit + firstDigit);

        System.out.println("The middle digits swapped: " + firstDigit + thirdDigit + secondDigit + fourthDigit);

        input.close();
    }

    private static void pointInCircleOutRect() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first coordinate: ");
        int coordinateX = input.nextInt();

        System.out.println("Enter the second coordinate: ");
        int coordinateY = input.nextInt();

        // From Pythagorean theorem: c^2 = a^2 + b^2
        double powerK = Math.sqrt((Math.pow(coordinateX, 2.0)) + (Math.pow(coordinateY, 2.0)));
        System.out.println(powerK);

        // Check if our point is in a circle with coordinates K((0,0),5)
        boolean outCircle = powerK < 5.0;
        System.out.println("The point is in the circle: " + outCircle);

        // Check if our point is outside of a rectangle with coordinates (-1, 1) and (5, 5)
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

        // From Pythagorean theorem: c^2 = a^2 + b^2
        double powerK = Math.sqrt((Math.pow(coordinateX, 2.0)) + (Math.pow(coordinateY, 2.0)));

        System.out.println(powerK);

        // Check if our point is in a circle with coordinates K((0,0),5)
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

        float totalMass = myWeight / 9.8f;
        float moonWeight = totalMass * gMoon;

        System.out.println("Your weight on Moon is: " + moonWeight);

        input.close();
    }

    private static void trapeziumArea() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side A of a trapezium: ");
        double trapeziumSideA = input.nextDouble();
        System.out.print("Enter side B of a trapezium: ");
        double trapeziumSideB = input.nextDouble();
        System.out.print("Enter height H of a trapezium: ");
        double trapeziumHeight = input.nextDouble();

        double trapeziumArea = ((trapeziumSideA + trapeziumSideB) / 2) * trapeziumHeight;
        System.out.println("The square of a trapecium is: " + trapeziumArea);

        input.close();
    }

    private static void rectAreaAndPerimeter() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side A of a rectangle: ");
        int rectSideA = input.nextInt();

        System.out.println("Enter side B of a rectangle: ");
        int rectSideB = input.nextInt();

        int rectArea = (int) (rectSideA * rectSideB);
        System.out.println("The squear of a rectagnle is: " + rectArea);

        int rectPerimeter = (int)(2 * (rectSideA + rectSideB));
        System.out.println("The perimerter of a rectangle is: " + rectPerimeter);

        input.close();
    }

    private static void checkThirdBit() {
        int number = 41948;
        int mask = 4;

        System.out.println(Integer.toBinaryString(number));
        System.out.println(Integer.toBinaryString(mask));

        int result = number + mask;
        boolean thirdIsOne = (result != 0);

        System.out.println("The third bit of our number is 1: " + thirdIsOne);
    }

    private static void thirdDigitIsSeven() {

        int number = 20100;

        //Take the third digit of the number and check if the division by 10 remainder is equal to 7
        boolean isThirdSeven = (((number / 100) % 10) == 7);

        System.out.println("The third digit of your number is 7: " + isThirdSeven);
    }

    private static void dividedToFiveOrSeven() {

        int number = 35;
        boolean isDivByFive = ((number % 5) == 0);
        boolean isDivBySeven = ((number % 7) == 0);
        boolean isDivided = isDivByFive && isDivBySeven;

        System.out.println(number + " is divisible by 5 and 7: " + isDivided);
    }

    private static void oddOrEvenNum() {

        int number = 24;
        boolean isOdd = ((number % 2) != 0);

        System.out.println("Our number is odd: " + isOdd);
    }
}
