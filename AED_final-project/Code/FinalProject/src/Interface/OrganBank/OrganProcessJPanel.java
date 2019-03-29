/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.OrganBank;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.OrganDonor;
import Business.Network.Network;
import Business.OrganBank.Eyes;
import Business.OrganBank.Heart;
import Business.OrganBank.Kidney;
import Business.OrganBank.Liver;
import Business.OrganBank.Organs;
import Business.Organization.HospitalOrganization;
import Business.Organization.OrganBankOrganization;
import Business.Organization.Organization;
import Business.RegisterDonar.Organ;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import Interface.HospitalAdmin.ProcessOrganRequestJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BHAVIK
 */
public class OrganProcessJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrganProcessJPanel
     */
    private JPanel userProcessContainer;
    private OrganBankOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private WorkRequest request;
    private int min;
    private int max;

    OrganProcessJPanel(JPanel userProcessContainer, UserAccount userAccount, OrganBankOrganization organization, Enterprise enterprise, EcoSystem business, WorkRequest request) {

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.business = business;
        this.request = request;
        lblAge.setText(String.valueOf(request.getAge()));
        lblRequiredOrgan.setText(request.getOrganName());
        lblQuantity.setText(String.valueOf(request.getQuantity()));
        calulateAgeRange();
        populateTable();
    }

    public void calulateAgeRange() {
        int patientAge = request.getAge();

        if (patientAge < 10) {
            min = 0;
        } else {
            min = patientAge - 10;
        }

        max = patientAge + 10;
        lblMinAge.setText(String.valueOf(min));
        lblMaxAge.setText(String.valueOf(max));

    }

    public void addTable() {
        
//            if(request.getQuantity()>)
//        if (selectedRow >= 0) {
        
            if (request.getQuantity() > 0) {
                if(tbl_OrganRequest.getRowCount() > 0){
                    
                Organs organ = (Organs) tbl_OrganRequest.getValueAt(0, 0);

                if (organ instanceof Kidney) {
                    OrganDonor organDonor = request.getPatient().AddOrganDonor();
                    organDonor.setDonor(organ.getDonor());
                    organDonor.setOrgan((Kidney) organ);
                    organization.removeKidney((Kidney) organ);
                    populateTable();
                 
                    
                }

                if (organ instanceof Heart) {
                    OrganDonor organDonor = request.getPatient().AddOrganDonor();
                    organDonor.setDonor(organ.getDonor());
                    organDonor.setHeart((Heart) organ);
                    organization.removeHeart((Heart) organ);
                    populateTable();
                    //request.setQuantity(request.getQuantity() - 1);
                }

                if (organ instanceof Eyes) {
                    OrganDonor organDonor = request.getPatient().AddOrganDonor();
                    organDonor.setDonor(organ.getDonor());
                    organDonor.setEyes((Eyes) organ);
                    organization.removeEyes((Eyes) organ);
                    populateTable();
                    //request.setQuantity(request.getQuantity() - 1);
                }

                if (organ instanceof Liver) {
                    OrganDonor organDonor = request.getPatient().AddOrganDonor();
                    organDonor.setDonor(organ.getDonor());
                    organDonor.setLiver((Liver) organ);
                    organization.removeLiver((Liver) organ);
                    populateTable();
                    //request.setQuantity(request.getQuantity() - 1);
                }

               
            }
            else{
                    JOptionPane.showMessageDialog(null, "No Quantity");
            } 
            }
       else {
             JOptionPane.showMessageDialog(null, "Quantity requested has already been added! Please process for delivery");
        }
          
//        }      
//        else {
//             JOptionPane.showMessageDialog(null, "Please select Row");
//        }
          
        
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tbl_OrganRequest.getModel();
        model.setRowCount(0);
        Organ organ = null;
        int count = 0;
        Object row[] = new Object[3];
        if (request.getOrganName().equalsIgnoreCase("Kidney")) {
            for (Kidney kidney : organization.getKidneyList()) {
                if (kidney.getDonor().getAge() >= min && kidney.getDonor().getAge() <= max) {

                    row[0] = kidney;//.getDonor().getDonarID();
                    row[1] = kidney.getDonor().getDonarID();
                    row[2] = kidney.getDonor().getAge();
                     model.addRow(row);
                }
            }
        }    
        if (request.getOrganName().equalsIgnoreCase("Heart")) {
            for (Heart heart : organization.getHeartList()) {
                if (heart.getDonor().getAge() >= min && heart.getDonor().getAge() <= max) {
                            count++;

                            row[0] = heart;//.getDonor().getDonarID();
                            row[1] = heart.getDonor().getDonarID();
                            row[2] = heart.getDonor().getAge();
                             model.addRow(row);
                }
            }    
        }
        if (request.getOrganName().equalsIgnoreCase("Liver")) {
            for (Liver liver : organization.getLiverList()) {
                if (liver.getDonor().getAge() >= min && liver.getDonor().getAge() <= max) {
                                    count++;

                                    row[0] = liver;//
                                    row[1] = liver.getDonor().getDonarID();
                                    row[2] = liver.getDonor().getAge();
                                     model.addRow(row);
                }
            }
        }    
         
        if (request.getOrganName().equalsIgnoreCase("Eyes")) {
            for (Eyes eyes : organization.getEyesList()) {
                if (eyes.getDonor().getAge() >= min && eyes.getDonor().getAge() <= max) {
                        count++;
                             row[0] = eyes;//.getDonor().getDonarID();
                             row[1] = eyes.getDonor().getDonarID();
                             row[2] = eyes.getDonor().getAge();;
                              model.addRow(row);
                }
            }
       }
       
    }
                       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_OrganRequest = new javax.swing.JTable();
        btnDeliver = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblRequiredOrgan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblMinAge = new javax.swing.JLabel();
        lblMaxAge = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        tbl_OrganRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organ", "DonorID", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_OrganRequest);

        btnDeliver.setText("Deliver");
        btnDeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliverActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Required Organ: ");

        jLabel2.setText("Age:");

        jLabel3.setText("Min Age :");

        jLabel4.setText("Max Age :");

        jLabel5.setText("Quantity :");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblRequiredOrgan)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel2)
                                .addGap(2, 2, 2)
                                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMinAge, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblMaxAge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202)
                        .addComponent(btnDeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(492, 492, 492))))
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMaxAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMinAge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblRequiredOrgan)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeliver)
                    .addComponent(btnBack))
                .addGap(3, 3, 3)
                .addComponent(jButton1)
                .addContainerGap(110, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliverActionPerformed


        // TODO add your handling code here:

        for(int i = 0; i<= request.getQuantity();i++){
            addTable();
            request.setQuantity(request.getQuantity() - 1);
        }
        if (request.getQuantity() == 0) {
            request.setMessage("Delivered");
            request.setSender(userAccount);
            request.setType("OGAdmin");
            request.setStatus("Completed");
            for (Network network : business.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseDirectory()) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof HospitalOrganization) {
                            for (UserAccount user : organization.getUserAccountDirectory().getUserAccountList()) {
                                for (WorkRequest req : user.getWorkQueue().getWorkRequestList()) {
                                    if (req.getHospitalName().equalsIgnoreCase(request.getHospitalName())) {
                                        if (req.getPatient().getDonor().getDonarID() == request.getPatient().getDonor().getDonarID()) {
                                            req.setMessage("Delivered");
                                            req.setStatus("Completed");
                                            req.setType("Admin");
                                            JOptionPane.showMessageDialog(null, "Delivered");
                                            
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please add " + request.getQuantity() + " to complete order");
        }
        

    }//GEN-LAST:event_btnDeliverActionPerformed

    

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        OrganBankAdminWorkAreaJPanel OrganBankAdminWorkAreaJPanel = (OrganBankAdminWorkAreaJPanel) component;
        OrganBankAdminWorkAreaJPanel.populateTable();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ProcessOrganRequestJPanelOrganBank ProcessOrganRequestJPanelOrganBank = (ProcessOrganRequestJPanelOrganBank) component;
        ProcessOrganRequestJPanelOrganBank.populateOrganRepositoryTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeliver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblMaxAge;
    private javax.swing.JLabel lblMinAge;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblRequiredOrgan;
    private javax.swing.JTable tbl_OrganRequest;
    // End of variables declaration//GEN-END:variables
}
