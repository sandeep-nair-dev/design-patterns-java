package org.sandeep.F1_CreationalPatterns.Builder.GOF_GangOfFour_BuilderPattern;

//  Client: The Client is the code that initiates the construction of the complex object.
public class ClientMain {
    public static void main(String[] args) {
        Director director1 = new Director(new EngineeringStudentBuilder());
        Director director2 = new Director(new MBAStudentBuilder());

        Student engStudent = director1.createStudent("Student1", 24, "FathersName1", "MothersName1");
        Student mbaStudent = director2.createStudent("Student2", 34, "FathersName2", "MothersName2");

        System.out.println(engStudent.toString());
        System.out.println(mbaStudent.toString());


    }
}
