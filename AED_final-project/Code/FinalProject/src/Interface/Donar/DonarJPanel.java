/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Donar;

import Business.EcoSystem;
import Business.HelperMethod.HelperMethod;
import Business.RegisterDonar.Donar;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Chintan
 */
public class DonarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonarJPanel
     */
    private EcoSystem system;
    private JPanel userProcessContainer;
    public DonarJPanel(EcoSystem system,JPanel userProcessContainer) {
        initComponents();
        this.system = system;
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_Year = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_zipcode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_contactNo = new javax.swing.JTextField();
        txt_emgContactNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_Register = new javax.swing.JButton();
        cb_gender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        rb_yes = new javax.swing.JRadioButton();
        rb_no = new javax.swing.JRadioButton();
        backJButton = new javax.swing.JButton();

        jLabel1.setText("Name :");

        jLabel2.setText("Birth Year :");

        jLabel3.setText("Address :");

        jLabel4.setText("Gender :");

        jLabel5.setText("Contact no :");

        jLabel6.setText("ZipCode :");

        jLabel7.setText("Emergency Contact :");

        btn_Register.setText("Register");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });

        cb_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        jLabel9.setText("Donate Organs :");

        rb_yes.setText("Yes");
        rb_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_yesActionPerformed(evt);
            }
        });

        rb_no.setText("No");
        rb_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_noActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(jLabel9))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(104, 104, 104)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_name)
                                    .addComponent(txt_Year)
                                    .addComponent(txt_address)
                                    .addComponent(txt_zipcode)
                                    .addComponent(cb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_contactNo)
                                    .addComponent(txt_emgContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(rb_yes)
                                    .addGap(18, 18, 18)
                                    .addComponent(rb_no)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(backJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Register)))
                .addContainerGap(398, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_contactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_emgContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(rb_yes)
                    .addComponent(rb_no))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Register)
                    .addComponent(backJButton))
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        // TODO add your handling code here:
        boolean allFieldsAreValid = true;
        String name = "";
        String address = "";
        
        if(txt_name.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "Please enter Patient's Name");
           allFieldsAreValid = false;
        }
        else
        {
        name = txt_name.getText();
        }
        
        int birthYear = 0;
        if(txt_Year.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "Please enter Birth Year");
           allFieldsAreValid = false;
        }
        else
        {
            if(HelperMethod.isNumeric(txt_Year.getText()))
            {
            birthYear = Integer.parseInt(txt_Year.getText());
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid birth year. The entered birth year is invalid.");
                allFieldsAreValid = false;
            }
        }
        
        String gender = String.valueOf(cb_gender.getSelectedItem());
        if(txt_address.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "Please enter Patient's Address");
           allFieldsAreValid = false;
        }
        else
        {
        address = txt_address.getText();
        }
        
        int zipcode = 0;
        if(txt_zipcode.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "Please enter zip code");
           allFieldsAreValid = false;
        }
        else
        {
            if(HelperMethod.validateZipCode(txt_zipcode.getText()))
            {
            zipcode = Integer.parseInt(txt_zipcode.getText());
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid US zipcode. The entered zipcode is invalid.");
                allFieldsAreValid = false;
            }
        }
        
        String contactNo = "";
        if(txt_contactNo.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "Please enter a contact number");
           allFieldsAreValid = false;
        }
        else
        {
            if(HelperMethod.isNumeric(txt_contactNo.getText()))
            {
            contactNo = txt_contactNo.getText();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid contact number. The entered contact number is invalid.");
                allFieldsAreValid = false;
            }
        }
        
        String emgContactNo= "";
        if(txt_contactNo.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "Please enter an emergency contact number");
           allFieldsAreValid = false;
        }
        else
        {
            if(HelperMethod.isNumeric(txt_emgContactNo.getText()))
            {
            emgContactNo = txt_emgContactNo.getText();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid emergency contact number. The entered emergency contact number is invalid.");
                allFieldsAreValid = false;
            }
        }
        boolean donate = true;
        
        if(rb_yes.isSelected())
        {
            donate = true;
        }
        if(rb_no.isSelected())
        {
            donate = false;
        }
        
        if(allFieldsAreValid)
        {
        Donar donar = system.addDonar();
        donar.setName(name);
        birthYear = Integer.parseInt(txt_Year.getText());
        donar.setYear(birthYear);
        donar.setGender(gender);
        donar.setAddress(address);
        donar.setContactNo(contactNo);
        donar.setEmgContantno(emgContactNo);
        donar.setDonate(donate);
        donar.setZipCode(zipcode);
        
        JOptionPane.showMessageDialog(null, "Thank You for Registration.");
        }
        
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void rb_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_yesActionPerformed
        // TODO add your handling code here:
        if(rb_yes.isSelected())
        {
            rb_no.setSelected(false);
        }
    }//GEN-LAST:event_rb_yesActionPerformed

    private void rb_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_noActionPerformed
        // TODO add your handling code here:
        if(rb_no.isSelected())
        {
            rb_yes.setSelected(false);
        }
    }//GEN-LAST:event_rb_noActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btn_Register;
    private javax.swing.JComboBox<String> cb_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rb_no;
    private javax.swing.JRadioButton rb_yes;
    private javax.swing.JTextField txt_Year;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_contactNo;
    private javax.swing.JTextField txt_emgContactNo;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_zipcode;
    // End of variables declaration//GEN-END:variables
}
