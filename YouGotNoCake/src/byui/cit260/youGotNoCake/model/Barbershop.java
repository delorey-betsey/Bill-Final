package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class Barbershop  implements Serializable{
    
    //class-instance variables
    private Number locationId;
    private String locationText;

    public Barbershop() {
    }

    
    public Number getLocationId() {
        return locationId;
    }

    public void setLocationId(Number locationId) {
        this.locationId = locationId;
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
        hash = 29 * hash + Objects.hashCode(this.locationId);
        hash = 29 * hash + Objects.hashCode(this.locationText);
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
        final Barbershop other = (Barbershop) obj;
        if (!Objects.equals(this.locationId, other.locationId)) {
            return false;
        }
        if (!Objects.equals(this.locationText, other.locationText)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Barbershop{" + "locationId=" + locationId + ", locationText=" + locationText + '}';
    } 
}
