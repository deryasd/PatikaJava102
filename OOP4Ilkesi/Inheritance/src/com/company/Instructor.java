package com.company;

public class Instructor extends Academician{

    private String doorNumber;
    public Instructor(String nameSurname, String mobile, String email, String department,String title, String doorNumber
    ){
        super(nameSurname, mobile, email, department, title);
        this.doorNumber = doorNumber;
    }

    public String getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(String doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    public void entrance(){
        System.out.println(this.getNameSurname() + " öğretim görevlisi B kapısından giriş yaptı.");
    }

    @Override
    public void attendClass(String entranceTime){
        System.out.println(this.getNameSurname() + " öğretim görevlisi derse " + entranceTime + " saatinde başladı.");
    }
}
