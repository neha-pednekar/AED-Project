/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.HospitalAdmin.DoctorMainWorkareaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Neha Pednekar
 */
public class DoctorRole extends Role{

    public DoctorRole() {
        super(RoleType.DoctorRole.getValue());
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorMainWorkareaJPanel(userProcessContainer, account, (HospitalOrganization)organization, enterprise, business);
    }
 
}
