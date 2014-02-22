/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session5ireport;

import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author Gabriel
 */
public class Session5iReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        List listaJugadores = new ArrayList();
        for (int i = 1; i <= 49; i++) {
            listaJugadores.add(new Jugador(i, "Jugador" + i, "Wii"));
        }
        for (int i = 50; i <= 79; i++) {
            listaJugadores.add(new Jugador(i, "Jugador" + i, "XBox"));
        }
        for (int i = 80; i <= 100; i++) {
            listaJugadores.add(new Jugador(i, "Jugador" + i, "PS3"));
        }
        JasperReport  reporte = (JasperReport)JRLoader.loadObjectFromFile("repoteGrafica.jasper");
        JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, new JRBeanCollectionDataSource(listaJugadores));
        JRExporter exporter = new JRPdfExporter();
        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
        exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reporteGrafica.pdf"));
        exporter.exportReport();
    }
    
}
