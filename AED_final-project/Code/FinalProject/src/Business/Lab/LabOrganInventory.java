/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Lab;

import Business.RegisterDonar.Donar;
import java.util.ArrayList;

/**
 *
 * @author Chintan
 */
public class LabOrganInventory {
    private String labName;
    private String hospitalName;
    ArrayList<Donar> goodOrganlist ;
    ArrayList<Donar> badOrganlist ;
    ArrayList<Donar> NAOrganlist ;

    public ArrayList<Donar> getNAOrganlist() {
        return NAOrganlist;
    }

    public void setNAOrganlist(ArrayList<Donar> NAOrganlist) {
        this.NAOrganlist = NAOrganlist;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public ArrayList<Donar> getGoodOrganlist() {
        return goodOrganlist;
    }

    public void setGoodOrganlist(ArrayList<Donar> goodOrganlist) {
        this.goodOrganlist = goodOrganlist;
    }

    public ArrayList<Donar> getBadOrganlist() {
        return badOrganlist;
    }

    public void setBadOrganlist(ArrayList<Donar> badOrganlist) {
        this.badOrganlist = badOrganlist;
    }
    
    
    public LabOrganInventory()
    {
        goodOrganlist = new ArrayList<Donar>();
        badOrganlist = new ArrayList<Donar>();
        NAOrganlist = new ArrayList<Donar>();
    }
    
    public void addGoodOrgans(Donar d)
    {
        goodOrganlist.add(d);
    }
    public void addBadOrgans(Donar d)
    {
        badOrganlist.add(d);
    }
    public void addNaOrgans(Donar d)
    {
        NAOrganlist.add(d);
    }
}
