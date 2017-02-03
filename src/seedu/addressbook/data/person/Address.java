package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, Clementi Ave 3, #12-34, 231534";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Address should in the the format: Block, Street, Unit, Postal Code";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";
    public static final String SEPARATOR = ", ";
    public static final int BLOCK_PART = 0;
    public static final int STREET_PART = 1;
    public static final int UNIT_PART = 2;
    public static final int POSTALCODE_PART = 3;
    public static final int ADDRESS_PARTS = 4;

    //public final String value;
    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        String trimmedAddress = address.trim();
        this.isPrivate = isPrivate;
        String [] addressParts = trimmedAddress.split(", ");
        if (!isValidAddress(addressParts)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        block = new Block(addressParts[BLOCK_PART]);
        street = new Street(addressParts[STREET_PART]);
        unit = new Unit(addressParts[UNIT_PART]);
        postalCode = new PostalCode(addressParts[POSTALCODE_PART]);
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String[] test) {
        return test.length == ADDRESS_PARTS
        		&& Block.isValidBlock(test[BLOCK_PART])
        		&& Street.isValidStreet(test[STREET_PART])
        		&& Unit.isValidUnit(test[UNIT_PART])
        		&& PostalCode.isValidPostalCode(test[POSTALCODE_PART]);
    }

    @Override
    public String toString() {
        return block.getBlock() + SEPARATOR
        		+ street.getStreet() + SEPARATOR
        		+ unit.getUnit() + SEPARATOR
        		+ postalCode.getPostalCode();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.toString().equals(((Address) other).toString())); // state check
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
