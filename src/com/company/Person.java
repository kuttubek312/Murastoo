package com.company;

public class Person {
   private String name ;
   private String desingnalion;



    public Person(String name, String desingnalion){
        this.name = name;
        this.desingnalion = desingnalion;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesingnalion() {
        return desingnalion;
    }

    public void setDesingnalion(String desingnalion) {
        this.desingnalion = desingnalion;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", desingnalion='" + desingnalion + '\'' +
                '}';
    }
    void learn(){
        System.out.println("учиться");
    }
    void walk(){
        System.out.println("развлекает");
    }

    void eat(){
        System.out.println("кушает");
    }
    }



