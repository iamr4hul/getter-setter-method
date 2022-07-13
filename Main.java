package com.company;

public class Main {
    public static void main(String[]args){
        Person myObj1 = new Person();
        Person myObj2 = new Person();
        myObj1.setNaam("yufi");
        myObj2.setCode(182);
        System.out.println(myObj1.getNaam());
        System.out.println(myObj1.getCode());

    }
}