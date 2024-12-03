package CapaPresentacion;

import CapaNegocio.*;
import capaEntidad.*;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
        
        Fuentes.Cargar();
        lblNomSoftware.setFont(Fuentes.AnjaEliane);
        lblBienv.setFont(Fuentes.QuicksandSemiBold.deriveFont(22f)); 
        btnIngresar.setFont(Fuentes.QuicksandSemiBold.deriveFont(17f)); 
        lblUsr.setFont(Fuentes.QuicksandMedium.deriveFont(15f));
        txtNomUsr.setFont(Fuentes.QuicksandMedium.deriveFont(13f));
        lblTextoIniSes.setFont(Fuentes.QuicksandMedium.deriveFont(14f));
        
        txtNomUsr.putClientProperty("JComponent.roundRect", true);
        pwfTxtContraseña.putClientProperty("JComponent.roundRect", true);
        btnIngresar.putClientProperty("JButton.buttonType", "roundRect");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        lblLogoSena = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        pwfTxtContraseña = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        lblLogoContr = new javax.swing.JLabel();
        txtNomUsr = new javax.swing.JTextField();
        lblUsr = new javax.swing.JLabel();
        lblLogoUsuario = new javax.swing.JLabel();
        lblTextoIniSes = new javax.swing.JLabel();
        lblSigExclam2 = new javax.swing.JLabel();
        lblBienv = new javax.swing.JLabel();
        lblSigExclam1 = new javax.swing.JLabel();
        lblNomSoftware = new javax.swing.JLabel();
        lblLogoSpackBit = new javax.swing.JLabel();
        lblCarrito = new javax.swing.JLabel();
        lblFondosecu = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(500, 600));
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        pnlFondo.setBackground(new java.awt.Color(43, 41, 54));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogoSena.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoSena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/logoSena.png"))); // NOI18N
        pnlFondo.add(lblLogoSena, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 310, -1));

        btnIngresar.setBackground(new java.awt.Color(255, 103, 25));
        btnIngresar.setFont(new java.awt.Font("Quicksand SemiBold", 1, 17)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorderPainted(false);
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pnlFondo.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 200, 48));

        pwfTxtContraseña.setBackground(new java.awt.Color(64, 57, 74));
        pwfTxtContraseña.setFont(new java.awt.Font("Quicksand Medium", 0, 13)); // NOI18N
        pwfTxtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwfTxtContraseñaActionPerformed(evt);
            }
        });
        pnlFondo.add(pwfTxtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 200, 35));

        lblPassword.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(153, 153, 153));
        lblPassword.setText("Contraseña");
        pnlFondo.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 275, -1, -1));

        lblLogoContr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/llave.png"))); // NOI18N
        pnlFondo.add(lblLogoContr, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 275, -1, -1));

        txtNomUsr.setBackground(new java.awt.Color(64, 57, 74));
        txtNomUsr.setFont(new java.awt.Font("Quicksand Medium", 0, 13)); // NOI18N
        txtNomUsr.setForeground(new java.awt.Color(255, 255, 255));
        pnlFondo.add(txtNomUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 200, 35));

        lblUsr.setFont(new java.awt.Font("Quicksand Medium", 0, 15)); // NOI18N
        lblUsr.setForeground(new java.awt.Color(153, 153, 153));
        lblUsr.setText("Usuario");
        pnlFondo.add(lblUsr, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 185, -1, -1));

        lblLogoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/usuario.png"))); // NOI18N
        pnlFondo.add(lblLogoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 185, -1, -1));

        lblTextoIniSes.setFont(new java.awt.Font("Quicksand", 0, 14)); // NOI18N
        lblTextoIniSes.setForeground(new java.awt.Color(153, 153, 153));
        lblTextoIniSes.setText("Inicie sesion en su cuenta para continuar.");
        pnlFondo.add(lblTextoIniSes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        lblSigExclam2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/Exclam2.png"))); // NOI18N
        pnlFondo.add(lblSigExclam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        lblBienv.setFont(new java.awt.Font("Quicksand SemiBold", 0, 22)); // NOI18N
        lblBienv.setForeground(new java.awt.Color(255, 255, 255));
        lblBienv.setText("Bienvenido");
        pnlFondo.add(lblBienv, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        lblSigExclam1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/Exclam1.png"))); // NOI18N
        pnlFondo.add(lblSigExclam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        lblNomSoftware.setFont(new java.awt.Font("Anja Eliane", 0, 21)); // NOI18N
        lblNomSoftware.setForeground(new java.awt.Color(43, 41, 54));
        lblNomSoftware.setText("ROULETTE POS");
        pnlFondo.add(lblNomSoftware, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        lblLogoSpackBit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/logoSparkBit.png"))); // NOI18N
        pnlFondo.add(lblLogoSpackBit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        lblCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/compra.png"))); // NOI18N
        pnlFondo.add(lblCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        lblFondosecu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/imgGrande.jpg"))); // NOI18N
        pnlFondo.add(lblFondosecu, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/img/cerrar.png"))); // NOI18N
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        pnlFondo.add(lblCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        List<Usuario> TEST = new CnUsuario().Listar();

        Usuario objUsuario = TEST.stream()
            .filter(u -> u.getDocumento().equals(txtNomUsr.getText()) && u.getClave().equals(pwfTxtContraseña.getText()))
            .findFirst()
            .orElse(null);

        if (objUsuario != null) {
           Menu menu = new Menu(objUsuario);
           menu.setVisible(true);
           this.dispose();

        } else {
        JOptionPane.showMessageDialog(this, "No se encontró el usuario", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_formMouseDragged

    private void pwfTxtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwfTxtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwfTxtContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (UnsupportedLookAndFeelException error) {
            System.err.println( "Fallo al inicializar LaF" );
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lblBienv;
    private javax.swing.JLabel lblCarrito;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblFondosecu;
    private javax.swing.JLabel lblLogoContr;
    private javax.swing.JLabel lblLogoSena;
    private javax.swing.JLabel lblLogoSpackBit;
    private javax.swing.JLabel lblLogoUsuario;
    private javax.swing.JLabel lblNomSoftware;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSigExclam1;
    private javax.swing.JLabel lblSigExclam2;
    private javax.swing.JLabel lblTextoIniSes;
    private javax.swing.JLabel lblUsr;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPasswordField pwfTxtContraseña;
    private javax.swing.JTextField txtNomUsr;
    // End of variables declaration//GEN-END:variables
}
