/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.vista;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;

/**
 *
 * @author Omar Guerrero
 */
public class FrmReporteVentas extends javax.swing.JFrame implements IFrmCierreCajaLocal {

    /**
     * Creates new form FrmCierreCajaLocal
     */
    UIManager UI;

    public FrmReporteVentas() {

        initComponents();
        setTitle("Reporte de ventas");
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
        lblGarrafonesNuevos = new javax.swing.JLabel();
        lblPagadosTranasferencia = new javax.swing.JLabel();
        lblGarrafonesVaciados = new javax.swing.JLabel();
        lblDineroVenta = new javax.swing.JLabel();
        lblGarrafonesVendidos = new javax.swing.JLabel();
        lblLitrosVendidos = new javax.swing.JLabel();
        txtPagadosTrasferencia = new javax.swing.JTextField();
        txtGarrafonesVaciados = new javax.swing.JTextField();
        txtGarrafonesNuevos = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtGarrafonesVaciados1 = new javax.swing.JTextField();
        txtGarrafonesVaciados2 = new javax.swing.JTextField();
        txtGarrafonesVaciados3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reporte de ventas");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGarrafonesNuevos.setBackground(new java.awt.Color(102, 102, 102));
        lblGarrafonesNuevos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGarrafonesNuevos.setForeground(new java.awt.Color(102, 102, 102));
        lblGarrafonesNuevos.setText("Garrafones Nuevos");
        jPanel1.add(lblGarrafonesNuevos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        lblPagadosTranasferencia.setBackground(new java.awt.Color(102, 102, 102));
        lblPagadosTranasferencia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPagadosTranasferencia.setForeground(new java.awt.Color(102, 102, 102));
        lblPagadosTranasferencia.setText("Pagados Por Trasferencia");
        jPanel1.add(lblPagadosTranasferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, -1, -1));

        lblGarrafonesVaciados.setBackground(new java.awt.Color(102, 102, 102));
        lblGarrafonesVaciados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGarrafonesVaciados.setForeground(new java.awt.Color(102, 102, 102));
        lblGarrafonesVaciados.setText("Garrafones Vaciados");
        jPanel1.add(lblGarrafonesVaciados, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        lblDineroVenta.setBackground(new java.awt.Color(102, 102, 102));
        lblDineroVenta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDineroVenta.setForeground(new java.awt.Color(102, 102, 102));
        lblDineroVenta.setText("Dinero Venta Total");
        jPanel1.add(lblDineroVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, -1));

        lblGarrafonesVendidos.setBackground(new java.awt.Color(102, 102, 102));
        lblGarrafonesVendidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGarrafonesVendidos.setForeground(new java.awt.Color(102, 102, 102));
        lblGarrafonesVendidos.setText("Garrafones Vendidos");
        jPanel1.add(lblGarrafonesVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        lblLitrosVendidos.setBackground(new java.awt.Color(102, 102, 102));
        lblLitrosVendidos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLitrosVendidos.setForeground(new java.awt.Color(102, 102, 102));
        lblLitrosVendidos.setText("Litros Vendidos");
        jPanel1.add(lblLitrosVendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, -1, -1));

        txtPagadosTrasferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPagadosTrasferenciaMouseClicked(evt);
            }
        });
        jPanel1.add(txtPagadosTrasferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 90, -1));

        txtGarrafonesVaciados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGarrafonesVaciadosMouseClicked(evt);
            }
        });
        jPanel1.add(txtGarrafonesVaciados, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, 90, -1));

        txtGarrafonesNuevos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGarrafonesNuevosMouseClicked(evt);
            }
        });
        jPanel1.add(txtGarrafonesNuevos, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 90, -1));

        jPanel2.setBackground(new java.awt.Color(58, 138, 236));

        lblBienvenido.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 36)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        lblBienvenido.setText("Reporte de ventas");

        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Usuario");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, Short.MAX_VALUE)
                .addComponent(lblBienvenido)
                .addGap(164, 164, 164))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario)
                            .addComponent(lblBienvenido))))
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 990, 90));

        btnCalcular.setBackground(new java.awt.Color(58, 138, 236));
        btnCalcular.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Generar");
        btnCalcular.setBorder(null);
        btnCalcular.setBorderPainted(false);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 120, 40));

        btnLimpiar.setBackground(new java.awt.Color(58, 138, 236));
        btnLimpiar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 120, 40));

        btnCancelar.setBackground(new java.awt.Color(58, 138, 236));
        btnCancelar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 110, 40));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, 40, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Total");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 320, 40, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 40, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 40, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 130, -1));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("a");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 20, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Seleccione fechas ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("De");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        txtGarrafonesVaciados1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGarrafonesVaciados1MouseClicked(evt);
            }
        });
        jPanel1.add(txtGarrafonesVaciados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 320, 90, -1));

        txtGarrafonesVaciados2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGarrafonesVaciados2MouseClicked(evt);
            }
        });
        jPanel1.add(txtGarrafonesVaciados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 230, 90, -1));

        txtGarrafonesVaciados3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGarrafonesVaciados3MouseClicked(evt);
            }
        });
        jPanel1.add(txtGarrafonesVaciados3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 350, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtGarrafonesVaciadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGarrafonesVaciadosMouseClicked
        quitarBorde(txtGarrafonesVaciados);
    }//GEN-LAST:event_txtGarrafonesVaciadosMouseClicked

    private void txtPagadosTrasferenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPagadosTrasferenciaMouseClicked
        quitarBorde(txtPagadosTrasferencia);
    }//GEN-LAST:event_txtPagadosTrasferenciaMouseClicked

    private void txtGarrafonesNuevosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGarrafonesNuevosMouseClicked
        quitarBorde(txtGarrafonesNuevos);
    }//GEN-LAST:event_txtGarrafonesNuevosMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void txtGarrafonesVaciados1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGarrafonesVaciados1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGarrafonesVaciados1MouseClicked

    private void txtGarrafonesVaciados2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGarrafonesVaciados2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGarrafonesVaciados2MouseClicked

    private void txtGarrafonesVaciados3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGarrafonesVaciados3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGarrafonesVaciados3MouseClicked
    
    public void quitarBorde(JTextField field){
         Border border = BorderFactory.createLineBorder(Color.black);
         field.setBorder(border);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpiar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblDineroVenta;
    private javax.swing.JLabel lblGarrafonesNuevos;
    private javax.swing.JLabel lblGarrafonesVaciados;
    private javax.swing.JLabel lblGarrafonesVendidos;
    private javax.swing.JLabel lblLitrosVendidos;
    private javax.swing.JLabel lblPagadosTranasferencia;
    private javax.swing.JTextField txtGarrafonesNuevos;
    private javax.swing.JTextField txtGarrafonesVaciados;
    private javax.swing.JTextField txtGarrafonesVaciados1;
    private javax.swing.JTextField txtGarrafonesVaciados2;
    private javax.swing.JTextField txtGarrafonesVaciados3;
    private javax.swing.JTextField txtPagadosTrasferencia;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public String getLecturaMedidor() {
        return txtLecturaMedidor.getText();
    }

    @Override
    public String getLecturaAnterior() {
        return txtLecturaAnterior.getText();
    }

    @Override
    public String getGarrafonesRuta() {
        return txtGarrafonesRuta.getText();
    }

    @Override
    public String getGarrafonesVaciados() {
        return txtGarrafonesVaciados.getText();
    }

    @Override
    public String getPagadosTrasferencia() {
        return txtPagadosTrasferencia.getText();
    }

    @Override
    public String getGarrafonesNuevos() {
        return txtGarrafonesNuevos.getText();
    }

    @Override
    public String getDineroCaja() {
        return txtDineroCaja.getText();
    }

    @Override
    public void setLitrosVendidos(String litros) {
        txtLitrosVendidos.setText(litros);
    }

    @Override
    public void setGarrafonesVendidos(String garraafonesVendidos) {
        txtGarrafonesVendidos.setText(garraafonesVendidos);
    }

    @Override
    public void setDineroTotal(String dineroTotal) {
        txtDineroTotal.setText(dineroTotal);
    }

    @Override
    public void setFaltante(String faltante) {
        txtFaltante.setText(faltante);
    }

    @Override
    public void agregarCalcularListener(ActionListener actionListener) {
        btnCalcular.addActionListener(actionListener);
    }

    @Override
    public void agregarLimpiarListener(ActionListener actionListener) {
        btnLimpiar.addActionListener(actionListener);
    }

    @Override
    public void agregarGuardarListener(ActionListener actionListener) {
        btnGuardar.addActionListener(actionListener);
    }

    @Override
    public void agregarCancelarListener(ActionListener actionListener) {
        btnCancelar.addActionListener(actionListener);
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        UI = null;
        UI.put("OptionPane.background", new Color(58, 138, 236));
        UI.put("Panel.background", new Color(58, 138, 236));
        JOptionPane.showMessageDialog(this, "<html><p style = \"color:white \">" + mensaje.replace("\n", "<br>") + "</p></html>", "Aviso", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/gota.png", 40, 40));

    }

    @Override
    public void mostrarMensajeError(String mensajeError) {
        UI = null;
        UI.put("OptionPane.background", new Color(58, 138, 236));
        UI.put("Panel.background", new Color(58, 138, 236));
        JOptionPane.showMessageDialog(this, "<html><p style = \"color:white \">" + mensajeError.replace("\n", "<br>") + "</p></html>", "Error", JOptionPane.PLAIN_MESSAGE, icono("/imagenes/gota.png", 40, 40));
    }

    @Override
    public int mostrarMensajeConfirmacion(String mensaje) {
        UI = null;
        UI.put("OptionPane.background", new Color(58, 138, 236));
        UI.put("Panel.background", new Color(58, 138, 236));
        return JOptionPane.showConfirmDialog(this, "<html><p style = \"color:white; font:12px; \">" + mensaje.replace("\n", "<br>") + "</p></html>", "Mensaje de confirmación", JOptionPane.YES_NO_OPTION, HEIGHT, icono("/imagenes/gota.png", 60, 60));
    }

    @Override
    public void eliminarVentana() {
        this.dispose();
    }

    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, heigth));
        return img;
    }

    private void limpiarCampos() {
        txtLecturaMedidor.setText("");
        txtLecturaAnterior.setText("");
        txtGarrafonesRuta.setText("");
        txtGarrafonesVaciados.setText("");
        txtPagadosTrasferencia.setText("");
        txtGarrafonesNuevos.setText("");
        txtDineroCaja.setText("");
        txtLitrosVendidos.setText("");
        txtGarrafonesVendidos.setText("");
        txtDineroTotal.setText("");
        txtFaltante.setText("");
    }

    private boolean contieneSoloNumeros(String campo) {
        return campo.matches("[0-9]+");
    }

    private boolean CampoVacio(String campo) {
        return campo.isEmpty();
    }

    private void cambiarColor(JTextField textField) {
        if (textField.getText().trim().isEmpty()) {
            Border border = BorderFactory.createLineBorder(Color.red, 2);
            textField.setBorder(border);
        }
        if (!contieneSoloNumeros(textField.getText())) {
            Border border = BorderFactory.createLineBorder(Color.red, 2);
            textField.setBorder(border);
        }
    }
    
    @Override
    public boolean verificarCampos() {
        if (CampoVacio(txtLecturaMedidor.getText()) == true || CampoVacio(txtLecturaAnterior.getText()) == true || CampoVacio(txtGarrafonesRuta.getText()) == true || CampoVacio(txtGarrafonesVaciados.getText()) == true || CampoVacio(txtPagadosTrasferencia.getText()) == true || CampoVacio(txtGarrafonesNuevos.getText()) == true || CampoVacio(txtDineroCaja.getText()) == true) {
            cambiarColor(txtLecturaMedidor);
            cambiarColor(txtLecturaAnterior);
            cambiarColor(txtGarrafonesRuta);
            cambiarColor(txtGarrafonesVaciados);
            cambiarColor(txtPagadosTrasferencia);
            cambiarColor(txtGarrafonesNuevos);
            cambiarColor(txtDineroCaja);
            return false;
        }
        if (contieneSoloNumeros(txtLecturaMedidor.getText()) == false || contieneSoloNumeros(txtLecturaAnterior.getText()) == false || contieneSoloNumeros(txtGarrafonesRuta.getText()) == false || contieneSoloNumeros(txtGarrafonesVaciados.getText()) == false || contieneSoloNumeros(txtPagadosTrasferencia.getText()) == false || contieneSoloNumeros(txtGarrafonesNuevos.getText()) == false || contieneSoloNumeros(txtDineroCaja.getText()) == false) {
            cambiarColor(txtLecturaMedidor);
            
            
            cambiarColor(txtLecturaAnterior);
            cambiarColor(txtGarrafonesRuta);
            cambiarColor(txtGarrafonesVaciados);
            cambiarColor(txtPagadosTrasferencia);
            cambiarColor(txtGarrafonesNuevos);
            cambiarColor(txtDineroCaja);
            return false;

        }

        return true;
    }

    @Override
    public void setGuardable() {
        this.btnCalcular.setEnabled(false);
        this.btnGuardar.setEnabled(true);
        this.txtLecturaMedidor.setEnabled(false);
        this.txtLecturaAnterior.setEnabled(false);
        this.txtGarrafonesRuta.setEnabled(false);
        this.txtGarrafonesVaciados.setEnabled(false);
        this.txtPagadosTrasferencia.setEnabled(false);
        this.txtGarrafonesNuevos.setEnabled(false);
        this.txtDineroCaja.setEnabled(false);
    }

    @Override
    public void setCalculable() {
        this.btnCalcular.setEnabled(true);
        this.btnGuardar.setEnabled(false);
        this.limpiarCampos();
        this.txtLecturaMedidor.setEnabled(true);
        this.txtLecturaAnterior.setEnabled(true);
        this.txtGarrafonesRuta.setEnabled(true);
        this.txtGarrafonesVaciados.setEnabled(true);
        this.txtPagadosTrasferencia.setEnabled(true);
        this.txtGarrafonesNuevos.setEnabled(true);
        this.txtDineroCaja.setEnabled(true);

    }

    @Override
    public void setNombreUsuario(String nombreUsuario) {
        txtUsuario.setText(nombreUsuario);
    }

    @Override
    public String getLitrosVendidos() {
        return txtLitrosVendidos.getText();
    }

    @Override
    public String getGarrafonesVendidos() {
        return txtGarrafonesVendidos.getText();
    }

    @Override
    public String getDineroTotal() {
        return txtDineroTotal.getText();
    }

    @Override
    public String getFaltante() {
        return txtFaltante.getText();
    }

}
