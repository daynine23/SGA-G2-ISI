package model.SustentacionJurado.Controller;

import java.io.File;

public class CargarActaSustentacionController {
    public void cargarActa(Long idEvento, File archivoPDF){

        System.out.println("Se carga el Acta que contenga el evento con el id: " + idEvento + "\nY que se cargue en este archivo PDF: " + archivoPDF);
    }
}
