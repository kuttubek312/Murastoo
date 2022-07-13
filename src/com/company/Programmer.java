package com.company;

public class Programmer extends Person{

    private String CompanyName;

    public Programmer(String name, String desingnalion, String companyName) {
        super(name, desingnalion);
        CompanyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer{" + "CompanyName='" + CompanyName + '\'' + '}';
    }
    void setCompanyName(){
        System.out.println("Google");
    }
    void coding(){
        System.out.println("знает писать код на языке как java, c++, HTML, payton");
    }
}
