/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oopprojek;
import menupakaian.Beranda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.sql.ResultSet;

/**
 *
 * @author amsal
 */


public class Signmenu extends javax.swing.JFrame {

    private static final String URL = "jdbc:mysql://localhost/projekoop";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    public Signmenu() {
        
        initComponents();
        clearframe();
    }

    private void clearframe(){
       signinPanel.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signupPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        signup = new javax.swing.JButton();
        emailTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        signinPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        passwordTextField1 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        usernameTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        signinButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signupPanel.setBackground(new java.awt.Color(255, 255, 255));
        signupPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Password");
        signupPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, 10));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel3.setText("Sign Up");
        signupPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 140, 50));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Username");
        signupPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 90, -1));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setText("Email");
        signupPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 90, -1));

        jLabel7.setText("Already Have An Account?");
        signupPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, 20));

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Login now!");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        signupPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, -1, 20));

        usernameTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        signupPanel.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 240, 30));

        passwordTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signupPanel.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 240, 30));

        signup.setBackground(new java.awt.Color(255, 51, 51));
        signup.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Sign Up Now !");
        signup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        signupPanel.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 260, 50));

        emailTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        signupPanel.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 240, 30));
        signupPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 720, -1, -1));

        getContentPane().add(signupPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 720));

        signinPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setText("Password");
        signinPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, 10));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel9.setText("Sign In");
        signinPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 140, 50));

        passwordTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signinPanel.add(passwordTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 240, 30));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setText("Username");
        signinPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 90, -1));

        jLabel11.setText("Don't Have An Account?");
        signinPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, 20));

        usernameTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        usernameTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextField1ActionPerformed(evt);
            }
        });
        signinPanel.add(usernameTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 240, 30));

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("Register Now");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        signinPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, 20));

        signinButton.setBackground(new java.awt.Color(255, 51, 51));
        signinButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        signinButton.setForeground(new java.awt.Color(255, 255, 255));
        signinButton.setText("Get Started !");
        signinButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signinButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signinButtonActionPerformed(evt);
            }
        });
        signinPanel.add(signinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 240, 50));

        getContentPane().add(signinPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
            String username = usernameTextField.getText();    
            String email = emailTextField.getText();
            String password = new String(passwordTextField.getPassword());
            
            if(username.isEmpty() || email.isEmpty() || password.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Silahkan Isi Semua Data! ", "Error", JOptionPane.ERROR_MESSAGE);
            }   
            else
            {
                try {
                    Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                    String query = "INSERT INTO pengguna (nama, email, password) VALUES (?, ?, ?)";
                    try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                        pstmt.setString(1, username);
                        pstmt.setString(2, email);
                        pstmt.setString(3, password);
                        pstmt.executeUpdate();
                    }
                JOptionPane.showMessageDialog(this, "Sign-up berhasil", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                signupPanel.setVisible(false);
                signinPanel.setVisible(true);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Gagal melakukan sign-up: ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
    }//GEN-LAST:event_signupActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        signupPanel.setVisible(false);
        signinPanel.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        signinPanel.setVisible(false);
        signupPanel.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void signinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signinButtonActionPerformed
    String username = usernameTextField.getText();
    String password = new String(passwordTextField.getPassword());
    if(username.isEmpty()|| password.isEmpty())
    {
        JOptionPane.showMessageDialog(this, "Silahkan Isi Semua Data! ", "Error", JOptionPane.ERROR_MESSAGE);
    }
    else
    {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            String query = "SELECT * FROM pengguna WHERE nama = ? AND password = ?";

            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setString(1, username);
                pstmt.setString(2, password);

                try (ResultSet resultSet = pstmt.executeQuery()) {
                    if (resultSet.next()) {
                        // Sign-in berhasil
                        JOptionPane.showMessageDialog(this, "Sign-in berhasil", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                        Beranda br = new Beranda();
                        br.setVisible(true);
                        dispose();
                        // Lakukan tindakan setelah sign-in berhasil, misalnya, tampilkan panel baru atau lakukan sesuatu yang diperlukan.
                    } else {
                        // Sign-in gagal
                        JOptionPane.showMessageDialog(this, "Gagal melakukan sign-in. Nama pengguna atau kata sandi salah.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal melakukan sign-in: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_signinButtonActionPerformed

    private void usernameTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextField1ActionPerformed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Signmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Signmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JPasswordField passwordTextField1;
    private javax.swing.JButton signinButton;
    private javax.swing.JPanel signinPanel;
    private javax.swing.JButton signup;
    private javax.swing.JPanel signupPanel;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JTextField usernameTextField1;
    // End of variables declaration//GEN-END:variables
}