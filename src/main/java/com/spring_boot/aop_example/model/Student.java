package com.spring_boot.aop_example.model;

public class Student {
    private String stdId;
    private String firstName;
    private String lastName;

    public Student(){

    }

    public String getStdId(){
        return stdId;
    }
    public void setStdId(String stdId){
        this.stdId = stdId;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

}
