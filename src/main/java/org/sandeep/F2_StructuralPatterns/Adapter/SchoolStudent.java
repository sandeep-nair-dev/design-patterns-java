package org.sandeep.F2_StructuralPatterns.Adapter;

//  Adaptee
// Here SchoolStudent is like the legacy code that exists and we want to use at Client side but don't want to make changes to the legacy code.
public class SchoolStudent {
    private String name;
    private String surname;
    private String emailAddress;

    public SchoolStudent(String name, String surname, String emailAddress) {
        this.name = name;
        this.surname = surname;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
