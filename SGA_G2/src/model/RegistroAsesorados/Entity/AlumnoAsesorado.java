package model.RegistroAsesorados.Entity;

import java.util.Date;

public class AlumnoAsesorado {

    private Long alumnold;
    private String nombres;
    private String apellidos;
    private String correo;
    private String dni;
    private Date fechaNacimiento;
    private String codigoAlumno;
    private String programa;

    public AlumnoAsesorado(Long alumnold, String nombres, String apellidos, String correo, String dni, Date fechaNacimiento, String codigoAlumno, String programa) {
        this.alumnold = alumnold;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.codigoAlumno = codigoAlumno;
        this.programa = programa;
    }

    public Long getAlumnold() {return alumnold;}

    public void setAlumnold(Long alumnold) {this.alumnold = alumnold;}

    public String getNombres() {return nombres;}

    public void setNombres(String nombres) {this.nombres = nombres;}

    public String getApellidos() {return apellidos;}

    public void setApellidos(String apellidos) {this.apellidos = apellidos;}

    public String getCorreo() {return correo;}

    public void setCorreo(String correo) {this.correo = correo;}

    public String getDni() {return dni;}

    public void setDni(String dni) {this.dni = dni;}

    public Date getFechaNacimiento() {return fechaNacimiento;}

    public void setFechaNacimiento(Date fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}

    public String getCodigoAlumno() {return codigoAlumno;}

    public void setCodigoAlumno(String codigoAlumno) {this.codigoAlumno = codigoAlumno;}

    public String getPrograma() {return programa;}

    public void setPrograma(String programa) {this.programa = programa;}

    @Override
    public String toString() {
        return "AlumnoAsesorado{" +
                "alumnold=" + alumnold +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", correo='" + correo + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", codigoAlumno='" + codigoAlumno + '\'' +
                ", programa='" + programa + '\'' +
                '}';
    }
}