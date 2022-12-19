package org.example;

public class Student {
    public String name;
    public String lastName;
    public int age;
    public int dopkaQuantity;
    public int stipendQuantity;

    public Student(String name, String lastName, int age, int dopkaQuantity, int stipendQuantity) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dopkaQuantity = dopkaQuantity;
        this.stipendQuantity = stipendQuantity;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public int getDopkaQuantity() {
        return this.dopkaQuantity;
    }

    public int getStipendQuantity() {
        return this.stipendQuantity;
    }
}
