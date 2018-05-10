/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Baris
 */
public class Patient {

    private String name, surname;
    private int age, lengthOfStayInTheCountry;
    private boolean healthInsurance;
    private boolean countryMember;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLengthOfStayInTheCountry() {
        return lengthOfStayInTheCountry;
    }

    public void setLengthOfStayInTheCountry(int lengthOfStayInTheCountry) {
        this.lengthOfStayInTheCountry = lengthOfStayInTheCountry;
    }

    public boolean isHealthInsurance() {
        return healthInsurance;
    }

    public void setHealthInsurance(boolean healthInsurance) {
        this.healthInsurance = healthInsurance;
    }

    public boolean isCountryMember() {
        return countryMember;
    }

    public void setCountryMember(boolean countryMember) {
        this.countryMember = countryMember;
    }



    public Patient(String name, String surname, int age, int LengthOfStayInTheCountry, boolean healthInsurance, boolean countryMember) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.lengthOfStayInTheCountry = LengthOfStayInTheCountry;
        this.healthInsurance = healthInsurance;
        this.countryMember = countryMember;
    }

    public Patient() {
    }

}
