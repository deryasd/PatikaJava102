package com.company;

public class Main {

    public static void main(String[] args) {
        Employee c1 = new Employee("Mustafa Çetindağ","0550560560506","mustafa@gmail.com");
        c1.entrance();

        Academician a1 = new Academician("Derya Kalender","4656565","derya.sdev@gmail.com","Pc Programming","Student");
        System.out.println(a1.getNameSurname());
        a1.attendAClass();

        Employee a11 = new Officer("Ersin Kalender", "6465454","ersin@gmail","home","7/4");

        Instructor i1 = new Instructor("Ayla Durmaz", "0532565265","ayla@gmail.com","Pc","Instructor", "45");
        i1.entrance();
    }
}
