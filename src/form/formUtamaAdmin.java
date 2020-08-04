/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import perpustakaan.MenuLogin;

/**
 *
 * @author oyeaaa
 */
public class formUtamaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form formUtamaAdmin
     */
    public formUtamaAdmin() {
        initComponents();
        
        // Menset ukuran layar utama ke full size
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        jLabel1.setText(Integer.toString(formLoginAdmin.getId()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUtama = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuAkun = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenuItem();
        menuKelolaBuku = new javax.swing.JMenu();
        formKelolaBuku = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuKelolaPinjam = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MENU UTAMA ADMIN");

        panelUtama.setBackground(new java.awt.Color(0, 204, 204));

        panelUtama.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelUtamaLayout = new javax.swing.GroupLayout(panelUtama);
        panelUtama.setLayout(panelUtamaLayout);
        panelUtamaLayout.setHorizontalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        panelUtamaLayout.setVerticalGroup(
            panelUtamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUtamaLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        menuAkun.setText("Akun");

        menuLogout.setText("Logout");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        menuAkun.add(menuLogout);

        jMenuBar1.add(menuAkun);

        menuKelolaBuku.setText("Data");

        formKelolaBuku.setText("Data Buku");
        formKelolaBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formKelolaBukuActionPerformed(evt);
            }
        });
        menuKelolaBuku.add(formKelolaBuku);
        menuKelolaBuku.add(jSeparator1);

        menuKelolaPinjam.setText("Data Anggota");
        menuKelolaBuku.add(menuKelolaPinjam);
        menuKelolaBuku.add(jSeparator2);

        jMenuItem4.setText("Data Peminjaman");
        menuKelolaBuku.add(jMenuItem4);

        jMenuBar1.add(menuKelolaBuku);

        jMenu3.setText("Tentang Kami");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUtama)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        // Instance menu login
        MenuLogin menuLogin = new MenuLogin();
        
        menuLogin.setVisible(true);
        this.dispose();
        
        JOptionPane.showMessageDialog(null, "Anda berhasil logout");
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void formKelolaBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formKelolaBukuActionPerformed
        // Menghapus komponen lain di panel utama
        panelUtama.removeAll();
        panelUtama.repaint();
        
        // Instance class form kelola buku
        formKelolaBuku kelolaBuku = new formKelolaBuku();
        
        // Mengambil ukuran layar utama dan layar form kelola buku
        Dimension layarUtama = this.getSize();
        Dimension layarKelolaBuku = kelolaBuku.getSize();
        
        // Set posisi form kelola buku ke center
        kelolaBuku.setLocation((layarUtama.width - layarKelolaBuku.width)/2, (layarUtama.height - layarKelolaBuku.height)/4);
        
        // Menambahkan halaman form kelola buku di panel utama
        panelUtama.add(kelolaBuku);
        kelolaBuku.setVisible(true);
        
    }//GEN-LAST:event_formKelolaBukuActionPerformed

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
            java.util.logging.Logger.getLogger(formUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formUtamaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formUtamaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem formKelolaBuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu menuAkun;
    private javax.swing.JMenu menuKelolaBuku;
    private javax.swing.JMenuItem menuKelolaPinjam;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JDesktopPane panelUtama;
    // End of variables declaration//GEN-END:variables
}
