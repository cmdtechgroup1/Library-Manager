package com.cmd.backend.model;

public class Student {

    private final String fName;
    private final String lName;
    private final String regNo;
    private final int id;
    private final String imgUrl;
    private final String phoneNumber;
    private final String email;

    public Student(String fName, String lName, String regNo, int id, String imgUrl, String phoneNumber, String email) {
        this.fName = fName;
        this.lName = lName;
        this.regNo = regNo;
        this.id = id;
        this.imgUrl = imgUrl;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getRegNo() {
        return regNo;
    }

    public int getId() {
        return id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
