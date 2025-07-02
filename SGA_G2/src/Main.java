import java.util.Date;
import java.util.Scanner;
import java.time.LocalTime;

import model.RegistroAsesorados.Entity.FichaConsolidada;
import model.SeguimientoAsesoria.Entity.ReporteAvance;
import model.SeguimientoAsesoria.Entity.SeguimientoSesion;
import model.SustentacionJurado.Entity.ActaSustentacion;
import model.SustentacionJurado.Entity.EventoSustentacion;
import model.SustentacionJurado.Entity.ResultadoSustentacion;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // Bucle para que el menú se muestre hasta que elijan salir
        while (true) {
            System.out.println("\n===== SISTEMA DE GESTIÓN DE ASESORÍAS (SGA) =====");
            System.out.println("1. Registrar Nuevo Asesorado");
            System.out.println("2. Registrar Sesión de Seguimiento");
            System.out.println("3. Actualizar Veredicto y Observaciones");
            System.out.println("4. Cargar Acta Oficial");
            System.out.println("5. Salir");
            System.out.print("--> Elija una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpia el buffer para que no haya saltos

            switch (opcion) {
                case 1:
                    registrarNuevoAsesorado(scanner);
                    break;
                case 2:
                    registrarSesionDeSeguimiento(scanner);
                    break;
                case 3:
                    actualizarVeredicto(scanner);
                    break;
                case 4:
                    cargarActaOficial(scanner);
                    break;
                case 5:
                    System.out.println("\nSaliendo del sistema... ¡Gracias por usar SGA!");
                    return; // Termina el programa
                default:
                    System.out.println("\n¡Opción no válida! Por favor, intente de nuevo.");
            }

            System.out.println("\n...Presione Enter para volver al menú...");
            scanner.nextLine();
        }
    }

    public static void registrarNuevoAsesorado(Scanner scanner) {
        System.out.println("\n--- [Función: Registrar Nuevo Asesorado] ---");
        System.out.print("Ingrese nombre del alumno: ");
        String nombre = scanner.nextLine();
        System.out.println("\n>> ¡Éxito! La Ficha Consolidada para '" + nombre + "' ha sido creada.");
    }

    public static void registrarSesionDeSeguimiento(Scanner scanner) {
        System.out.println("\n--- [Función: Registrar Sesión de Seguimiento] ---");
        System.out.print("Ingrese tema tratado: ");
        String tema = scanner.nextLine();
        System.out.println("\n>> ¡Éxito! La sesión sobre '" + tema + "' ha sido registrada en el historial.");
    }

    public static void actualizarVeredicto(Scanner scanner) {
        System.out.println("\n--- [Función: Actualizar Veredicto] ---");
        System.out.print("Ingrese el veredicto (Aprobado/Desaprobado): ");
        String veredicto = scanner.nextLine();

        System.out.print("Ingrese la calificación (ej. 18): ");
        int calificacion = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.print("Ingrese las observaciones: ");
        String observaciones = scanner.nextLine();

        ResultadoSustentacion resultado = new ResultadoSustentacion(1L, veredicto, calificacion, observaciones);

        System.out.println("\n>> ¡Éxito! El resultado '" + resultado.getVeredictoFinal() + "' ha sido guardado.");
    }

    public static void cargarActaOficial(Scanner scanner) {
        System.out.println("\n--- [Función: Cargar Acta Oficial] ---");
        System.out.print("Ingrese la ruta del archivo PDF del Acta: ");
        String rutaPDF = scanner.nextLine();

        ActaSustentacion acta = new ActaSustentacion(1L, "acta_final.pdf", rutaPDF, new Date());

        System.out.println("\n>> ¡Éxito! El Acta desde '" + acta.getEnlaceDocumentoPDF() + "' fue cargada.");
        System.out.println(">> Notificación interna creada para el Docente y Alumno.");
    }
}