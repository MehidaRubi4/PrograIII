import java.util.Scanner;

public class SistemaInstalacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SolicitudInstalacion impresora = new SolicitudInstalacion(
            2001, "Instalacion de una impresora",
            " La instalacion de la impresora esta en proceso. Uno de nuestros tecnicos lo contactara pronto."
        );

        SolicitudInstalacion router = new SolicitudInstalacion(
            2015, "Instalacion de un router",
            " La instalacion del router ha sido agendada. Un tecnico asignado visitara su area hoy."
        );

        SolicitudInstalacion software = new SolicitudInstalacion(
            2018, "Instalacion de un software",
            " El software solicitado será instalado de forma remota en los proximos 30 minutos."
        );

        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE INSTALACION ===");
            System.out.println("1. Solicitar instalacion de impresora");
            System.out.println("2. Solicitar instalacion de router");
            System.out.println("3. Solicitar instalacion de software");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            SolicitudInstalacion solicitudSeleccionada = null;

            switch (opcion) {
                case 1: solicitudSeleccionada = impresora; break;
                case 2: solicitudSeleccionada = router; break;
                case 3: solicitudSeleccionada = software; break;
                case 4: System.out.println("Saliendo del sistema."); break;
                default: System.out.println("Opcion no valida."); continue;
            }

            if (solicitudSeleccionada != null) {
                solicitudSeleccionada.mostrarInfo();
                System.out.print("Ingrese el numero de ticket para confirmar: ");
                int ticketIngresado = scanner.nextInt();

                if (solicitudSeleccionada.validarTicket(ticketIngresado)) {
                    solicitudSeleccionada.mostrarRespuesta();
                } else {
                    System.out.println(" Numero de ticket incorrecto.");
                }
            }

        } while (opcion != 4);

        scanner.close();
    }
}
