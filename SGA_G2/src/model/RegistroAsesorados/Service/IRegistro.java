package model.RegistroAsesorados.Service;

import model.RegistroAsesorados.Entity.FichaConsolidada;
import java.util.List;

public interface IRegistro {
    List<FichaConsolidada> consultarFichasPorDocente(Long idDocente);
    FichaConsolidada verDetalleFicha(Long idFicha);
    void crearFicha(FichaConsolidada nuevaFicha);
    void modificarFicha(FichaConsolidada fichaModificada);
}