package com.payment.UsersProject.reponse;

public class UserResponse {


    private int studentId;
    private String name;

    private String lastName;


    private String email;

    private String password;

    public UserResponse(int studentId, String name, String lastName, String email, String password) {
        this.studentId = studentId;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public UserResponse() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
