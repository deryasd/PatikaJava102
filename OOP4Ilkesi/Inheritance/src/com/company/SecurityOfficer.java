package com.company;

public class SecurityOfficer extends Officer {
    private String document;

    public SecurityOfficer (String nameSurname, String mobile, String email, String department, String shift, String document){
        super(nameSurname, mobile, email, department, shift);
        this.document = document;
    }

    public void guardDuty(){
        System.out.println(this.getNameSurname() + " dokümasyonu.");
    }
}
