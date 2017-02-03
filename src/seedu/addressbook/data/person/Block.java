package seedu.addressbook.data.person;

/**
 * Represents the Block in the Address of a person
 */
public class Block {
	private static final String BLOCK_VALIDATION_REGEX = "^[A-Za-z0-9 ]+";
	private String block;
	 	
	public Block(String block){
		this.block = block.trim();
	}
	 	
	public String getBlock(){
	 	return block;
	}
	 	
	public static boolean isValidBlock(String test){
	 	String trimmedTest = test.trim();
	 	return trimmedTest.matches(BLOCK_VALIDATION_REGEX);
	 }
}

