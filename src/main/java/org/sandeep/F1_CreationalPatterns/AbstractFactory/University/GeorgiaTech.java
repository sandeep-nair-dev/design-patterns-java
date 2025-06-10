package org.sandeep.F1_CreationalPatterns.AbstractFactory.University;

//ConcreteProduct
public class GeorgiaTech implements University {
    @Override
    public int getFee() {
        return 90000;
    }

    @Override
    public String getAdmitCard() {
        return "Georgia Admit Card";
    }
}
