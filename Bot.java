package com.company;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by tkoleva on 07/26/16.
 */
public class Bot {
    private String name;
    private static  ArrayList<String> friendsList;
    private static ArrayList<String> shoppingCart;
    private static Stack<String> testCart;
    private static Scanner input = new Scanner(System.in);

    public Bot(String name){
        this.name = name;
        friendsList = new ArrayList<String>();
        shoppingCart = new ArrayList<String>();
        testCart = new Stack<String>();
    }

    public void askQuestion(){
        System.out.println("What do you want?");
        System.out.println("(type 'help' to see all available commands)");
    }

    public void recognizeInput(String input){
        if (input.equals("add friend")){
            Bot.addFriend();
        } else if(input.equals("print friends")){
            Bot.printFriends();
        } else if(input.equals("add to shopping list")){
            Bot.addToShoppingList();
        } else if(input.equals("print shopping list")){
            Bot.printShoppingList();
        } else if(input.equals("remove from shopping list")){
            Bot.removeFromShoppingList();
        } else if(input.equals("tell a joke")){
            Bot.tellJoke();
        } else if(input.equals("show time")){
            Bot.showCurrentTime();
        } else if(input.equals("help")){
            Bot.listHelp();
        }
    }

    public static void addFriend(){
        System.out.print("Enter your friend's name: ");
        String friendName = input.nextLine();
        if (!friendsList.contains(friendName)){
            friendsList.add(friendName);
            System.out.println("Your friend was added to the list.");
            System.out.println();
        } else {
            System.out.println("This friend already exists in your list.");
            System.out.println();
        }

    }

    public static void printFriends(){
        if (friendsList.size() > 0){
            System.out.println("Your list with friends is the following: "
                    + Arrays.toString(friendsList.toArray()));
            System.out.println();
        } else {
            System.out.println("Your friends list is empty.");
            System.out.println();
        }
    }

    public static void addToShoppingList(){
        System.out.print("Enter your shopping product: ");
        String product = input.nextLine();
        if(!shoppingCart.contains(product)){
            shoppingCart.add(product);
            System.out.println("The product was added to your shopping list.");
            System.out.println();
        } else {
            System.out.println("This product is already in your shopping list.");
            System.out.println();
        }
    }

    public static void printShoppingList(){
        if (shoppingCart.size() > 0){
            System.out.println("Your shopping list is: " + Arrays.toString(shoppingCart.toArray()));
            System.out.println();
        } else {
            System.out.println("Your shopping list is empty.");
            System.out.println();
        }
    }

    public static void removeFromShoppingList(){
        if(shoppingCart.size() > 0){
            System.out.println("Which product would you like to remove?");
            String removeProduct = input.nextLine();

            if(shoppingCart.contains(removeProduct)){
                shoppingCart.remove(removeProduct);
                System.out.println("The product was removed from your shopping list.");
                System.out.println();
            } else {
                System.out.println("This product is not in your shopping list.");
                System.out.println();
            }

        } else {
            System.out.println("The list is empty and there is nothing to remove.");
            System.out.println();
        }
    }

    public static void tellJoke(){
        System.out.println("I can write code.");
        System.out.println("You can laugh. It's a joke.");
        System.out.println();
    }

    public static void showCurrentTime(){
//      Only in Java 8
//      System.out.println(LocalDateTime.now());
        String timeStamp = new SimpleDateFormat("dd/MM/yyy/ HH:mm:ss").format(Calendar.getInstance().getTime());
        System.out.println("The current time is: " + timeStamp);
        System.out.println();
    }

    public static void listHelp(){
        System.out.println(" - Enter 'add friend' to add a friend;");
        System.out.println(" - Enter 'print friends' to print all your friends;");
        System.out.println(" - Enter 'add to shopping list' to add items in your shopping list;");
        System.out.println(" - Enter 'print shopping list' to print all items in your shopping list");
        System.out.println(" - Enter 'remove from shopping list' to remove item from your shopping list");
        System.out.println(" - Enter 'tell a joke' to tell you the best joke ever;");
        System.out.println(" - Enter 'show time' to see the current time");
        System.out.println(" - Enter 'help' to see this list again.");
        System.out.println();
    }
}
