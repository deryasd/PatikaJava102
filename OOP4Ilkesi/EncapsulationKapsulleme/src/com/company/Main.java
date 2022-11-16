package com.company;



public class Main {
    // Encapsulation (Kapsülleme)
    // Inheritance (Kalıtım)
    // Polimorphism (Çok Biçimlilik)
    // Abstraction (Soyutlama)
    public static void main(String[] args) {
        Book harryPotter = new Book("Harry Potter", 150);
        Book lordOfTheRings = new Book("Lord of The Rings", -100);
        lordOfTheRings.setName("ABC");
        System.out.println(lordOfTheRings.getName());
        System.out.println(lordOfTheRings.getName());
        System.out.println(lordOfTheRings.getName());

    }

}
