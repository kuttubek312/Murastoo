package com.company;

public class Musician extends Person {

    private String BandName;

    public Musician(String name, String desingnalion, String bandName) {
        super(name, desingnalion);
        BandName = bandName;
    }
    void setBandName(){
        System.out.println("Хип Хоп");

    }
    void learn(){
        System.out.println("пишет песни");
    }
    void walk(){
        System.out.println("любить слушать музыку");
    }
    void eat(){
        System.out.println("много есть");
    }
    void singing(){
        System.out.println("круто читает реп ");
    }
    void platGitar(){
        System.out.println("гитарада да ойной алат");
    }
}
