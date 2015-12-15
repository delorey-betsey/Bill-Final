package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class SkatePark implements Serializable{
    //class-instance variables
    private Number locationID;
    private String locationText;

    public SkatePark() {
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
        hash = 83 * hash + Objects.hashCode(this.locationID);
        hash = 83 * hash + Objects.hashCode(this.locationText);
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
        final SkatePark other = (SkatePark) obj;
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
        return "SkatePark{" + "locationID=" + locationID + ", locationText=" + locationText + '}';
    }   
}
