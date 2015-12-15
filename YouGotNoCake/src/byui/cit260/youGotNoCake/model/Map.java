package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class Map implements Serializable{
    //class-instance variable
    private Number locationID;
    private Number playerChoice;

    public Map() {
    }
    
        public Number getLocationID() {
        return locationID;
    }

    public void setLocationID(Number locationID) {
        this.locationID = locationID;
    }

    public Number getPlayerChoice() {
        return playerChoice;
    }

    public void setPlayerChoice(Number playerChoice) {
        this.playerChoice = playerChoice;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.locationID);
        hash = 89 * hash + Objects.hashCode(this.playerChoice);
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "locationID=" + locationID + ", playerChoice=" + playerChoice + '}';
    }

        @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (!Objects.equals(this.locationID, other.locationID)) {
            return false;
        }
        if (!Objects.equals(this.playerChoice, other.playerChoice)) {
            return false;
        }
        return true;
    }   
}
