public class PMain {
    public static void main(String[] args) {
        Automovil a1 = new Automovil("Ford", "Fiesta", "Rojo", 4, 5, "FFR01");
        Conductor c1 = new Conductor("Juan", "01/01/1990", "A010101", "ISC", 28, "Ford Fiesta", 5, 200, 1, "Alameda",
                4);
        Pasajero p1 = new Pasajero("Pedro", "01/01/1990", "A010101", "ISC", 1);

        p1.SolicitarViaje(12, 300);
        c1.aceptarPasajero();
        c1.registrarViaje();
        c1.iniciarViaje();
        p1.SolicitarParada(1);
        c1.verificarParada();
        c1.calificarUsuario(12);
        p1.darCalificacion(12);
        c1.cancelarViaje("Problemas de programacion");
        c1.reanudarViaje();
        c1.iniciarViaje();

    }
}
