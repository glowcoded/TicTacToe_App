package org.example;

import java.util.Scanner;

public class uc3 {

    // Method to take user input
    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int slot = sc.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        int userInput = getUserInput();  // calling method

        System.out.println("You entered: " + userInput);
    }
}