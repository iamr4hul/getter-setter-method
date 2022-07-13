package com.company;

public class Person {
    private String name ="Rahul";  // restricted access of these variables value
    private int code = 146;// restricted access of these variables value

    // for accessing these variables we need Getter and Setter methods i.e."get and set";
    // First use getter method to get the values
    // these methods always be in public

    // Getter method

    public String getNaam(){
        return name;
    }
    public int getCode(){
        return code;
    }

    // Setter method
    public void setNaam(String newNaam){
        this.name = newNaam;
    }

    public void setCode(int newCode){
        this.code = newCode;
    }
}