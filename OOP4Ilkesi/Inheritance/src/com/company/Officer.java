package com.company;

public class Officer extends Employee {
    private String department;
    private String shift;

    public Officer(String nameSurname, String mobile, String email, String department,String shift){
        super(nameSurname,mobile,email);
        this.department = department;
        this.shift = shift;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getShift(){
        return shift;
    }

    public void setShift (String title){
        this.shift = shift;
    }

    public void startWork(){
        System.out.println(this.getNameSurname() + " işe başladı.");
    }


}
