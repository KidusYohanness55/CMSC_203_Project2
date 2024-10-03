package mypack;

import java.util.*;

/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: This class retrieves user input for a patients information, and displays
 * the information along with information from 3 procedures, as well as the sum of their charges.
 * Due: 10/4/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Kidus Yohanness
*/

public class PatientDriverApp {
	
	public static void main(String [] args) {
	String firstName, middleName, lastName, address, city, state, zipCode,
	phoneNumber, emergencyName, emergencyNumber;
	
	// Input for variables
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Please enter patient's first name: ");
	firstName = keyboard.nextLine();
	System.out.print("Please enter patient's middle name: ");
	middleName = keyboard.nextLine();
	System.out.print("Please enter patient's last name: ");
	lastName = keyboard.nextLine();
	System.out.print("Please enter patient's street address: ");
	address = keyboard.nextLine();
	System.out.print("Please enter patient's city: ");
	city = keyboard.nextLine();
	System.out.print("Please enter patient's state: ");
	state = keyboard.nextLine();
	System.out.print("Please enter patient's zip code: ");
	zipCode = keyboard.nextLine();
	System.out.print("Please enter patient's phone number: ");
	phoneNumber = keyboard.nextLine();
	System.out.print("Please enter patient's emergency contact name: ");
	emergencyName= keyboard.nextLine();
	System.out.print("Please enter patient's emergency contact phone number: ");
	emergencyNumber = keyboard.nextLine();
	keyboard.close();
	
	// Instances of Patient and Procedure classes
	Patient patient = new Patient(firstName, middleName, lastName, address, city, state, zipCode,
			phoneNumber, emergencyName, emergencyNumber);
	Procedure procedure1 = new Procedure("Physical Exam", "10/4/2024", "Dr. Irvine", 3250);
	Procedure procedure2 = new Procedure("X-Ray", "10/4/2024");
	procedure2.setPractitionerName("Dr. Jamison");
	procedure2.setCharges(5500.43);
	Procedure procedure3 = new Procedure();
	procedure3.setProcedureName("Blood Test");
	procedure3.setProcedureDate("10/4/2024");
	procedure3.setPractitionerName("Dr. Smith");
	procedure3.setCharges(1400.75);
	
	// Display information
	System.out.println("\nPatient info: ");
	displayPatient(patient);
	displayProcedure(procedure1);
	displayProcedure(procedure2);
	displayProcedure(procedure3);
	System.out.println("Total Charges: $" + calculateTotalCharges(procedure1, procedure2, procedure3) + "\n");
	System.out.println("The program was developed by a Student: Kidus Yohanness 10/4/2024\n"
			+ "Student Name: Kidus Yohanness\nMC#: M21190864\nDue Date: 10/4/2024");
	
	
	}
	
	/**
	 * This method displays information from an instance of the Patient class
	 * 
	 * @param patient the Patient class instance to be displayed
	 */
	public static void displayPatient(Patient patient) {
		System.out.println(patient.toString());
	}
	/**
	 * This method displays information from an instance of the Procedure class
	 * 
	 * @param procedure the Procedure class instance to be displayed
	 */
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure.toString());
	}
	/**
	 * This method returns the sum of each of the charges from 3 Procedure class instances
	 * 
	 * @param procedure1 the first Procedure class instance to retrieve charges from
	 * @param procedure2 the second Procedure class instance to retrieve charges from
	 * @param procedure3 the third Procedure class instance to retrieve charges from
	 * @return the sum of charges from the three instances
	 */
	public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
		return (procedure1.getCharges() + procedure2.getCharges() + procedure3.getCharges());
	}
}
