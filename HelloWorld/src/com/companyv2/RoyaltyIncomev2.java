package com.companyv2;

public class RoyaltyIncomev2 extends Incomev2 {
    public  RoyaltyIncomev2(double incomev2) {
        super(incomev2);
    }
    @Override
    public double getTax() {
        return incomev2 * 0.2;
    }
}
