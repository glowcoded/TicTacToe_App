package org.example;

import java.util.Scanner;

public class uc4 {

    // Method to take user input
    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter slot number (1-9): ");
        return sc.nextInt();
    }

    // Method to convert slot to row & column
    public static void convertSlot(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        System.out.println("Row: " + row);
        System.out.println("Column: " + col);
    }

    public static void main(String[] args) {

        int slot = getUserInput();   // take input

        if (slot < 1 || slot > 9) {
            System.out.println("Invalid input! Enter number between 1 and 9.");
        } else {
            convertSlot(slot);       // convert and display
        }
    }
}
