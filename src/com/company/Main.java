package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {



       Programmer programmer = new Programmer("Куттубек","програмист", "Google");
       Dancer dancer = new Dancer("Венера", "бийчи" , "звёзды");
       Musician musician = new Musician("Даниель","ырчы","хип хоп");



        System.out.println(programmer.getName());
        System.out.println(programmer.getDesingnalion());
        programmer.setCompanyName();
        programmer.learn();
        programmer.coding();
        programmer.walk();
        programmer.eat();
        System.out.println();



        System.out.println(dancer.getName());
        System.out.println(dancer.getDesingnalion());
        dancer.setGroupName();
        dancer.lrarn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println();

        System.out.println(musician.getName());
        System.out.println(musician.getDesingnalion());
        musician.setBandName();
        musician.learn();
        musician.walk();
        musician.eat();
        musician.singing();
        musician.platGitar();

    }
}