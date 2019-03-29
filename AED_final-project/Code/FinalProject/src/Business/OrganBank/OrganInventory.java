/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrganBank;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author BHAVIK
 */
public class OrganInventory {
 private Kidney kidney;
 private Heart heart;
 private Liver liver;
 private Eyes eyes;
 private ArrayList<Object> organlist ;

 
    public OrganInventory() {
    kidney = new Kidney();
    heart = new Heart();
    liver = new Liver();
    eyes = new Eyes();
    organlist = new ArrayList<Object>(Arrays.asList(kidney,heart,liver,eyes));
    }

    public ArrayList<Object> getOrganlist() {
        return organlist;
    }

    public void setOrganlist(ArrayList<Object> organlist) {
        this.organlist = organlist;
    }
    
    public Kidney getKidney() {
        return kidney;
    }

    public void setKidney(Kidney kidney) {
        this.kidney = kidney;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public Liver getLiver() {
        return liver;
    }

    public void setLiver(Liver liver) {
        this.liver = liver;
    }

    public Eyes getEyes() {
        return eyes;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }
   
   
 
}
