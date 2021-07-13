
package english;

import home.Home;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class English extends javax.swing.JFrame {

     private JFrame frame;
     DefaultListModel fill = new DefaultListModel();
    public static final int ListSize = 2;
    public English() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        vo = new javax.swing.JTextField();
        co = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        view = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/english/Home.0.png"))); // NOI18N
        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 336, -1, -1));

        Close.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/english/Close.png"))); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 336, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Vowel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 251, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Consonant");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 251, -1, -1));

        vo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(vo, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 181, 47, 36));

        co.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(co, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 181, 44, 36));

        view.setColumns(20);
        view.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        view.setRows(5);
        jScrollPane2.setViewportView(view);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 393, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/english/Home.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        frame = new JFrame ("Exit Application");
        if (JOptionPane.showConfirmDialog(frame, "Confirm Exit?",
            "English Window",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
             System.exit(0);
        }
    }//GEN-LAST:event_CloseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String vowel = vo.getText().toString().trim();
        if(vowel.equals("A")||vowel.equals("a"))
        {
            view.setText( "  Apple = I like to eat Apple. "  +"\n  Axe = Be careful with the sharp Axe. " );            
        }
        else if(vowel.equals("E")||vowel.equals("e"))
          {
            view.setText("  Egg = Eggs are good for health. "  +"\n  Eye = Open your Eyes. " );          
          } 
        else if(vowel.equals("I")||vowel.equals("i"))
          {
            view.setText( "  Ice = I need Ice cubes. "  +"\n  Innocent = Be Innocent just like a child. " );         
          }   
        else if(vowel.equals("O")||vowel.equals("o"))
          {
            view.setText( "  Open = Open your book. "  +"\n Orange = Oranges are rich in vitamin C. " );         
          } 
        else if(vowel.equals("U")||vowel.equals("u"))
          {
            view.setText( "  Unity = Unity is strength. "  +"\n  Umbrella = I lost my Umbrella. " );
            
          }  
        else
        {
            view.setText( "  Sorry it is not vowel  "   );
            
        }
        vo.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String conso = co.getText().toString().trim();
        if(conso.equals("B")||conso.equals("b"))
        {
            view.setText( "  Book = This is my book.  "  +"\n   Banana = Tom loved bananas. " );
            
    }//GEN-LAST:event_jButton2ActionPerformed
        else if(conso.equals("C")||conso.equals("c"))
         {
           view.setText( "  Cook = Mother Cook food everyday for us.  "  +"\n   Cow = Cows eat grass. " );
            
         } 
        else if(conso.equals("D")||conso.equals("d"))
         {
            view.setText( "  Dog = I fed the dog.  "  +"\n   Donkey = Horses and donkeys are different. " );
            
         } 
        else if(conso.equals("F")||conso.equals("f"))
         {
            view.setText( "  Father = I'm proud of my father.  "  +"\n   Fool = Sure rana is fool. " );
            
         }  
        else if(conso.equals("G")||conso.equals("g"))
         {
            view.setText( "  Good = Rana is a good boy. "  +"\n   Goat = Rana have a goat. " );
            
         }  
        else if(conso.equals("H")||conso.equals("h"))
         {
            view.setText( "  Honest = He is poor but honest.  "  +"\n  Hospital = You need to go to hospital. " );
           
         }  
        else if(conso.equals("J")||conso.equals("j"))
         {
            view.setText( "  Jug = He filled a Jug with milk.  "  +"\n   Jungle =  I love The Jungle Book.  " );
            
         }  
        else if(conso.equals("K")||conso.equals("k"))
         {
            view.setText( "  King = The King abused his power.  "  +"\n   Kite = He flew a kite. " );
            
         }  
        else if(conso.equals("L")||conso.equals("l"))
         {
            view.setText( "  Lion = Lions run fast.  "  +"\n   Lunch = It's Lunch time. " );
            
         }  
        else if(conso.equals("M")||conso.equals("m"))
         {
            view.setText( "  Mother = Every Mother loves her child. "  +"\n   Mango = I want to eat a Mango." );
           
         }  
        else if(conso.equals("N")||conso.equals("n"))
         {
            view.setText( "  Nose = Your Nose is bleeding.  "  +"\n   Noise = I heard a Noise. " );
            
         }  
        else if(conso.equals("P")||conso.equals("p"))
         {
            view.setText( "  Pond = There are a lot of frogs in this Pond. "  +"\n   Pure = We drink Pure water. " );
            
         } 
        else if(conso.equals("Q")||conso.equals("q"))
         {
            view.setText( "  Quran = the Quran is divided in 114 suras. "  +"\n   Queen = The Queen's crown was made of gold. " );
            
         }  
        else if(conso.equals("R")||conso.equals("r"))
         {
            view.setText( "  Read = I'm Reading.  "  +"\n   Run = He Runs fast. " );
            
         }  
        else if(conso.equals("S")||conso.equals("s"))
         {
            view.setText( "  Sun = The Sun was warm.  "  +"\n   Ship = The Ship grew distant. " );
            
         }  
        else if(conso.equals("T")||conso.equals("t"))
         {
            view.setText( "  Tiger = He gave me a picture of a Tiger.  "  +"\n   Train = The Train has just left. " );
            
         }  
        else if(conso.equals("V")||conso.equals("v"))
         {
            view.setText( "  Victory = The Victory day of Bangladesh in 16th december. "  +"\n   Van = He inched the Van forward. " );
            
         }  
        else if(conso.equals("W")||conso.equals("w"))
         {
            view.setText( "  Wood = Old Wood is best to burn.  "  +"\n   Water = Everyone drink Water. " );
            
         }  
        else if(conso.equals("X")||conso.equals("x"))
         {
            view.setText( "  Xmas = A merry Xmas to all our readers!  "  +"\n   X-ray = I had to go for an X-ray. " );
            
         }  
        else if(conso.equals("Y")||conso.equals("y"))
         {
            view.setText( "  Yellow = Bananas are Yellow.  "  +"\n   Yo-yo = He kept bouncing up and down like a yo-yo. " );
            
         } 
        else if(conso.equals("Z")||conso.equals("z"))
         {
            view.setText( "  Zoo = I went to the Zoo.  "  +"\n   Zebra = Zebras are found at a zoo. " );
            
         } 
        else
        {
            view.setText( "  Sorry it is not consonant  "   );
            
        }
        co.setText(null);
    }
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
            java.util.logging.Logger.getLogger(English.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(English.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(English.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(English.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new English().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton Home;
    private javax.swing.JTextField co;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea view;
    private javax.swing.JTextField vo;
    // End of variables declaration//GEN-END:variables

}
