package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
//  write your code here
//        main.task1();
//         main.task2();
//         main.task3();
//         main.task4();
//        main.task5();
       main.task6();
    }

    void task1() {

        int table[] = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < table.length; i++) {
//  Check if an element is od number
            int value = table[i];
            if (value % 2 == 0) {
                System.out.println("Even number: " + value);
            } else {
                System.out.println("Odd number: " + value);
            }
        }
    }

    void task2() {
//  For each loop to iterate through the array
        int table[] = {1, 2, 3, 4, 5, 6};
        for (int value : table) {
            if (value % 2 == 0) {
                System.out.println("Even number: " + value);
            } else {
                System.out.println("Odd number: " + value);
            }
        }
    }

    void task3() {
//  While-loop to iterate through the array
        int table[] = {1, 2, 3, 4, 5, 6};
        int counter = 0;
        while (counter < table.length) {
            int value = table[counter];
            if (value % 2 == 0) {
                System.out.println("Even number: " + value);
            } else {
                System.out.println("Odd number: " + value);
            }
        }
    }

    void task4() {

        //Do-while loop to iterate through an array
        int table[] = {1, 2, 3, 4, 5, 6};
        int counter = 0;
        do {
            int value = table[counter++];
            if (value % 2 == 0) {
                System.out.println("Even number: " + value);
            } else {
                System.out.println("Odd number: " + value);
            }
        } while (counter < table.length);
    }

    void task5() {
//Pseudo code
//Print welcome message

        System.out.println("Welcome!!!");
//Declare variables
        String[] teamMembers = new String[5];
        Scanner scanner = new Scanner(System.in);
        String input;
//receive input from user
        int counter = 0;
        do {
            System.out.println("Please provide a name to be added or type quit to end.");
            input = scanner.nextLine();
//Add item to array if not equals string
            if (!input.equalsIgnoreCase("quit")) {
                teamMembers[counter] = input;
                counter++;
            }

        } while (!input.equalsIgnoreCase("quit") && counter < teamMembers.length);

// check if input equals quit and break out of condition if true
//if false add input to the list name/teammates and repeat process of collecting names till array is full
// Max number of team 5
// Print welcom messages for all users inputed.
        for (String value : teamMembers) {
            System.out.println(" Welcome to the team: " + value);
        }
    }

    void task6() {
        System.out.println("Welcome to the grocery list program!!");
        Scanner scanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        System.out.println("Please select the number of items to be added to the grocery list!!");
        int number = intScanner.nextInt();
        String input;
        String[] grocery_list = new String[number];
        int counter = 0;
        do {
            System.out.println("Please provide an item to be added or type 'stop' to complete the grocery list");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("stop")) {
                grocery_list[counter] = input;
                counter++;
            }
        } while (!input.equalsIgnoreCase("stop") && counter < grocery_list.length) ;
            System.out.println("Grocery Items: ");
// save items received to array in program String[] grocery_list
//print the list to the console with completed by looping over the grocery list array and printing out each item
            for (String value : grocery_list) {
                if (value == null) {
                    break;
                }
                System.out.println(value);
            }

        }
    }








