package org.sandeep.F2_StructuralPatterns.Adapter;

//  Adapter
public class SchoolStudentAdapter implements Student{


    SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }


    @Override
    public String getFirstName() {
        return schoolStudent.getName();
    }

    @Override
    public String getLastName() {
        return schoolStudent.getSurname();
    }

    @Override
    public String getEmail() {
        return schoolStudent.getEmailAddress();
    }
}
