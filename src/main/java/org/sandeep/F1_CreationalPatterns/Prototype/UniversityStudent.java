package org.sandeep.F1_CreationalPatterns.Prototype;

import java.util.ArrayList;
import java.util.List;

public class UniversityStudent implements Cloneable{
    String name;
    int rollNo;
    int age;
    String fathersName;
    String mothersName;
    String registrationNumber;
    String course;
    List<String> subjects = new ArrayList<>();

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    Address address;


    public UniversityStudent(String name, int rollNo, int age, String fathersName, String mothersName, String registrationNumber, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.registrationNumber = registrationNumber;
        this.course = course;
    }

    public void loadData(){
        // assume it is fetching data from database and then setting in object
        getSubjects().add("Maths");
        getSubjects().add("Physics");
        getSubjects().add("OS");
        getSubjects().add("OOPS");
        getSubjects().add("DBMS");
        getSubjects().add("DSA");
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "UniversityStudent{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                ", fathersName='" + fathersName + '\'' +
                ", mothersName='" + mothersName + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", course='" + course + '\'' +
                ", subjects=" + subjects +
                ", address=" + address +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    // Default clone method does shallow copy, i.e., copies all the member fields, but it does not copy objects that the fields refer to. Instead, the references to these objects are copied, meaning both the original and the copied object refer to the same objects.
    // To make sure deep copy is done we need to write the implementation and create new object
    @Override
    public UniversityStudent clone() {
//            UniversityStudent clone = (UniversityStudent) super.clone();
//            // TODO: copy mutable state here, so the clone can't change the internals of the original
//            return clone;
            UniversityStudent universityStudent = new UniversityStudent(this.name, this.rollNo, this.age, this.fathersName, this.mothersName, this.registrationNumber, this.course);
            ArrayList<String> subjectsClone = new ArrayList<>(this.subjects);
            Address addressClone = new Address(this.address.getCity(), this.address.getState());
            universityStudent.setSubjects(subjectsClone);
            universityStudent.setAddress(addressClone);
            return universityStudent;

    }
}
