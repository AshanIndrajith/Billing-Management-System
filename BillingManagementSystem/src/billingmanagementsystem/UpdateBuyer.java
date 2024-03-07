

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package billingmanagementsystem;
import java.awt.Color;
import javax.swing.JTextField;
import Project.ConnectionProvider;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author INSIGHT
 */
public class UpdateBuyer extends javax.swing.JFrame {

    /**
     * Creates new form NewBuyer
     */
    public UpdateBuyer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        contact1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update buyer ani.gif"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 11, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/new buyer.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 11, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        name.setForeground(new java.awt.Color(153, 153, 153));
        name.setText("Enter name");
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 224, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Contact info :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        contact.setForeground(new java.awt.Color(153, 153, 153));
        contact.setText("Enter Contact number");
        contact.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contactFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contactFocusLost(evt);
            }
        });
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel2.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 224, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Email :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Address :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Gender :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setText("Enter email address");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 224, -1));

        address.setForeground(new java.awt.Color(153, 153, 153));
        address.setText("Enter  address");
        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFocusLost(evt);
            }
        });
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 224, -1));

        gender.setForeground(new java.awt.Color(153, 153, 153));
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other" }));
        gender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                genderFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                genderFocusLost(evt);
            }
        });
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel2.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 224, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 81, -1));

        jButton2.setBackground(new java.awt.Color(153, 0, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 81, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close Jframe.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Contact info :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        contact1.setForeground(new java.awt.Color(153, 153, 153));
        contact1.setText("Enter Contact number");
        contact1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contact1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contact1FocusLost(evt);
            }
        });
        contact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contact1ActionPerformed(evt);
            }
        });
        jPanel2.add(contact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 224, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 673, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        // TODO add your handling code here:
        if(name.getText().equals("Enter name"))
        {
            name.setText("");
            name.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_nameFocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        // TODO add your handling code here:
        if(name.getText().equals(""))
        {
            name.setText("Enter name");
            name.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_nameFocusLost

    private void contactFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusGained
        // TODO add your handling code here:
        if(contact.getText().equals("Enter Contact number"))
        {
            contact.setText("");
            contact.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_contactFocusGained

    private void contactFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contactFocusLost
        // TODO add your handling code here:
         if(contact.getText().equals(""))
        {
            contact.setText("Enter Contact number");
            contact.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_contactFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        // TODO add your handling code here:
         if(email.getText().equals("Enter email address"))
        {
            email.setText("");
            email.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:
         if(email.getText().equals(""))
        {
            email.setText("Enter email address");
            email.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_emailFocusLost

    private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
        // TODO add your handling code here:
          if(address.getText().equals("Enter  address"))
        {
            address.setText("");
            address.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_addressFocusGained

    private void addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusLost
        // TODO add your handling code here:
          if(address.getText().equals(""))
        {
            address.setText("Enter  address");
            address.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_addressFocusLost

    private void genderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genderFocusGained
        // TODO add your handling code here:
           if(name.getText().equals("Enter  address"))
        {
            name.setText("");
            name.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_genderFocusGained

    private void genderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_genderFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_genderFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new UpdateBuyer().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
// Retrieve values from text fields
        String Name = name.getText();
        String Contact = contact.getText();
        String Email = email.getText();
        String Address = address.getText();
        String Gender = (String) gender.getSelectedItem();

        // Check if any of the fields are empty
        if (!Name.isEmpty() && !Contact.isEmpty() && !Email.isEmpty() && !Address.isEmpty() && Gender != null) {
            try {
                // Get connection
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();

                // Construct SQL query for insertion
                String query = "INSERT INTO buyer VALUES('" + Name + "','" + Contact + "','" + Email + "','" + Address + "','" + Gender + "')";

                // Execute the query
                st.executeUpdate(query);
                
                // Display success message
                JOptionPane.showMessageDialog(null, "Successfully Updated");

                // Clear text fields
                name.setText("");
                contact.setText("");
                email.setText("");
                address.setText("");

            } catch (SQLException ex) {
                // Handle SQL exception
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Failed to Update: " + ex.getMessage());
            }
        } else {
            // Display error message if any field is empty
            JOptionPane.showMessageDialog(null, "One or more fields are empty. Please fill in all fields.");
        }
    

    }//GEN-LAST:event_jButton1ActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void contact1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contact1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_contact1FocusGained

    private void contact1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contact1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_contact1FocusLost

    private void contact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contact1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contact1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateBuyer().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField contact1;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}


