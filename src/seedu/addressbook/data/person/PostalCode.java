package seedu.addressbook.data.person;

/**
 * Represents the postal code of an address in the address book.
 */
public class PostalCode {
	public static final String POSTALCODE_VALIDATION_REGEX = "^[0-9]+$";
	private String postalCode;
	 	
	public PostalCode(String postalCode){
		this.postalCode = postalCode.trim();
	}
	 	
	public String getPostalCode(){
	 	return postalCode;
	}
	 	
	public static boolean isValidPostalCode(String test){
	 	String trimmedTest = test.trim();
	 	return trimmedTest.matches(POSTALCODE_VALIDATION_REGEX);
	 }
}
