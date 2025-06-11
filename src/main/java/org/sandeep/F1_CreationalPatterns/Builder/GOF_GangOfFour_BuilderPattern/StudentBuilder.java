package org.sandeep.F1_CreationalPatterns.Builder.GOF_GangOfFour_BuilderPattern;

import java.util.List;

//  Builder: The Builder is an interface or an abstract class that declares the construction steps for building a complex object.
public abstract class StudentBuilder {
    String name;
    int rollNo;
    int age;
    String fathersName;
    String mothersName;
    String registrationNumber;
    String course;
    List<String> subjects;

    public StudentBuilder name(String name){
        this.name=name;
        return this;
    }

    public StudentBuilder rollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder fathersName(String fathersName) {
        this.fathersName = fathersName;
        return this;
    }

    public StudentBuilder mothersName(String mothersName) {
        this.mothersName = mothersName;
        return this;
    }

    public StudentBuilder registrationNumber(String registrationNumber){
        this.registrationNumber=registrationNumber;
        return this;
    }

    public abstract StudentBuilder subjects();

    public abstract StudentBuilder course();

    public Student build(){
        return new Student(this);
    }
}
