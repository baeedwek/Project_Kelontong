/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_kelontong;

/**
 *
 * @author ACER
 */
public class admin_poenya extends javax.swing.JFrame {

    /**
     * Creates new form admin_poenya
     */
    public admin_poenya() {
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
        logout = new javax.swing.JButton();
        inputdatabarang = new javax.swing.JButton();
        inputdatakaryawan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        daftarKaryawan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_kelontong/png/icons8_Login_35px.png"))); // NOI18N
        logout.setText("LOGOUT");
        logout.setBorder(null);
        logout.setContentAreaFilled(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        inputdatabarang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputdatabarang.setText("INPUT DATA BARANG");
        inputdatabarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputdatabarangActionPerformed(evt);
            }
        });
        jPanel1.add(inputdatabarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 158, 240, 212));

        inputdatakaryawan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inputdatakaryawan.setText("INPUT DATA KARYAWAN");
        inputdatakaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputdatakaryawanActionPerformed(evt);
            }
        });
        jPanel1.add(inputdatakaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 158, 240, 212));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DASHBOARD ADMIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 46, 269, 37));

        daftarKaryawan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        daftarKaryawan.setText("DAFTAR KARYAWAN");
        daftarKaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarKaryawanActionPerformed(evt);
            }
        });
        jPanel1.add(daftarKaryawan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 158, 240, 212));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputdatabarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputdatabarangActionPerformed
        // TODO add your handling code here:
        input_barang dataBarang = new input_barang();
        dataBarang.setVisible(true);
        dispose();
    }//GEN-LAST:event_inputdatabarangActionPerformed

    private void inputdatakaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputdatakaryawanActionPerformed
        // TODO add your handling code here:
        input_karyawan dataKaryawan = new input_karyawan();
        dataKaryawan.setVisible(true);
        dispose();
    }//GEN-LAST:event_inputdatakaryawanActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        login_admin loginAdmin = new login_admin();
        loginAdmin.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void daftarKaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarKaryawanActionPerformed
        // TODO add your handling code here:
        daftar_karyawan dftrKaryawan = new daftar_karyawan();
        dftrKaryawan.setVisible(true);
        dispose();
    }//GEN-LAST:event_daftarKaryawanActionPerformed

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
            java.util.logging.Logger.getLogger(admin_poenya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_poenya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_poenya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_poenya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_poenya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton daftarKaryawan;
    private javax.swing.JButton inputdatabarang;
    private javax.swing.JButton inputdatakaryawan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}