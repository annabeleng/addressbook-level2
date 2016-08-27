package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, some street";
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
        this.street = new Street(blockName);
        this.unit = new Unit(blockName);
        this.postal = new Postal(blockName);
        this.value = block.getName()+" ,"+street.getName()+" ,"+unit.getName()+" ,"+postal.getName();
        
    }



    @Override
    public String toString() {
        String fullAddress = block.getName() + street.getName() + unit.getName() + postal.getName();
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
        return block.hashCode()+street.hashCode()+unit.hashCode()+postal.hashCode();
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