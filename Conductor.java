public class Conductor extends Usuario {
    String auto;
    static int calificacion;
    double tarifa;
    String Destino;
    static int Lugares;

    Conductor(String nombre, String fecha_de_nacimiento, String matricula, String carrera, int edad, String auto,
            int calificacion, double tarifa, int idConductor, String destino, int lugares) {
        Usuario.nombre = nombre;
        this.edad = edad;
        this.auto = auto;
        Conductor.calificacion = calificacion;
        this.tarifa = tarifa;
        Usuario.idConductor = idConductor;
        Destino = destino;
        Lugares = lugares;

    }

    void aceptarPasajero() {
        if (Pasajero.tarifaPasajero >= tarifa) {
            System.out.println(
                    "Pasajero aceptado con el id: " + Usuario.idPasajero + " y nombre de pasajero: " + Pasajero.nombre);
        } else {
            System.out.println(
                    "El Pasajero no cumple con la tarrifa minima de: " + tarifa + " y tiene una tarifa de: "
                            + Pasajero.tarifaPasajero);
        }
    }

    void registrarViaje() {
        System.out.println("Viaje registrado con los siguientes datos: ");
        System.out.println("Id del viaje: " + Usuario.idViaje);
        System.out.println("Nombre del conductor: " + nombre + " Id del conductor: " + Usuario.idConductor);
        System.out.println("Nombre del pasajero: " + Pasajero.nombre + " id del pasajero: " + Usuario.idPasajero);
        System.out.println("Destino: " + Destino);
        System.out.println("Cumpliendo la tarifa minima de: " + tarifa + " el pasajero ofreciendo: "
                + Pasajero.tarifaPasajero);
    }

    void iniciarViaje() {
        if (Usuario.viajeStatus > 0)
            System.out.println("Viaje iniciado" + " con el id: " + Usuario.idViaje);
        else
            System.out.println("El viaje ya ha sido cancelado, por favor inicie un nuevo viaje");
    }

    void verificarParada() {
        if (Usuario.viajeStatus > 0) {
            if (Pasajero.idParada > 0) {
                System.out.println("Parada aceptada" + " con el id de parada: " + Pasajero.idParada);
            } else {
                System.out.println("Parada no aceptada" + Pasajero.idParada);
            }
        } else
            System.out.println("El viaje ya ha sido cancelado");

    }

    void calificarUsuario(int Calificacion) {
        calificacion = Calificacion;
        System.out.println("La calificacion del usuario es: " + calificacion);
    }

    void reanudarViaje() {
        if (Usuario.viajeStatus > 0) {
            System.out.println("Viaje reanudado con el id: " + Usuario.idViaje);
        } else
            System.out.println("El viaje ya ha sido cancelado");
    }
}
