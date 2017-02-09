package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's contact in the address book. Contains 3 sub-classes: address, email, and phone.
 * Guarantees: immutable; is valid as declared in {@link #isValidContact(String)}
 */
public class Contact {
	
	public final String value;
    private boolean isPrivate;
    
    public Contact(String contact, boolean isPrivate, String validationRegex, String messageConstraints) throws IllegalValueException {
        this.isPrivate = isPrivate;
        String trimmedContact = contact.trim();
        if (!isValidContact(trimmedContact, validationRegex)) {
            throw new IllegalValueException(messageConstraints);
        }
        this.value = trimmedContact;
    }
    
    /**
     * Checks if a given string is a valid data input.
     */
    private static boolean isValidContact(String test, String validationRegex) {
    	return test.matches(validationRegex);
    }
    
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
