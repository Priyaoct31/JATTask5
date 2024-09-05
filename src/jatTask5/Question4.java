package jatTask5;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		/* Write a program to print the given below pattern
		 Sample input: 5
		 Sample output:
		 	*   *
		 	 * *
		 	  * 
		     * *
		    *   *
		 */

			//get the input from user i.e., number of rows for the pattern
		
		   Scanner sc = new Scanner(System.in);
	       System.out.println("Enter the number: ");
	       int n = sc.nextInt();
		
	        //iterate
	        for (int i = 0; i < n; i++) {
	        	
	            for (int j = 0; j < n; j++) {
	            	
	                // Print stars in specific positions
	                if (j == i || j == (n - i - 1)) {
	                	
	                    System.out.print("*");
	                }
	                
	                else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
}
