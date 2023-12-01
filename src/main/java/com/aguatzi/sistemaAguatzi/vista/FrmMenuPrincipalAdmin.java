package com.aguatzi.sistemaAguatzi.vista;

import java.awt.event.ActionListener;

/**
 *
 * @author Omar Guerrero
 */
public class FrmMenuPrincipalAdmin extends javax.swing.JFrame implements IFrmMenuPrincipalAdmin {

    /**
     * Logger de excepciones
     */
    public FrmMenuPrincipalAdmin() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background3 = new javax.swing.JPanel();
        head3 = new javax.swing.JPanel();
        txtBienvenida = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JLabel();
        btnEmpleado = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnHorarios = new javax.swing.JButton();
        btnPrecios = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Purificadora Aguatzi");
        setResizable(false);

        background3.setBackground(new java.awt.Color(255, 255, 255));
        background3.setMaximumSize(new java.awt.Dimension(600, 400));
        background3.setMinimumSize(new java.awt.Dimension(600, 400));
        background3.setPreferredSize(new java.awt.Dimension(600, 400));
        background3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head3.setBackground(new java.awt.Color(58, 138, 236));

        txtBienvenida.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        txtBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        txtBienvenida.setText("Bienvenido:");

        txtNombreUsuario.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreUsuario.setText("nombreUsuario");

        javax.swing.GroupLayout head3Layout = new javax.swing.GroupLayout(head3);
        head3.setLayout(head3Layout);
        head3Layout.setHorizontalGroup(
            head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreUsuario)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        head3Layout.setVerticalGroup(
            head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBienvenida)
                    .addComponent(txtNombreUsuario))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        background3.add(head3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 90));

        btnEmpleado.setBackground(new java.awt.Color(58, 138, 236));
        btnEmpleado.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleado.setText("Registrar empleado");
        btnEmpleado.setBorder(null);
        btnEmpleado.setBorderPainted(false);
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });
        background3.add(btnEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 180, 40));

        btnCerrarSesion.setBackground(new java.awt.Color(58, 138, 236));
        btnCerrarSesion.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarSesion.setText("Cerrar Sesión");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        background3.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 180, 40));

        btnHorarios.setBackground(new java.awt.Color(58, 138, 236));
        btnHorarios.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnHorarios.setForeground(new java.awt.Color(255, 255, 255));
        btnHorarios.setText("Crear horarios");
        btnHorarios.setBorder(null);
        btnHorarios.setBorderPainted(false);
        btnHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorariosActionPerformed(evt);
            }
        });
        background3.add(btnHorarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 180, 40));

        btnPrecios.setBackground(new java.awt.Color(58, 138, 236));
        btnPrecios.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnPrecios.setForeground(new java.awt.Color(255, 255, 255));
        btnPrecios.setText("Cambiar precios");
        btnPrecios.setBorder(null);
        btnPrecios.setBorderPainted(false);
        btnPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreciosActionPerformed(evt);
            }
        });
        background3.add(btnPrecios, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 180, 40));

        btnReportes.setBackground(new java.awt.Color(58, 138, 236));
        btnReportes.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("Reportes de ventas");
        btnReportes.setBorder(null);
        btnReportes.setBorderPainted(false);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        background3.add(btnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background3, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(background3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed

    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed

    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHorariosActionPerformed

    private void btnPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreciosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPreciosActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background3;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnEmpleado;
    private javax.swing.JButton btnHorarios;
    private javax.swing.JButton btnPrecios;
    private javax.swing.JButton btnReportes;
    private javax.swing.JPanel head3;
    private javax.swing.JLabel txtBienvenida;
    private javax.swing.JLabel txtNombreUsuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void agregarReporteVentas(ActionListener actionListener) {
        btnReportes.addActionListener(actionListener);
    }

    @Override
    public void agregarCrearHorarios(ActionListener actionListener) {
        btnHorarios.addActionListener(actionListener);
    }

    @Override
    public void agregarRegistrarEmpleado(ActionListener actionListener) {
        btnEmpleado.addActionListener(actionListener);
    }

    @Override
    public void agregarCambiarPrecios(ActionListener actionListener) {
        btnPrecios.addActionListener(actionListener);
    }

    @Override
    public void agregarCerrarSesionListener(ActionListener actionListener) {
        btnCerrarSesion.addActionListener(actionListener);
    }

    @Override
    public void setNombreUsuario(String nombreUsuario) {
        txtNombreUsuario.setText(nombreUsuario);
    }

    @Override
    public void eliminarVentana() {
        this.dispose();
    }

}
