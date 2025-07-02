package model.SeguimientoAsesoria.Controller;

import model.SeguimientoAsesoria.Entity.SeguimientoSesion;

import java.util.Date;

public class RegistrarSesionSeguimientoController {
    public void registrarSesionSeguimiento(Long idSeguimiento,Date fecha, String temaTratado){
        SeguimientoSesion nuevoSeguimiento = new SeguimientoSesion(idSeguimiento, fecha, temaTratado);
        System.out.println("Seguimiento generado !!!");
    }
}
