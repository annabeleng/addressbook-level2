/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * @author Bel
 * Represents a person's block in the address of that person.
 */
public class Block {
    private String block;
    
    public Block(String block){
        this.block=block;
    }
    
    public String getName(){
        return block;
    }

}
