package com.companyv3;

import com.supermarket.Merchandise;

public class Main {
    public static void main(String[] args) {
        Incomev3[] incomev3s = new Incomev3[]{
                new SalaryIncomev3(7000),
                new RoyaltyIncomev3(5000)
        };
        System.out.println(totalTax(incomev3s));
        System.out.println(Merchandise.DISCONT_FOR_VIP);
    }

    public static double totalTax(Incomev3... incomev3s) {
        double total = 0;
        for (Incomev3 incomev3 : incomev3s) {
            total += incomev3.getTax();
        }
        return total;
    }

}

