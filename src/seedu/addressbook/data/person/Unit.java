package seedu.addressbook.data.person;

/**
 * Represents the house unit number of an address in the address book.
 */
public class Unit {
	public static final String UNIT_VALIDATION_REGEX = "^#?[A-Za-z0-9- ]+$";
	private String unit;
	 	
	public Unit(String unit){
		this.unit = unit.trim();
	}
	 	
	public String getUnit(){
	 	return unit;
	}
	 	
	public static boolean isValidUnit(String test){
	 	String trimmedTest = test.trim();
	 	return trimmedTest.matches(UNIT_VALIDATION_REGEX);
	 }
}
