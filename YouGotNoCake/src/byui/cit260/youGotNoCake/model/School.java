package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class School implements Serializable{
    //class-instance variables
    private Number locationID;
    private String locationText;
    private String calcBMI;
    private Number playerHeight;
    private Number playerWeight;
    private Number playerBMI;

    public School() {
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

    public String getCalcBMI() {
        return calcBMI;
    }

    public void setCalcBMI(String calcBMI) {
        this.calcBMI = calcBMI;
    }

    public Number getPlayerHeight() {
        return playerHeight;
    }

    public void setPlayerHeight(Number playerHeight) {
        this.playerHeight = playerHeight;
    }

    public Number getPlayerWeight() {
        return playerWeight;
    }

    public void setPlayerWeight(Number playerWeight) {
        this.playerWeight = playerWeight;
    }

    public Number getPlayerBMI() {
        return playerBMI;
    }

    public void setPlayerBMI(Number playerBMI) {
        this.playerBMI = playerBMI;
    }

    @Override
    public String toString() {
        return "School{" + "locationID=" + locationID + ", locationText=" + locationText + ", calcBMI=" + calcBMI + ", playerHeight=" + playerHeight + ", playerWeight=" + playerWeight + ", playerBMI=" + playerBMI + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.locationID);
        hash = 59 * hash + Objects.hashCode(this.locationText);
        hash = 59 * hash + Objects.hashCode(this.calcBMI);
        hash = 59 * hash + Objects.hashCode(this.playerHeight);
        hash = 59 * hash + Objects.hashCode(this.playerBMI);
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
        final School other = (School) obj;
        if (!Objects.equals(this.locationID, other.locationID)) {
            return false;
        }
        if (!Objects.equals(this.locationText, other.locationText)) {
            return false;
        }
        if (!Objects.equals(this.calcBMI, other.calcBMI)) {
            return false;
        }
        if (!Objects.equals(this.playerHeight, other.playerHeight)) {
            return false;
        }
        if (!Objects.equals(this.playerWeight, other.playerWeight)) {
            return false;
        }
        if (!Objects.equals(this.playerBMI, other.playerBMI)) {
            return false;
        }
        return true;
    }
    
    
}
