

package math;

import home.Home;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Math extends javax.swing.JFrame {

     private JFrame frame;
    public Math() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        Home = new javax.swing.JButton();
        a1 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        Addition = new javax.swing.JButton();
        s1 = new javax.swing.JTextField();
        s2 = new javax.swing.JTextField();
        Subtraction = new javax.swing.JButton();
        m1 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        Multipel = new javax.swing.JButton();
        d1 = new javax.swing.JTextField();
        d2 = new javax.swing.JTextField();
        Division = new javax.swing.JButton();
        rs = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math/Close.png"))); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));

        Home.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math/Home.0.png"))); // NOI18N
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        a1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        getContentPane().add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 60, 30));

        a2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        getContentPane().add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 60, 30));

        Addition.setBackground(new java.awt.Color(255, 102, 255));
        Addition.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Addition.setText("Addition");
        Addition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdditionActionPerformed(evt);
            }
        });
        getContentPane().add(Addition, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        s1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        getContentPane().add(s1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 60, 30));

        s2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        getContentPane().add(s2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 60, 30));

        Subtraction.setBackground(new java.awt.Color(153, 204, 255));
        Subtraction.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Subtraction.setText("Subtraction");
        Subtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubtractionActionPerformed(evt);
            }
        });
        getContentPane().add(Subtraction, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        m1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        getContentPane().add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 60, 30));

        m2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        getContentPane().add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 60, 30));

        Multipel.setBackground(new java.awt.Color(204, 255, 204));
        Multipel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Multipel.setText("Multipel");
        Multipel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultipelActionPerformed(evt);
            }
        });
        getContentPane().add(Multipel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, -1));

        d1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        getContentPane().add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 60, 30));

        d2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        getContentPane().add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 60, 30));

        Division.setBackground(new java.awt.Color(255, 153, 153));
        Division.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Division.setText("Division");
        Division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisionActionPerformed(evt);
            }
        });
        getContentPane().add(Division, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        rs.setBackground(new java.awt.Color(0, 0, 0));
        rs.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rs.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(rs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 160, 50));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setText("Math Table");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/math/Home.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        frame = new JFrame ("Exit Application");
        if (JOptionPane.showConfirmDialog(frame, "Confirm Exit?",
            "Math Window",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
        }
    }//GEN-LAST:event_CloseActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
            setVisible(false);
            new Home().setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a2ActionPerformed

    private void AdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdditionActionPerformed
        int a,b,c;
        a = Integer.parseInt(a1.getText());
        b = Integer.parseInt(a2.getText());
        c = a + b;
        rs.setText("Addition = "+c);
        s1.setText(null);
        s2.setText(null);
        m1.setText(null);
        m2.setText(null);
        d1.setText(null);
        d2.setText(null);
    }//GEN-LAST:event_AdditionActionPerformed

    private void SubtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubtractionActionPerformed
        int d,e,f;
        d = Integer.parseInt(s1.getText());
        e = Integer.parseInt(s2.getText());
        f = d - e;
        rs.setText("Subtraction = "+f);
        a1.setText(null);
        a2.setText(null);
        m1.setText(null);
        m2.setText(null);
        d1.setText(null);
        d2.setText(null);
    }//GEN-LAST:event_SubtractionActionPerformed

    private void MultipelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultipelActionPerformed
        int g,h,i;
        g = Integer.parseInt(m1.getText());
        h = Integer.parseInt(m2.getText());
        i = g * h;
        rs.setText("Multipel = "+i);
        s1.setText(null);
        s2.setText(null);
        a1.setText(null);
        a2.setText(null);
        d1.setText(null);
        d2.setText(null);
    }//GEN-LAST:event_MultipelActionPerformed

    private void DivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisionActionPerformed
       
        int j, k;
        float l = 0;
        j = Integer.parseInt(d1.getText());
        k = Integer.parseInt(d2.getText());
        l = j / k;
        rs.setText("Division = "+l);
        s1.setText(null);
        s2.setText(null);
        a1.setText(null);
        a2.setText(null);
        m1.setText(null);
        m2.setText(null);
    }//GEN-LAST:event_DivisionActionPerformed

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
            java.util.logging.Logger.getLogger(Math.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Math.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Math.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Math.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Math().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addition;
    private javax.swing.JButton Close;
    private javax.swing.JButton Division;
    private javax.swing.JButton Home;
    private javax.swing.JButton Multipel;
    private javax.swing.JButton Subtraction;
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a2;
    private javax.swing.JTextField d1;
    private javax.swing.JTextField d2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JLabel rs;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    // End of variables declaration//GEN-END:variables

}
