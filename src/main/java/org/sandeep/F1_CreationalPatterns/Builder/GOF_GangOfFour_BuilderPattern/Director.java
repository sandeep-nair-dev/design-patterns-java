package org.sandeep.F1_CreationalPatterns.Builder.GOF_GangOfFour_BuilderPattern;

//  Director: The Director is responsible for managing the construction process of the complex object.
public class Director {

    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder){
        this.studentBuilder=studentBuilder;
    }

    public Student createStudent(String name, int age, String fathersName, String mothersName){
        if(studentBuilder instanceof EngineeringStudentBuilder) return createEngineeringStudent(name, age, fathersName, mothersName);
        else if(studentBuilder instanceof MBAStudentBuilder) return createMBAStudent(name,age, fathersName, mothersName);
        return null;
    }

    private Student createEngineeringStudent(String name, int age, String fathersName, String mothersName){
        return studentBuilder.name(name).rollNo((int)(Math.random()*100)).age(age).fathersName(fathersName).mothersName(mothersName).registrationNumber("ENGG" + Integer.parseInt(String.valueOf((int) (Math.random() * 100)))).subjects().course().build();
    }

    private Student createMBAStudent(String name, int age, String fathersName, String mothersName){
        return studentBuilder.name(name).rollNo((int)(Math.random()*100)).age(age).fathersName(fathersName).mothersName(mothersName).registrationNumber("MBA" + Integer.parseInt(String.valueOf((int) (Math.random() * 100)))).subjects().course().build();
    }
}
