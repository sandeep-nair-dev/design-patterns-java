package org.sandeep.F1_CreationalPatterns.AbstractFactory.University;

//ConcreteProduct
public class MIT implements University {
    @Override
    public int getFee() {
        return 100000;
    }

    @Override
    public String getAdmitCard() {
        return "MIT Admit Card";
    }
}
