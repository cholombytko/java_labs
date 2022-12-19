package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void displayProperties(Student student) {
        String properties =
                "Name: " + student.getName() + "\n" +
                "Last name: " + student.getLastName() + "\n" +
                "Age: " + student.getAge() + "\n" +
                "Dopka quantity: " + student.getDopkaQuantity() + "\n" +
                "Stipend quantity: " + student.getStipendQuantity() + "\n";
        System.out.println(properties);
    }

    public static void sortByDopka(Student[] students) {
        Arrays.sort(students, Comparator.comparing(Student::getDopkaQuantity));
        for(Student student : students) {
            displayProperties(student);
        }
    }

    public static void sortByAge(Student[] students) {
        Arrays.sort(students, Comparator.comparing(Student::getAge).reversed());
        for(Student student : students) {
            displayProperties(student);
        }
    }

    public static void main(String[] args) {
        Student Dmytro = new Student("Dmytro", "Chuenko", 19, 8, 0);
        Student Misha = new Student("Misha", "Lukianenko", 18, 4, 1500);
        Student Kyrylo = new Student("Kyrylo", "Cholombytko", 20, 0, 2000);

        Student[] students = {Dmytro, Misha, Kyrylo};

        sortByDopka(students);
        sortByAge(students);
    }
}