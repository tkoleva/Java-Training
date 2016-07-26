package com.company;

import java.util.Scanner;

public class BotAppClass {

    public static void main(String[] args) {
        String name = "Gogo";
        Bot bot = new Bot(name);

        Scanner input = new Scanner(System.in);
        String userInput;
        System.out.println("Hello! My name is " + name + ".");
        do {
            bot.askQuestion();
            userInput = input.nextLine();
            bot.recognizeInput(userInput);

        } while(!userInput.contains("bye"));
        System.out.println("Bye, bye!");
    }
}
