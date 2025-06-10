package org.sandeep.F1_CreationalPatterns.AbstractFactory.University;

//ConcreteProduct
public class VSU implements University {
    @Override
    public int getFee() {
        return 30000;
    }

    @Override
    public String getAdmitCard() {
        return "VSU Admit Card";
    }
}
