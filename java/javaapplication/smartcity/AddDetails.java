/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication.smartcity;

import javax.swing.JFrame;
import java.sql.*;
/**
 *
 * @author vivek
 */
public class AddDetails extends javax.swing.JFrame {

    /**
     * Creates new form Layout
     */
    public AddDetails() {
        initComponents();
        setTitle("Admin Login");
        setSize(1000,600);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputText1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputText2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputText3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputText4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        inputText5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputText6 = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("SCHOOL/COLLEGE NAME  :");

        inputText1.setBackground(new java.awt.Color(204, 204, 204));
        inputText1.setFont(new java.awt.Font("Cochin", 0, 18)); // NOI18N
        inputText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputText1ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel2.setText("SCHOOL / COLLEGE CODE :");

        inputText2.setBackground(new java.awt.Color(204, 204, 204));
        inputText2.setFont(new java.awt.Font("Cochin", 0, 18)); // NOI18N
        inputText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputText2ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel3.setText("AREA IN SQ.METERS :");

        inputText3.setBackground(new java.awt.Color(204, 204, 204));
        inputText3.setFont(new java.awt.Font("Cochin", 0, 18)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel4.setText("ADDRESS :");

        inputText4.setBackground(new java.awt.Color(204, 204, 204));
        inputText4.setFont(new java.awt.Font("Cochin", 0, 18)); // NOI18N
        inputText4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputText4ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel6.setText("DISTRICT :");

        inputText5.setBackground(new java.awt.Color(204, 204, 204));
        inputText5.setFont(new java.awt.Font("Cochin", 0, 18)); // NOI18N
        inputText5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputText5ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("Californian FB", 1, 18)); // NOI18N
        jLabel7.setText("STATE :");

        inputText6.setBackground(new java.awt.Color(204, 204, 204));
        inputText6.setFont(new java.awt.Font("Cochin", 0, 18)); // NOI18N

        Add.setBackground(new java.awt.Color(0, 153, 255));
        Add.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        Add.setText("Add Details");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Add)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputText3)
                    .addComponent(inputText2)
                    .addComponent(inputText1)
                    .addComponent(inputText4)
                    .addComponent(inputText5)
                    .addComponent(inputText6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(inputText1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inputText2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputText3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputText5))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(inputText6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        img.setIcon(new javax.swing.ImageIcon("/Users/vivek/NetBeansProjects/SmartCity/src/main/java/images/icons8-add-properties-100.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 48)); // NOI18N
        jLabel5.setText("Add Details");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 486, Short.MAX_VALUE)
                .addComponent(img)
                .addGap(89, 89, 89))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(img)
                .addGap(14, 14, 14))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputText1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_inputText1ActionPerformed

    private void inputText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputText2ActionPerformed

    private void inputText4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputText4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputText4ActionPerformed

    private void inputText5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputText5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputText5ActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        String sname=inputText1.getText();
        String scode=inputText2.getText();
        String area=inputText3.getText();
        String address=inputText4.getText();
        String district=inputText5.getText();
        String state=inputText6.getText();
        Connection con=null;
        PreparedStatement pst=null;
        try
        {
            String url="jdbc:mysql://localhost:3306/SmartCity";
            String usern="root";
            String pwd="";
            con=DriverManager.getConnection(url,usern,pwd);
            if(con!=null)
            {
                String query="insert into school (school_name,school_code,area,address,district,state) values(?,?,?,?,?,?)";
                pst=con.prepareStatement(query);
                pst.setString(1,sname);
                pst.setString(2,scode);
                pst.setString(3,area);
                pst.setString(4,address);
                pst.setString(5,district);
                pst.setString(6,state);
                pst.executeUpdate();
                String query1="insert into details(name,infra_type) values(?,?)";
                pst=con.prepareStatement(query1);
                pst.setString(1,sname);
                pst.setString(2, "School");
                pst.executeUpdate();
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_AddActionPerformed

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
            java.util.logging.Logger.getLogger(AddDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel img;
    private javax.swing.JTextField inputText1;
    private javax.swing.JTextField inputText2;
    private javax.swing.JTextField inputText3;
    private javax.swing.JTextField inputText4;
    private javax.swing.JTextField inputText5;
    private javax.swing.JTextField inputText6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
