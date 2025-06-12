package org.sandeep.F1_CreationalPatterns.Prototype;


import java.util.List;

/**
 * Cloneable is helpful in cases where:
 * - We dont know what all fields are there in the object and want a copy of the object
 * - Some field is private and dont have a public setter..,.in that case we won't be able to initialize the value using new Object and set...here cloneable is useful
 * - Cloning a object is faster as compared to fetching details from db and using it to create new object.
 */
public class PrototypeMain {
    public static void main(String[] args) {
        UniversityStudent universityStudent = new UniversityStudent("Student 1", (int) (Math.random()*100), (int) (Math.random()*100), "FathersName1", "MothersName1", String.valueOf(Math.random()*100), String.valueOf(Math.random()*100));
        universityStudent.loadData();
        universityStudent.setAddress(new Address("New Delhi", "Delhi"));
        System.out.println(universityStudent);

        //This is again fetching the same data from db and populating in new object that is more intensive. Instead we could clone the 1st object and then make changes only to the fields we want to change
        UniversityStudent universityStudent2 = new UniversityStudent("Student 2", (int) (Math.random()*100), (int) (Math.random()*100), "FathersName2", "MothersName2", String.valueOf(Math.random()*100), String.valueOf(Math.random()*100));
        universityStudent2.loadData();
        System.out.println(universityStudent2);

        UniversityStudent universityStudent3 = universityStudent.clone();
        universityStudent3.setName("Student 3");
        universityStudent3.setRollNo((int) (Math.random()*100));
        universityStudent3.setAge((int) (Math.random()*100));
        universityStudent3.setRegistrationNumber(String.valueOf(Math.random()*100));

        universityStudent.getAddress().setCity("Kanpur");
        universityStudent.getAddress().setState("Bihar");
        universityStudent.getSubjects().remove(1);
        universityStudent.getSubjects().remove(1);

        System.out.println(universityStudent);
        System.out.println(universityStudent3);
    }
}
