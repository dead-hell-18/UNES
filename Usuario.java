public class Usuario {
    static String nombre;
    int edad;
    static int idPasajero;
    static int idConductor;
    static int idViaje;
    static int viajeStatus = 1;

    public Usuario() {

    }

    void cancelarViaje(String Razon) {
        switch (Razon) {
            case "Cambio de planes":
                System.out.println("Razon valida, viaje cancelado");
                viajeStatus = 0;
                break;
            case "Problemas de programacion":
                System.out.println("Razon valida, viaje cancelado");
                viajeStatus = 0;
                break;
            case "Problemas de pago":
                System.out.println("Razon valida, viaje cancelado");
                viajeStatus = 0;
                break;
            case "Problemas de Seguridad":
                System.out.println("Razon valida, viaje cancelado");
                viajeStatus = 0;
                break;
            case "Problemas con el conductor":
                System.out.println("Razon valida, viaje cancelado");
                viajeStatus = 0;
                break;
            case "Problemas con el vehiculo":
                System.out.println("Razon valida, viaje cancelado");
                viajeStatus = 0;
                break;
            case "Problemas con el pasajero":
                System.out.println("Razon valida, viaje cancelado");
                viajeStatus = 0;
            default:
                System.out.println("Razon no valida, viaje no cancelado");
                break;
        }
    }
}
