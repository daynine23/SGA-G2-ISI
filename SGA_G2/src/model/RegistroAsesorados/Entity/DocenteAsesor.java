package model.RegistroAsesorados.Entity;

public class DocenteAsesor {

    private Long docenteld;
    private String nombre;
    private String apellido;
    private String especialidad;
    private String dni;

    public DocenteAsesor(Long docenteld, String nombre, String apellido, String especialidad, String dni) {
        this.docenteld = docenteld;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.dni = dni;
    }

    public Long getDocenteld() {return docenteld;}

    public void setDocenteld(Long docenteld) {this.docenteld = docenteld;}

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {this.apellido = apellido;}

    public String getEspecialidad() {return especialidad;}

    public void setEspecialidad(String especialidad) {this.especialidad = especialidad;}

    public String getDni() {return dni;}

    public void setDni(String dni) {this.dni = dni;}
}