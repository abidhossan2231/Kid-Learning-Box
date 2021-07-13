
package home;


import english.English;
import evenodd.EVENODD;
import information.Information;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import login.LogIN;
import multiplication.Multiplication;
import math.Math;

public class Home extends javax.swing.JFrame {

    private JFrame frame;
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Eng = new javax.swing.JButton();
        Multi = new javax.swing.JButton();
        Info = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        close = new javax.swing.JButton();
        Math = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Eng.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Eng.setText("English");
        Eng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EngActionPerformed(evt);
            }
        });
        getContentPane().add(Eng, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 140, -1));

        Multi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Multi.setText("Multiplication");
        Multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiActionPerformed(evt);
            }
        });
        getContentPane().add(Multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        Info.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Info.setText("Information");
        Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoActionPerformed(evt);
            }
        });
        getContentPane().add(Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        Logout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/exit.png"))); // NOI18N
        Logout.setText("LogOut");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        close.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/Close.png"))); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        Math.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Math.setText("Math");
        Math.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MathActionPerformed(evt);
            }
        });
        getContentPane().add(Math, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 140, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("EVENODD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 140, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home/Home.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiActionPerformed
        setVisible(false);
        new Multiplication().setVisible(true);
    }//GEN-LAST:event_MultiActionPerformed

    private void EngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EngActionPerformed
        setVisible(false);
        new English().setVisible(true);
    }//GEN-LAST:event_EngActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to logout","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new LogIN().setVisible(true);
        
        }
    }//GEN-LAST:event_LogoutActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        frame = new JFrame ("Exit Application");
        if (JOptionPane.showConfirmDialog(frame, "Confirm Exit?",
                "Home Window",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        { 
        System.exit(0);
        }
    }//GEN-LAST:event_closeActionPerformed

    private void InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoActionPerformed
        setVisible(false);
        new Information().setVisible(true);
    }//GEN-LAST:event_InfoActionPerformed

    private void MathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MathActionPerformed
        setVisible(false);
       new Math().setVisible(true);
    }//GEN-LAST:event_MathActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        new EVENODD().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eng;
    private javax.swing.JButton Info;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Math;
    private javax.swing.JButton Multi;
    private javax.swing.JButton close;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
