package model.RegistroAsesorados.Controller;

import model.RegistroAsesorados.Entity.AlumnoAsesorado;
import model.RegistroAsesorados.Entity.FichaConsolidada;


import java.util.Calendar;
import java.util.Date;

public class ModificarFichaAsesoradoController {
   public void modificarFichaAsesorado(FichaConsolidada ficha){
       Calendar cal = Calendar.getInstance();
       cal.set(2025, Calendar.JULY, 2); // Meses van de 0 a 11, así que JULY = 6
       Date fecha = cal.getTime();
       AlumnoAsesorado alumnoAsesorado = new AlumnoAsesorado(1234567890L, "Carlos Raul Hilario", "Ramirez Cuentas", "carlos@gmail.com", "73777227", fecha, "012411743", "bachller");
       FichaConsolidada fichaAnterior = new FichaConsolidada(1234567890L, "Inteligencia artificial", fecha, 55, "pendiente", alumnoAsesorado );

       // Actualizamos
       fichaAnterior.setAlumno(ficha.getAlumno());
       fichaAnterior.setTituloProyecto(ficha.getTituloProyecto());
       fichaAnterior.setAvance(ficha.getAvance());
       fichaAnterior.setEstado(ficha.getEstado());
       fichaAnterior.setFechaInicio(ficha.getFechaInicio());
   }
}
