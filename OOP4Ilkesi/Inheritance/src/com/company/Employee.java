package com.company;

public abstract class Employee {
    private String nameSurname;
    private String mobile;
    private String email;

    public Employee(String nameSurname, String mobile,String email) {
        this.nameSurname = nameSurname;
        this.mobile = mobile;
        this.email = email;
    }

    public String getNameSurname (){
        return nameSurname;
    }

    public void setNameSurname(String nameSurname){
        this.nameSurname = nameSurname;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail ( String email){
        this.email = email;
    }

    public String getMobile (){
        return mobile;
    }

    public void setMobile (String mobile) {
        this.mobile = mobile;
    }

    public void entrance(){
        System.out.println(this.nameSurname + " üniversiteye giriş yaptı.");
    }

    public void entrance(String entranceTime){
        System.out.println(this.nameSurname + " " + entranceTime + " saatinde giriş yaptı.");
    }

    public void entrance(String entranceTime, String exitTime){
        System.out.println(this.nameSurname + " " + entranceTime + " saatinde giriş yaptı," + exitTime + " saatinde çıkacaktır.");
    }

    public void exit(){
        System.out.println(this.nameSurname + " üniversiteden çıkış yaptı.");
    }

    public void refectory(){
        System.out.println(this.nameSurname + " yemekhaneye girdi.");
    }
}
