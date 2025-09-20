package org.sandeep.F2_StructuralPatterns.Facade;

public class User {
    private String username;
    private String email;
    private String number;

    public User(String username, String email, String number) {
        this.username = username;
        this.email = email;
        this.number = number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
