// Programmers: Bonita Rodrigues
// Course:  CS 212, Dr.Nweke
// Due Date: 1/30/24
// Lab Assignment: PA0 Disease Rate
// Problem Statement: Calculate the spread of a disease over 10 days (including day 0) given the R number
// Input: name of disease, R number
// Output: days 0-9 with number of cases for each day
// Credits: none

import java.util.Scanner;  // Import the Scanner class

public class PA0{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // Opening statements
        System.out.println("This program will Calculate the spread of a disease over 10 days");

        // Asks the user for the name and the R number of the disease
        System.out.println("What is the name of your disease? ");
        String name = scan.nextLine();
        System.out.print("What is the R number? ");
        float rNum = scan.nextFloat();
        System.out.println("\n");

        // Sets variables numCases and toPower
        double numCases = 1;
        int toPower = 1;

        // Finds the number of cases for days 0-9 and outputs it to the user
        for (int i=0; i<10; i++){
            System.out.println("Day " + i + ": " + numCases); // i is only used for days
            numCases = numCases + Math.pow(rNum, toPower);
            toPower += 1;
        }

        // Outputs ending statements to the user
        System.out.println("\nThe disease growth over 10 days for " + name + " with a R number of " + rNum + " is shown above.");
        System.out.println("Thank you for using our program.");

    }
}
