package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class Museum implements Serializable{
    //class-instance variables
    private Number locationID;
    private String locationText;

    public Museum() {
    }

    public Number getLocationID() {
        return locationID;
    }

    public void setLocationID(Number locationID) {
        this.locationID = locationID;
    }

    public String getLocationText() {
        return locationText;
    }

    public void setLocationText(String locationText) {
        this.locationText = locationText;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.locationID);
        hash = 73 * hash + Objects.hashCode(this.locationText);
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
        final Museum other = (Museum) obj;
        if (!Objects.equals(this.locationID, other.locationID)) {
            return false;
        }
        if (!Objects.equals(this.locationText, other.locationText)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Museum{" + "locationID=" + locationID + ", locationText=" + locationText + '}';
    }
    
    
}
