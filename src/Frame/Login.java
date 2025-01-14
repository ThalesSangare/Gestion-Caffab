/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import DAO.Connexion;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Meeriame
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    // EFFACER LES BORDURE DES CHAMPS DANS USER_TABLE ET GARDER CELUI D'EN BAS
    Border textfields = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white);

    public Login() {
        initComponents();
        txt_login.setBorder(textfields);
        txt_pass.setBorder(textfields);
    }
    String req = "";
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection con = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        txt_login = new javax.swing.JTextField();
        txt_log_oublier = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbo_option = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AUTHENTIFICATION");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 340, 60));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 60));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_question_mark_32.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 60, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 80));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jButton2.setText("ENTRER");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 280, 60));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_shutdown_48px_1.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 80, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 560, 80));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel2.setText("OPTION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 160, 30));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setText("USERNAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 140, 30));

        txt_pass.setBackground(new java.awt.Color(0, 102, 102));
        txt_pass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_pass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 240, 40));

        txt_login.setBackground(new java.awt.Color(0, 102, 102));
        txt_login.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        txt_login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_login.setBorder(null);
        jPanel1.add(txt_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 240, 40));

        txt_log_oublier.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        txt_log_oublier.setForeground(new java.awt.Color(153, 0, 0));
        txt_log_oublier.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txt_log_oublier, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 340, 40));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel5.setText("PASSWORD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 160, 30));

        cbo_option.setBackground(new java.awt.Color(0, 102, 102));
        cbo_option.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        cbo_option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selectionner", "Admin", "Utilisateur" }));
        cbo_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_optionActionPerformed(evt);
            }
        });
        jPanel1.add(cbo_option, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 230, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String login = txt_login.getText();
        String pass = txt_pass.getText();
        String option = cbo_option.getSelectedItem().toString();
        con = new Connexion().getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(null, "Serveur inactif");
        } else {
            if (login.equals("") || pass.equals("") || option.equals("Selectionner")) {
                JOptionPane.showMessageDialog(null, "Remplissez tout les champs svp !");
            } else {
                req = "select * from users where login=? and password=?";
                try {
                    ps = con.prepareStatement(req);
                    ps.setString(1, login);
                    ps.setString(2, pass);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        String val = rs.getString("droit");
                        String eta = rs.getString("etat");
                        if (option.equalsIgnoreCase("Admin") && val.equalsIgnoreCase("Admin")) {
                            if (eta.equalsIgnoreCase("Activer")) {
                                Principal princi = new Principal();
                                princi.setVisible(true);
                                setVisible(false);
                            } else {
                                JOptionPane.showMessageDialog(null, "Votre Compte est bloqué, Contacter l'administrateur");
                            }

                        }
                        if (option.equalsIgnoreCase("Utilisateur") && val.equalsIgnoreCase("Utilisateur")) {
                            if (eta.equalsIgnoreCase("Activer")) {
                                Principal_user princiuser = new Principal_user();
                                princiuser.setVisible(true);
                                setVisible(false);
                            } else {
                                JOptionPane.showMessageDialog(null, "Votre Compte est bloqué, Contacter l'administrateur");
                            }

                        }

                    }
                } catch (Exception e) {
                }
            }
        }

        txt_log_oublier.setText("Login ou MotdePass incorrect");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int thal = JOptionPane.showConfirmDialog(null, "Voulez-vous Quitter l'appli ? ", "FERMETURE", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (thal == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    //===============OUVRIR UN FICHIER PDF =================================
    public void monguide() {

        File fichier = new File("src/Etats/GUIDE_GESTION_CAFFAB.pdf");
// On vérifie que la classe Desktop soit bien supportée : 
        if (Desktop.isDesktopSupported()) {
            // On récupère l'instance du desktop : 
            Desktop desktop = Desktop.getDesktop();
            // On vérifie que la fonction open est bien supportée : 
            if (desktop.isSupported(Desktop.Action.OPEN)) {
                // Et on lance l'application associé au fichier pour l'ouvrir : 
                try {
                    desktop.open(fichier);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erreur d'affiche du guide " + e.getLocalizedMessage());
                }
            }
        }
    }
    private void cbo_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_optionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_optionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        monguide();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbo_option;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txt_log_oublier;
    private javax.swing.JTextField txt_login;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
