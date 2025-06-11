package org.sandeep.F1_CreationalPatterns.Builder.GOF_GangOfFour_BuilderPattern;

import java.util.List;

//  ConcreteBuilder: ConcreteBuilder classes implement the Builder interface, providing specific implementations for building each part of the product.
public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder subjects() {
        this.subjects = List.of("Operating Systems", "OOPS", "DSA");
        return this;
    }

    @Override
    public StudentBuilder course() {
        this.course="Engineering";
        return this;
    }
}
