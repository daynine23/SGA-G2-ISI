package model.RegistroAsesorados.Entity;

import java.util.Date;

public class FichaConsolidada {

    private Long fichald;
    private String tituloProyecto;
    private Date fechaInicio;
    private Integer avance;
    private String estado;

    public FichaConsolidada(Long fichald, String tituloProyecto, Date fechaInicio, Integer avance, String estado) {
        this.fichald = fichald;
        this.tituloProyecto = tituloProyecto;
        this.fechaInicio = fechaInicio;
        this.avance = avance;
        this.estado = estado;
    }

    public Long getFichald() {return fichald;}

    public void setFichald(Long fichald) {this.fichald = fichald;}

    public String getTituloProyecto() {return tituloProyecto;}

    public void setTituloProyecto(String tituloProyecto) {this.tituloProyecto = tituloProyecto;}

    public Date getFechaInicio() {return fechaInicio;}

    public void setFechaInicio(Date fechaInicio) {this.fechaInicio = fechaInicio;}

    public Integer getAvance() {return avance;}

    public void setAvance(Integer avance) {this.avance = avance;}

    public String getEstado() {return estado;}

    public void setEstado(String estado) {this.estado = estado;}
}