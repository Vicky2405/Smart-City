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
 * @author bhaskar patidar
 */
public class DeleteUser extends javax.swing.JFrame {

    /**
     * Creates new form DeleteUser
     */
    public DeleteUser() {
        initComponents();
        setTitle("Delete User");
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
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        goBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        deletetxt = new javax.swing.JLabel();
        deletetxt1 = new javax.swing.JLabel();
        deletetxt2 = new javax.swing.JLabel();
        deletetxt3 = new javax.swing.JLabel();
        deletetxt4 = new javax.swing.JLabel();
        deletetxt5 = new javax.swing.JLabel();
        userName = new javax.swing.JComboBox<>();
        Confirm = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 48)); // NOI18N
        jLabel1.setText("Delete User");

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/vivek/NetBeansProjects/SmartCity/src/main/java/images/delete user big.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel3.setText("Name");

        deleteButton.setBackground(new java.awt.Color(0, 153, 255));
        deleteButton.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        deleteButton.setText("Get Details");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        goBack.setBackground(new java.awt.Color(153, 153, 153));
        goBack.setIcon(new javax.swing.ImageIcon("/Users/vivek/NetBeansProjects/SmartCity/src/main/java/images/go back.png")); // NOI18N
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        deletetxt.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt.setText("jLabel4");

        deletetxt1.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt1.setText("jLabel4");

        deletetxt2.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt2.setText("jLabel4");

        deletetxt3.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt3.setText("jLabel4");

        deletetxt4.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt4.setText("jLabel4");

        deletetxt5.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        deletetxt5.setText("jLabel4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletetxt5)
                    .addComponent(deletetxt2)
                    .addComponent(deletetxt))
                .addGap(137, 137, 137)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletetxt4)
                    .addComponent(deletetxt3)
                    .addComponent(deletetxt1))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletetxt)
                    .addComponent(deletetxt1))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletetxt2)
                    .addComponent(deletetxt3))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletetxt5)
                    .addComponent(deletetxt4))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        deletetxt.setVisible(false);
        deletetxt1.setVisible(false);
        deletetxt2.setVisible(false);
        deletetxt3.setVisible(false);
        deletetxt4.setVisible(false);
        deletetxt5.setVisible(false);

        userName.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N

        Confirm.setFont(new java.awt.Font("Cochin", 1, 18)); // NOI18N
        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(deleteButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(goBack)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addComponent(Confirm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(Confirm)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(goBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        fillComboBox();
        Confirm.setVisible(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillComboBox()
    {
        Connection con=null;
            PreparedStatement pst2=null;
            ResultSet rs2=null;
            try
            {
                String url="jdbc:mysql://localhost:3306/SmartCity";
                String usern="root";
                String pwd="";
                con=DriverManager.getConnection(url,usern,pwd);
                if(con!=null)
                {
                    String query2="select * from login";
                    pst2=con.prepareStatement(query2);
                    rs2=pst2.executeQuery();
                    while(rs2.next())
                    {
                        String name=rs2.getString("username");
                        userName.addItem(name);
                    }
                }
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
    }
    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        AdminPage admin =new AdminPage();
        admin.setVisible(true);
        dispose();
    }//GEN-LAST:event_goBackActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        String uname=userName.getSelectedItem().toString();
        String btn=deleteButton.getText();
        String strusertype="";
        Connection con=null;
            PreparedStatement pst=null;
            PreparedStatement pst1=null;
            PreparedStatement pst3=null;
            ResultSet rs=null;
            ResultSet rs1=null;
        if(btn.equals("Delete"))
        {
            
            try
            {
                String url="jdbc:mysql://localhost:3306/SmartCity";
                String usern="root";
                String pwd="";
                con=DriverManager.getConnection(url,usern,pwd);
                System.out.print("hello");
                if(con!=null)
                {
                    System.out.print("1");
                    String query="select * from login where username=?";
                    pst=con.prepareStatement(query);
                    pst.setString(1,uname);
                    rs=pst.executeQuery();
                    if(rs.next())
                    {
                        strusertype=rs.getString("usertype");
                        if(strusertype.equalsIgnoreCase("mla"))
                        {
                            System.out.println("1");
                            String query1="delete from login where username=?";
                            pst3=con.prepareStatement(query1);
                            pst3.setString(1,uname);
                            pst3.executeUpdate();
                            String query2="delete from mla where name=?";
                            pst3=con.prepareStatement(query2);
                            pst3.setString(1,uname);
                            pst3.executeUpdate();
                            JOptionPane.showMessageDialog(null, "User Deleted Successfully!");
                            AdminPage adminpage= new AdminPage();
                            adminpage.setVisible(true);
                            dispose();
                        }
                        if(strusertype.equalsIgnoreCase("cm"))
                        {
                            System.out.println("1");
                            String query1="delete from login where username=?";
                            pst3=con.prepareStatement(query1);
                            pst3.setString(1,uname);
                            pst3.executeUpdate();
                            String query2="delete from cm where name=?";
                            pst3=con.prepareStatement(query2);
                            pst3.setString(1,uname);
                            pst3.executeUpdate();
                            JOptionPane.showMessageDialog(null, "User Deleted Successfully!");
                            AdminPage adminpage= new AdminPage();
                            adminpage.setVisible(true);
                            dispose();
                        }
                        if(strusertype.equalsIgnoreCase("contractor"))
                        {
                            System.out.println("1");
                            String query1="delete from login where username=?";
                            pst3=con.prepareStatement(query1);
                            pst3.setString(1,uname);
                            pst3.executeUpdate();
                            String query2="delete from contractor where name=?";
                            pst3=con.prepareStatement(query2);
                            pst3.setString(1,uname);
                            pst3.executeUpdate();
                            JOptionPane.showMessageDialog(null, "User Deleted Successfully!");
                            AdminPage adminpage= new AdminPage();
                            adminpage.setVisible(true);
                            dispose();
                        }
                        if(strusertype.equalsIgnoreCase("principal"))
                        {
                            System.out.println("1");
                            String query1="delete from login where username=?";
                            pst3=con.prepareStatement(query1);
                            pst3.setString(1,uname);
                            pst3.executeUpdate();
                            String query2="delete from mla where name=?";
                            pst3=con.prepareStatement(query2);
                            pst3.setString(1,uname);
                            pst3.executeUpdate();
                            JOptionPane.showMessageDialog(null, "User Deleted Successfully!");
                            AdminPage adminpage= new AdminPage();
                            adminpage.setVisible(true);
                            dispose();
                        }
                    }
                }
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
//        if(btn.equals("Get Details"))
        else
        {
            try{
                String url="jdbc:mysql://localhost:3306/SmartCity";
                String usern="root";
                String pwd="";
                con=DriverManager.getConnection(url,usern,pwd);
                if(con!=null)
                {
                    String query="select * from login where username=?";
                    pst=con.prepareStatement(query);
                    pst.setString(1,uname);
                    rs=pst.executeQuery();
                    if(rs.next())
                    {
                        strusertype=rs.getString("usertype");
                        System.out.println(strusertype);
                        if(strusertype.equalsIgnoreCase("principal"))
                        {
                            String query1="select * from principal where name=?";
                            pst1=con.prepareStatement(query1);
                            pst1.setString(1,uname);
                            rs1=pst1.executeQuery();
                            if(rs1.next())
                            {
                                deletetxt.setText("District");
                                deletetxt.setVisible(true);
                                deletetxt1.setText(rs1.getString("District"));
                                deletetxt1.setVisible(true);
                                deletetxt2.setText("School");
                                deletetxt2.setVisible(true);
                                deletetxt3.setText(rs1.getString("School"));
                                deletetxt3.setVisible(true);
                            }
                        }
                        if(strusertype.equalsIgnoreCase("contractor"))
                        {
                            
                            String query1="select * from contractor where name=?";
                            pst1=con.prepareStatement(query1);
                            pst1.setString(1,uname);
                            rs1=pst1.executeQuery();
                            if(rs1.next())
                            {
                                deletetxt.setText("District");
                                deletetxt.setVisible(true);
                                deletetxt1.setText(rs1.getString("District"));
                                deletetxt1.setVisible(true);
                                deletetxt2.setText("Company Name");
                                deletetxt2.setVisible(true);
                                deletetxt3.setText(rs1.getString("Company_Name"));
                                deletetxt3.setVisible(true);
                            }
                        }
                        if(strusertype.equalsIgnoreCase("mla"))
                        {
                            String query1="select * from mla where name=?";
                            pst1=con.prepareStatement(query1);
                            pst1.setString(1,uname);
                            rs1=pst1.executeQuery();
                            if(rs1.next())
                            {
                                deletetxt.setText("District");
                                deletetxt.setVisible(true);
                                deletetxt1.setText(rs1.getString("District"));
                                deletetxt1.setVisible(true);
                                deletetxt2.setText("State");
                                deletetxt2.setVisible(true);
                                deletetxt3.setText(rs1.getString("State"));
                                deletetxt3.setVisible(true);
                            }
                        }
                        if(strusertype.equalsIgnoreCase("cm"))
                        {
                            String query1="select * from cm where name=?";
                            pst1=con.prepareStatement(query1);
                            pst1.setString(1,uname);
                            rs1=pst1.executeQuery();
                            if(rs1.next())
                            {
                                deletetxt.setText("State");
                                deletetxt.setVisible(true);
                                deletetxt1.setText(rs1.getString("State"));
                                deletetxt1.setVisible(true);
                            }
                        }
                    }
                   
                    
                }
            }
            catch(Exception ex)
            {
                ex.printStackTrace();
            }
            deleteButton.setText("Delete"); 
            deleteButton.setVisible(false);
            Confirm.setVisible(true);
        }
       
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:
        if(Confirm.isSelected())
        {
            deleteButton.setVisible(true);
        }
        else
        {
            deleteButton.setVisible(false);
        }
    }//GEN-LAST:event_ConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Confirm;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel deletetxt;
    private javax.swing.JLabel deletetxt1;
    private javax.swing.JLabel deletetxt2;
    private javax.swing.JLabel deletetxt3;
    private javax.swing.JLabel deletetxt4;
    private javax.swing.JLabel deletetxt5;
    private javax.swing.JButton goBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> userName;
    // End of variables declaration//GEN-END:variables
}
