package model.RegistroAsesorados.Repository;

import model.RegistroAsesorados.Entity.DocenteAsesor;

public interface IDocenteAsesorRepository {
    DocenteAsesor buscarPorId(Long idDocente);
}