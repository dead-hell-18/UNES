
public class Pasajero extends Usuario {
    String Fecha_de_nacimiento;
    String Matricula;
    String Carrera;
    static int idParada;
    static double tarifaPasajero;

    Pasajero(String nombre, String fecha_de_nacimiento, String matricula, String carrera, int idPasajero) {
        Pasajero.nombre = nombre;
        this.Fecha_de_nacimiento = fecha_de_nacimiento;
        this.Matricula = matricula;
        this.Carrera = carrera;
        Usuario.idPasajero = idPasajero;
    }

    public void SolicitarViaje(int idviaje, int tarifa) {
        idViaje = idviaje;
        tarifaPasajero = tarifa;
        System.out.println("El Pasajero con id: " + Usuario.idPasajero + " Solicita un viaje con el id: " + idViaje
                + " Con una tarifa de: " + tarifa);
    }

    void SolicitarLugar(int lugar) {
        if (Usuario.viajeStatus > 0) {
            if (lugar > Conductor.Lugares) {
                System.out.println("El conductor cuenta con lugares disponibles");
            } else {
                System.out.println("El conductor no cuenta con lugares disponibles");
            }
        } else
            System.out.println("El viaje ya ha sido cancelado");
    }

    void SolicitarParada(int idparada) {
        idParada = idparada;
        if (Usuario.viajeStatus < 0) {
        } else
            System.out.println("El viaje ya ha sido cancelado");
    }

    int darCalificacion(int calificacion) {
        System.out.println("La calificacion del conductor es: " + Conductor.calificacion);
        return Conductor.calificacion;
    }

}