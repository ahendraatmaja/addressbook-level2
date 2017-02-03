package seedu.addressbook.data.person;

/**
 * Represents the Street section of an address in the address book.
 */
public class Street {
	public static final String STREET_VALIDATION_REGEX = "^[A-Za-z0-9 ]+$";
	private String street;
	 	
	public Street(String street){
		this.street = street.trim();
	}
	 	
	public String getStreet(){
	 	return street;
	}
	 	
	public static boolean isValidStreet(String test){
	 	String trimmedTest = test.trim();
	 	return trimmedTest.matches(STREET_VALIDATION_REGEX);
	 }
}
