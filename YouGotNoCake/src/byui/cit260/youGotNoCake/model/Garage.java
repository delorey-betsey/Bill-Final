package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class Garage implements Serializable {
    
     //class-instance variables
    private Player mmvPlayer;
    private int locationID;
    private String foundItem;

    public Garage(Player player) {
        this.mmvPlayer = player;
        this.locationID = 6;
        this.foundItem = "Apnea Fairy";
    }

    public Player pickupItem() {
        
            for (String cakeIngredient : new CakeIngredients().getCakeIngredientsArray()) {
                if (cakeIngredient.equalsIgnoreCase(foundItem)) {
                    mmvPlayer.getFoundCakeIngredients().add(foundItem);
                }
            }

            for (String partySupply : new PartySupplies().getPartySuppliesArray()) {
                if (partySupply.equalsIgnoreCase(foundItem)) {
                    mmvPlayer.getFoundPartySupplies().add(foundItem);
                }
            }
        return mmvPlayer;
    }
        
    public int getLocationID() {
        return locationID;
    }

    public void setLocationID(int locationID) {
        this.locationID = locationID;
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
        final Garage other = (Garage) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Garage{" + "mmvPlayer=" + mmvPlayer + ", locationID=" + locationID + ", foundItem=" + foundItem + '}';
    }
    
}
