package com.example.comp1011week1lab;
public class Cartype {

    //The class should have at least 3, private instance variables.
    private String make;
    private String model;
    private String license_number;

    //The class should have get/set methods for all of the instance variables.
    //The set methods should have some form of validation and throw an exception if they have an invalid argument.

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }
}
