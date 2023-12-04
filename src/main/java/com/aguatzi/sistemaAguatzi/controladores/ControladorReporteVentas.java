/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aguatzi.sistemaAguatzi.controladores;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


import com.aguatzi.sistemaAguatzi.entidades.CierreCajaLocal;
import com.aguatzi.sistemaAguatzi.entidades.Usuario;
import com.aguatzi.sistemaAguatzi.vista.FrmReporteVentas;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

/**
 *
 * @author mig_2
 */
public class ControladorReporteVentas {
	
	private final FrmReporteVentas frmReporteVentas;
	private final Usuario usuario;
    	private final UnitOfWork unitOfWork;

	private final float PRECIO_GARRAFON_RELLEANDO = 13;
	private final float PRECIO_GARRAFON_NUEVO = 100;
	private final float CAPACIDAD_GARRAFON = 19.5f;
	
	public ControladorReporteVentas(FrmReporteVentas frmReporteVentas, Usuario usuario) {
		this.frmReporteVentas = frmReporteVentas;
		this.usuario = usuario;
		this.frmReporteVentas.agregarGenerarListener(new GenerarListener());
		this.frmReporteVentas.agregarDetalladoListener(new DetalladoListener());
		unitOfWork = new UnitOfWork();
	}

	class GenerarListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			LocalDate fechaInicial=frmReporteVentas.getFechaInicial();
			LocalDate fechaFinal=frmReporteVentas.getFechaFinal();
			if (fechaInicial != null && fechaFinal != null) {
				Date fechaInicialDate = Date.from(fechaInicial.atStartOfDay(ZoneId.systemDefault()).toInstant());
				Date fechaFinalDate = Date.from(fechaFinal.atStartOfDay(ZoneId.systemDefault()).toInstant());
				List<Object[]> resultados=unitOfWork.cclRepository().obtenerSumaDetallesPorFecha(fechaInicialDate, fechaFinalDate);
			    	Object[] resultado = resultados.get(0);
    				long cantidadGarrafonesVendidos = (long) resultado[0];
			        long cantidadGarrafonesPagadosTransferencia = (long) resultado[1];
    				long cantidadGarrafonesNuevos= (long) resultado[2];
    				long cantidadGarrafonesVaciados = (long) resultado[3];
				float totalGarrafonesVendidos = cantidadGarrafonesVendidos*PRECIO_GARRAFON_RELLEANDO;
				float totalGarrafonesNuevos= cantidadGarrafonesNuevos*PRECIO_GARRAFON_NUEVO;
				float totalGarrafonesPagadosTransferencia= cantidadGarrafonesPagadosTransferencia*PRECIO_GARRAFON_RELLEANDO; 
				float totalGarrafonesVaciados =cantidadGarrafonesVaciados*PRECIO_GARRAFON_RELLEANDO;
    				double litrosVendidos = (double) resultado[4];
    				double dineroTotal = (double) resultado[5];
				frmReporteVentas.setCantidadGarrafonesVendidos(Long.toString(cantidadGarrafonesVendidos));
				frmReporteVentas.setCantidadGarrafonesNuevos(Long.toString(cantidadGarrafonesNuevos));
				frmReporteVentas.setCantidadGarrafonesVaciados(Long.toString(cantidadGarrafonesVaciados));
				frmReporteVentas.setCantidadGarrafonesPagadosTransferencia(Long.toString(cantidadGarrafonesPagadosTransferencia));
				frmReporteVentas.setTotalLitrosVendidos(Double.toString(litrosVendidos));
				frmReporteVentas.setTotalGarrafonesVendidos(Float.toString(totalGarrafonesVendidos));
				frmReporteVentas.setTotalGarrafonesNuevos(Float.toString(totalGarrafonesNuevos));
				frmReporteVentas.setTotalGarrafonesPagadosTransferencia(Float.toString(totalGarrafonesPagadosTransferencia));
				frmReporteVentas.setTotalGarrafonesVaciados(Float.toString(totalGarrafonesVaciados));
				frmReporteVentas.setDineroVentaTotal(Double.toString(dineroTotal));
			}
		}
    	}
	
	class DetalladoListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			LocalDate fechaInicial=frmReporteVentas.getFechaInicial();
			LocalDate fechaFinal=frmReporteVentas.getFechaFinal();
			if (fechaInicial != null && fechaFinal != null) {
				Date fechaInicialDate = Date.from(fechaInicial.atStartOfDay(ZoneId.systemDefault()).toInstant());
				Date fechaFinalDate = Date.from(fechaFinal.atStartOfDay(ZoneId.systemDefault()).toInstant());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String fechaInicialStr = sdf.format(fechaInicialDate);
				String fechaFinalStr = sdf.format(fechaFinalDate);
				List<CierreCajaLocal> resultado = unitOfWork.cclRepository().obtnerEnRangoDeFechas(fechaInicialDate, fechaFinalDate);
				String nombreUsuario = System.getProperty("user.name");
				// Definir la ruta del archivo PDF con el nombre de usuario
				String rutaArchivo = "C:\\Users\\" + nombreUsuario + "\\Aguatzi\\reporte"+fechaInicialStr+""+fechaFinalStr+".pdf";
				generarPDF(resultado, rutaArchivo);
			}
		}

    	}

	public void generarPDF(List<CierreCajaLocal> cierres, String rutaArchivo) {
		Document documento = new Document();

		try {
		    // Crear automáticamente la carpeta si no existe
		    File carpeta = new File(rutaArchivo).getParentFile();
		    if (!carpeta.exists()) {
			carpeta.mkdirs();
		    }

		    PdfWriter.getInstance(documento, new FileOutputStream(rutaArchivo));
		    documento.open();

		    // Agregar un encabezado al PDF
		    agregarEncabezado(documento);

		    PdfPTable tabla = new PdfPTable(13); // 13 columnas en tu clase
		    tabla.setWidthPercentage(100); // Hacer que la tabla ocupe el ancho completo del documento

		    // Agregar encabezados de la tabla
		    agregarEncabezadoTabla(tabla);

		    // Agregar datos
		    for (CierreCajaLocal cierre : cierres) {
			agregarFilaTabla(tabla, cierre);
		    }

		    documento.add(tabla);
		    documento.close();

		    // Abrir el PDF después de crearlo
		    abrirPDF(rutaArchivo);

		    System.out.println("PDF generado exitosamente en: " + rutaArchivo);
		} catch (DocumentException e) {
		    e.printStackTrace();
		} catch (Exception e) {
		    e.printStackTrace();
		}
        }

	private void agregarEncabezado(Document documento) throws DocumentException {
		Font fontEncabezado = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, BaseColor.BLACK);

		Paragraph encabezado = new Paragraph("Informe de Cierres de Caja", fontEncabezado);
		encabezado.setAlignment(Element.ALIGN_CENTER);

		documento.add(encabezado);
		documento.add(Chunk.NEWLINE); // Agregar espacio después del encabezado
	}

	
	private void agregarEncabezadoTabla(PdfPTable tabla) {
		String[] encabezados = {"ID", "Lectura Medidor", "Lectura Anterior", "Garrafones Repartidor", "Garrafones Vaciados",
			"Pagados Transferencia", "Garrafones Nuevos Vendidos", "Dinero Caja", "Litros Vendidos",
			"Garrafones Vendidos", "Dinero Total", "Faltante", "Fecha"};

		for (String encabezado : encabezados) {
		    PdfPCell celda = new PdfPCell();
		    celda.setPhrase(new Phrase(encabezado));
		    tabla.addCell(celda);
		}
	}

	private static void abrirPDF(String rutaArchivo) {
		try {
		    File archivoPDF = new File(rutaArchivo);

		    // Verificar si Desktop es compatible y el archivo existe
		    if (Desktop.isDesktopSupported() && archivoPDF.exists()) {
			Desktop.getDesktop().open(archivoPDF);
		    } else {
			System.out.println("No se pudo abrir el archivo PDF.");
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}


	private void agregarFilaTabla(PdfPTable tabla, CierreCajaLocal cierre) {
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

		tabla.addCell(String.valueOf(cierre.getIdCierreCajaLocal()));
		tabla.addCell(String.valueOf(cierre.getLecturaMedidor()));
		tabla.addCell(String.valueOf(cierre.getLecturaAnterior()));
		tabla.addCell(String.valueOf(cierre.getGarrafonesRepartidor()));
		tabla.addCell(String.valueOf(cierre.getGarrafonesVaciados()));
		tabla.addCell(String.valueOf(cierre.getPagadosTransferencia()));
		tabla.addCell(String.valueOf(cierre.getGarrafonesNuevosVendidos()));
		tabla.addCell(String.valueOf(cierre.getDineroCaja()));
		tabla.addCell(String.valueOf(cierre.getLitrosVendidos()));
		tabla.addCell(String.valueOf(cierre.getGarrafonesVendidos()));
		tabla.addCell(String.valueOf(cierre.getDineroTotal()));
		tabla.addCell(String.valueOf(cierre.getFaltante()));
		tabla.addCell(formatoFecha.format(cierre.getFecha()));
	}


}
