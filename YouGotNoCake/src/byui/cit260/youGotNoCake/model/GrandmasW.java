package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class GrandmasW implements Serializable{
    //class-instance variables
    private Number locationID;
    private String locationText;
    private String congratsYouWin;

    public GrandmasW() {
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

    public String getCongratsYouWin() {
        return congratsYouWin;
    }

    public void setCongratsYouWin(String congratsYouWin) {
        this.congratsYouWin = congratsYouWin;
    }

    @Override
    public String toString() {
        return "GrandmasW{" + "locationID=" + locationID + ", locationText=" + locationText + ", congratsYouWin=" + congratsYouWin + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.locationID);
        hash = 53 * hash + Objects.hashCode(this.locationText);
        hash = 53 * hash + Objects.hashCode(this.congratsYouWin);
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
        final GrandmasW other = (GrandmasW) obj;
        if (!Objects.equals(this.locationID, other.locationID)) {
            return false;
        }
        if (!Objects.equals(this.locationText, other.locationText)) {
            return false;
        }
        if (!Objects.equals(this.congratsYouWin, other.congratsYouWin)) {
            return false;
        }
        return true;
    }   
}
