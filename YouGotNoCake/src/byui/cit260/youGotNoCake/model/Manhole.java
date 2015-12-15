package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class Manhole implements Serializable{
    //class-instance variables
    private Number locationID;
    private String locationText;
    private String calcFlushes;
    private Number numFamilyMbrs;
    private Number playerGallonsFlushed;

    public Manhole() {
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

    public String getCalcFlushes() {
        return calcFlushes;
    }

    public void setCalcFlushes(String calcFlushes) {
        this.calcFlushes = calcFlushes;
    }

    public Number getNumFamilyMbrs() {
        return numFamilyMbrs;
    }

    public void setNumFamilyMbrs(Number numFamilyMbrs) {
        this.numFamilyMbrs = numFamilyMbrs;
    }

    public Number getPlayerGallonsFlushed() {
        return playerGallonsFlushed;
    }

    public void setPlayerGallonsFlushed(Number playerGallonsFlushed) {
        this.playerGallonsFlushed = playerGallonsFlushed;
    }

    @Override
    public String toString() {
        return "Manhole{" + "locationID=" + locationID + ", locationText=" + locationText + ", calcFlushes=" + calcFlushes + ", numFamilyMbrs=" + numFamilyMbrs + ", playerGallonsFlushed=" + playerGallonsFlushed + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.locationID);
        hash = 47 * hash + Objects.hashCode(this.locationText);
        hash = 47 * hash + Objects.hashCode(this.calcFlushes);
        hash = 47 * hash + Objects.hashCode(this.numFamilyMbrs);
        hash = 47 * hash + Objects.hashCode(this.playerGallonsFlushed);
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
        final Manhole other = (Manhole) obj;
        if (!Objects.equals(this.locationID, other.locationID)) {
            return false;
        }
        if (!Objects.equals(this.locationText, other.locationText)) {
            return false;
        }
        if (!Objects.equals(this.calcFlushes, other.calcFlushes)) {
            return false;
        }
        if (!Objects.equals(this.numFamilyMbrs, other.numFamilyMbrs)) {
            return false;
        }
        if (!Objects.equals(this.playerGallonsFlushed, other.playerGallonsFlushed)) {
            return false;
        }
        return true;
    }    
}
