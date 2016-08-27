/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * @author Bel
 * Represents a person's block in the address of that person.
 */
public class Block {
    public static final String EXAMPLE = "Block 123";
    private String block;
    
    public Block(String block){
        this.block=block;
    }
    
    public String getName(){
        return block;
    }
    
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Block // instanceof handles nulls
                && this.block.equals(((Block) other).block)); // state check
    }

}
