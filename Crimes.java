package finalProj;

/*
* File: Crimes.java
* Author: Yael Brown
* Date: October 8, 2017
* Purpose: Read a file that will contain data
* related to the US. Crime statics from 1994-2013.
*/

// Import Required libraries
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Crimes {
    // csv file read setup
    static String fileName = "Crime.csv";
    static BufferedReader inputStream = null;
    inputStream = new BufferedReader(new FileReader(fileName));
    
    // Define variables
    static boolean check = false; // Used for while loop to keep reiterating try code. 
    static Scanner choice = new Scanner(System.in);
    static String selection = null;

    // Method for reading Crime.csv file
    public static void read(){
    	// some read code
    }     
    
    // Method for printing menu
    public static void menu() {
        System.out.println("\n********** Welcome to the US Crime Statistical Application **************************\n");
        System.out.println("1. What were the percentages in population growth for each consecutive year from 1994 � 2013?");
        System.out.println("2. What year was the Murder rate the highest?");
        System.out.println("3. What year was the Murder rate the lowest?");
        System.out.println("4. What year was the Robbery rate the highest?");
        System.out.println("5. What year was the Robbery rate the lowest?");
        System.out.println("Q. Quit the program\n");
        System.out.print("Enter your selection: ");
        
        // Recieve selection input
        selection = choice.nextLine();
        
        // Perform appropriate action with input
        switch (selection) {
            case "1": System.out.println("Your selection is 1");
                      read();
                      menu();
                      break;
            default:  System.out.println("This is the default statement");
                      break;
        }
    } 
  
    public static void quit() {
        System.out.println("\nThank you for trying the US Crimes Statistics Program.");
    } 
 
    public static void main(String[] args) {
  	   	try {
            menu();
            } catch (Exception e) {
                System.out.println("There was an exception, trying again");
                menu();
            }
        }
    }