package com.company;

public abstract class Assistant extends Academician{

    private String hour;
    public Assistant(String nameSurname, String mobile, String email, String department,String title, String hour){
        super(nameSurname, mobile, email, department, title);
        this.hour = hour;
    }

    public String getHour(){
        return hour;
    }

    public void setHour(String hour){
        this.hour = hour;
    }

    public void makeAnExam(){
        System.out.println(this.getNameSurname() + " quiz yaptı.");
    }

    @Override
    public void attendClass(String entranceTime){
        System.out.println(this.getNameSurname() + " asistanı derse " + entranceTime + " saatinde başladı.");
    }
}
