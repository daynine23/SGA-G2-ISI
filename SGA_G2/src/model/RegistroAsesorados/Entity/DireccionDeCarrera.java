package model.RegistroAsesorados.Entity;

public class DireccionDeCarrera {

    private Long direccionCarrerald;
    private String nombreResponsable;

    public DireccionDeCarrera(Long direccionCarrerald, String nombreResponsable) {
        this.direccionCarrerald = direccionCarrerald;
        this.nombreResponsable = nombreResponsable;
    }

    public Long getDireccionCarrerald() {return direccionCarrerald;}

    public void setDireccionCarrerald(Long direccionCarrerald) {this.direccionCarrerald = direccionCarrerald;}

    public String getNombreResponsable() {return nombreResponsable;}

    public void setNombreResponsable(String nombreResponsable) {this.nombreResponsable = nombreResponsable;}
}