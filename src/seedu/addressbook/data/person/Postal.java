/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * @author Bel
 * Represent a person's postal code in the address of that person.
 */
public class Postal {
    private String postal;
    
    public Postal(String postal) {
        this.postal=postal;
    }
    
    public String getName() {
        return postal;
    }
}
