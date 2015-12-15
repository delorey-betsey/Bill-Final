package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class Lists implements Serializable {
    //class instance variables
    private String listName;
    private Number numItemsFound;

    public Lists() {
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public Number getNumItemsFound() {
        return numItemsFound;
    }

    public void setNumItemsFound(Number numItemsFound) {
        this.numItemsFound = numItemsFound;
    }

    @Override
    public String toString() {
        return "Lists{" + "listName=" + listName + ", numItemsFound=" + numItemsFound + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.listName);
        hash = 71 * hash + Objects.hashCode(this.numItemsFound);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lists other = (Lists) obj;
        if (!Objects.equals(this.listName, other.listName)) {
            return false;
        }
        if (!Objects.equals(this.numItemsFound, other.numItemsFound)) {
            return false;
        }
        return true;
    }
   
}
