package com.smagin.mipt.fullstack.scopes;

import java.util.Arrays;
import java.util.Scanner;

public class StudentService {
    public static Student bestStudent(Student[] listStudents) {
        Student bestStudent = listStudents[0];
        for (int i = 1; i < listStudents.length; i++) {
            if ((bestStudent.calculateAverageGrade(bestStudent.getGrades())) < (listStudents[i].calculateAverageGrade(listStudents[i].getGrades()))) {
                bestStudent = listStudents[i];
            }
        }
        return bestStudent;
    }

    public static void sortBySurname(Student[] listStudents) {
        String[] intermediateArray = new String[listStudents.length];
        for (int serialNumber = 0; serialNumber < listStudents.length; serialNumber++) {
            intermediateArray[serialNumber] = listStudents[serialNumber].getName();
        }
        Arrays.sort(intermediateArray);
        for (int serialNumber = 0; serialNumber < listStudents.length; serialNumber++) {
            listStudents[serialNumber].setName(intermediateArray[serialNumber]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] listStudent = new Student[2];
        int[] assessment = new int[2];

        for (int serialNumberStudent = 0; serialNumberStudent < listStudent.length; serialNumberStudent++) {
            for (int assessmentNumber = 0; assessmentNumber < assessment.length; assessmentNumber++) {
                assessment[assessmentNumber] = scanner.nextInt();
            }
            String name = scanner.next();
            listStudent[serialNumberStudent] = new Student(name, assessment);
        }

        System.out.println(bestStudent(listStudent).getName());

        sortBySurname(listStudent);
        for (int Student = 0; Student < listStudent.length; Student++) {
            System.out.println(listStudent[Student].getName());
        }
        listStudent[0] = new Student(null, null, null);
        listStudent[1] = new Student(null, null, null);
        StudentService.bestStudent(listStudent);

    }

    static public class Student {
        private String name;
        private String surname;
        int[] grades;

        Student(String name, String surname, int[] grades) {

        }

        Student(String name, int[] grades) {
            this.name = name;
            this.grades = grades;
        }

        Student(String name) {
            this.name = name;
        }

        Student(int[] grades) {
            this.grades = grades;
        }

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

        public int[] getGrades() {
            return grades;
        }

        public void setGrades(int[] grades) {
            if (grades.length < 10) {
                this.grades = grades;
            }
        }

        public double calculateAverageGrade(int[] grades) {
            double average = Arrays.stream(grades).asDoubleStream().sum();
            average /= grades.length;
            return average;
        }

        public void insertNewGrade(int newGrades) {
            for (int assessmentNumber = 0; assessmentNumber < grades.length - 1; assessmentNumber++) {
                grades[assessmentNumber + 1] = grades[assessmentNumber];
            }
            grades[0] = newGrades;
        }


    }
}


