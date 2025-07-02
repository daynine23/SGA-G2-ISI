package model.RegistroAsesorados.Repository;

import model.RegistroAsesorados.Entity.FichaConsolidada;

import java.util.List;
public interface IFichaConsolidadaRepository {
    void guardar(FichaConsolidada ficha);
    FichaConsolidada buscarPorId(Long idFicha);
    List<FichaConsolidada> buscarPorDocente(Long idDocente);
}