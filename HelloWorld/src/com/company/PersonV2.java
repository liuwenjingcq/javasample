package com.company;

import org.w3c.dom.ls.LSOutput;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PersonV2 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String hello() {
        return "Hello, " + name;
    }

    public static double TotalTax(Income... incomes) {
        double total = 0;
        for (Income income : incomes) {
            total += income.getTax();
        }
        return total;
    }

    Income[] incomes = new Income[]{
            new Income(3000),
            new Salary(7500),
            new RoyaltyIncome(12000)
    };

    public void run() {

    }
}
