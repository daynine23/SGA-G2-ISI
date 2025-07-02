package model.SustentacionJurado.Repository;

import model.SustentacionJurado.Entity.EventoSustentacion;

public interface IEventoSustentacionRepository {
    EventoSustentacion buscarPorId(Long idEvento);
    void guardar(EventoSustentacion evento);
}