package seedu.addressbook.data.person;

/**
 * Returns a concatenated version of the printable strings of each object.
 */
public interface Printable {
	public static final String PRINTABLE_SEPARATOR = ", ";
	
	public String getPrintableString(); 
	
	public static String getPrintableString(Printable...printables) {
		String stringOutput = "";
		for (Printable printable : printables) {
			stringOutput = stringOutput + printable + PRINTABLE_SEPARATOR;
		}
		return stringOutput.trim();
	}
}
