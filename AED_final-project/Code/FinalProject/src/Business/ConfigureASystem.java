package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.OrganBank.Eyes;
import Business.OrganBank.Heart;
import Business.OrganBank.Kidney;
import Business.OrganBank.Liver;
import Business.Organization.OrganBankOrganization;
import Business.Organization.Organization;
import Business.RegisterDonar.Donar;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAccount;


/**
 *
 * @author Neha Pednekar
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprises
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("NP","9920197432","bshah@yahoo.com");
       
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SysAdminRole());
        
        Network network = system.createAndAddNetwork();
        network.setName("b");
        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise("aa", Enterprise.EnterpriseType.SectorA);
        enterprise.setName("c");
        OrganBankOrganization organization = (OrganBankOrganization) enterprise.getOrganizationDirectory().createOrganization(Organization.Type.OrganBankOrganization, "orgh");
        
        Donar donar = system.addDonar();
        donar.setAddress("jasdd");
        donar.setDied(true);
        donar.setContactNo("656665656");
        donar.setGender("Male");
        donar.setDonate(true);
        donar.setYear(1990);
        donar.setZipCode(02215);
        
        
        Donar d1 = system.addDonar();
        d1.setAddress("jasdd");
        d1.setDied(true);
        d1.setContactNo("656665656");
        d1.setGender("Male");
        d1.setDonate(true);
        d1.setYear(1990);
        d1.setZipCode(02215);
        
        Eyes eyes = organization.addEyes();
        Kidney kidney = organization.addKidney();
        Liver liver = organization.addLiver();
        Heart heart = organization.addHeart();
        
        
        Eyes e = organization.addEyes();
        Kidney k = organization.addKidney();
        Liver l = organization.addLiver();
        Heart h = organization.addHeart();
        
        kidney.setDonor(donar);
        eyes.setDonor(donar);
        liver.setDonor(donar);
        heart.setDonor(donar);
        
        k.setDonor(d1);
        e.setDonor(d1);
        l.setDonor(d1);
        h.setDonor(d1);
                
                //+Patient patient = system.a
        return system;
    }
    
}
