package jatTask5;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// Write a program that reads in a string from the user and uses a loop to reverse the order of the characters in the string.
		// Then, output the reversed string
		
		//read the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String name = sc.next();
		
		//initial a result variable to store the reversed string
		String result = " ";
		
		//iterate the string and store the characters in c & keep adding it the result 
		for(int i=name.length()-1; i>=0; i-- ) {
			
			char c = name.charAt(i);
			result = result+c;
		}
		
		//Print the reversed string
		System.out.println("Reversed String is : " + result);
	}

}
