/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Neha Pednekar
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type, String organizationName){
        Organization organization = null;
        if (type.getValue().equals(Type.HospitalOrganization.getValue())){
            organization = new HospitalOrganization();
            HospitalOrganization hospitalOrganization = (HospitalOrganization)organization;
            hospitalOrganization.setOrganizationName(organizationName);
            organization = hospitalOrganization;
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.OrganBankOrganization.getValue())){
            organization = new OrganBankOrganization();
            OrganBankOrganization organBankOrganization = (OrganBankOrganization)organization;
            organBankOrganization.setOrganizationName(organizationName);
            organization = organBankOrganization;
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            LabOrganization labOrganization = (LabOrganization)organization;
            labOrganization.setOrganizationName(organizationName);
            organization = labOrganization;
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.MedicalCollegeOrganization.getValue())){
            organization = new MedicalCollegeOrganization();
            MedicalCollegeOrganization medicalCollegeOrganization = (MedicalCollegeOrganization)organization;
            medicalCollegeOrganization.setOrganizationName(organizationName);
            organization = medicalCollegeOrganization;
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ResearchOrganization.getValue())){
            organization = new ResearchOrganization();
            ResearchOrganization researchOrganization = (ResearchOrganization)organization;
            researchOrganization.setOrganizationName(organizationName);
            organization = researchOrganization;
            organizationList.add(organization);
        }
        return organization;
    }
}