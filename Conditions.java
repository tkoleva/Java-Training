package com.company;

import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
//        firstTask();
//        secondTask();
//        thirdTask();
//        fourthTask();
//        quadraticEquation();
//        biggestNumber();
//        zeroSums();
//        bonusPoints();
//        numberToString();
    }

    private static void numberToString() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number from 0 to 999: ");
        int number = input.nextInt();

        // The last digit from the number
        int digitTenth = number % 10;
        System.out.println("The tenth digit is: " + digitTenth);

        // The second digit from the number. If not, the second digit = 0
        int digitTwo = (number / 10) % 10;
        System.out.println(digitTwo);

        // The third digit of the number. If not, the third digit = 0
        int  digitOne = (number / 100) % 10;
        System.out.println(digitOne);

        String stringOne = "";
        String stringTwo = "";
        String stringThree = "";

        // If the first digit is > 0 then we should print its value
        if ((digitOne != 0)) {
            number = digitOne * 100;
            switch (number) {
                case 100:
                    stringOne = "Сто";
                    break;
                case 200:
                    stringOne = "Двеста";
                    break;
                case 300:
                    stringOne = "Триста";
                    break;
                case 400:
                    stringOne = "Четиристотин";
                    break;
                case 500:
                    stringOne = "Петстотин";
                    break;
                case 600:
                    stringOne = "Шестотин";
                    break;
                case 700:
                    stringOne = "Седемстотин";
                    break;
                case 800:
                    stringOne = "Осемстотин";
                    break;
                case 900:
                    stringOne = "Деветстотин";
                    break;
            }
        }
        // If the second digit > 0 then we should print it
        if ((digitTwo != 0)) {
            number = digitTwo * 10;
            switch (number) {
                case 10:
                    stringTwo = "Десет";
                    break;
                case 20:
                    stringTwo = "Двадесет";
                    break;
                case 30:
                    stringTwo = "Тридесет";
                    break;
                case 40:
                    stringTwo = "Четиредесет";
                    break;
                case 50:
                    stringTwo = "Петдесет";
                    break;
                case 60:
                    stringTwo = "Шестдесет";
                    break;
                case 70:
                    stringTwo = "Седемдесет";
                    break;
                case 80:
                    stringTwo = "Осемдесет";
                    break;
                case 90:
                    stringTwo = "Деветдесет";
                    break;
            }
        }
        // If the second digit = 1 then we should print 'eleven', 'twelve' and so on
        if (digitTwo == 1) {
            number = (digitTwo * 10) + digitTenth;
            switch (number) {
                case 11:
                    stringTwo = "Единадесет";
                    break;
                case 12:
                    stringTwo = "Дванадесет";
                    break;
                case 13:
                    stringTwo = "Тринадесет";
                    break;
                case 14:
                    stringTwo = "Четиринадест";
                    break;
                case 15:
                    stringTwo = "Петнадесет";
                    break;
                case 16:
                    stringTwo = "Шестнадесет";
                    break;
                case 17:
                    stringTwo = "Седемнадесет";
                    break;
                case 18:
                    stringTwo = "Осемнадесет";
                    break;
                case 19:
                    stringTwo = "Деветнадесет";
                    break;
            }
        }
        // If the third digit is >=0 then we should print it. 0 will be printed only if the entire number is 0
        if (digitTenth >= 0) {
            number = digitTenth;
            switch (number) {
                case 0:
                    stringThree = "Нула";
                    break;
                case 1:
                    stringThree = "Едно";
                    break;
                case 2:
                    stringThree = "Две";
                    break;
                case 3:
                    stringThree = "Три";
                    break;
                case 4:
                    stringThree = "Четири";
                    break;
                case 5:
                    stringThree = "Пет";
                    break;
                case 6:
                    stringThree = "Шест";
                    break;
                case 7:
                    stringThree = "Седем";
                    break;
                case 8:
                    stringThree = "Осем";
                    break;
                case 9:
                    stringThree = "Девет";
                    break;
            }
        }
        if ((digitOne != 0) && (digitTwo != 0) && (digitTenth != 0) && (digitTwo != 1)) {
            System.out.println(stringOne + " " + stringTwo + " и " + stringThree);
        } else if ((digitOne != 0) && (digitTwo ==0) && (digitTenth ==0)){
            System.out.println(stringOne);
        } else if ((digitOne ==0) && (digitTwo ==0) && (digitTenth !=0)){
            System.out.println(stringThree);
        } else if ((digitTwo == 1) && (digitOne != 0)){
            System.out.println(stringOne + " и " + stringTwo);
        } else if ((digitTwo == 1) && (digitOne == 0)) {
            System.out.println(stringTwo);
        } else if ((digitOne == 0) && (digitTenth == 0) && (digitTwo != 0)){
            System.out.println(stringTwo);
        } else if ((digitOne !=0) && (digitTenth == 0)){
            System.out.println(stringOne + " и " + stringTwo);
        } else if ((digitTenth == 0) && (digitOne == 0) && (digitTwo == 0)){
            System.out.println(stringThree);
        } else if ((digitTwo == 0) && (digitOne != 0) && (digitTenth != 0)){
            System.out.println(stringOne + " и " + stringThree);
        } else if ((digitOne == 0) && (digitTwo != 0) && (digitTenth != 0)){
            System.out.println(stringTwo + " и " + stringThree);
        }

        input.close();
    }

    private static void bonusPoints() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your initial points between 1 and 9: ");
        int points = input.nextInt();

        switch (points){
            case 1:
                System.out.println("Your bonus points are: " + (points * 10));
                System.out.println("Your overall points are: " + ((points * 10) + points));
                break;
            case 2:
                System.out.println("Your bonus points are: " + (points * 10));
                System.out.println("Your overall points are: " + ((points * 10) + points));
                break;
            case 3:
                System.out.println("Your bonus points are: " + (points * 10));
                System.out.println("Your overall points are: " + ((points * 10) + points));
                break;
            case 4:
                System.out.println("Your bonus points are: " + (points * 100));
                System.out.println("Your overall points are: " + ((points * 100) + points));
                break;
            case 5:
                System.out.println("Your bonus points are: " + (points * 100));
                System.out.println("Your overall points are: " + ((points * 100) + points));
                break;
            case 6:
                System.out.println("Your bonus points are: " + (points * 100));
                System.out.println("Your overall points are: " + ((points * 100) + points));
                break;
            case 7:
                System.out.println("Your bonus points are: " + (points * 1000));
                System.out.println("Your overall points are: " + ((points * 1000) + points));
                break;
            case 8:
                System.out.println("Your bonus points are: " + (points * 1000));
                System.out.println("Your overall points are: " + ((points * 1000) + points));
                break;
            case 9:
                System.out.println("Your bonus points are: " + (points * 1000));
                System.out.println("Your overall points are: " + ((points * 1000) + points));
                break;
            default:
                System.out.println("The points aren't between 1 to 9!");
        }

        input.close();
    }

    private static void zeroSums() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first integer number: ");
        int a = input.nextInt();
        System.out.println("Enter the second integer number: ");
        int b = input.nextInt();
        System.out.println("Enter the third integer number: ");
        int c = input.nextInt();

        if ((a + b) == 0){
            System.out.println("The sum of a and b is 0.");
            if ((a + c) == 0){
                System.out.println("Also, the sum of a and c is 0.");
            } else if ((b + c) == 0) {
                System.out.println("The sum of b and c is 0.");
            }
        } else if ((a + c) == 0){
            System.out.println("The sum of a and c is 0.");
            if ((b + c) == 0) {
                System.out.println("The sum of b and c is 0.");
            }
        } else {
            System.out.println("There are no sums equal to 0.");
        }

        input.close();
    }

    private static void biggestNumber() {
        int a = 5000;
        int b = -4000;
        int c = 20000;
        int d = 1111;
        int e = 211;

        int result = a;
        if ((a >= b) && (a >= c) && (a >= d) && (a >= e)){
            System.out.println("A the biggest number.");
        } else if ((b >= a) && (b >= c) && (b >= d) && (b >= e)){
            System.out.println("B the biggest number.");
        } else if ((c >= a) && (c >=b) && (c >= d) && (c >= e)){
            System.out.println("C is the biggest number.");
        } else if ((d >= a) && (d >= b) && (d >= c) && (d >= e)) {
            System.out.println("D is the biggest number.");
        } else {
            System.out.println("E is the biggest number.");
        }
    }

    private static void quadraticEquation() {
        Scanner input = new Scanner(System.in);

        // (a* (x * x)) + (b * x) + c = 0
        System.out.println("Enter the first quadratic equation parameter: ");
        int a = input.nextInt();
        System.out.println("Enter the second quadratic equation parameter: ");
        int b = input.nextInt();
        System.out.println("Enter the third quadratic equation parameter: ");
        int c = input.nextInt();

        if (a != 0){
            double desc = (Math.pow(b, 2) - (4 * a * c));
            if (desc > 0){
                System.out.println("This quadratic equation has two real roots!");
                double x1 = (-b - (Math.sqrt(desc))) / (2 * a);
                double x2 = (-b + (Math.sqrt(desc))) / (2 * a);
                System.out.println("The roots of this quadratic equation are: " + x1 + " and " + x2);
            } else if (desc == 0){
                System.out.println("This quadratic equation has only one real root!");
                double root1 = - (b / (2 * a));
                System.out.println("This quadratic equation's root is: " + root1);
            } else {
                System.out.println("This quadratic equation has no real roots!");
            }
        } else {
            System.out.println("This is not a quadratic equation.");
        }

        input.close();
    }

    private static void fourthTask() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a digit from 0 to 9: ");
        int number = input.nextInt();
        switch(number){
            case 0:
                System.out.println("Нула");
                break;
            case 1:
                System.out.println("Едно");
                break;
            case 2:
                System.out.println("Две");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четири");
                break;
            case 5:
                System.out.println("Пет");
                break;
            case 6:
                System.out.println("Шест");
                break;
            case 7:
                System.out.println("Седем");
                break;
            case 8:
                System.out.println("Осем");
                break;
            case 9:
                System.out.println("Девет");
                break;
            default:
                System.out.println("The digit is not between 0 to 9!");
        }

        input.close();
    }

    private static void thirdTask() {
        int firstNumber = -30;
        int secondNumber = 5;
        int thirdNumber = 13;

        boolean isFirstMax = (firstNumber > secondNumber) && (firstNumber > thirdNumber);
        boolean isSecondMax = (secondNumber > firstNumber) && (secondNumber > thirdNumber);
//        boolean isThirdMax = (thirdNumber > firstNumber) && (thirdNumber > secondNumber);

        if (isFirstMax){
            System.out.println("The first number is the biggest one.");
        } else if (isSecondMax){
            System.out.println("The second number is the biggest one.");
        } else
            System.out.println("The third one is the biggest one.");
    }

    private static void secondTask() {
        double firstNumber = -25.0;
        double secondNumber = 5.0;

        boolean isFirstPositive = firstNumber > 0;
        boolean isSecondPositive = secondNumber > 0;

        if (isFirstPositive == isSecondPositive){
            System.out.println("The divident is positive.");
        }
        else {
            System.out.println("Negative");
        }
    }

    private static void firstTask() {
        int firstInt = 5;
        int secondInt = 1;
        int swapInt = 0;

        System.out.println("first: " + firstInt + ", second: " + secondInt);
        boolean shouldSwap = firstInt > secondInt;

        if (shouldSwap) {
            swapInt = firstInt;
            firstInt = secondInt;
            secondInt = swapInt;
        }

        System.out.println("first: " + firstInt + ", second: " + secondInt);
    }
}
