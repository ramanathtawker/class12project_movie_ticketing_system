import javax.swing.*;
import java.sql.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrameAdmin3.java
 *
 * Created on Oct 18, 2018, 4:02:03 PM
 */

/**
 *
 * @author Ramanatha Tawker
 */
public class NewJFrameAdmin3 extends javax.swing.JFrame {

    /** Creates new form NewJFrameAdmin3 */
    public NewJFrameAdmin3() {
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
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setText("                       SCREEN DETAILS | MOVIE DETAILS | TIMINGS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(174, 11, 350, 14);

        jLabel2.setText("MOVIE NAME");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(24, 46, 80, 30);

        jTextField1.setToolTipText("##-moviename **-timing(24Hrs) (MOVIE##**)");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(140, 50, 149, 20);

        jLabel3.setText("SCREEN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(424, 46, 100, 14);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SCREEN1", "SCREEN2", "SCREEN3" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(573, 43, 149, 20);

        jButton1.setText("SELECT IMAGE AND PROCEED");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(70, 250, 400, 40);
        jPanel1.add(jLabel6);
        jLabel6.setBounds(570, 190, 101, 144);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 8));
        jLabel7.setText("MOVIENAME-(U | A | U/A)<>TIME<>AM/PM");
        jLabel7.setToolTipText("Type the Movie Name in this format\n<> represent a space");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(110, 120, 232, 20);

        jButton2.setText("Reset Show");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(70, 320, 400, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        try{JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        java.io.File f=chooser.getSelectedFile();
        String filename=f.getAbsolutePath();

        
        ImageIcon icon=new ImageIcon(filename);
        jLabel6.setIcon(icon);
        
        String e=" ";String a=" ";String b=" ";String c=" ";String d=" ";
       Class.forName("java.sql.DriverManager");
                Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
                Statement st=con1.createStatement();
                int r=filename.length()-1;
                String s2="";
                String MovieName=jTextField1.getText();
                String Screen=(String)(jComboBox1.getSelectedItem());
        for(int i=0;i<=r;i++)
        {
            if(filename.charAt(i)=='\\')
            {
                s2=s2+"\\";
            }
           s2=s2+ filename.charAt(i);
        }

                int rs=st.executeUpdate("UPDATE IMAGES SET TITLE='"+MovieName+"'"+"SET URL='"+s2+"'"+"WHERE SCREEN='"+Screen+"'");
                if(rs>0){
                   JOptionPane.showMessageDialog(null,"Sucessfull");
                }
        }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e.getMessage());
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameAdmin3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
