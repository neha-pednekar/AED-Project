/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.RegisterDonar.Donar;
import java.util.ArrayList;

/**
 *
 * @author Neha Pednekar
 */
public class Patient {

    private int patientID;
    private Donar donor;
    private static int count = 1;
    private ArrayList<OrganDonor> organDonorList;
    private String doctor;

    public ArrayList<OrganDonor> getOrganDonorList() {
        return organDonorList;
    }

    public void setOrganDonorList(ArrayList<OrganDonor> organDonorList) {
        this.organDonorList = organDonorList;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

 

    public Patient() {
        organDonorList = new ArrayList<OrganDonor>();
        patientID = count;
        count++;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public Donar getDonor() {
        return donor;
    }

    public void setDonor(Donar donor) {
        this.donor = donor;
    }

    public OrganDonor AddOrganDonor() {
        OrganDonor organDonor = new OrganDonor();
        organDonorList.add(organDonor);
        return organDonor;
    }

    public void OrganDonor(OrganDonor organDonor) {
        organDonorList.remove(organDonor);
    }
}
