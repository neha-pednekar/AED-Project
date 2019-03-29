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
import Interface.HospitalAdmin.DienerAssistantRoleJPanel;
import Interface.HospitalAdmin.HospitalAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author BHAVIK
 */
public class DienerAssistantRole extends Role{

    public DienerAssistantRole() {
        super(RoleType.DienerAssistantRole.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DienerAssistantRoleJPanel(userProcessContainer, account, (HospitalOrganization)organization, enterprise, business);
    }
   
    
}
