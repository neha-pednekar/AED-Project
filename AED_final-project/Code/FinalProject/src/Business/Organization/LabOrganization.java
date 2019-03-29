/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Lab.LabOrganInventory;
import Business.Role.LabRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author BHAVIK
 */
public class LabOrganization extends Organization{

    
    private String organizationName;
    private LabOrganInventory labOrganInventory;
    
    public LabOrganization() {
        super(Type.Lab.getValue());
        labOrganInventory = new LabOrganInventory();
    }
    
    public String getOrganizationName() {
        return organizationName;
    }
    public LabOrganInventory getLabOrganInventory() {
        return labOrganInventory;
    }

    public void setLabOrganInventory(LabOrganInventory labOrganInventory) {
        this.labOrganInventory = labOrganInventory;
    }
  
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LabRole());
        return roles;
    }
    
    @Override
    public String toString() {
        return this.organizationName;
    }

    
}
