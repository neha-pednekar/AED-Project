/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Hospital.Patient;
import Business.OrganBank.Organs;
import Business.Role.DienerAssistantRole;
import Business.Role.DoctorRole;
import Business.Role.HospitalAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author BHAVIK
 */
public class HospitalOrganization extends Organization{
    
    //private ArrayList<Organ> organList;
    private String organizationName;
    private ArrayList<Patient> patientList;
    
    public HospitalOrganization() {
        super(Type.HospitalOrganization.getValue());
        patientList = new ArrayList<Patient>();
        //organList = new ArrayList<Organ>();
    }

//    public ArrayList<Organ> getOrganList() {
//        return organList;
//    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

//    public Organ addOrgan(){
//    Organ organ = new Organ();
//    organList.add(organ);
//    return organ;
//    }
    
    public Patient addPatient(){
        Patient patient = new Patient();
        patientList.add(patient);
        return patient;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HospitalAdminRole());
        roles.add(new DienerAssistantRole());
        roles.add(new DoctorRole());
        
        return roles;
    }
    
    @Override
    public String toString() {
        return this.organizationName;
    }
    
}
