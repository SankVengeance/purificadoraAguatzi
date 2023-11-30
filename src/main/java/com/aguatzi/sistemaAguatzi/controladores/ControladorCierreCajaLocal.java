/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.controladores;

import com.aguatzi.sistemaAguatzi.entidades.CierreCajaLocal;
import com.aguatzi.sistemaAguatzi.entidades.Empleado;
import com.aguatzi.sistemaAguatzi.entidades.Usuario;
import com.aguatzi.sistemaAguatzi.vista.FrmMenuPrincipalLocal;
import com.aguatzi.sistemaAguatzi.vista.IFrmCierreCajaLocal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 *
 * @author mig_2
 */
public class ControladorCierreCajaLocal {

    private final IFrmCierreCajaLocal frmCierreCajaLocal;
    private final UnitOfWork unitOfWork;
    private final Usuario usuario;
    private final float PRECIO_GARRAFON_RELLEANDO = 13;
    private final float PRECIO_GARRAFON_NUEVO = 100;
    private final float CAPACIDAD_GARRAFON = 19.5f;

    public ControladorCierreCajaLocal(IFrmCierreCajaLocal frmCierreCajaLocal, Usuario usuario) {
        this.frmCierreCajaLocal = frmCierreCajaLocal;
        this.usuario = usuario;
        this.frmCierreCajaLocal.setNombreUsuario(this.usuario.getNombreUsuario());
        this.frmCierreCajaLocal.agregarCalcularListener(new CalcularListener());
        this.frmCierreCajaLocal.agregarLimpiarListener(new LimpiarListener());
        this.frmCierreCajaLocal.agregarGuardarListener(new GuardarListener());
        this.frmCierreCajaLocal.agregarCancelarListener(new CancelarListener());
        this.frmCierreCajaLocal.setCalculable();
        unitOfWork = new UnitOfWork();
    }

