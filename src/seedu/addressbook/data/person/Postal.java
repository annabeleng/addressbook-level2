/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * @author Bel
 * Represent a person's postal code in the address of that person.
 */
public class Postal {
    public static final String EXAMPLE = "Postal Code";
    private String postal;
    
    public Postal(String postal) {
        this.postal=postal;
    }
    
    public String getName() {
        return postal;
    }
    
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Postal // instanceof handles nulls
                && this.postal.equals(((Postal) other).postal)); // state check
    }
}
