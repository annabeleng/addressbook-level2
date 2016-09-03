package seedu.addressbook.data.tag;

import java.util.ArrayList;

public class Tagging {
    public static ArrayList<Tagging> allTags = new ArrayList<Tagging>();
    private String name;
    private String tagValue;
    private String operationDone;
    private final String ADD_OPERATION = "+";
    private final String MINUS_OPERATION = "-";
    
    public Tagging(String name, String tagValue, boolean addNotDelete){
        this.name = name;
        this.tagValue = tagValue;
        if (addNotDelete==true) {
            this.operationDone = ADD_OPERATION;
        }
        else {
            this.operationDone = MINUS_OPERATION;
        }
    }

    @Override
    public String toString() {
        return operationDone + " " + name + " [" + tagValue + "]";
    }
    

}
