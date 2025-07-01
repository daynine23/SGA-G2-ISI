package model.SustentacionJurado.Entity;

import java.util.Date;

public class ActaSustentacion {

    private Long idActa;
    private String nombreArchivo;
    private String enlaceDocumentoPDF;
    private Date fechaDeCarga;

    public ActaSustentacion(Long idActa, String nombreArchivo, String enlaceDocumentoPDF, Date fechaDeCarga) {
        this.idActa = idActa;
        this.nombreArchivo = nombreArchivo;
        this.enlaceDocumentoPDF = enlaceDocumentoPDF;
        this.fechaDeCarga = fechaDeCarga;
    }

    public Long getIdActa() {
        return idActa;
    }

    public void setIdActa(Long idActa) {
        this.idActa = idActa;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getEnlaceDocumentoPDF() {
        return enlaceDocumentoPDF;
    }

    public void setEnlaceDocumentoPDF(String enlaceDocumentoPDF) {
        this.enlaceDocumentoPDF = enlaceDocumentoPDF;
    }

    public Date getFechaDeCarga() {
        return fechaDeCarga;
    }

    public void setFechaDeCarga(Date fechaDeCarga) {
        this.fechaDeCarga = fechaDeCarga;
    }
}
