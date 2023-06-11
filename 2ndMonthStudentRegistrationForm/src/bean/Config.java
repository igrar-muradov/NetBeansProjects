/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

import java.io.Serializable;
import util.FileUtility;

/**
 *
 * @author Igrar
 */
public class Config implements Serializable {

    private static final String fileName = "app.obj";
    private static Config config = null;
    private static boolean loggedIn;
    private Student[] students = new Student[0];
    private Teacher[] teachers = new Teacher[0];

    public static void initialize() {
        Object obj = FileUtility.readFileDeserialize(fileName);
        if (obj == null) {
            return;
        }

        if (obj instanceof Config) {
            config = (Config) obj;
        }
    }

    public static void save() {
        FileUtility.writeObjectToFile(Config.getInstance(), fileName);
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public static Config getInstance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public static Config getConfig() {
        return config;
    }

    public static void setConfig(Config config) {
        Config.config = config;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

    public void appendStudent(Student stud) {
        int n = students.length;
        Student[] newStuds = new Student[n + 1];
        for (int i = 0; i < n; i++) {
            newStuds[i] = students[i];
        }
        newStuds[n] = stud;
        students = newStuds;
    }

    public void appendTeacher(Teacher t) {
        int n = teachers.length;
        Teacher[] newTeachers = new Teacher[n + 1];
        for (int i = 0; i < n; i++) {
            newTeachers[i] = teachers[i];
        }
        newTeachers[n] = t;
        teachers = newTeachers;
    }

}
