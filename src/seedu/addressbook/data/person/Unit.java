/**
 * 
 */
package seedu.addressbook.data.person;

/**
 * @author Bel
 * Represent a person's unit in the address of that person.
 */
public class Unit {
    private String unit;
    
    public Unit(String unit) {
        this.unit=unit;
    }
    
    public String getName() {
        return unit;
    }
}
