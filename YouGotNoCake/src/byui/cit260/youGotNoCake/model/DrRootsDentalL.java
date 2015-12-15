package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class DrRootsDentalL implements Serializable{
    //class-instance variables
    private Number locationID;
    private String locationText;
    private String booHooYouLose;

    public DrRootsDentalL() {
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

    public String getBooHooYouLose() {
        return booHooYouLose;
    }

    public void setBooHooYouLose(String booHooYouLose) {
        this.booHooYouLose = booHooYouLose;
    }

    @Override
    public String toString() {
        return "DrRootsDentalL{" + "locationID=" + locationID + ", locationText=" + locationText + ", booHooYouLose=" + booHooYouLose + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.locationID);
        hash = 37 * hash + Objects.hashCode(this.locationText);
        hash = 37 * hash + Objects.hashCode(this.booHooYouLose);
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
        final DrRootsDentalL other = (DrRootsDentalL) obj;
        if (!Objects.equals(this.locationID, other.locationID)) {
            return false;
        }
        if (!Objects.equals(this.locationText, other.locationText)) {
            return false;
        }
        if (!Objects.equals(this.booHooYouLose, other.booHooYouLose)) {
            return false;
        }
        return true;
    }    
}
