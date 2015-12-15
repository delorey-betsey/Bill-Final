package byui.cit260.youGotNoCake.model;

import java.io.Serializable;
import java.util.Objects;

public class Calculations implements Serializable{
    //class-instance variables
    private Number numInput1;
    private Number numInput2;
    private Number numInput3;
    private Number numInput4;
    private String input1;
    private String input2;
    private String input3;
    private Number numberOutput;
    private String stringOutput;

    public Calculations() {
    }
    
    public Number getNumInput1() {
        return numInput1;
    }

    public void setNumInput1(Number numInput1) {
        this.numInput1 = numInput1;
    }

    public Number getNumInput2() {
        return numInput2;
    }

    public void setNumInput2(Number numInput2) {
        this.numInput2 = numInput2;
    }

    public Number getNumInput3() {
        return numInput3;
    }

    public void setNumInput3(Number numInput3) {
        this.numInput3 = numInput3;
    }

    public Number getNumInput4() {
        return numInput4;
    }

    public void setNumInput4(Number numInput4) {
        this.numInput4 = numInput4;
    }

    public String getInput1() {
        return input1;
    }

    public void setInput1(String input1) {
        this.input1 = input1;
    }

    public String getInput2() {
        return input2;
    }

    public void setInput2(String input2) {
        this.input2 = input2;
    }

    public String getInput3() {
        return input3;
    }

    public void setInput3(String input3) {
        this.input3 = input3;
    }

    public Number getNumberOutput() {
        return numberOutput;
    }

    public void setNumberOutput(Number numberOutput) {
        this.numberOutput = numberOutput;
    }

    public String getStringOutput() {
        return stringOutput;
    }

    public void setStringOutput(String stringOutput) {
        this.stringOutput = stringOutput;
    }

    @Override
    public String toString() {
        return "Calculations{" + "numInput1=" + numInput1 + ", numInput2=" + numInput2 + ", numInput3=" + numInput3 + ", numInput4=" + numInput4 + ", input1=" + input1 + ", input2=" + input2 + ", input3=" + input3 + ", numberOutput=" + numberOutput + ", stringOutput=" + stringOutput + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.numInput1);
        hash = 79 * hash + Objects.hashCode(this.numInput2);
        hash = 79 * hash + Objects.hashCode(this.numInput3);
        hash = 79 * hash + Objects.hashCode(this.numInput4);
        hash = 79 * hash + Objects.hashCode(this.input1);
        hash = 79 * hash + Objects.hashCode(this.input2);
        hash = 79 * hash + Objects.hashCode(this.input3);
        hash = 79 * hash + Objects.hashCode(this.numberOutput);
        hash = 79 * hash + Objects.hashCode(this.stringOutput);
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
        final Calculations other = (Calculations) obj;
        if (!Objects.equals(this.numInput1, other.numInput1)) {
            return false;
        }
        if (!Objects.equals(this.numInput2, other.numInput2)) {
            return false;
        }
        if (!Objects.equals(this.numInput3, other.numInput3)) {
            return false;
        }
        if (!Objects.equals(this.numInput4, other.numInput4)) {
            return false;
        }
        if (!Objects.equals(this.input1, other.input1)) {
            return false;
        }
        if (!Objects.equals(this.input2, other.input2)) {
            return false;
        }
        if (!Objects.equals(this.input3, other.input3)) {
            return false;
        }
        if (!Objects.equals(this.numberOutput, other.numberOutput)) {
            return false;
        }
        if (!Objects.equals(this.stringOutput, other.stringOutput)) {
            return false;
        }
        return true;
    } 
}
