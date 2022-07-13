package com.company;

public class Dancer extends Person{

    private String GroupName;

    public Dancer(String name, String desingnalion, String groupName) {
        super(name, desingnalion);
        GroupName = groupName;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    void setGroupName(){
        System.out.println("Балет");
    }
    void lrarn(){
        System.out.println("учется танцовать");
    }
    void walk(){
        System.out.println("любить танцевать");

    }
    void eat(){
        System.out.println("на диете ");

        }
        void dancing(){
            System.out.println("танцует лучше всех");
        }
    }

