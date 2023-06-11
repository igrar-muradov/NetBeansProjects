/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Igrar
 */
public class Student extends Person{

    private String schoolName;
    private double schloarship;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getSchloarship() {
        return schloarship;
    }

    public void setSchloarship(double schloarship) {
        this.schloarship = schloarship;
    }

    @Override
    public String toString() {
        return this.getName()+" "+this.getSurname();
    }

}
