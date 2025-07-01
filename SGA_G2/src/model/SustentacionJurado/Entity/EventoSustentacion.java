package model.SustentacionJurado.Entity;

import java.time.LocalTime;
import java.util.Date;

public class EventoSustentacion {

    private Long idEvento;
    private Date fechaProgramada;
    private LocalTime horaProgramada;
    private String enlaceVirtual;
    private String estadoEvento;
    private Date fechaDesignacionJurados;
    private String nombreJuradoPresidente;
    private String nombreJuradoVocal;
    private String nombreJuradoSecretario;

    public EventoSustentacion(Long idEvento, Date fechaProgramada, LocalTime horaProgramada, String enlaceVirtual, String estadoEvento, Date fechaDesignacionJurados, String nombreJuradoPresidente, String nombreJuradoVocal, String nombreJuradoSecretario) {
        this.idEvento = idEvento;
        this.fechaProgramada = fechaProgramada;
        this.horaProgramada = horaProgramada;
        this.enlaceVirtual = enlaceVirtual;
        this.estadoEvento = estadoEvento;
        this.fechaDesignacionJurados = fechaDesignacionJurados;
        this.nombreJuradoPresidente = nombreJuradoPresidente;
        this.nombreJuradoVocal = nombreJuradoVocal;
        this.nombreJuradoSecretario = nombreJuradoSecretario;
    }

    public Long getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }

    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    public void setFechaProgramada(Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public LocalTime getHoraProgramada() {
        return horaProgramada;
    }

    public void setHoraProgramada(LocalTime horaProgramada) {
        this.horaProgramada = horaProgramada;
    }

    public String getEnlaceVirtual() {
        return enlaceVirtual;
    }

    public void setEnlaceVirtual(String enlaceVirtual) {
        this.enlaceVirtual = enlaceVirtual;
    }

    public String getEstadoEvento() {
        return estadoEvento;
    }

    public void setEstadoEvento(String estadoEvento) {
        this.estadoEvento = estadoEvento;
    }

    public Date getFechaDesignacionJurados() {
        return fechaDesignacionJurados;
    }

    public void setFechaDesignacionJurados(Date fechaDesignacionJurados) {
        this.fechaDesignacionJurados = fechaDesignacionJurados;
    }

    public String getNombreJuradoPresidente() {
        return nombreJuradoPresidente;
    }

    public void setNombreJuradoPresidente(String nombreJuradoPresidente) {
        this.nombreJuradoPresidente = nombreJuradoPresidente;
    }

    public String getNombreJuradoVocal() {
        return nombreJuradoVocal;
    }

    public void setNombreJuradoVocal(String nombreJuradoVocal) {
        this.nombreJuradoVocal = nombreJuradoVocal;
    }

    public String getNombreJuradoSecretario() {
        return nombreJuradoSecretario;
    }

    public void setNombreJuradoSecretario(String nombreJuradoSecretario) {
        this.nombreJuradoSecretario = nombreJuradoSecretario;
    }
}
