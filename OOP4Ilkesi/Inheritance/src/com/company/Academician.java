package com.company;

public class Academician extends Employee{
    private String department;
    private String title;

    public Academician(String nameSurname, String mobile, String email, String department,String title){
        super(nameSurname,mobile,email);
        this.department = department;
        this.title = title;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void attendAClass(){
        System.out.println(this.getNameSurname() + " derse giriş yaptı.");
    }
}
