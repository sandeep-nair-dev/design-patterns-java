package org.sandeep.F1_CreationalPatterns.AbstractFactory;

import org.sandeep.F1_CreationalPatterns.AbstractFactory.University.University;

public interface UniversityFactory {
    University getUniversityInstance(String course);
}
