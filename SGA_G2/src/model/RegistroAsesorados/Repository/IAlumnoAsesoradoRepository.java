package model.RegistroAsesorados.Repository;

import model.RegistroAsesorados.Entity.AlumnoAsesorado;

public interface IAlumnoAsesoradoRepository {
    AlumnoAsesorado buscarPorCodigo(String codigoAlumno);
    void guardar(AlumnoAsesorado alumno);
}