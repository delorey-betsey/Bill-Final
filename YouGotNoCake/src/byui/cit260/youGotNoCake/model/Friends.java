package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class Friends implements Serializable{
    //class-instance variables
    private Number locationID;
    private String locationText;
    private String calcXmas;
    private String todaysDate;
    private Number playerDaysToXmas;

    public Friends() {
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

    public String getCalcXmas() {
        return calcXmas;
    }

    public void setCalcXmas(String calcXmas) {
        this.calcXmas = calcXmas;
    }

    public String getTodaysDate() {
        return todaysDate;
    }

    public void setTodaysDate(String todaysDate) {
        this.todaysDate = todaysDate;
    }

    public Number getPlayerDaysToXmas() {
        return playerDaysToXmas;
    }

    public void setPlayerDaysToXmas(Number playerDaysToXmas) {
        this.playerDaysToXmas = playerDaysToXmas;
    }

    @Override
    public String toString() {
        return "Friends{" + "locationID=" + locationID + ", locationText=" + locationText + ", calcXmas=" + calcXmas + ", todaysDate=" + todaysDate + ", playerDaysToXmas=" + playerDaysToXmas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.locationID);
        hash = 31 * hash + Objects.hashCode(this.locationText);
        hash = 31 * hash + Objects.hashCode(this.calcXmas);
        hash = 31 * hash + Objects.hashCode(this.todaysDate);
        hash = 31 * hash + Objects.hashCode(this.playerDaysToXmas);
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
        final Friends other = (Friends) obj;
        if (!Objects.equals(this.locationID, other.locationID)) {
            return false;
        }
        if (!Objects.equals(this.locationText, other.locationText)) {
            return false;
        }
        if (!Objects.equals(this.calcXmas, other.calcXmas)) {
            return false;
        }
        if (!Objects.equals(this.todaysDate, other.todaysDate)) {
            return false;
        }
        if (!Objects.equals(this.playerDaysToXmas, other.playerDaysToXmas)) {
            return false;
        }
        return true;
    }   
    
}
