package mypack;

/*
 * Class: CMSC203 
 * Instructor: Gary Thai
 * Description: This class defines information of a patient to be instantiated used as an object.
 * Due: 10/4/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Kidus Yohanness
*/

public class Patient {
	// Fields
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String emergencyName;
	private String emergencyNumber;
	/**
	 * This is a no-arg constructor for the Patient class
	 */
	public Patient() {
		this.firstName = "";
		this.middleName = "";
		this.lastName = "";
		this.streetAddress = "";
		this.city = "";
		this.state = "";
		this.zipCode = "";
		this.phoneNumber = "";
		this.emergencyName = "";
		this.emergencyNumber = "";
	}
	/**
	 * This is a parameterized constructor for the Patient class
	 * 
	 * @param firstName variable for patient's first name
	 * @param middleName variable for patient's middle name
	 * @param lastName variable for patient's last name
	 */
	public Patient(String firstName, String middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	/**
	 * This is a parameterized constructor for the Patient class
	 * 
	 * @param firstName variable for patient's first name
	 * @param middleName variable for patient's middle name
	 * @param lastName variable for patient's last name
	 * @param streetAddress variable for the patient's street address
	 * @param city variable for the patient's city
	 * @param state variable for the patient's state
	 * @param zipCode variable for the patient's zip code
	 * @param phoneNumber variable for the patient's phone number
	 * @param emergencyName variable for the patient's emergency contact name
	 * @param emergencyNumber variable for the patient's emergency contact phone number
	 */
	public Patient(String firstName, String middleName, String lastName, 
			String streetAddress, String city, String state, String zipCode,
			String phoneNumber, String emergencyName, String emergencyNumber) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.phoneNumber = phoneNumber;
		this.emergencyName = emergencyName;
		this.emergencyNumber = emergencyNumber;
	}
	
	/**
	 * This accessor method returns the first name of the patient
	 * 
	 * @return patient's first name
	 */
	public String getFirstName() {
        return firstName;
    }
	/**
	 * This accessor method returns the middle name of the patient
	 * 
	 * @return patient's middle name
	 */
    public String getMiddleName() {
        return middleName;
    }
    /**
	 * This accessor method returns the last name of the patient
	 * 
	 * @return patient's last name
	 */
    public String getLastName() {
        return lastName;
    }
    /**
	 * This accessor method returns the street address of the patient
	 * 
	 * @return patient's street address
	 */
    public String getStreetAddress() {
        return streetAddress;
    }
    /**
	 * This accessor method returns the city of the patient
	 * 
	 * @return patient's city
	 */
    public String getCity() {
        return city;
    }
    /**
	 * This accessor method returns the state of the patient
	 * 
	 * @return patient's state
	 */
    public String getState() {
        return state;
    }
    /**
	 * This accessor method returns the zip code of the patient
	 * 
	 * @return patient's zip code
	 */
    public String getZipCode() {
        return zipCode;
    }
    /**
	 * This accessor method returns the phone number of the patient
	 * 
	 * @return patient's phone number
	 */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    /**
	 * This accessor method returns the name of the emergency contact
	 * 
	 * @return patient's emergency contact's name
	 */
    public String getEmergencyName() {
        return emergencyName;
    }
    /**
	 * This accessor method returns the phone number of the emergency contact
	 * 
	 * @return patient's emergency contact's phone number
	 */
    public String getEmergencyNumber() {
        return emergencyNumber;
    }
    
    /**
     * This mutator method updates the patient's first name
     * 
     * @param firstName The string the first name will be updated to
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * This mutator method updates the patient's middle name
     * 
     * @param firstName The string the middle name will be updated to
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    /**
     * This mutator method updates the patient's last name
     * 
     * @param firstName The string the last name will be updated to
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * This mutator method updates the patient's street address
     * 
     * @param firstName The string the street address will be updated to
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    /**
     * This mutator method updates the patient's city
     * 
     * @param firstName The string the city will be updated to
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * This mutator method updates the patient's state
     * 
     * @param firstName The string the state will be updated to
     */
    public void setState(String state) {
        this.state = state;
    }
    /**
     * This mutator method updates the patient's zip code
     * 
     * @param firstName The string the zip code will be updated to
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    /**
     * This mutator method updates the patient's phone number
     * 
     * @param firstName The string the phone number will be updated to
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    /**
     * This mutator method updates the patient's emergency contact name
     * 
     * @param firstName The string the emergency contact name will be updated to
     */
    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }
    /**
     * This mutator method updates the patient's emergency contact phone number
     * 
     * @param firstName The string the emergency contact phone number will be updated to
     */
    public void setEmergencyNumber(String emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }
    /**
     * This method concatenates the first, middle, and last name of the patient into one
     * 
     * @return full name of the patient
     */
    public String buildFullName() {
    	String fullName = "";
    	fullName += (this.firstName + " " +
    	this.middleName + " " + this.lastName);
    	return fullName;
    }
    /**
     * This method concatenates the patient's street addres, city, state, and zip code into one
     * 
     * @return full address of the patient
     */
    public String buildAddress() {
    	return (this.streetAddress + " " +
    	this.city + " " + this.state + " " +
    	this.zipCode);
    }
    /**
     * This method concatenates the patient's emergency contact name and phone number into one
     * 
     * @return the full emergency contact
     */
    public String buildEmergencyContact() {
    	String fullContact = "";
    	fullContact += (this.emergencyName + " " +
    	this.emergencyNumber);
    	return fullContact;
    }
    /**
     * This method concatenates the full information of the patient to be displayed
     * 
     * @return the full information of the patient
     */
    public String toString() {
    	return ("  Name: " + buildFullName() + "\n" +
    			"  Address: " + buildAddress() + "\n" +
    			"  Phone Number: " + getPhoneNumber() + "\n" +
    			"  Emergency Contact: "  + buildEmergencyContact() + "\n");
    }
}
