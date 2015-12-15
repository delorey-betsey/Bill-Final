package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class DarkAlley implements Serializable {
    
     //class-instance variables
    private Player mmvPlayer;
    private int locationID;
    private SleepAids foundItem;

    public DarkAlley(Player player) {
        this.mmvPlayer = player;
        this.locationID = 20;
        this.foundItem = SleepAids.TAX_CODE;
    }
    
    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    public Player pickupItem() {
        
        for (SleepAids sleepAid : new SleepAids[]{
            SleepAids.APNEA_FAIRY,
            SleepAids.TAX_CODE,
            SleepAids.TRANQUILIZER_DART,
            SleepAids.WARM_MILK
        }) {
            if (sleepAid.equals(foundItem)) {
                mmvPlayer.getFoundSleepAids().add(foundItem);
            }
        }
        return mmvPlayer;
    }
            
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + Objects.hashCode(this.locationID);
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
        final DarkAlley other = (DarkAlley) obj;
        return true;
    }

    @Override
    public String toString() {
        return "DarkAlley{" + "mmvPlayer=" + mmvPlayer + ", locationID=" + locationID + ", foundItem=" + foundItem + '}';
    }
    
}