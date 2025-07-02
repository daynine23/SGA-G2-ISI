package model.SeguimientoAsesoria.Entity;

import java.util.Date;

public class ReporteAvance {

    private Long reporteAvanceId;
    private Date fechaEnvio; // Podríamos llamarlo fechaGeneracion para ser más precisos
    private String estado;
    private String comentarios;

    public ReporteAvance(Long reporteAvanceId, Date fechaEnvio, String estado, String comentarios) {
        this.reporteAvanceId = reporteAvanceId;
        this.fechaEnvio = fechaEnvio;
        this.estado = estado;
        this.comentarios = comentarios;
    }

    public Long getReporteAvanceId() {return reporteAvanceId;}

    public void setReporteAvanceId(Long reporteAvanceId) {this.reporteAvanceId = reporteAvanceId;}

    public Date getFechaEnvio() {return fechaEnvio;}

    public void setFechaEnvio(Date fechaEnvio) {this.fechaEnvio = fechaEnvio;}

    public String getEstado() {return estado;}

    public void setEstado(String estado) {this.estado = estado;}

    public String getComentarios() {return comentarios;}

    public void setComentarios(String comentarios) {this.comentarios = comentarios;}
}