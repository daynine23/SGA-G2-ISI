package model.SustentacionJurado.Entity;

public class DireccionCarrera {

    private Long direccionCarreraId;
    private String nombreResponsable;

    public DireccionCarrera(Long direccionCarreraId, String nombreResponsable) {
        this.direccionCarreraId = direccionCarreraId;
        this.nombreResponsable = nombreResponsable;
    }

    public Long getDireccionCarreraId() {
        return direccionCarreraId;
    }

    public void setDireccionCarreraId(Long direccionCarreraId) {
        this.direccionCarreraId = direccionCarreraId;
    }

    public String getNombreResponsable() {
        return nombreResponsable;
    }

    public void setNombreResponsable(String nombreResponsable) {
        this.nombreResponsable = nombreResponsable;
    }
}
