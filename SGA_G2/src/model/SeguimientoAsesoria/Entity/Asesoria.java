package model.SeguimientoAsesoria.Entity;

import java.util.Date;

public class Asesoria {

    private Long asesoriaId;
    private Date fechaInicio;
    private String estado;

    public Asesoria(Long asesoriaId, Date fechaInicio, String estado) {
        this.asesoriaId = asesoriaId;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
    }

    public Long getAsesoriaId() {return asesoriaId;}

    public void setAsesoriaId(Long asesoriaId) {this.asesoriaId = asesoriaId;}

    public Date getFechaInicio() {return fechaInicio;}

    public void setFechaInicio(Date fechaInicio) {this.fechaInicio = fechaInicio;}

    public String getEstado() {return estado;}

    public void setEstado(String estado) {this.estado = estado;}
}