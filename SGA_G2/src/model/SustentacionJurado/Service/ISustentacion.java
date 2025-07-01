package model.SustentacionJurado.Service;

import model.SustentacionJurado.Entity.EventoSustentacion;

public interface ISustentacion {

    void obtenerSustentacion(Long id);
    void crearSustentacion(EventoSustentacion evt);
    void editarSustentacion(EventoSustentacion evt);
}
