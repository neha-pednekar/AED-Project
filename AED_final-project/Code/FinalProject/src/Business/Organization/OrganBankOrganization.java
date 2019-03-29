/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.OrganBank.Eyes;
import Business.OrganBank.Heart;
import Business.OrganBank.Kidney;
import Business.OrganBank.Liver;
import Business.Role.OrganAdminRole;
import Business.Role.OrganHospitalWorkRequestRole;
import Business.Role.OrganSystemWorkRequestRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author BHAVIK
 */
public class OrganBankOrganization extends Organization {

    private String organizationName;
    private ArrayList<Kidney> kidneyList;
    private ArrayList<Heart> heartList;
    private ArrayList<Liver> liverList;
    private ArrayList<Eyes> eyesList;

    public OrganBankOrganization() {
        super(Type.OrganBankOrganization.getValue());
        kidneyList = new ArrayList<Kidney>();
        heartList = new ArrayList<Heart>();
        liverList = new ArrayList<Liver>();
        eyesList = new ArrayList<Eyes>();

    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public Kidney addKidney() {
        Kidney kidney = new Kidney();
        kidney.getAge();
        kidneyList.add(kidney);
        return kidney;
    }

    public Heart addHeart() {
        Heart heart = new Heart();
        heartList.add(heart);
        return heart;
    }

    public Liver addLiver() {
        Liver liver = new Liver();
        liverList.add(liver);
        return liver;
    }

    public Eyes addEyes() {
        Eyes eyes = new Eyes();
        eyesList.add(eyes);
        return eyes;
    }

    public void removeKidney(Kidney kidney) {
        kidneyList.remove(kidney);
    }

    public void removeHeart(Heart heart) {
        heartList.remove(heart);
    }

    public void removeLiver(Liver liver) {
        liverList.remove(liver);
    }

    public void removeEyes(Eyes eyes) {
        eyesList.remove(eyes);
    }

    public ArrayList<Kidney> getKidneyList() {
        return kidneyList;
    }

    public void setKidneyList(ArrayList<Kidney> kidneyList) {
        this.kidneyList = kidneyList;
    }

    public ArrayList<Heart> getHeartList() {
        return heartList;
    }

    public void setHeartList(ArrayList<Heart> heartList) {
        this.heartList = heartList;
    }

    public ArrayList<Liver> getLiverList() {
        return liverList;
    }

    public void setLiverList(ArrayList<Liver> liverList) {
        this.liverList = liverList;
    }

    public ArrayList<Eyes> getEyesList() {
        return eyesList;
    }

    public void setEyesList(ArrayList<Eyes> eyesList) {
        this.eyesList = eyesList;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new OrganAdminRole());
        roles.add(new OrganHospitalWorkRequestRole());
        roles.add(new OrganSystemWorkRequestRole());
        return roles;
    }

    @Override
    public String toString() {
        return this.organizationName;
    }
}
