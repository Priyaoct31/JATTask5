package jatTask5;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// Program to calculate the hotel tariff
		
			//To get the input from user
			Scanner sc = new Scanner(System.in);
	        
	        // Input month, room rent/day, and number of days
	        System.out.print("Enter the month (1-12): ");
	        int month = sc.nextInt();
	        
	        System.out.print("Enter the room rent per day: ");
	        double roomRentPerDay = sc.nextDouble();
	        
	        System.out.print("Enter the number of days stayed: ");
	        int numberOfDays = sc.nextInt();
	        
	        // Initialize a variable for the total rent
	        double totalTariff = roomRentPerDay * numberOfDays;
	        
	        // Use switch to check for peak season months and apply 20% extra
	        switch (month) {
	            case 4:  // April
	            case 5:  // May
	            case 6:  // June
	            case 11: // November
	            case 12: // December
	                totalTariff += totalTariff * 0.20; // Increase by 20%
	                break;
	            default:
	                // No additional cost for non-peak months
	                break;
	        }
	        
	        // Print the total tariff with two decimal places
	        System.out.printf("Total tariff: %.2f%n", totalTariff);
	        
	}

}
