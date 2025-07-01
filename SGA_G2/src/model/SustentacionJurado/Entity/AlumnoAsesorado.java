package model.SustentacionJurado.Entity;

public class AlumnoAsesorado {

    private Long alumnoId;
    private String apeliidos;
    private String nombres;
    private String programa;
    private String correo;

    public AlumnoAsesorado(Long alumnoId, String apeliidos, String nombres, String programa, String correo) {
        this.alumnoId = alumnoId;
        this.apeliidos = apeliidos;
        this.nombres = nombres;
        this.programa = programa;
        this.correo = correo;
    }

    public Long getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(Long alumnoId) {
        this.alumnoId = alumnoId;
    }

    public String getApeliidos() {
        return apeliidos;
    }

    public void setApeliidos(String apeliidos) {
        this.apeliidos = apeliidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
