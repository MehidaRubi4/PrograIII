import java.util.Scanner;

public class SistemaInstalacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE INSTALACION ===");
            System.out.println("1. Solicitar instalacion de impresora");
            System.out.println("2. Solicitar instalacion de router");
            System.out.println("3. Solicitar instalacion de software");
            System.out.println("4. Ir al menú de tickets");
            System.out.println("5. Salir del sistema");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            SolicitudInstalacion solicitudSeleccionada = null;

            switch (opcion) {
                case 1 -> solicitudSeleccionada = new SolicitudInstalacion(
                    ContadorTickets.generarNuevoTicket(),
                    "Instalacion de una impresora",
                    "La instalacion de la impresora está en proceso. Uno de nuestros técnicos lo contactará pronto."
                );
                case 2 -> solicitudSeleccionada = new SolicitudInstalacion(
                    ContadorTickets.generarNuevoTicket(),
                    "Instalacion de un router",
                    "La instalación del router ha sido agendada. Un técnico asignado visitará su área hoy."
                );
                case 3 -> solicitudSeleccionada = new SolicitudInstalacion(
                    ContadorTickets.generarNuevoTicket(),
                    "Instalación de un software",
                    "El software solicitado será instalado de forma remota en los próximos 30 minutos."
                );
                case 4 -> {
                    System.out.println("\nRedirigiendo al menú de tickets...");
                    ObjetoMenuTickets menu = new ObjetoMenuTickets();
                    int subopcion;
                    do {
                        System.out.println("\n=== MENÚ DE TICKETS ===");
                        System.out.println("1. Recuperación de contraseña");
                        System.out.println("2. Instalaciones");
                        System.out.println("3. Solicitudes administrativas");
                        System.out.println("4. Volver al sistema de instalación");
                        System.out.print("Seleccione una opción: ");
                        subopcion = scanner.nextInt();

                        switch (subopcion) {
                            case 1 -> menu.recuperacion();
                            case 2 -> menu.instalación();
                            case 3 -> menu.administrativa();
                            case 4 -> System.out.println("Regresando al sistema de instalación...");
                            default -> System.out.println("Opción inválida");
                        }
                    } while (subopcion != 4);
                    continue; // vuelve al menú principal
                }
                case 5 -> {
                    System.out.println("Saliendo completamente del sistema.");
                    break;
                }
                default -> {
                    System.out.println("Opción no válida.");
                    continue;
                }
            }

            if (solicitudSeleccionada != null) {
                solicitudSeleccionada.mostrarInfo();
                System.out.println("Su número de ticket es: " + solicitudSeleccionada.getTicket());
                System.out.print("Ingrese el número de ticket para confirmar: ");
                int ticketIngresado = scanner.nextInt();

                if (solicitudSeleccionada.validarTicket(ticketIngresado)) {
                    solicitudSeleccionada.mostrarRespuesta();
                } else {
                    System.out.println("Número de ticket incorrecto.");
                }
            }
        } while (opcion != 5);
        scanner.close();
    }
}
