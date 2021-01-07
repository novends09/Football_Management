/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author ACER
 */
public class FrmDashboard extends javax.swing.JFrame {

    /**
     * Creates new form FrmDashboard
     */
    public FrmDashboard() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnManageTeam = new javax.swing.JButton();
        team = new javax.swing.JLabel();
        btnManagePlayer = new javax.swing.JButton();
        player = new javax.swing.JLabel();
        btnStanding = new javax.swing.JButton();
        btnMatch = new javax.swing.JButton();
        standing = new javax.swing.JLabel();
        fixture = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DASHBOARD");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(290, 20, 160, 60);

        btnManageTeam.setText("Manage Team");
        btnManageTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTeamActionPerformed(evt);
            }
        });
        jPanel1.add(btnManageTeam);
        btnManageTeam.setBounds(100, 230, 110, 30);

        team.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/team.png"))); // NOI18N
        jPanel1.add(team);
        team.setBounds(70, 110, 160, 110);

        btnManagePlayer.setText("Manage Player");
        btnManagePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePlayerActionPerformed(evt);
            }
        });
        jPanel1.add(btnManagePlayer);
        btnManagePlayer.setBounds(310, 230, 110, 30);

        player.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/player.jpg"))); // NOI18N
        jPanel1.add(player);
        player.setBounds(300, 120, 130, 100);

        btnStanding.setText("Standing");
        btnStanding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStandingActionPerformed(evt);
            }
        });
        jPanel1.add(btnStanding);
        btnStanding.setBounds(180, 390, 110, 30);

        btnMatch.setText("Match Set");
        btnMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatchActionPerformed(evt);
            }
        });
        jPanel1.add(btnMatch);
        btnMatch.setBounds(510, 230, 90, 30);

        standing.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        standing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/standings.png"))); // NOI18N
        jPanel1.add(standing);
        standing.setBounds(490, 120, 120, 100);

        fixture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fixture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/fixture.png"))); // NOI18N
        jPanel1.add(fixture);
        fixture.setBounds(170, 290, 130, 90);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/logout.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(410, 290, 110, 90);

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(420, 390, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 710, 460);

        setSize(new java.awt.Dimension(723, 502));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTeamActionPerformed
        // TODO add your handling code here:
        new FrmTeam().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnManageTeamActionPerformed

    private void btnManagePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePlayerActionPerformed
        // TODO add your handling code here:
        new FrmPlayer().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnManagePlayerActionPerformed

    private void btnStandingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStandingActionPerformed
        // TODO add your handling code here:
        new FrmLeagueTable().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnStandingActionPerformed

    private void btnMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatchActionPerformed
        // TODO add your handling code here:
        new FrmMatchSet().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMatchActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        new FrmLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManagePlayer;
    private javax.swing.JButton btnManageTeam;
    private javax.swing.JButton btnMatch;
    private javax.swing.JButton btnStanding;
    private javax.swing.JLabel fixture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JLabel player;
    private javax.swing.JLabel standing;
    private javax.swing.JLabel team;
    // End of variables declaration//GEN-END:variables
}
