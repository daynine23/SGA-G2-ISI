package model.SustentacionJurado.Entity;

public class ResultadoSustentacion {

    private Long idResultado;
    private String veredictoFinal;
    private Integer calificacion;
    private String observacionesDelJurado;

    public ResultadoSustentacion(Long idResultado, String veredictoFinal, Integer calificacion, String observacionesDelJurado) {
        this.idResultado = idResultado;
        this.veredictoFinal = veredictoFinal;
        this.calificacion = calificacion;
        this.observacionesDelJurado = observacionesDelJurado;
    }

    public Long getIdResultado() {
        return idResultado;
    }

    public void setIdResultado(Long idResultado) {
        this.idResultado = idResultado;
    }

    public String getVeredictoFinal() {
        return veredictoFinal;
    }

    public void setVeredictoFinal(String veredictoFinal) {
        this.veredictoFinal = veredictoFinal;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getObservacionesDelJurado() {
        return observacionesDelJurado;
    }

    public void setObservacionesDelJurado(String observacionesDelJurado) {
        this.observacionesDelJurado = observacionesDelJurado;
    }
}
