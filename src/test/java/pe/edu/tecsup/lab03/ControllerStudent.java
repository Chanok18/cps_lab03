package pe.edu.tecsup.lab03;

import java.time.LocalDate;
import java.time.LocalTime;

public class ControllerStudent {

    // 1. Declaramos las variables primero
    String nombreEstudiante = "Bellido Chambi Rony Widmer";
    LocalDate fechaActual = App.now();
    LocalTime horaActual = LocalTime.now();

    // 2. Luego el método que las usa
    public void mostrarInformacion() {
        System.out.println("Alumno: " + nombreEstudiante);
        System.out.println("Fecha: " + fechaActual);
        System.out.println("Hora: " + horaActual);
    }

}