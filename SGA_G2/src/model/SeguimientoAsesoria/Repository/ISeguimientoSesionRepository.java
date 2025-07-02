package model.SeguimientoAsesoria.Repository;

import model.SeguimientoAsesoria.Entity.SeguimientoSesion;
import java.util.List;

public interface ISeguimientoSesionRepository {
    void guardar(SeguimientoSesion sesion);
    List<SeguimientoSesion> buscarPorIdAsesoria(Long idAsesoria);
}