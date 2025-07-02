package model.RegistroAsesorados.Repository;

import model.RegistroAsesorados.Entity.DireccionDeCarrera;

public interface IDireccionDeCarreraRepository {
    DireccionDeCarrera buscarPorId(Long idDireccion);
}