package CapaPresentacion;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Dimension;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import capaEntidad.*;
import desplazable.Desface;

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
        PanelMenu = new javax.swing.JPanel();
        lblLogoSena = new javax.swing.JLabel();
        lblNomSoftware = new javax.swing.JLabel();
        lblUsuarios = new javax.swing.JLabel();
        lblTextUsr = new javax.swing.JLabel();
        lblMantenedor = new javax.swing.JLabel();
        lblTextMant = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        lblTextClient = new javax.swing.JLabel();
        lblProveedores = new javax.swing.JLabel();
        lblTextProveed = new javax.swing.JLabel();
        lblCompras = new javax.swing.JLabel();
        lblTextCompras = new javax.swing.JLabel();
        lblReportes = new javax.swing.JLabel();
        lblTextReportes = new javax.swing.JLabel();
        lblAcercaDe = new javax.swing.JLabel();
        lblTextAcercaDe = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        ButonMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        PanelMenu.setBackground(new java.awt.Color(43, 41, 54));

        lblLogoSena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/logoSena 1.png"))); // NOI18N

        lblNomSoftware.setFont(new java.awt.Font("Anja Eliane", 0, 18)); // NOI18N
        lblNomSoftware.setForeground(new java.awt.Color(169, 169, 169));
        lblNomSoftware.setText("ROULETTE POS");

        lblUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/usuario 1.png"))); // NOI18N

        lblTextUsr.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        lblTextUsr.setForeground(new java.awt.Color(153, 153, 153));
        lblTextUsr.setText("Usuario");

        lblMantenedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/mantenedor.png"))); // NOI18N

        lblTextMant.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        lblTextMant.setForeground(new java.awt.Color(153, 153, 153));
        lblTextMant.setText("Mantenedor");

        lblClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/clientes.png"))); // NOI18N

        lblTextClient.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        lblTextClient.setForeground(new java.awt.Color(153, 153, 153));
        lblTextClient.setText("Clientes");

        lblProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/proveedor.png"))); // NOI18N

        lblTextProveed.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        lblTextProveed.setForeground(new java.awt.Color(153, 153, 153));
        lblTextProveed.setText("Proveedores");

        lblCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/compras.png"))); // NOI18N

        lblTextCompras.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        lblTextCompras.setForeground(new java.awt.Color(153, 153, 153));
        lblTextCompras.setText("Compras");

        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/reporte.png"))); // NOI18N

        lblTextReportes.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        lblTextReportes.setForeground(new java.awt.Color(153, 153, 153));
        lblTextReportes.setText("Reportes");

        lblAcercaDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/Acerca de.png"))); // NOI18N

        lblTextAcercaDe.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        lblTextAcercaDe.setForeground(new java.awt.Color(153, 153, 153));
        lblTextAcercaDe.setText("Acerca de");

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

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                .addGap(0, 102, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addComponent(lblMantenedor)
                        .addGap(18, 18, 18)
                        .addComponent(lblTextMant))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addComponent(lblUsuarios)
                        .addGap(18, 18, 18)
                        .addComponent(lblTextUsr))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addComponent(lblClientes)
                        .addGap(18, 18, 18)
                        .addComponent(lblTextClient))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addComponent(lblProveedores)
                        .addGap(18, 18, 18)
                        .addComponent(lblTextProveed))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addComponent(lblCompras)
                        .addGap(18, 18, 18)
                        .addComponent(lblTextCompras))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addComponent(lblReportes)
                        .addGap(18, 18, 18)
                        .addComponent(lblTextReportes))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addComponent(lblAcercaDe)
                        .addGap(17, 17, 17)
                        .addComponent(lblTextAcercaDe))))
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblLogoSena)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblNomSoftware)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButonMenu)
                        .addContainerGap())))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGap(408, 408, 408)
                        .addComponent(lblCompras))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogoSena)
                            .addComponent(ButonMenu))
                        .addGap(43, 43, 43)
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuarios)
                            .addGroup(PanelMenuLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblTextUsr)))
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelMenuLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblMantenedor))
                            .addGroup(PanelMenuLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(lblTextMant)))
                        .addGap(3, 3, 3)
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelMenuLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(lblClientes))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                                .addComponent(lblTextClient)
                                .addGap(6, 6, 6)))
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelMenuLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblProveedores))
                            .addGroup(PanelMenuLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(lblTextProveed)
                                .addGap(40, 40, 40)
                                .addComponent(lblTextCompras))))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblNomSoftware)))
                .addGap(35, 35, 35)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReportes)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuLayout.createSequentialGroup()
                        .addComponent(lblTextReportes)
                        .addGap(7, 7, 7)))
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblAcercaDe))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblTextAcercaDe)))
                .addGap(53, 53, 53)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pnlFondo.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
      if (PanelMenu.getX() == 0) { 
        // Desplazar hacia la izquierda
        desface.desplazarIzquierda(PanelMenu, PanelMenu.getX(), -170, 10, 10);
    } else if (PanelMenu.getX() == -170) { 
        // Desplazar hacia la derecha
        desface.desplazarDerecha(PanelMenu, PanelMenu.getX(), 0, 10, 10);
    }
    }//GEN-LAST:event_ButonMenuActionPerformed

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
    public javax.swing.JButton ButonMenu;
    private javax.swing.JPanel PanelMenu;
    public javax.swing.JButton btnSalir;
    public javax.swing.JLabel lblAcercaDe;
    public javax.swing.JLabel lblClientes;
    public javax.swing.JLabel lblCompras;
    private javax.swing.JLabel lblIdntUsr;
    public javax.swing.JLabel lblLogoSena;
    private javax.swing.JLabel lblLogoSpackBit;
    public javax.swing.JLabel lblMantenedor;
    public javax.swing.JLabel lblNomSoftware;
    private javax.swing.JLabel lblNomUsr;
    public javax.swing.JLabel lblProveedores;
    public javax.swing.JLabel lblReportes;
    public javax.swing.JLabel lblTextAcercaDe;
    public javax.swing.JLabel lblTextClient;
    public javax.swing.JLabel lblTextCompras;
    public javax.swing.JLabel lblTextMant;
    public javax.swing.JLabel lblTextProveed;
    public javax.swing.JLabel lblTextReportes;
    public javax.swing.JLabel lblTextUsr;
    public javax.swing.JLabel lblUsuarios;
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables

}
