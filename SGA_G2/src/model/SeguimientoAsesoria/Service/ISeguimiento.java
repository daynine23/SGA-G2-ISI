package model.SeguimientoAsesoria.Service;

import model.SeguimientoAsesoria.Entity.Asesoria;
import model.SeguimientoAsesoria.Entity.ReporteAvance;
import model.SeguimientoAsesoria.Entity.SeguimientoSesion;
import java.util.List;

public interface ISeguimiento {
    Asesoria consultarHistorial(Long idAsesoria);
    void registrarNuevaSesion(Long idAsesoria, SeguimientoSesion nuevaSesion);
    ReporteAvance generarReporteParaDescarga(Long idAsesoria, String comentariosDocente);
}