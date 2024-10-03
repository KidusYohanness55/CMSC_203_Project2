package mypack;

/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: This class defines information of a procedure to be instantiated and be used as object(s).
 * Due: 10/4/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Kidus Yohanness
*/

public class Procedure {
	// Fields
	private String procedureName;
	private String procedureDate;
	private String practitionerName;
	private double charges;
	/**
	 * This is a no-arg constructor for the Procedure class
	 */
	public Procedure(){
		this.procedureName = "";
		this.procedureDate = "";
		this.practitionerName = "";
		this.charges = 0.0;
	}
	/**
	 * This is a parameterized constructor for the Procedure class
	 * 
	 * @param name procedure's name
	 * @param date procedure's date
	 */
	public Procedure(String name, String date) {
		this.procedureName = name;
		this.procedureDate = date;
	}
	/**
	 * This is a no-arg constructor for the Procedure class
	 * 
	 * @param name procedure's name
	 * @param date procedure's date
	 * @param practitioner practitioner's name
	 * @param charges procedure's charges
	 */
	public Procedure(String name, String date, String practitioner, double charges) {
		this.procedureName = name;
		this.procedureDate = date;
		this.practitionerName = practitioner;
		this.charges = charges;
	}
	/**
	 * This is an accessor method for the procedure's name
	 * 
	 * @return procedure's name
	 */
	public String getProcedureName() {
		return procedureName;
	}
	/**
	 * This is an accessor method for the procedure's date
	 * 
	 * @return procedure's date
	 */
	public String getProcedureDate() {
		return procedureDate;
	}
	/**
	 * This is an accessor method for the practitioner's name
	 * 
	 * @return practitioner's name
	 */
	public String getPractitionerName() {
		return practitionerName;
	}
	/**
	 * This is an accessor method for the procedure's charges
	 * 
	 * @return procedure's charges
	 */
	public double getCharges() {
		return charges;
	}
	/**
	 * This is a mutator method for the procedure's name
	 * 
	 * @param name procedure's name to be updated
	 */
	public void setProcedureName(String name) {
		this.procedureName = name;
	}
	/**
	 * This is a mutator method for the procedure's date
	 * 
	 * @param date procedure's date to be updated
	 */
	public void setProcedureDate(String date) {
		this.procedureDate = date;
	}
	/**
	 * This is a mutator method for the practitioner's name
	 * 
	 * @param name practitioner's name to be updated
	 */
	public void setPractitionerName(String name) {
		this.practitionerName = name;
	}
	/**
	 * This is a mutator method for the procedure's charges
	 * 
	 * @param charges procedure's charges to be updated
	 */
	public void setCharges(double charges) {
		this.charges = charges;
	}
	/**
	 * This is a method to concatenate the procedure's name, date, practitioner, and charges into one
	 * 
	 * @return the procedure's information
	 */
	public String toString() {
		return ("\tProcedure Name: " + getProcedureName() + "\n" +
				"\tProcedure Date: " + getProcedureDate() + "\n" +
				"\tPractitioner Name: " + getPractitionerName() + "\n" +
				"\tCharges: " + getCharges() + "\n");
	}
}
