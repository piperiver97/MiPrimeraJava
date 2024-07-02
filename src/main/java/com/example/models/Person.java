package com.example.models;

public class Person {
    
    private String name;
    private String lastname;
    private String dni;
    private int bornDate;
    private String country;
    private char gender;
    public Person(String name, String lastname, String dni, int bornDate, String country, char gender) {
        this.name = name;
        this.lastname = lastname;
        this.dni = dni;
        this.bornDate = bornDate;
        this.country = country;
        this.gender = gender;
    }
    public String getLastname() {
        return lastname;
    }
    public String getDni() {
        return dni;
    }
    public int getBornDate() {
        return bornDate;
    }
    public String getCountry() {
        return country;
    }
    public char getGender() {
        return gender;
    }
    public String getName(){
        return name;
    }
    public void print(){
        System.out.println(this.toString());
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", lastname=" + lastname + ", dni=" + dni + ", bornDate=" + bornDate
                + ", country=" + country + ", gender=" + gender + "]";
    }


}
