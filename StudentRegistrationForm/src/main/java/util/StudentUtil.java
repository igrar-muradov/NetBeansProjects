/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import beans.Student;
import main.Config;

/**
 *
 * @author Igrar
 */
public class StudentUtil {

    public static Student fillStudent() {
        String name = InputUtil.requireText("Name : ");
        String surname = InputUtil.requireText("Surame : ");
        int age = InputUtil.requireNumber("Age :");
        String className = InputUtil.requireText("Class Name : ");

        Student st = new Student(name, surname, age, className);
        return st;
    }

    public static void printAllRegisteredStudents() {
        printStudents(Config.students);
    }

    public static void printStudents(Student[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+" "+arr[i].toString());
        }
    }

    public static void registerStudents() {
        int count = InputUtil.requireNumber("Student Registration\nHow many students do you want to register?\n:");
        Config.students = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nRegistration " + (i + 1));
            Config.students[i] = StudentUtil.fillStudent();
        }

        System.out.println("Below " + count + " Students have Successfully added");
        StudentUtil.printAllRegisteredStudents();
    }

    public static Student[] findStudents(String text) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                count++;
            }
        }

        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                result[found++] = st;
            }
        }
        return result;
    }

    public static void findStudentsAndPrint() {
        StudentUtil.printStudents(StudentUtil.findStudents(InputUtil.requireText("Enter Keyword\n:")));
    }

    public static void updateStudentInfo() {
        int index = InputUtil.requireNumber("Please choose student's Index Number\n: ");
        StudentUtil.printAllRegisteredStudents();
        Student st = Config.students[index - 1];
        updateStudentsParametr(st);
        System.out.println("Student's info successfully updated");
        System.out.println(st.toString());
    }

    public static void updateStudentsParametr(Student st) {
        int parametr = InputUtil.requireNumber("Please choose Number\n1. Name\n2. Surname\n3. Age\n4. Class\n: ");
        switch (parametr) {
            case 1 ->
                st.setName(InputUtil.requireText("New Name: "));
            case 2 ->
                st.setSurname(InputUtil.requireText("New Surname: "));
            case 3 ->
                st.setAge(InputUtil.requireNumber("New Age: "));
            case 4 ->
                st.setClassName(InputUtil.requireText("New Class: "));
            default -> {
            }
        }
    }

}
