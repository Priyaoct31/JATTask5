package jatTask5;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// Write a program to calculate the largest number among three numbers
		
		//Get input from users
		Scanner sc = new Scanner(System.in);
        
        // enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        
        // Initialize a variable to store the largest number
        int largest;
        
        // Compare  three numbers
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
        
        // Output the largest number
        System.out.println("The largest number is: " + largest);
        

	}

}
