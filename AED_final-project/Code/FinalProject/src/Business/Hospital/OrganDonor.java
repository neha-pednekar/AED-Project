/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import Business.OrganBank.Eyes;
import Business.OrganBank.Heart;
import Business.OrganBank.Kidney;
import Business.OrganBank.Liver;
import Business.RegisterDonar.Donar;

/**
 *
 * @author BHAVIK
 */
public class OrganDonor {

    private Donar donor;
    private Kidney kidney;
    private Heart heart;
    private String name;
    private Eyes eyes;
    private Liver liver;

    public Eyes getEyes() {
        return eyes;
    }

    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
    }

    public Liver getLiver() {
        return liver;
    }

    public void setLiver(Liver liver) {
        this.liver = liver;
    }

    public Donar getDonor() {
        return donor;
    }

    public void setDonor(Donar donor) {
        this.donor = donor;
    }

    public Kidney getOrgan() {
        return kidney;
    }

    public void setOrgan(Kidney organ) {
        this.kidney = organ;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
