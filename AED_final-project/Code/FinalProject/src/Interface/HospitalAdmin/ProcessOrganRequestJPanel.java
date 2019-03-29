/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.HospitalAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.OrganBank.Eyes;
import Business.OrganBank.Heart;
import Business.OrganBank.Kidney;
import Business.OrganBank.Liver;
import Business.OrganBank.Organs;
import Business.Organization.HospitalOrganization;
import Business.Organization.LabOrganization;
import Business.Organization.OrganBankOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalWorkRequest;
import Business.WorkQueue.OrganBankWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Neha Pednekar
 */
public class ProcessOrganRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessOrganRequestJPanel
     */
    
    private JPanel userProcessContainer;
    private HospitalOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private HospitalWorkRequest hospitalWorkRequest;
    String organizationName;
    
    public ProcessOrganRequestJPanel(JPanel userProcessContainer, UserAccount account,Enterprise enterprise, HospitalOrganization organization, EcoSystem business,
            String requiredOrganName, int quantity, HospitalWorkRequest request){
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.business = business;
        this.userAccount = account;
        this.hospitalWorkRequest = request;
        this.enterprise = enterprise;
        txtRequiredOrganName.setText(requiredOrganName);
        txtQuantity.setText(String.valueOf(quantity));
        populateOrganRepositoryTable();
        calulateAgeRange();
    }
    
    
    int min;
    int max;
    public void calulateAgeRange()
    {
        int patientAge = hospitalWorkRequest.getPatient().getDonor().getAge();
        if(patientAge < 10)
        {
            min = 0;
        }
        else
        {
            min = patientAge - 10;
        }
        
        max = patientAge + 10;
        
        txtMin.setText(String.valueOf(min));
        txtMax.setText(String.valueOf(max));
    }
    
    public void populateOrganRepositoryTable()
    {
                                            
            int countOfKidneyWithinRange = 0;
            int countOfLiverWithinRange = 0;
            int countOfHeartWithinRange = 0;
            int countOfEyesWithinRange = 0;

            DefaultTableModel tableModel = (DefaultTableModel)tblOrganRepository.getModel();
            tableModel.setRowCount(0);
            for(Network network: business.getNetworkList())
            {
                for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseDirectory())
                {
                    for(Organization organization: enterprise.getOrganizationDirectory().getOrganizationList())
                    {
                        if(organization instanceof OrganBankOrganization)
                        {
                            Object[] row = new Object[4];
                            row[0] = organization;
                            if(txtRequiredOrganName.getText().equals("Kidney"))
                            {
                                for(Kidney kidneyOrgan: ((OrganBankOrganization) organization).getKidneyList())
                                {
                                    if(kidneyOrgan.getAge() >= min && kidneyOrgan.getAge() <= max)
                                    {
                                        countOfKidneyWithinRange++;
                                    }
                                }
                                row[1] = countOfKidneyWithinRange;
                                row[2] = network.getName();
                                row[3] = enterprise.getName();
                            }
                            else if(txtRequiredOrganName.getText().equals("Liver"))
                            {
                            for(Liver liverOrgan: ((OrganBankOrganization) organization).getLiverList())
                                {
                                    if(liverOrgan.getAge() >= min && liverOrgan.getAge() <= max)
                                    {
                                        countOfLiverWithinRange++;
                                    }
                                }
                                row[1] = countOfLiverWithinRange;
                                row[2] = network.getName();
                                row[3] = enterprise.getName();
                            }
                            else if(txtRequiredOrganName.getText().equals("Heart"))
                            {
                            for(Heart heartOrgan: ((OrganBankOrganization) organization).getHeartList())
                                {
                                    if(heartOrgan.getAge() >= min && heartOrgan.getAge() <= max)
                                    {
                                        countOfHeartWithinRange++;
                                    }
                                }
                                row[1] = countOfHeartWithinRange;
                                row[2] = network.getName();
                                row[3] = enterprise.getName();
                            }
                            else if(txtRequiredOrganName.getText().equals("Eyes"))
                            {
                            for(Eyes eyesOrgan: ((OrganBankOrganization) organization).getEyesList())
                                {
                                    if(eyesOrgan.getAge() >= min && eyesOrgan.getAge() <= max)
                                    {
                                        countOfEyesWithinRange++;
                                    }
                                }
                                row[1] = countOfEyesWithinRange;
                                row[2] = network.getName();
                                row[3] = enterprise.getName();
                            }
                            tableModel.addRow(row);
                        }
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

        jLabel7 = new javax.swing.JLabel();
        quantitySpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganRepository = new javax.swing.JTable();
        btnPlaceOrganRequest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblOrgans = new javax.swing.JTable();
        btnApproveAndAssignToOrganBank = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lblSupplier1 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblSupplier2 = new javax.swing.JLabel();
        txtRequiredOrganName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMax = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));

        jLabel7.setText("Quantity:");

        quantitySpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Process Organ Request Work Area Panel");

        tblOrganRepository.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organ Bank", "Availability", "City", "Sector"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganRepository);
        if (tblOrganRepository.getColumnModel().getColumnCount() > 0) {
            tblOrganRepository.getColumnModel().getColumn(0).setResizable(false);
            tblOrganRepository.getColumnModel().getColumn(1).setResizable(false);
            tblOrganRepository.getColumnModel().getColumn(2).setResizable(false);
            tblOrganRepository.getColumnModel().getColumn(3).setResizable(false);
        }

        btnPlaceOrganRequest.setText("Place Requested Organs");
        btnPlaceOrganRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceOrganRequestActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblOrgans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organ Name", "Organ Bank Name", "Patient ID", "Receiver", "Sender", "Status", "Message"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblOrgans);
        if (tblOrgans.getColumnModel().getColumnCount() > 0) {
            tblOrgans.getColumnModel().getColumn(0).setResizable(false);
            tblOrgans.getColumnModel().getColumn(1).setResizable(false);
            tblOrgans.getColumnModel().getColumn(2).setResizable(false);
            tblOrgans.getColumnModel().getColumn(3).setResizable(false);
            tblOrgans.getColumnModel().getColumn(4).setResizable(false);
            tblOrgans.getColumnModel().getColumn(5).setResizable(false);
            tblOrgans.getColumnModel().getColumn(6).setResizable(false);
        }

        btnApproveAndAssignToOrganBank.setText("Approve and Assign to the Organ Bank");
        btnApproveAndAssignToOrganBank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveAndAssignToOrganBankActionPerformed(evt);
            }
        });

        jLabel8.setText("Quantity:");

        lblSupplier1.setText("Organ Cart:");

        txtQuantity.setEnabled(false);

        lblSupplier2.setText("Required Organ:");

        txtRequiredOrganName.setEnabled(false);

        jLabel2.setText("Age Range");

        jLabel3.setText("Min:");

        txtMin.setEnabled(false);
        txtMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinActionPerformed(evt);
            }
        });

        jLabel4.setText("Max:");

        txtMax.setEnabled(false);
        txtMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnApproveAndAssignToOrganBank))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(252, 252, 252)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnPlaceOrganRequest)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblSupplier1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSupplier2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRequiredOrganName, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSupplier2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRequiredOrganName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnApproveAndAssignToOrganBank, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(lblSupplier1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnPlaceOrganRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlaceOrganRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceOrganRequestActionPerformed
        // TODO add your handling code here:
        //String message = messageJTextField.getText();
        int selectedRow = tblOrganRepository.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        OrganBankWorkRequest request = new OrganBankWorkRequest();
        
        request.setTestResult("Sent to Organ Bank");
        request.setMessage("Sent to Organ Bank");
        request.setSender(userAccount);
        request.setStatus("Sent to Organ Bank");
        request.setPatient(hospitalWorkRequest.getPatient());
        request.setAge(hospitalWorkRequest.getPatient().getDonor().getAge());
        request.setOrganName(hospitalWorkRequest.getOrganName());
        request.setOrganizationName(organizationName);
        request.setHospitalName(hospitalWorkRequest.getHospitalName());
        request.setQuantity(hospitalWorkRequest.getQuantity());
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof OrganBankOrganization){
                if(((OrganBankOrganization) organization).getOrganizationName().equals(organizationName))
                {
                org = organization;
                break;
                }
            }
        }
        
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
        //    userAccount.getWorkQueue().getWorkRequestList().add(request);
        }
        
        JOptionPane.showMessageDialog(null, "The request was forwarded to Organ Bank successfully");
        
    }//GEN-LAST:event_btnPlaceOrganRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageOrganRequestJPanel manageOrganRequestJPanel = (ManageOrganRequestJPanel) component;
        manageOrganRequestJPanel.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnApproveAndAssignToOrganBankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveAndAssignToOrganBankActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrganRepository.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }
        
        int availability = (int)tblOrganRepository.getValueAt(selectedRow, 1);
        OrganBankOrganization organBankOrganization = null;
        Organization org = (Organization)tblOrganRepository.getValueAt(selectedRow, 0);
        if(org instanceof OrganBankOrganization)
        {
            organBankOrganization = (OrganBankOrganization)org;
        }
        
        DefaultTableModel tableModel = (DefaultTableModel)tblOrgans.getModel();
        tableModel.setRowCount(0);
        
        if(hospitalWorkRequest.getType().equalsIgnoreCase("Admin"))
            {
            hospitalWorkRequest.setStatus("Approved By Hospital Admin");
            hospitalWorkRequest.setMessage("Approved by Hospital Admin");
            Object[] row = new Object[7];
            row[0] = hospitalWorkRequest.getOrganName();
            row[1] = organBankOrganization.getOrganizationName();
            organizationName = organBankOrganization.getOrganizationName();
            row[2] = hospitalWorkRequest.getPatient().getPatientID();
            row[3] = hospitalWorkRequest.getReceiver();
            row[4] = hospitalWorkRequest.getSender();
            row[5] = hospitalWorkRequest.getStatus();
            row[6] = hospitalWorkRequest;
            
            tableModel.addRow(row);
            }
 
    }//GEN-LAST:event_btnApproveAndAssignToOrganBankActionPerformed

    private void txtRequiredOrganNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRequiredOrganNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRequiredOrganNameActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinActionPerformed

    private void txtMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveAndAssignToOrganBank;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPlaceOrganRequest;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSupplier1;
    private javax.swing.JLabel lblSupplier2;
    private javax.swing.JSpinner quantitySpinner1;
    private javax.swing.JTable tblOrganRepository;
    private javax.swing.JTable tblOrgans;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtRequiredOrganName;
    // End of variables declaration//GEN-END:variables
}
