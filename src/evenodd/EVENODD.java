
package evenodd;

import home.Home;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class EVENODD extends javax.swing.JFrame {

    static int score = 0;
    static int count = 0;
    Random r = new Random();
    int randomNum;
    private JFrame frame;
    public EVENODD() {
        initComponents();
        this.setLocationRelativeTo(null);
        randomNum = r.nextInt(100);
        Num.setText(String.valueOf(randomNum));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Num = new javax.swing.JLabel();
        ODD = new javax.swing.JButton();
        EVEN = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Sco = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 255));
        jLabel1.setText("IQ TEST");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        Num.setBackground(new java.awt.Color(255, 255, 255));
        Num.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Num.setForeground(new java.awt.Color(255, 102, 255));
        getContentPane().add(Num, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 100, 60));

        ODD.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ODD.setText("ODD");
        ODD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ODDActionPerformed(evt);
            }
        });
        getContentPane().add(ODD, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        EVEN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        EVEN.setText("EVEN");
        EVEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EVENActionPerformed(evt);
            }
        });
        getContentPane().add(EVEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        Home.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evenodd/Home.0.png"))); // NOI18N
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        Close.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evenodd/Close.png"))); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setText("SCORE :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        Sco.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Sco.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(Sco, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 70, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/evenodd/Home.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ODDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ODDActionPerformed
        count = count+1;
        
        if(count==10){
            int num = 0;
            if(num%2!=0){
                score = score+1;
                Sco.setText(String.valueOf(score));
                randomNum = r.nextInt(100);
                
            }
            else{
                randomNum = r.nextInt(100);
                Num.setText(String.valueOf(randomNum));
                
            }
            JOptionPane.showMessageDialog(this,"Your score is "+score +"/10");
            count = 0;
            score = 0;
            Sco.setText("");
            randomNum = r.nextInt(100);
            Num.setText(String.valueOf(randomNum));
        }
        else{
            int num = 0;
            if(num%2==0){
                score = score+1;
                Sco.setText(String.valueOf(score));
                randomNum = r.nextInt(100);
                Num.setText(String.valueOf(randomNum));
            }
            else{
                randomNum = r.nextInt(100);
                Num.setText(String.valueOf(randomNum));
            }
        } 
    }//GEN-LAST:event_ODDActionPerformed

    private void EVENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EVENActionPerformed
       count = count+1;
        
        if(count==10){
            int num = 0;
            if(num%2==0){
                score = score+1;
                Sco.setText(String.valueOf(score));
                randomNum = r.nextInt(100);
                
            }
            else{
                randomNum = r.nextInt(100);
                Num.setText(String.valueOf(randomNum));
                
            }
            JOptionPane.showMessageDialog(this,"Your score is "+score +"/10");
            count = 0;
            score = 0;
            Sco.setText("");
            randomNum = r.nextInt(100);
            Num.setText(String.valueOf(randomNum));
        }
        else{
            int num = 0;
            if(num%2==0){
                score = score+1;
                Sco.setText(String.valueOf(score));
                randomNum = r.nextInt(100);
                Num.setText(String.valueOf(randomNum));
            }
            else{
                randomNum = r.nextInt(100);
                Num.setText(String.valueOf(randomNum));
            }
        } 
    }//GEN-LAST:event_EVENActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
         setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        frame = new JFrame ("Exit Application");
        if (JOptionPane.showConfirmDialog(frame, "Confirm Exit?",
            "Even_Odd Window",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }
    }//GEN-LAST:event_CloseActionPerformed

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
            java.util.logging.Logger.getLogger(EVENODD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EVENODD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EVENODD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EVENODD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EVENODD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton EVEN;
    private javax.swing.JButton Home;
    private javax.swing.JLabel Num;
    private javax.swing.JButton ODD;
    private javax.swing.JLabel Sco;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
