package com.example.demo5phut1web.bean;

public class Student {
    private String name;
    private String country;

    public Student(String name,String country){
        super();
        this.name=name;
        this.country=country;
    }

    public String getName(){
        return  name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String postname(){
        return name;
    }

    public String getCountry(){
        return country;
    }
    public String postcountry(){
        return country;
    }

    public void setCountry(String country){
        this.country=country;
    }
}
