package model.SustentacionJurado.Service;

import model.SustentacionJurado.Entity.EventoSustentacion;
import model.SustentacionJurado.Entity.ResultadoSustentacion;

public interface ISustentacion {
    EventoSustentacion consultarEstadoSustentacion(Long idEvento);
    void gestionarProgramacion(EventoSustentacion datosEvento);
    void actualizarVeredicto(Long idEvento, ResultadoSustentacion resultado);
    void cargarActaOficial(Long idEvento, String rutaArchivoPDF);
}