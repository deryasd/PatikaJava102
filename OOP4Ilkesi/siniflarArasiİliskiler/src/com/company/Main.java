package com.company;

public class Main {

    public static void main(String[] args) {
        Student st1 = new Student("Mustafa","Çetindağ","123","AA", 85);
        Student st2 = new Student("Alper Can","Eryaşar","124","BB", 110);
        Student st3 = new Student("Funda","Rautela","125","CC", 75);

        /*System.out.println(st2.getNote());
        st2.setNote(65);
        System.out.println(st2.getNote());*/

        // Kalıtım (Inheritance)
        // Composition, Aggretation
        //Course has a Instructor
        Instructor teacher = new Instructor("Mahmut","Çetindağ","CENG");
        Course mat = new Course("MAT101", "MAT", teacher);
        System.out.println(mat.getInstructor().getName());
        //Student[] stu = {st1,st2,st3};
        //System.out.println("Ortalama :" + mat.calculateAvarage(stu));
    }
}
