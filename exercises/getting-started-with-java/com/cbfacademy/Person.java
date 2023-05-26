package com.cbfacademy;

public class Person {

    final static String SPECIES = "Human"

    String firstName;
    String lastName;
    int age;

    public Person(String firstname, String lastName, int age)
        this.firstName =firstname;
        this.lastName =lastname;
        this.age =age;
    }
    public String getDetails(){
        return String.format(
                format:"My name is %s, and %s years old. I belong to the %s species",
        this.firstName, this.lastName, this.age, SPECIES
        );
    }
    public static void main(String... args) {
        System.out.println("Hello World!");
    }
}