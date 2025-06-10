package org.sandeep.F1_CreationalPatterns.AbstractFactory.University;

//ConcreteProduct
public class USC implements University {
    @Override
    public int getFee() {
        return 40000;
    }

    @Override
    public String getAdmitCard() {
        return "USC Admit Card";
    }
}
