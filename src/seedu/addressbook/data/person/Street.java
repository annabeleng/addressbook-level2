/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * @author Bel
 * Represent a person's street in address of that person
 */
public class Street {
    public static final String EXAMPLE = "Street";
    private String street;
    
    public Street(String street) {
        this.street=street;
    }
    
    public String getName() {
        return street;
    }
    
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Street // instanceof handles nulls
                && this.street.equals(((Street) other).street)); // state check
    }
}
