package model.SustentacionJurado.Controller;

import model.SustentacionJurado.Entity.ResultadoSustentacion;

public class ActualizarVeredictoObservacionesController {
    public void registrarResultado(Long idEvento, String veredictoFinal){
        System.out.println("Se actualiza el veredicto:" + veredictoFinal);
        System.out.println("Del evento que tenga el id: " + idEvento);
    }
}
