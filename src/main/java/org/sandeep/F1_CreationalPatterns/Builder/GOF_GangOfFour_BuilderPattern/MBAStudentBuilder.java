package org.sandeep.F1_CreationalPatterns.Builder.GOF_GangOfFour_BuilderPattern;

import java.util.List;

//  ConcreteBuilder: ConcreteBuilder classes implement the Builder interface, providing specific implementations for building each part of the product.
public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder subjects() {
        this.subjects = List.of("Management","HR");
        return this;
    }

    @Override
    public StudentBuilder course() {
        this.course="MBA";
        return this;
    }
}
