/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * @author Bel
 * Represent a person's street in address of that person
 */
public class Street {
    private String street;
    
    public Street(String street) {
        this.street=street;
    }
    
    public String getName() {
        return street;
    }

}
