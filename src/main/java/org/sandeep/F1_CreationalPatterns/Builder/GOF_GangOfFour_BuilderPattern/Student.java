package org.sandeep.F1_CreationalPatterns.Builder.GOF_GangOfFour_BuilderPattern;

import java.util.List;

//  Product: The Product is the complex object that the Builder pattern is responsible for constructing.
public class Student {
    String name;
    int rollNo;
    int age;
    String fathersName;
    String mothersName;
    String registrationNumber;
    String course;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.name=studentBuilder.name;
        this.rollNo = studentBuilder.rollNo;
        this.age = studentBuilder.age;
        this.fathersName = studentBuilder.fathersName;
        this.mothersName = studentBuilder.mothersName;
        this.registrationNumber=studentBuilder.registrationNumber;
        this.course = studentBuilder.course;
        this.subjects = studentBuilder.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                ", fathersName='" + fathersName + '\'' +
                ", mothersName='" + mothersName + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", course='" + course + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