    class CalcularListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!frmCierreCajaLocal.verificarCampos()) {
                frmCierreCajaLocal.mostrarMensaje("Datos faltantes o erroneos"+"\nVerifica los campos en rojo");
                return;
            }
            float lecturaMedidor = Float.parseFloat(frmCierreCajaLocal.getLecturaMedidor());
            float lecturaAnterior = Float.parseFloat(frmCierreCajaLocal.getLecturaAnterior());
            int garrafonesRuta = Integer.parseInt(frmCierreCajaLocal.getGarrafonesRuta());
            int garrafonesVaciados = Integer.parseInt(frmCierreCajaLocal.getGarrafonesVaciados());
            int pagosTransferencia = Integer.parseInt(frmCierreCajaLocal.getPagadosTrasferencia());
            int garrafonesNuevos = Integer.parseInt(frmCierreCajaLocal.getGarrafonesNuevos());
            float dineroCaja = Float.parseFloat(frmCierreCajaLocal.getDineroCaja());
            float litrosVendidos = lecturaAnterior - lecturaMedidor - garrafonesVaciados * CAPACIDAD_GARRAFON;
            frmCierreCajaLocal.setLitrosVendidos(String.valueOf(litrosVendidos));
            float garrafonesVendidos = litrosVendidos / CAPACIDAD_GARRAFON - garrafonesRuta;
            int garrafonesVendidosRedondeado = (int) garrafonesVendidos;
            frmCierreCajaLocal.setGarrafonesVendidos(String.valueOf(garrafonesVendidosRedondeado));
            float dineroTotal = garrafonesVendidos * PRECIO_GARRAFON_RELLEANDO + garrafonesNuevos * PRECIO_GARRAFON_NUEVO - pagosTransferencia * PRECIO_GARRAFON_RELLEANDO;
            frmCierreCajaLocal.setDineroTotal(String.valueOf(dineroTotal));
            float dineroFaltante = dineroTotal - dineroCaja;
            frmCierreCajaLocal.setFaltante(String.valueOf(dineroFaltante));
            frmCierreCajaLocal.setGuardable();
        }
    }

    class LimpiarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frmCierreCajaLocal.setCalculable();
        }
    }

    class GuardarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!frmCierreCajaLocal.verificarCampos()) {
                frmCierreCajaLocal.mostrarMensajeError("Datos invalidos!");
                return;
            }
            float lecturaMedidor = Float.parseFloat(frmCierreCajaLocal.getLecturaMedidor());
            float lecturaAnterior = Float.parseFloat(frmCierreCajaLocal.getLecturaAnterior());
            int garrafonesRuta = Integer.parseInt(frmCierreCajaLocal.getGarrafonesRuta());
            int garrafonesVaciados = Integer.parseInt(frmCierreCajaLocal.getGarrafonesVaciados());
            int pagosTransferencia = Integer.parseInt(frmCierreCajaLocal.getPagadosTrasferencia());
            int garrafonesNuevos = Integer.parseInt(frmCierreCajaLocal.getGarrafonesNuevos());
            float dineroCaja = Float.parseFloat(frmCierreCajaLocal.getDineroCaja());
            float litrosVendidos = lecturaAnterior - lecturaMedidor - garrafonesVaciados * CAPACIDAD_GARRAFON;
            float garrafonesVendidos = litrosVendidos / CAPACIDAD_GARRAFON - garrafonesRuta;
            int garrafonesVendidosRedondeado = (int) garrafonesVendidos;
            float dineroTotal = garrafonesVendidos * PRECIO_GARRAFON_RELLEANDO + garrafonesNuevos * PRECIO_GARRAFON_NUEVO - pagosTransferencia * PRECIO_GARRAFON_RELLEANDO;
            float dineroFaltante = dineroTotal - dineroCaja;
            Empleado empleado = unitOfWork.empleadosRepository().obtenerPorUsuario(usuario);
            int respuesta = frmCierreCajaLocal.mostrarMensajeConfirmacion("Resumen de cierre de caja" + "\nLitros vendidos: " + frmCierreCajaLocal.getLitrosVendidos() + "\nGarrafones vendidos: " + frmCierreCajaLocal.getGarrafonesVendidos() + "\nDinero en caja: " + frmCierreCajaLocal.getDineroCaja() + "\nDinero venta total:" + frmCierreCajaLocal.getDineroTotal() + "\nFaltante: " + frmCierreCajaLocal.getFaltante() + "\n¿Seguro que desea guardar el cierre de caja actual?"
            );
            if (respuesta != 0) {
                return;
            }
            if (empleado == null) {
                frmCierreCajaLocal.mostrarMensajeError("El usuario actual no puede realizar este cierre de caja, no se como terminaste aqui :/");
                return;
            }
	    Date fecha = new Date();
            CierreCajaLocal cierreCajaLocal = new CierreCajaLocal(lecturaMedidor, lecturaAnterior, garrafonesRuta, garrafonesVaciados, pagosTransferencia, garrafonesNuevos, dineroCaja, litrosVendidos, garrafonesVendidosRedondeado, dineroTotal, dineroFaltante,fecha, empleado);
            unitOfWork.cclRepository().agregar(cierreCajaLocal);
            frmCierreCajaLocal.mostrarMensaje("¡Cierre de caja realizado con éxito!");
            frmCierreCajaLocal.setCalculable();
        }
    }

    class CancelarListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int respuesta = frmCierreCajaLocal.mostrarMensajeConfirmacion("¿Seguro que desea cancelar el cierre de caja?");
            if (respuesta != 0) {
                return;
            }
            frmCierreCajaLocal.eliminarVentana();
            String tipoUsuario = usuario.getTipoUsuario();
            switch (tipoUsuario) {
                case "local":
                    FrmMenuPrincipalLocal frmMenuPrincipalLocal = new FrmMenuPrincipalLocal();
                    ControladorMenuPrincipalLocal controladorMenuPrincipalLocal = new ControladorMenuPrincipalLocal(frmMenuPrincipalLocal, usuario);
                    frmMenuPrincipalLocal.setVisible(true);
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
