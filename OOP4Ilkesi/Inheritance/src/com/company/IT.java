package com.company;

public class IT extends Officer {

    private String jobDescriptions;

    public IT (String nameSurname, String mobile, String email, String department, String shift, String jobDescriptions){
        super(nameSurname, mobile, email, department, shift);
        this.jobDescriptions = jobDescriptions;
    }

    public String getJobDescriptions(){
        return jobDescriptions;
    }

    public void setJobDescriptions(String jobDescriptions){
        this.jobDescriptions = jobDescriptions;
    }

    @Override
    public void entrance(){
        System.out.println(this.getNameSurname() + " D kapısından içeri girdi.");
    }
    public void setUpNetwork(){
        System.out.println(this.getNameSurname() + " tarafından network kuruldu.");
    }
}
