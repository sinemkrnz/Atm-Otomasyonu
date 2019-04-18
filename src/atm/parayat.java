/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sinem
 */
public class parayat extends javax.swing.JFrame {

    public String Tc;
    public int MNO;
    public parayat() {
        initComponents();
    }

        private String TarihEkle(){
        DateFormat bicim=new SimpleDateFormat("dd.MM.yyyy");
        Date tarih=new Date();
        return bicim.format(tarih);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jTextField2 = new javax.swing.JTextField();
        jToggleButton8 = new javax.swing.JToggleButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(659, 526));
        setSize(new java.awt.Dimension(659, 526));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("YATIRMAK İSTEDİĞİNİZ MİKTARI SEÇİNİZ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ss - Kopya.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 57, 57));

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ss - Kopya.png"))); // NOI18N
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 57, 57));

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ss - Kopya.png"))); // NOI18N
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 57, 57));

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ss - Kopya.png"))); // NOI18N
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 57, 57));

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ss.png"))); // NOI18N
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 57, 57));

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ss.png"))); // NOI18N
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 57, 57));

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ss.png"))); // NOI18N
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 57, 60));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(81, 81, 81));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 160, 30));

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/ss.png"))); // NOI18N
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 57, 57));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("ANA MENÜ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("MİKTAR GİRİNİZ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 160, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("20");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("40");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 209, -1, 60));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("60");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 299, -1, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("50");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("100");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("200");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/1510241336_pitchesbg_1.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 659, 526));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        anasayfa ana=new anasayfa();
        ana.Tc=Tc;
        ana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        try {
            baglantı b=new baglantı();
            Connection conn=b.baglan();

            Statement st1=conn.createStatement();
            st1.executeUpdate("Insert Into BANKA (MUSTERİNO , SUBEKODU, ISLEMNO, TARİH) Values("+MNO+",1,2,'"+TarihEkle()+"')");

            Statement st=conn.createStatement();
            st.executeUpdate("Update MÜSTERILER Set BAKIYE=BAKIYE+"+20+" Where TC='"+Tc+"' And MUSTERI_NO="+MNO);
            JOptionPane.showMessageDialog(rootPane, "20 TL Hesaba Yatırıldı");

            st1.close();
            st.close();
            conn.close();
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(parayat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        try {
            baglantı b=new baglantı();
            Connection conn=b.baglan();

            Statement st1=conn.createStatement();
            st1.executeUpdate("Insert Into BANKA (MUSTERİNO , SUBEKODU, ISLEMNO, TARİH) Values("+MNO+",1,2,'"+TarihEkle()+"')");

            Statement st=conn.createStatement();
            st.executeUpdate("Update MÜSTERILER Set BAKIYE=BAKIYE+"+40+" Where TC='"+Tc+"' And MUSTERI_NO="+MNO);
            JOptionPane.showMessageDialog(rootPane, "40 TL Hesaba Yatırıldı");

            st1.close();
            st.close();
            conn.close();
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(paracek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        try {
            baglantı b=new baglantı();
            Connection conn=b.baglan();

            Statement st1=conn.createStatement();
            st1.executeUpdate("Insert Into BANKA (MUSTERİNO , SUBEKODU, ISLEMNO, TARİH) Values("+MNO+",1,2,'"+TarihEkle()+"')");

            Statement st=conn.createStatement();
            st.executeUpdate("Update MÜSTERILER Set BAKIYE=BAKIYE+"+60+" Where TC='"+Tc+"' And MUSTERI_NO="+MNO);
            JOptionPane.showMessageDialog(rootPane, "60 TL Hesaba Yatırıldı");

            st1.close();
            st.close();
            conn.close();
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(paracek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        try {
            baglantı b=new baglantı();
            Connection conn=b.baglan();

            Statement st1=conn.createStatement();
            st1.executeUpdate("Insert Into BANKA (MUSTERİNO , SUBEKODU, ISLEMNO, TARİH) Values("+MNO+",1,2,'"+TarihEkle()+"')");

            Statement st=conn.createStatement();
            st.executeUpdate("Update MÜSTERILER Set BAKIYE=BAKIYE+"+50+" Where TC='"+Tc+"' And MUSTERI_NO="+MNO);
            JOptionPane.showMessageDialog(rootPane, "50 TL Hesaba Yatırıldı");

            st1.close();
            st.close();
            conn.close();
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(paracek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        try {
            baglantı b=new baglantı();
            Connection conn=b.baglan();

            Statement st1=conn.createStatement();
            st1.executeUpdate("Insert Into BANKA (MUSTERİNO , SUBEKODU, ISLEMNO, TARİH) Values("+MNO+",1,2,'"+TarihEkle()+"')");

            Statement st=conn.createStatement();
            st.executeUpdate("Update MÜSTERILER Set BAKIYE=BAKIYE+"+100+" Where TC='"+Tc+"' And MUSTERI_NO="+MNO);
            JOptionPane.showMessageDialog(rootPane, "100 TL Hesaba Yatırıldı");

            st1.close();
            st.close();
            conn.close();
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(paracek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        
            try {
                baglantı b=new baglantı();
                Connection conn=b.baglan();

                Statement st1=conn.createStatement();
                st1.executeUpdate("Insert Into BANKA (MUSTERİNO , SUBEKODU, ISLEMNO, TARİH) Values("+MNO+",1,2,'"+TarihEkle()+"')");

                Statement st=conn.createStatement();
                st.executeUpdate("Update MÜSTERILER Set BAKIYE=BAKIYE+"+Integer.parseInt(jTextField2.getText())+" Where TC='"+Tc+"' And MUSTERI_NO="+MNO);
                JOptionPane.showMessageDialog(rootPane, jTextField2.getText()+" TL Hesaba Yatırıldı");

                st1.close();
                st.close();
                conn.close();
                this.setVisible(false);

            } catch (SQLException ex) {
                Logger.getLogger(paracek1.class.getName()).log(Level.SEVERE, null, ex);
            }
        

    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        try {
            baglantı b=new baglantı();
            Connection conn=b.baglan();

            Statement st1=conn.createStatement();
            st1.executeUpdate("Insert Into BANKA (MUSTERİNO , SUBEKODU, ISLEMNO, TARİH) Values("+MNO+",1,2,'"+TarihEkle()+"')");

            Statement st=conn.createStatement();
            st.executeUpdate("Update MÜSTERILER Set BAKIYE=BAKIYE+"+200+" Where TC='"+Tc+"' And MUSTERI_NO="+MNO);
            JOptionPane.showMessageDialog(rootPane, "200 TL Hesaba Yatırıldı");

            st1.close();
            st.close();
            conn.close();
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(paracek1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jToggleButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(parayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(parayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(parayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(parayat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new parayat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    // End of variables declaration//GEN-END:variables
}
