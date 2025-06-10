package org.sandeep.F1_CreationalPatterns.AbstractFactory.University;

//ConcreteProduct
public class ASU implements University {
    @Override
    public int getFee() {
        return 50000;
    }

    @Override
    public String getAdmitCard() {
        return "ASU Admit Card";
    }
}
