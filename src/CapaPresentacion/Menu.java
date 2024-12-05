package CapaPresentacion;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import capaEntidad.*;
import desplazable.Desface;
import java.awt.BorderLayout;

public class Menu extends javax.swing.JFrame {
    Desface desface;
    
    private static Usuario usuarioActual;
    
    
    public Menu(Usuario objUsuario) {
        desface = new Desface();
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(new Dimension(1321, 800));
        this.setTitle("Sistema de Ventas");
       
       
        btnSalir.putClientProperty("JButton.buttonType", "roundRect");
        
        usuarioActual = objUsuario;
        lblNomUsr.setText(usuarioActual.getNombreCompleto()); // Muestra el nombre completo del usuario
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        lblNomUsr = new javax.swing.JLabel();
        lblIdntUsr = new javax.swing.JLabel();
        lblLogoSpackBit = new javax.swing.JLabel();
        pnlFondoDashboard = new javax.swing.JPanel();
        lblLogoSena = new javax.swing.JLabel();
        lblNomSoftware = new javax.swing.JLabel();
        lblUsuarios = new javax.swing.JLabel();
        lblMantenedor = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        lblProveedores = new javax.swing.JLabel();
        lblCompras = new javax.swing.JLabel();
        lblReportes = new javax.swing.JLabel();
        lblAcercaDe = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        ButonMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(43, 41, 54));
        setExtendedState(6);
        setUndecorated(true);
        setResizable(false);

