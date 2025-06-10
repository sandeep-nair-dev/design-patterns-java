package org.sandeep.F1_CreationalPatterns.AbstractFactory.University;

//ConcreteProduct
public class CalTech implements University {
    @Override
    public int getFee() {
        return 80000;
    }

    @Override
    public String getAdmitCard() {
        return "CalTech Admit Card";
    }
}
