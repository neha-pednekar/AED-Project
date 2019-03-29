/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrganBank;

import Business.Hospital.Patient;
import Business.RegisterDonar.Donar;

/**
 *
 * @author BHAVIK
 */
public abstract class Organs {

    private Donar donor;
    private Patient patient;
    private int age;

    public enum AgeGroup {
        //Kidney("15-24"),
        AgeGroup2("25-40"),
        AgeGroup3("40-55"),
        AgeGroup4("55 and Above");

        private String value;

        private AgeGroup(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organs() {
        //   this.age = name;
    }

    public Donar getDonor() {
        return donor;
    }

    public void setDonor(Donar donor) {
        this.donor = donor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public String toString(){
//    return this.age;
//    }
}
