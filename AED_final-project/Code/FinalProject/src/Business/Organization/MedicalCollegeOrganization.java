/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Role.MedicalCollegeAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author BHAVIK
 */
public class MedicalCollegeOrganization extends Organization{
    
    private String organizationName;
    
    public MedicalCollegeOrganization() {
        super(Type.MedicalCollegeOrganization.getValue());
    }
    
    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new MedicalCollegeAdminRole());
        return roles;
    }
    
    @Override
    public String toString() {
        return this.organizationName;
    }
}
