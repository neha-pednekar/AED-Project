/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.OrganBankOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.OrganBank.OrganHospitalWorkRequestRoleJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Chintan
 */
public class OrganHospitalWorkRequestRole extends Role{

    public OrganHospitalWorkRequestRole() {
        super(RoleType.OrganHospitalWorkRequestRole.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new OrganHospitalWorkRequestRoleJPanel(userProcessContainer, account, (OrganBankOrganization) organization, enterprise,business);
    }

}
