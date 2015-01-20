/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Johnny
 */
import java.awt.BorderLayout;

public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    UserDAO userDAO = new UserDAO();
    public LoginPage() {
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

        lbLogin = new javax.swing.JLabel();
        lbProgramVersion = new javax.swing.JLabel();
        tbUsername = new javax.swing.JTextField();
        tbPassword = new javax.swing.JTextField();
        lbUsername = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        btLogin = new javax.swing.JButton();
        lbCopyright = new javax.swing.JLabel();
        lbErrorMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbLogin.setText("TimeTracker v.0.0.1");

        lbProgramVersion.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        lbProgramVersion.setText("Login");

        tbUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbUsernameActionPerformed(evt);
            }
        });

        lbUsername.setText("Username:");

        lbPassword.setText("Password:");

        btLogin.setText("Login");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        lbCopyright.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        lbCopyright.setText("©Unison Software 2015");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addComponent(lbCopyright))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbProgramVersion)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tbUsername)
                                .addComponent(tbPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                            .addComponent(lbUsername)
                            .addComponent(lbPassword)
                            .addComponent(btLogin)
                            .addComponent(lbErrorMsg))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbProgramVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31)
                .addComponent(lbUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lbPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbErrorMsg)
                .addGap(18, 18, 18)
                .addComponent(btLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCopyright)
                    .addComponent(lbLogin))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        // TODO add your handling code here:
        //TrackerPage trackerPage = new TrackerPage.
        if(userDAO.UserLogin(tbUsername.getText(), tbPassword.getText()))
        {
            String username = userDAO.getUsername();
            System.out.println(username);
            int ID = userDAO.getID();
            System.out.println(ID);
            System.out.println();
            System.out.println();
            TrackerPage tp = new TrackerPage(userDAO.getUsername(), userDAO.getID(), userDAO.getHours(), userDAO.getMinutes());
            setVisible(false);
            dispose();   
        }
        else
            lbErrorMsg.setText("Username/Password didn't match");
    }//GEN-LAST:event_btLoginActionPerformed

    private void tbUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JLabel lbCopyright;
    private javax.swing.JLabel lbErrorMsg;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbProgramVersion;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JTextField tbPassword;
    private javax.swing.JTextField tbUsername;
    // End of variables declaration//GEN-END:variables
}
