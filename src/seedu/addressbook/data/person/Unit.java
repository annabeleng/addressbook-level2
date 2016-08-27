/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * @author Bel
 * Represent a person's unit in the address of that person.
 */
public class Unit {
    public static final String EXAMPLE = "Unit";
    private String unit;
    
    public Unit(String unit) {
        this.unit=unit;
    }
    
    public String getName() {
        return unit;
    }
    
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Unit // instanceof handles nulls
                && this.unit.equals(((Unit) other).unit)); // state check
    }
}
