package org.sandeep.F2_StructuralPatterns.Adapter;

import java.util.ArrayList;
import java.util.List;


//  Client
public class AdapterClient {

    public static void main(String[] args) {

    List<Student> students= new ArrayList<>();

    SchoolStudent schoolStudent = new SchoolStudent("name", "surname", "emailAddress");
    CollegeStudent collegeStudent = new CollegeStudent("firstName", "lastName", "email");
    students.add(collegeStudent);
    students.add(new SchoolStudentAdapter(schoolStudent));

        System.out.println(students);
    }
}
