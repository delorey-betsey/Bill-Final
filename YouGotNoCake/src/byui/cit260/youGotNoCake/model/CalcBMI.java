package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class CalcBMI implements Serializable{
    //class-instance variables
    private Number height;
    private Number weight;
    private Number result;

    public CalcBMI() {
    }
    
    public Number getHeight() {
        return height;
    }

    public void setHeight(Number height) {
        this.height = height;
    }

    public Number getWeight() {
        return weight;
    }

    public void setWeight(Number weight) {
        this.weight = weight;
    }

    public Number getResult() {
        return result;
    }

    public void setResult(Number result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CalcBMI{" + "height=" + height + ", weight=" + weight + ", result=" + result + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.height);
        hash = 37 * hash + Objects.hashCode(this.weight);
        hash = 37 * hash + Objects.hashCode(this.result);
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
        final CalcBMI other = (CalcBMI) obj;
        if (!Objects.equals(this.height, other.height)) {
            return false;
        }
        if (!Objects.equals(this.weight, other.weight)) {
            return false;
        }
        if (!Objects.equals(this.result, other.result)) {
            return false;
        }
        return true;
    }
}
