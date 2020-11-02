package com.companyv3;

public class RoyaltyIncomev3 implements Incomev3 {
    private double incomev3;

    RoyaltyIncomev3(double incomev3) {
        this.incomev3 = incomev3;
    }

    public double getTax() {
        return incomev3 * 0.2;
    }

}
