

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame2.java
 *
 * Created on Aug 4, 2018, 1:29:51 PM
 */

/**
 *
 * @author Ramanatha Tawker
 */
public class NewJFrame2 extends javax.swing.JFrame {

    /** Creates new form NewJFrame2 */
    public NewJFrame2() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("USERNAME:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(91, 100, 160, 14);

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("PASSWORD:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(91, 123, 160, 14);

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("CONFIRM PASSWORD ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(91, 149, 160, 14);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SECURITY QUESTION ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(91, 203, 160, 14);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(267, 97, 124, 20);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2);
        jTextField2.setBounds(267, 200, 124, 20);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(267, 123, 124, 20);
        jPanel1.add(jPasswordField2);
        jPasswordField2.setBounds(267, 149, 124, 20);

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("(Which city did you study high school)");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(91, 238, 290, 14);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(267, 263, 124, 23);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14));
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("SIGNUP-CREATE YOUR ACCOUNT!");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(121, 29, 270, 21);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signup-background.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 570, 380);

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(270, 320, 120, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
              if(!jTextField2.getText().equals(""))
              {
                  Class.forName("java.sql.DriverManager");
                Connection con1;
                con1=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
                Statement st=con1.createStatement();
                String username="'"+jTextField1.getText()+"'";
                String b=new String(jPasswordField2.getPassword());
                String a=new String(jPasswordField1.getPassword());
                String password="'"+a+"'";
                String password1="'"+b+"'";
                String security="'"+jTextField2.getText()+"'";
                String SQL="INSERT INTO USER VALUES("+username+","+password+","+security+")";
                
                if(Arrays.equals(jPasswordField1.getPassword(), jPasswordField2.getPassword()))
                {
                    int cnt=st.executeUpdate(SQL);
                    if (cnt > 0
                            )
                {
                    JOptionPane.showMessageDialog(null,"Account Created");
                    setVisible(false);
                }
                else
                {
                 JOptionPane.showMessageDialog(null,"Account Exits,Create with a new username!");
                 }
                st.close();
                con1.close();
            }
 else
                {
                    JOptionPane.showMessageDialog(null,"Both Passwords are not same");
 }

         }}
         catch(Exception e)
         {
             JOptionPane.showInputDialog(e.getMessage());
             System.exit(0);
         }
    
    }//GEN-LAST:event_jButton1ActionPerformed

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    // TODO add your handling code here:
}//GEN-LAST:event_jTextField1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    new NewJFrame1().setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

}
