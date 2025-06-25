package org.sandeep.F1_CreationalPatterns.AbstractFactory;

import org.sandeep.F1_CreationalPatterns.AbstractFactory.University.CalTech;
import org.sandeep.F1_CreationalPatterns.AbstractFactory.University.GeorgiaTech;
import org.sandeep.F1_CreationalPatterns.AbstractFactory.University.MIT;
import org.sandeep.F1_CreationalPatterns.AbstractFactory.University.University;

//Concrete Factory
public class IvyLeagueUniversityFactory implements UniversityFactory {

    public University getUniversityInstance(String course) {
        return switch (course) {
            case "Math" -> new MIT();
            case "Physics" -> new CalTech();
            case "CS" -> new GeorgiaTech();
            default -> null;
        };
    }
}
