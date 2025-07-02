package model.RegistroAsesorados.Controller;

import model.RegistroAsesorados.Entity.AlumnoAsesorado;
import model.RegistroAsesorados.Entity.FichaConsolidada;

public class CrearFichaAsesoradoController {
    public void crearFichaAsesorado(FichaConsolidada ficha, AlumnoAsesorado alumno){
        FichaConsolidada nuevaFicha = new FichaConsolidada(
                ficha.getFichald(),
                ficha.getTituloProyecto(),
                ficha.getFechaInicio(),
                ficha.getAvance(),
                ficha.getEstado(),
                alumno
        );
    }
}
