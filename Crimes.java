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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Crimes {
    // csv file read setup
	static Scanner scannerIn = null;
    static FileInputStream in = null;   
    static BufferedReader inputStream = null;
    
    // Define variables
    static boolean check = false; // Used for while loop to keep reiterating try code. 
    static Scanner choice = new Scanner(System.in);
    static String selection = null;

    // Method for reading Crime.csv file
    public static void readFile() throws IOException {
    	int fileChar;
    	String fileLine;
    	in = new FileInputStream("Crime.csv");
    	System.out.println("ReadIt File Contents");
    	// Reads one char at a time
    	while ((fileChar = in.read()) != -1) {
    		// convert int to char
    		System.out.print((char) fileChar);
    	}
    	// Separate the file output
    	System.out.println("");
    	System.out.println("Crime.csv File Contents using BufferedReader");
    	// Use of Scanner and BufferedReader
    	inputStream = new BufferedReader(new FileReader("Crime.csv"));
    	scannerIn = new Scanner(inputStream);
    	while (scannerIn.hasNext()) {
    		if (scannerIn.hasNextInt()) {
    			System.out.println(scannerIn.nextInt());
    		}
    		if (scannerIn.hasNextDouble()) {
    			System.out.println(scannerIn.nextDouble());
    		} else {
    			scannerIn.next();
    		}
    	}
    	// Separe the file output
    	System.out.println("");
    	// Use of
    	inputStream = new BufferedReader(new FileReader("Crime.csv"));
    	System.out.println("Crime.csv contents");
    	// Read one Line using BufferedReader
    	while ((fileLine = inputStream.readLine()) != null) {
    		System.out.println(fileLine);
    	}
    }
     
    
    // Method for printing menu
    public static void menu() throws IOException {
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
                      readFile();
                      menu();
                      break;
            default:  System.out.println("This is the default statement");
                      break;
        }
    } 
  
    public static void quit() {
        System.out.println("\nThank you for trying the US Crimes Statistics Program.");
    } 
 
    
    
    
    
    public static void main(String[] args) throws IOException {
  	   	try {
            menu();
            } catch (Exception e) {
                System.out.println("There was an exception, trying again");
                menu();
            }
        }
    }