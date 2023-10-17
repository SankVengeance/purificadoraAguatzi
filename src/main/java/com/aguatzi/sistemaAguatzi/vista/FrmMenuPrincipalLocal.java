package com.aguatzi.sistemaAguatzi.vista;

import java.awt.event.ActionListener;

/**
 *
 * @author Omar Guerrero
 */
public class FrmMenuPrincipalLocal extends javax.swing.JFrame implements IFrmMenuPrincipalLocal {

    /**
     * Logger de excepciones
     */
    public FrmMenuPrincipalLocal() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background3 = new javax.swing.JPanel();
        head3 = new javax.swing.JPanel();
        txtBienvenida = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        btnMiHorario = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnCierreCaja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BancoTransacciones");
        setResizable(false);

        background3.setBackground(new java.awt.Color(255, 255, 255));
        background3.setMaximumSize(new java.awt.Dimension(600, 400));
        background3.setMinimumSize(new java.awt.Dimension(600, 400));
        background3.setPreferredSize(new java.awt.Dimension(600, 400));
        background3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head3.setBackground(new java.awt.Color(0, 102, 255));

        txtBienvenida.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        txtBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        txtBienvenida.setText("Bienvenido:");

        lblNombreUsuario.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        lblNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreUsuario.setText("nombreUsuario");

        javax.swing.GroupLayout head3Layout = new javax.swing.GroupLayout(head3);
        head3.setLayout(head3Layout);
        head3Layout.setHorizontalGroup(
            head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreUsuario)
                .addContainerGap(359, Short.MAX_VALUE))
        );
        head3Layout.setVerticalGroup(
            head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(head3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(head3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBienvenida)
                    .addComponent(lblNombreUsuario))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        background3.add(head3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 90));

        btnMiHorario.setBackground(new java.awt.Color(0, 102, 255));
        btnMiHorario.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnMiHorario.setForeground(new java.awt.Color(255, 255, 255));
        btnMiHorario.setText("Mi horario");
        btnMiHorario.setBorder(null);
        btnMiHorario.setBorderPainted(false);
        btnMiHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiHorarioActionPerformed(evt);
            }
        });
        background3.add(btnMiHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 180, 40));

        btnCerrarSesion.setBackground(new java.awt.Color(0, 102, 255));
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
        background3.add(btnCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 180, 40));

        btnCierreCaja.setBackground(new java.awt.Color(0, 102, 255));
        btnCierreCaja.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnCierreCaja.setForeground(new java.awt.Color(255, 255, 255));
        btnCierreCaja.setText("Cierre De Caja");
        btnCierreCaja.setBorder(null);
        btnCierreCaja.setBorderPainted(false);
        btnCierreCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCierreCajaActionPerformed(evt);
            }
        });
        background3.add(btnCierreCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 180, 40));

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


    private void btnMiHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiHorarioActionPerformed
        
    }//GEN-LAST:event_btnMiHorarioActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnCierreCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCierreCajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCierreCajaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background3;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnCierreCaja;
    private javax.swing.JButton btnMiHorario;
    private javax.swing.JPanel head3;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel txtBienvenida;
    // End of variables declaration//GEN-END:variables

    @Override
    public void agregarCierreDeCajaLocalListener(ActionListener actionListener) {
        btnCierreCaja.addActionListener(actionListener);
    }
    
    @Override
    public void agregarMiHorarioListener(ActionListener actionListener) {
        btnMiHorario.addActionListener(actionListener);
    }
    
    @Override
    public void agregarCerrarSesionListener(ActionListener actionListener) {
        btnCerrarSesion.addActionListener(actionListener);
    }
    
}
