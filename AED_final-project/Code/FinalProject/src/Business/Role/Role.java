/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author BHAVIK
 */
public abstract class Role {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     public enum RoleType{
        EnterpriseAdmin("Enterprise Admin"),
        
        HospitalAdminRole("Hospital Admin Role"),
        DienerAssistantRole("Diener Assistant Role"),
        DoctorRole("Doctor Role"),
        
        OrganAdminRole("Organ Admin Role"),
        OrganHospitalWorkRequestRole("Organ Hospital Role"),
        OrganSystemWorkRequestRole("Organ System Role"),
        
        LabRole("Lab Role"),
        MayorRole("Mayor Role"),
        MedicalCollegeAdminRole("Medical College Admin Role"),
        OrganizationRole("Organization Role"),
        ResearchAdminRole("Research Admin Role"),
        SystemAdminRole("System Admin Role");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
     
     public Role(String name)
     {
         this.name = name;
     }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.name;
    }
}
