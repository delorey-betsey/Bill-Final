package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class Backyard implements Serializable {
    
     //class-instance variables
    private Player mmvPlayer;
    private int locationID;
    private SleepAids foundItem;
        
    public Backyard(Player player) {
        this.mmvPlayer = player;
        this.locationID = 2;
        this.foundItem = SleepAids.TRANQUILIZER_DART;
    }
    
    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }
    
    
    public Player pickupItem() {
        
        /*
        The ! = NOT.  Remember that an if() block only executes when the argument
        evaluates to true. So the statement reads: if(NOT mmvPLayer.hasItem(foundItem)).
        
        When the player already has picked up the item  .hasItem(foundItem) will
        return True.  The statement then becomes if(NOT true) or if(false) & the
        if block does NOT run.  
        
        If the player has not already come across the item, .hasItem(foundItem) 
        will return false and statement becomes if(NOT false) or if(true) 
        and the if block runs
        */
        
        if (!mmvPlayer.hasItem(foundItem)) {
        
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
        final Backyard other = (Backyard) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Backyard{" + "mmvPlayer=" + mmvPlayer + ", locationID=" + locationID + ", foundItem=" + foundItem + '}';
    }
    
}