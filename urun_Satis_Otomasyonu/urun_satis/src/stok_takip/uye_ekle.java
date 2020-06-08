/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stok_takip;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author fah
 */
public class uye_ekle extends javax.swing.JFrame {

    /**
     * Creates new form uye_ekle
     */
    public uye_ekle() {
        initComponents();
        txt_kadi.setBackground(new Color(0, 0, 0, 0));
        txt_kadi.setBorder(null);
        
        txt_parola.setBackground(new Color(0, 0, 0, 0));
        txt_parola.setBorder(null);
        txt_email.setBackground(new Color(0, 0, 0, 0));
        txt_email.setBorder(null);
        btn_uye_ekle.setBackground(new Color(0, 0, 0, 0));
        btn_uye_ekle.setBorder(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_uye_ekle = new javax.swing.JButton();
        txt_parola = new javax.swing.JPasswordField();
        btn_cikis2 = new javax.swing.JButton();
        txt_email = new javax.swing.JTextField();
        txt_kadi = new javax.swing.JTextField();
        lbl_email = new javax.swing.JLabel();
        lbl_parola = new javax.swing.JLabel();
        lbl_kadi = new javax.swing.JLabel();
        lbl_kategori = new javax.swing.JLabel();
        c_kategori = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setPreferredSize(new java.awt.Dimension(640, 480));
        getContentPane().setLayout(null);

        btn_uye_ekle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_uye_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_uye_ekleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_uye_ekle);
        btn_uye_ekle.setBounds(450, 210, 80, 90);

        txt_parola.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txt_parola.setForeground(new java.awt.Color(0, 153, 255));
        getContentPane().add(txt_parola);
        txt_parola.setBounds(160, 270, 270, 30);

        btn_cikis2.setText("ÇIKIŞ");
        btn_cikis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikis2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cikis2);
        btn_cikis2.setBounds(903, 11, 59, 23);

        txt_email.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txt_email.setForeground(new java.awt.Color(0, 153, 255));
        getContentPane().add(txt_email);
        txt_email.setBounds(160, 320, 270, 30);

        txt_kadi.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        txt_kadi.setForeground(new java.awt.Color(0, 153, 255));
        getContentPane().add(txt_kadi);
        txt_kadi.setBounds(160, 160, 270, 30);

        lbl_email.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(0, 153, 255));
        lbl_email.setText("E-Posta");
        getContentPane().add(lbl_email);
        lbl_email.setBounds(20, 320, 69, 22);

        lbl_parola.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_parola.setForeground(new java.awt.Color(0, 153, 255));
        lbl_parola.setText("Parola");
        getContentPane().add(lbl_parola);
        lbl_parola.setBounds(20, 270, 80, 22);

        lbl_kadi.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lbl_kadi.setForeground(new java.awt.Color(0, 153, 255));
        lbl_kadi.setText("Kullanıcı Adı");
        getContentPane().add(lbl_kadi);
        lbl_kadi.setBounds(20, 160, 160, 21);

        lbl_kategori.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_kategori.setForeground(new java.awt.Color(0, 153, 255));
        lbl_kategori.setText("Yetki");
        lbl_kategori.setToolTipText("");
        getContentPane().add(lbl_kategori);
        lbl_kategori.setBounds(20, 210, 80, 40);

        c_kategori.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        c_kategori.setForeground(new java.awt.Color(0, 153, 255));
        c_kategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Müdür", "Satış Danışmanı" }));
        c_kategori.setMinimumSize(new java.awt.Dimension(102, 15));
        c_kategori.setPreferredSize(new java.awt.Dimension(99, 15));
        getContentPane().add(c_kategori);
        c_kategori.setBounds(160, 210, 270, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resimler/uye_ol.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_uye_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_uye_ekleActionPerformed

        String kategori=String.valueOf(c_kategori.getSelectedItem());
        String kadi=txt_kadi.getText();
        String parola=txt_parola.getText();
        String email=txt_email.getText();

        try {

            if (kategori.equals("") || kadi.equals("") || parola.equals("") || email.equals("")) {

                JOptionPane.showMessageDialog(this, "Lütfen Boş Alanları Doldurunuz!");

            } else {
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = null;
                Statement st = null;
                ResultSet rs = null;

                con = DriverManager.getConnection("jdbc:mysql://localhost/stok?useUnicode=true&characterEncoding=UTF-8", "root", "");
                st = con.createStatement();

                String sql = "INSERT INTO uyeler (kategori,kadi,sifre,email)"
                + " VALUES ('"+kategori+"', '"+kadi+"', '"+parola+"', '"+email+"')";

                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Sayın " + kadi + " Üyelik İşleminiz Gerçekleşmiştir.");
                
                uye_giris ac = new uye_giris();
                ac.setVisible(true);
                
                this.setVisible(false);

            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Hata: " + ex.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Veritabanına bağlantı sağlanamadı! " + ex.toString());
        }

    }//GEN-LAST:event_btn_uye_ekleActionPerformed

    private void btn_cikis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikis2ActionPerformed

        uye_ekle a = new uye_ekle();
        a.setVisible(false);
        dispose();
    }//GEN-LAST:event_btn_cikis2ActionPerformed

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
            java.util.logging.Logger.getLogger(uye_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uye_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uye_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uye_ekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uye_ekle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis2;
    private javax.swing.JButton btn_uye_ekle;
    private javax.swing.JComboBox c_kategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_kadi;
    private javax.swing.JLabel lbl_kategori;
    private javax.swing.JLabel lbl_parola;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_kadi;
    private javax.swing.JPasswordField txt_parola;
    // End of variables declaration//GEN-END:variables
}