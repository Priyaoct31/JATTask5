package jatTask5;

public class Question1 {

	public static void main(String[] args) {
		// Write a Java program to check whether a given string is a palindrome or not using for loop and if-else statement

		
		String name = "malayalam"; //input string
		String result=""; // new string variable to store the reversed string
		
		//iterate the string and store the characters in c & keep adding it the result 
		for (int i = name.length()-1; i >=0; i--) {
			
			char c = name.charAt(i);
			
			result=result+c;
		}
		
		//if input name and reversed string is same then it should print Palindrome or not
		if (name.equals(result)) {
			
			System.out.println("Palindrome");
			
		} else {
			
			System.out.println("Not Palindrome");

		}
	}


}
