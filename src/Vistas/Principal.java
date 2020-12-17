package Vistas;

import Modelo.Usuario;

public class Principal extends javax.swing.JFrame {

    Usuario mod;

    public Principal() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public Principal(Usuario mod) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.mod = mod;
        if ("Administrador".equals(mod.getPerfil())){
        
    }  else if ("Vendedor".equals(mod.getPerfil())) {
         menu1.setVisible(false);
        menu5.setVisible(false);
    }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        AdmUsuario = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        IngresoProduc = new javax.swing.JMenuItem();
        menu3 = new javax.swing.JMenu();
        RealizarCons = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        GenerarVent = new javax.swing.JMenuItem();
        menu5 = new javax.swing.JMenu();
        ReportsVentas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1101, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );

        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        menu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/im1.png"))); // NOI18N
        menu1.setText("Usuarios");

        AdmUsuario.setText("Adm Usuarios");
        AdmUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmUsuarioActionPerformed(evt);
            }
        });
        menu1.add(AdmUsuario);

        jMenuBar1.add(menu1);

        menu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i4.png"))); // NOI18N
        menu2.setText("Productos");

        IngresoProduc.setText("Ingreso de productos");
        IngresoProduc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoProducActionPerformed(evt);
            }
        });
        menu2.add(IngresoProduc);

        jMenuBar1.add(menu2);

        menu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i2.png"))); // NOI18N
        menu3.setText("Consultas");

        RealizarCons.setText("Realizar consultas");
        RealizarCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarConsActionPerformed(evt);
            }
        });
        menu3.add(RealizarCons);

        jMenuBar1.add(menu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i5.png"))); // NOI18N
        jMenu1.setText("Ventas");

        GenerarVent.setText("Generar venta");
        GenerarVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarVentActionPerformed(evt);
            }
        });
        jMenu1.add(GenerarVent);

        jMenuBar1.add(jMenu1);

        menu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/i3.png"))); // NOI18N
        menu5.setText("Reportes");

        ReportsVentas.setText("Reportes de ventas");
        ReportsVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportsVentasActionPerformed(evt);
            }
        });
        menu5.add(ReportsVentas);

        jMenuItem1.setText("Reportes por usuario");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu5.add(jMenuItem1);

        jMenuBar1.add(menu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresoProducActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoProducActionPerformed
        Producto p = new Producto();
        escritorio.add(p);
        p.setVisible(true);

    }//GEN-LAST:event_IngresoProducActionPerformed

    private void AdmUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmUsuarioActionPerformed
        UsuarioV u = new UsuarioV();
        escritorio.add(u);
        u.setVisible(true);
    }//GEN-LAST:event_AdmUsuarioActionPerformed

    private void RealizarConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarConsActionPerformed
        Consulta c = new Consulta();
        escritorio.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_RealizarConsActionPerformed

    private void GenerarVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarVentActionPerformed
        Venta cf = new Venta();
        escritorio.add(cf);
        cf.setVisible(true);
    }//GEN-LAST:event_GenerarVentActionPerformed

    private void ReportsVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportsVentasActionPerformed
        ReportMes rp = new ReportMes();
        escritorio.add(rp);
        rp.setVisible(true);
    }//GEN-LAST:event_ReportsVentasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ReportCuenta rc = new ReportCuenta();
        escritorio.add(rc);
        rc.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AdmUsuario;
    private javax.swing.JMenuItem GenerarVent;
    private javax.swing.JMenuItem IngresoProduc;
    private javax.swing.JMenuItem RealizarCons;
    private javax.swing.JMenuItem ReportsVentas;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenu menu3;
    private javax.swing.JMenu menu5;
    // End of variables declaration//GEN-END:variables

}
