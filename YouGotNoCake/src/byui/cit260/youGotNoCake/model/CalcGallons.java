package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class CalcGallons implements Serializable{
    //class-instance variables
    private Number members;
    private Number result;

    public CalcGallons() {
    }

    public Number getMembers() {
        return members;
    }

    public void setMembers(Number members) {
        this.members = members;
    }

    public Number getResult() {
        return result;
    }

    public void setResult(Number result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "CalcGallons{" + "members=" + members + ", result=" + result + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.members);
        hash = 73 * hash + Objects.hashCode(this.result);
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
        final CalcGallons other = (CalcGallons) obj;
        if (!Objects.equals(this.members, other.members)) {
            return false;
        }
        if (!Objects.equals(this.result, other.result)) {
            return false;
        }
        return true;
    } 
}
