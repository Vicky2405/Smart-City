/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication.smartcity;

import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author vivek
 */
public class Principal_UpdateDetails extends javax.swing.JFrame {

    /**
     * Creates new form Layout
     */
    public Principal_UpdateDetails() {
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
        deleteButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        deletetxt = new javax.swing.JLabel();
        deletetxt1 = new javax.swing.JLabel();
        deletetxt2 = new javax.swing.JLabel();
        deletetxt3 = new javax.swing.JLabel();
        deletetxt5 = new javax.swing.JLabel();
        deletetxt6 = new javax.swing.JLabel();
        deletetxt7 = new javax.swing.JLabel();
        deletetxt8 = new javax.swing.JLabel();
        deletetxt9 = new javax.swing.JLabel();
        deletetxt10 = new javax.swing.JLabel();
        deletetxt11 = new javax.swing.JLabel();
        sArea = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        deleteButton.setBackground(new java.awt.Color(0, 153, 255));
        deleteButton.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        deleteButton.setText("Update");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        deletetxt.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt.setText("School Name");

        deletetxt1.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt1.setText("jLabel4");

        deletetxt2.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt2.setText("School Code");

        deletetxt3.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt3.setText("jLabel4");

        deletetxt5.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt5.setText("Area ()");

        deletetxt6.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt6.setText("Address");

        deletetxt7.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt7.setText("jLabel4");

        deletetxt8.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt8.setText("District");

        deletetxt9.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt9.setText("jLabel4");

        deletetxt10.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt10.setText("State");

        deletetxt11.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt11.setText("jLabel4");

        sArea.setFont(new java.awt.Font("Cochin", 1, 14)); // NOI18N
        sArea.setText("jTextField1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletetxt5)
                    .addComponent(deletetxt2)
                    .addComponent(deletetxt)
                    .addComponent(deletetxt6)
                    .addComponent(deletetxt8)
                    .addComponent(deletetxt10))
                .addGap(82, 82, 82)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletetxt11)
                    .addComponent(deletetxt9)
                    .addComponent(deletetxt3)
                    .addComponent(deletetxt1)
                    .addComponent(deletetxt7)
                    .addComponent(sArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletetxt)
                    .addComponent(deletetxt1))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletetxt2)
                    .addComponent(deletetxt3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletetxt5)
                    .addComponent(sArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletetxt6)
                    .addComponent(deletetxt7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletetxt8)
                    .addComponent(deletetxt9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletetxt10)
                    .addComponent(deletetxt11))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        deletetxt1.setVisible(false);
        deletetxt3.setVisible(false);
        deletetxt7.setVisible(false);
        deletetxt9.setVisible(false);
        deletetxt11.setVisible(false);

        backButton.setBackground(new java.awt.Color(153, 153, 153));
        backButton.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon("/Users/vivek/NetBeansProjects/SmartCity/src/main/java/images/go back.png")); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backButton)
                .addGap(68, 68, 68))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        img.setIcon(new javax.swing.ImageIcon("/Users/vivek/NetBeansProjects/SmartCity/src/main/java/images/icons8-add-properties-100.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 48)); // NOI18N
        jLabel5.setText("Update Details");

        user.setText("user");

        Name.setText("Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Name, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(118, 118, 118)
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Name)
                        .addGap(18, 18, 18)
                        .addComponent(user)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        user.setVisible(false);
        Name.setVisible(false);

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
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    public void fillPanel(String sName)
    {
        deletetxt1.setText(sName);
        deletetxt1.setVisible(true);
        deletetxt2.setVisible(false);
        deletetxt3.setVisible(false);
        sArea.setVisible(false);
        deletetxt5.setVisible(false);
        deletetxt6.setVisible(false);
        deletetxt7.setVisible(false);
        deletetxt8.setVisible(false);
        deletetxt9.setVisible(false);
        deletetxt10.setVisible(false);
        deletetxt11.setVisible(false);
        Details();
    }
    
    public void Details()
    {
        String sName=deletetxt1.getText();
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        try{
            String url="jdbc:mysql://localhost:3306/SmartCity";
            String usern="root";
            String pwd="";
            conn=DriverManager.getConnection(url,usern,pwd);
            if(conn!=null)
            {
                String query="select * from school where school_name=?";
                pst=conn.prepareStatement(query);
                pst.setString(1,sName);
                rs=pst.executeQuery();
                if(rs.next())
                {
                    deletetxt3.setText(rs.getString("school_code"));
                    deletetxt3.setVisible(true);
                    deletetxt2.setVisible(true);
                    sArea.setText(rs.getString("area"));
                    sArea.setVisible(true);
                    deletetxt5.setVisible(true);
                    deletetxt7.setText(rs.getString("address"));
                    deletetxt7.setVisible(true);
                    deletetxt6.setVisible(true);
                    deletetxt9.setText(rs.getString("district"));
                    deletetxt9.setVisible(true);
                    deletetxt8.setVisible(true);
                    deletetxt11.setText(rs.getString("state"));
                    deletetxt11.setVisible(true);
                    deletetxt10.setVisible(true);
                }
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        String uname=deletetxt1.getText();
        String sarea=sArea.getText();
        Connection con=null;
            PreparedStatement pst=null;
            PreparedStatement pst1=null;
            ResultSet rs=null;
            ResultSet rs1=null;
            try
            {
                String url="jdbc:mysql://localhost:3306/SmartCity";
                String usern="root";
                String pwd="";
                con=DriverManager.getConnection(url,usern,pwd);
                if(con!=null)
                {
                    String query1="update school set area=?,mla_approval=? where school_name=?";
                        pst=con.prepareStatement(query1);
                        pst.setString(1,sarea);
                        pst.setString(2,"pending");
                        pst.setString(3, uname);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Updated Successfully!");
                        String usrname=Name.getText();
                        String usrtype=user.getText();
                        User usr=new User();
                        usr.setUser(usrname);
                        usr.setUserType(usrtype);
                        usr.fillPanel(usrtype);
                        usr.setVisible(true);
                        dispose();
                }
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
            
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        String user1=Name.getText();
        String strusertype=user.getText();
        User usr=new User();
        usr.setUser(user1);
        usr.setUserType(strusertype);
        usr.fillPanel(strusertype);
        usr.setVisible(true);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    public void setUser(String user) 
    {
        this.Name.setText(user);
    }
    public void setUserType(String type)
    {
        this.user.setText(type);
    }
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
            java.util.logging.Logger.getLogger(Principal_UpdateDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_UpdateDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_UpdateDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_UpdateDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_UpdateDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Name;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel deletetxt;
    private javax.swing.JLabel deletetxt1;
    private javax.swing.JLabel deletetxt10;
    private javax.swing.JLabel deletetxt11;
    private javax.swing.JLabel deletetxt2;
    private javax.swing.JLabel deletetxt3;
    private javax.swing.JLabel deletetxt5;
    private javax.swing.JLabel deletetxt6;
    private javax.swing.JLabel deletetxt7;
    private javax.swing.JLabel deletetxt8;
    private javax.swing.JLabel deletetxt9;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField sArea;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
