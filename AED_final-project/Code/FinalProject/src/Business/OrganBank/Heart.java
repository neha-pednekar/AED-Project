/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrganBank;

import java.util.ArrayList;

/**
 *
 * @author BHAVIK
 */
public class Heart extends Organs {

    private String name;

    public Heart() {
        name = "Heart";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
