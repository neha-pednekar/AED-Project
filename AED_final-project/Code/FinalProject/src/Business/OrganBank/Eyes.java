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
public class Eyes extends Organs {

    private String name;

    public Eyes() {
        name = "Eyes";
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
