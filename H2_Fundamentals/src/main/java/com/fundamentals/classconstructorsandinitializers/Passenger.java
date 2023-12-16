package com.fundamentals.classconstructorsandinitializers;

import java.security.PublicKey;

public class Passenger {
    private int checkedBags;
    private int freeBags;
    private double perBagFee;

    public int getCheckedBags() {
        return checkedBags;
    }

    public void setCheckedBags(int checkedBags) {
        this.checkedBags = checkedBags;
    }

    public int getFreeBags() {
        return freeBags;
    }

    public void setFreeBags(int freeBags) {
        this.freeBags = freeBags;
    }

    public double getPerBagFee() {
        return perBagFee;
    }

    public void setPerBagFee(double perBagFee) {
        this.perBagFee = perBagFee;
    }

    //    CONSTRUCTOR
    public Passenger() {
    }

    ;

    public Passenger(int freeBags) {
        this(freeBags > 1 ? 25.0d : 50.0d); // pass that value to the
        // constructor that accepts that perbagfee
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkedBags) {
        this(freeBags);
        this.checkedBags = checkedBags;
    }

    private Passenger(double perBagFee) {
        this.perBagFee = perBagFee;
    }
}
