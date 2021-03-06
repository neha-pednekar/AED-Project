/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.HospitalAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Hospital.Patient;
import Business.Organization.HospitalOrganization;
import Business.Organization.Organization;
//import Business.RegisterDonar.Organ;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.HospitalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BHAVIK
 */
public class DoctorMainWorkareaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorMainWorkareaJPanel
     */
    JPanel userProcessContainer;
    Patient patient;
    HospitalOrganization organization;
    Enterprise enterprise;
    UserAccount userAccount;
    EcoSystem business;
    
    public DoctorMainWorkareaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userAccount = account;
        this.userProcessContainer = userProcessContainer;
        this.organization = (HospitalOrganization)organization;
        this.enterprise = enterprise;
        this.business = business;
        populateTable();
        populateReqTable();
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void populateTable(){
        DefaultTableModel tableModel = (DefaultTableModel) patientJTable.getModel();
        tableModel.setRowCount(0);
        
        for(Patient p : organization.getPatientList())
        {
            if (!p.getDonor().isDied())
            {
            Object column[] = new Object[4];
            column[0] = p;
            column[1] = p.getDonor().getName();
            column[2] = p.getDonor().getAge();
            column[3] = p.getDoctor();
            tableModel.addRow(column);
            }
        }
    }
    
     public void populateReqTable(){
        
        DefaultTableModel tableModel = (DefaultTableModel) trackTable.getModel();
        tableModel.setRowCount(0);
         if(!(userAccount.getWorkQueue().getWorkRequestList() == null))
         {
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList())
        {
            Object[] row = new Object[8];
            row[0] = request.getOrganName();
            row[1] = request.getPatient().getPatientID();
            row[2] = request.getQuantity();
            row[3] = request.getSender();
            row[4] = request.getReceiver();
            row[5] = ((HospitalWorkRequest) request).getStatus();
            row[6] = request;
            String result = ((HospitalWorkRequest) request).getTestResult();
            row[7] = result == null ? "Waiting" : result;
            System.out.println(request.getQuantity());
            tableModel.addRow(row);
        }
         }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        btnReqRaise = new javax.swing.JButton();
        btnDeathCerti = new javax.swing.JButton();
        btnTrackStatus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        trackTable = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        patientJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PatienID", "Name", "Age", "Doctor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(patientJTable);
        if (patientJTable.getColumnModel().getColumnCount() > 0) {
            patientJTable.getColumnModel().getColumn(0).setResizable(false);
            patientJTable.getColumnModel().getColumn(1).setResizable(false);
            patientJTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Doctor Work Area Panel");

        valueLabel.setText("<value>");

        enterpriseLabel.setText("EnterPrise :");

        btnReqRaise.setText("Raise Request");
        btnReqRaise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReqRaiseActionPerformed(evt);
            }
        });

        btnDeathCerti.setText("Death Certificate Req");
        btnDeathCerti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeathCertiActionPerformed(evt);
            }
        });

        btnTrackStatus.setText("Track Status");
        btnTrackStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrackStatusActionPerformed(evt);
            }
        });

        trackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrganRequested", "PatientID", "Quantity", "Sender", "Receiver", "Message", "Status", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(trackTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTrackStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(valueLabel)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnReqRaise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDeathCerti)))
                        .addGap(0, 539, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrackStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel)
                    .addComponent(valueLabel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReqRaise)
                    .addComponent(btnDeathCerti))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnReqRaiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReqRaiseActionPerformed
        // TODO add your handling code here:
        
        int rowSelected = patientJTable.getSelectedRow();
        if (rowSelected >= 0)
        {
        
        Patient patient = (Patient) patientJTable.getValueAt(rowSelected, 0);
        patient.setDoctor(String.valueOf(userAccount));
        RequestOrgan RequestOrgan = new RequestOrgan(userProcessContainer,userAccount, patient, organization, enterprise);
        userProcessContainer.add("RequestOrgan", RequestOrgan);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
        }
        else{
            JOptionPane.showMessageDialog(null,"Please Select Patient");
        }
           
    }//GEN-LAST:event_btnReqRaiseActionPerformed

    private void btnDeathCertiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeathCertiActionPerformed
        // TODO add your handling code here:
        
        int rowSelected = patientJTable.getSelectedRow();
        if (rowSelected >= 0)
        {
        Patient patient = (Patient) patientJTable.getValueAt(rowSelected, 0);
        //Organ organ = null;
        HospitalWorkRequest hospitalWorkRequest = new HospitalWorkRequest();
       // hospitalAdminWorkRequest.setOrgan(organ == null ? "Waiting" : organ);
        hospitalWorkRequest.setPatient(patient);
        hospitalWorkRequest.setSender(userAccount);
        hospitalWorkRequest.setStatus("With Diener");
        hospitalWorkRequest.setMessage("Please Issue Death Certificate");
        hospitalWorkRequest.setHospitalName((((HospitalOrganization) organization).getOrganizationName()));
        
       // hospitalAdminWorkRequest.setQuantity(0);
        hospitalWorkRequest.setType("diener");
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof HospitalOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(hospitalWorkRequest);
            userAccount.getWorkQueue().getWorkRequestList().add(hospitalWorkRequest);
            JOptionPane.showMessageDialog(null,"Request has been placed with Diener");
            populateReqTable();
        }
        else{
            JOptionPane.showMessageDialog(null,"bye bye ");
        }
        }
        else{
            JOptionPane.showMessageDialog(null,"Please Select Row");
        }
        populateTable();
        
//        RequestOrgan requestOrgan = new RequestOrgan(userProcessContainer, userAccount, patient, organization, enterprise);
//        userProcessContainer.add("RequestOrgan", requestOrgan);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnDeathCertiActionPerformed

    private void btnTrackStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrackStatusActionPerformed
//        // TODO add your handling code here:
//        TrackStatus trackStatus = new TrackStatus(userProcessContainer, userAccount,patient, organization, enterprise);
//        userProcessContainer.add("TrackStatus", trackStatus);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnTrackStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeathCerti;
    private javax.swing.JButton btnReqRaise;
    private javax.swing.JButton btnTrackStatus;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable patientJTable;
    private javax.swing.JTable trackTable;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
