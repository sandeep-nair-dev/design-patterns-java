package org.sandeep.F2_StructuralPatterns.Adapter;

public class CollegeStudent implements Student{
    String firstName;
    String lastName;
    String email;

    public CollegeStudent(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
