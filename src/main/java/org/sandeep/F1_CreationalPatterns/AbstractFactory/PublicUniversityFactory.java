package org.sandeep.F1_CreationalPatterns.AbstractFactory;

import org.sandeep.F1_CreationalPatterns.AbstractFactory.University.ASU;
import org.sandeep.F1_CreationalPatterns.AbstractFactory.University.USC;
import org.sandeep.F1_CreationalPatterns.AbstractFactory.University.University;
import org.sandeep.F1_CreationalPatterns.AbstractFactory.University.VSU;

//Concrete Factory
public class PublicUniversityFactory implements UniversityFactory {
    public University university;

    @Override
    public University getUniversityInstance(String course) {
        return switch (course) {
            case "Math" -> new USC();
            case "Physics" -> new VSU();
            case "CS" -> new ASU();
            default -> null;
        };
    }
//    @Override
//    public String getAdmitCard(String course) {
//        return null;
//    }
//
//    @Override
//    public int calculateFee(String course) {
//        return university.getFee();
//    }
}
