package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class CalcXmas implements Serializable{
    //class-instance variables
    private String todaysDate;
    private String result;
    private String xmasDay;

    public CalcXmas() {
    }
    
    public String getTodaysDate() {
        return todaysDate;
    }

    public void setTodaysDate(String todaysDate) {
        this.todaysDate = todaysDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getXmasDay() {
        return xmasDay;
    }

    public void setXmasDay(String xmasDay) {
        this.xmasDay = xmasDay;
    }

    @Override
    public String toString() {
        return "CalcXmas{" + "todaysDate=" + todaysDate + ", result=" + result + ", xmasDay=" + xmasDay + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.todaysDate);
        hash = 37 * hash + Objects.hashCode(this.result);
        hash = 37 * hash + Objects.hashCode(this.xmasDay);
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
        final CalcXmas other = (CalcXmas) obj;
        if (!Objects.equals(this.todaysDate, other.todaysDate)) {
            return false;
        }
        if (!Objects.equals(this.result, other.result)) {
            return false;
        }
        if (!Objects.equals(this.xmasDay, other.xmasDay)) {
            return false;
        }
        return true;
    }   
}
