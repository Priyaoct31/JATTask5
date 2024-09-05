package jatTask5;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		/*Write a program to print the given below patter
		Sample input: 4
		Sample output:
		1
		2 3
		4 5 6 
		7 8 9 10*/
		
		//Get the input from user i.e., number of rows for the pattern
		Scanner sc = new Scanner(System.in);       
       
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
     // initialize a variable to track the current number
        int num = 1; 

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
        	
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
            	
                System.out.print(num + " ");
                
                num++; // Increment after printing
            }
            
            // move to next line after each row
            System.out.println(); 
        }


	}

}
