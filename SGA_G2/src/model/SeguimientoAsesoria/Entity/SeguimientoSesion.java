package model.SeguimientoAsesoria.Entity;

import java.util.Date;

public class SeguimientoSesion {

    private Long seguimientoSesionId;
    private Date fecha;
    private String temaTratado;

    public SeguimientoSesion(Long seguimientoSesionId, Date fecha, String temaTratado) {
        this.seguimientoSesionId = seguimientoSesionId;
        this.fecha = fecha;
        this.temaTratado = temaTratado;
    }

    public Long getSeguimientoSesionId() {return seguimientoSesionId;}

    public void setSeguimientoSesionId(Long seguimientoSesionId) {this.seguimientoSesionId = seguimientoSesionId;}

    public Date getFecha() {return fecha;}

    public void setFecha(Date fecha) {this.fecha = fecha;}

    public String getTemaTratado() {return temaTratado;}

    public void setTemaTratado(String temaTratado) {this.temaTratado = temaTratado;}

    @Override
    public String toString() {
        return "SeguimientoSesion{" +
                "seguimientoSesionId=" + seguimientoSesionId +
                ", fecha=" + fecha +
                ", temaTratado='" + temaTratado + '\'' +
                '}';
    }
}