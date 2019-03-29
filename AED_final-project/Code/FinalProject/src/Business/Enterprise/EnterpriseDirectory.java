/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author BHAVIK
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseDirectory;

    public EnterpriseDirectory() {
        enterpriseDirectory = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(ArrayList<Enterprise> enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
      public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.SectorA){
            enterprise = new SectorAEnterprise(name);
            enterpriseDirectory.add(enterprise);
        }
        if (type == Enterprise.EnterpriseType.SectorB){
            enterprise = new SectorBEnterprise(name);
            enterpriseDirectory.add(enterprise);
        }
        return enterprise;
    }
    
    
}
