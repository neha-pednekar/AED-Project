/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.LabOrg.LabOrganTestJPanel;
import javax.swing.JPanel;

/**
 *
 * @author BHAVIK
 */
public class LabRole extends Role{

    public LabRole() {
        super(RoleType.LabRole.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new LabOrganTestJPanel(userProcessContainer, account, (LabOrganization)organization, enterprise, business);
    }
 
}
