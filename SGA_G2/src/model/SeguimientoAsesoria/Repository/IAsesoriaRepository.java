package model.SeguimientoAsesoria.Repository;

import model.SeguimientoAsesoria.Entity.Asesoria;

public interface IAsesoriaRepository {
    Asesoria buscarPorId(Long id);
    void guardar(Asesoria asesoria);
}