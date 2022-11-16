package com.company;

public class LabAssistant extends Assistant{

    public LabAssistant(String nameSurname, String mobile, String email, String department,String title, String hour){
        super(nameSurname, mobile, email, department, title, hour);
    }

    public void workIntoLab(){
        System.out.println(this.getNameSurname() + " laboratuvarda çalışıyor.");
    }

    public void lecture(){
        System.out.println(this.getNameSurname() + " ders veriyor.");
    }
}
