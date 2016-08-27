package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "block, some street, unit number, postalcode";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
    public static final String ADDRESS_VALIDATION_REGEX = ".+";

    public final String value;
    private final Block block;
    private final Street street;
    private final Unit unit;
    private final Postal postal;
    private boolean isPrivate;

    /**
     * Validates given address.
     * @param postalName 
     * @param unitName 
     * @param streetName 
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String blockName, String streetName, String unitName, String postalName, boolean isPrivate) {
 
        this.isPrivate = isPrivate;
        this.block = new Block(blockName);
        this.street = new Street(streetName);
        this.unit = new Unit(unitName);
        this.postal = new Postal(postalName);
        this.value = block.getName()+" ,"+street.getName()+" ,"+unit.getName()+" ,"+postal.getName();
        
    }

   /* public Address(String value, boolean isPrivate) {
        String[] fullAddress = value.split("'");
        this.block = new Block(fullAddress[0]);
        this.street = new Street(fullAddress[1]);
        this.unit = new Unit(fullAddress[2]);
        this.postal = new Postal(fullAddress[3]);
        
    } */


    @Override
    public String toString() {
        String fullAddress = block.getName() + ", "+ street.getName() +", " + unit.getName() + ", " + postal.getName();
        return fullAddress;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.block.equals(((Address) other).block) // state check
                && this.street.equals(((Address) other).street)
                && this.unit.equals(((Address) other).unit)
                && this.postal.equals(((Address) other).postal));
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
    
    public Block getBlock() {
        return block;
    }
    
    public Street getStreet() {
        return street;
    }
    
    public Unit getUnit() {
        return unit;
    }
    
    public Postal getPostal() {
        return postal;
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}