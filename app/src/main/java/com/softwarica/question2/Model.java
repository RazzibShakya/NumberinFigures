package com.softwarica.question2;

public class Model {
   String[]ones,tens;


    public Model(String[] ones, String[] tens) {
        this.ones = ones;
        this.tens = tens;
    }

    public String[] getOnes() {
        return ones;
    }

    public void setOnes(String[] ones) {
        this.ones = ones;
    }

    public String[] getTens() {
        return tens;
    }

    public void setTens(String[] tens) {
        this.tens = tens;
    }
}