        pnlFondo.setBackground(new java.awt.Color(64, 57, 74));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNomUsr.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        lblNomUsr.setForeground(new java.awt.Color(153, 153, 153));
        lblNomUsr.setText("lblNomUsr");
        pnlFondo.add(lblNomUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 20, -1, -1));

        lblIdntUsr.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        lblIdntUsr.setForeground(new java.awt.Color(153, 153, 153));
        lblIdntUsr.setText("Usuario :");
        pnlFondo.add(lblIdntUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, -1, -1));

        lblLogoSpackBit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/logoSparkBit 1.png"))); // NOI18N
        pnlFondo.add(lblLogoSpackBit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 710, -1, -1));

        pnlFondoDashboard.setBackground(new java.awt.Color(43, 41, 54));

        lblLogoSena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/logoSena 1.png"))); // NOI18N

        lblNomSoftware.setFont(new java.awt.Font("Anja Eliane", 0, 18)); // NOI18N
        lblNomSoftware.setForeground(new java.awt.Color(169, 169, 169));
        lblNomSoftware.setText("ROULETTE POS");

        lblUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/usuario 1.png"))); // NOI18N

        lblMantenedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/mantenedor.png"))); // NOI18N

        lblClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/clientes.png"))); // NOI18N

        lblProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/proveedor.png"))); // NOI18N

        lblCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/compras.png"))); // NOI18N

        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/reporte.png"))); // NOI18N

        lblAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/Acerca de.png"))); // NOI18N

        btnSalir.setBackground(new java.awt.Color(255, 103, 25));
        btnSalir.setFont(new java.awt.Font("Quicksand SemiBold", 1, 15)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/cerrar sesion.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        ButonMenu.setBackground(new java.awt.Color(43, 41, 54));
        ButonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/menu.png"))); // NOI18N
        ButonMenu.setBorder(null);
        ButonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButonMenuMouseClicked(evt);
            }
        });
        ButonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButonMenuActionPerformed(evt);
            }
        });

        jButton1.setText("Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Acerca de");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Compras");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Reportes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Mantenedor");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("Proveedor");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFondoDashboardLayout = new javax.swing.GroupLayout(pnlFondoDashboard);
        pnlFondoDashboard.setLayout(pnlFondoDashboardLayout);
        pnlFondoDashboardLayout.setHorizontalGroup(
            pnlFondoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoDashboardLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(pnlFondoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoDashboardLayout.createSequentialGroup()
                        .addComponent(lblMantenedor)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFondoDashboardLayout.createSequentialGroup()
                        .addComponent(lblUsuarios)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFondoDashboardLayout.createSequentialGroup()
                        .addComponent(lblCompras)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFondoDashboardLayout.createSequentialGroup()
                        .addComponent(lblReportes)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblAcercaDe)
                    .addGroup(pnlFondoDashboardLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(pnlFondoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFondoDashboardLayout.createSequentialGroup()
                                .addComponent(lblProveedores)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton8))
                            .addGroup(pnlFondoDashboardLayout.createSequentialGroup()
                                .addComponent(lblClientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(pnlFondoDashboardLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblLogoSena)
                .addGroup(pnlFondoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoDashboardLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblNomSoftware)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoDashboardLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButonMenu)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoDashboardLayout.createSequentialGroup()
                .addGap(0, 102, Short.MAX_VALUE)
                .addGroup(pnlFondoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );
        pnlFondoDashboardLayout.setVerticalGroup(
            pnlFondoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoDashboardLayout.createSequentialGroup()
                .addGroup(pnlFondoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoDashboardLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnlFondoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogoSena)
                            .addComponent(ButonMenu)))
                    .addGroup(pnlFondoDashboardLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblNomSoftware)))
                .addGap(73, 73, 73)
                .addGroup(pnlFondoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsuarios)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(pnlFondoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMantenedor)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnlFondoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClientes))
                .addGap(43, 43, 43)
                .addGroup(pnlFondoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProveedores)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(pnlFondoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCompras)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnlFondoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblReportes)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(pnlFondoDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAcercaDe)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlFondoDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 800));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        pnlFondo.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 1000, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        
    }//GEN-LAST:event_btnSalirMouseClicked

    private void ButonMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButonMenuMouseClicked
      
    }//GEN-LAST:event_ButonMenuMouseClicked

    private void ButonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButonMenuActionPerformed
      if (pnlFondoDashboard.getX() == 0) { 
        // Desplazar hacia la izquierda
        desface.desplazarIzquierda(pnlFondoDashboard, pnlFondoDashboard.getX(), -270, 10, 10);
    } else if (pnlFondoDashboard.getX() == -270) { 
        // Desplazar hacia la derecha
        desface.desplazarDerecha(pnlFondoDashboard, pnlFondoDashboard.getX(), 0, 10, 10);
    }
    }//GEN-LAST:event_ButonMenuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           usuario u1 = new usuario();
         u1.setSize(1000, 610);
         u1.setLocation(0, 0);
         
         content.removeAll();
         content.add(u1,BorderLayout.CENTER);
         content.revalidate();
         content.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         Cliente c = new Cliente();
         c.setSize(720, 430);
         c.setLocation(0, 0);
         
         content.removeAll();
         content.add(c,BorderLayout.CENTER);
         content.revalidate();
         content.repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Compras c2 = new Compras();
         c2.setSize(720, 430);
         c2.setLocation(0, 0);
         
         content.removeAll();
         content.add(c2,BorderLayout.CENTER);
         content.revalidate();
         content.repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Reportes r = new Reportes();
         r.setSize(720, 430);
         r.setLocation(0, 0);
         
         content.removeAll();
         content.add(r,BorderLayout.CENTER);
         content.revalidate();
         content.repaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Mantenedor m = new Mantenedor();
         m.setSize(720, 430);
         m.setLocation(0, 0);
         
         content.removeAll();
         content.add(m,BorderLayout.CENTER);
         content.revalidate();
         content.repaint();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       proveedor p = new proveedor();
         p.setSize(720, 430);
         p.setLocation(0, 0);
         
         content.removeAll();
         content.add(p,BorderLayout.CENTER);
         content.revalidate();
         content.repaint();
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException error) {
            System.err.println( "Fallo al inicializar LaF" );
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu(usuarioActual).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButonMenu;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel content;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton8;
    private javax.swing.JLabel lblAcercaDe;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblCompras;
    private javax.swing.JLabel lblIdntUsr;
    private javax.swing.JLabel lblLogoSena;
    private javax.swing.JLabel lblLogoSpackBit;
    private javax.swing.JLabel lblMantenedor;
    private javax.swing.JLabel lblNomSoftware;
    private javax.swing.JLabel lblNomUsr;
    private javax.swing.JLabel lblProveedores;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblUsuarios;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlFondoDashboard;
    // End of variables declaration//GEN-END:variables

}
