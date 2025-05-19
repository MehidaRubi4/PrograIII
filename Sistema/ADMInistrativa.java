// PARTE QUE PERTENECE A CHAT DE TEXTO
import java.util.Scanner;
import java.text.SimpleDateFormat; //para trabajar con fechas aunque no se usen aun

public class ADMInistrativa {
    private PilaSolcitudes pilaSolicitudes;
    
    public ADMInistrativa(){ 
        pilaSolicitudes = new PilaSolicitudes(); //Inicializa PilaSolicitudes como una nueva instancia de PilaSolicitudes
    }
    
    public void vacaciones(){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le porporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();
        automatico.nextLine(); //Limpia buffer del Scanner
        
        if(confirmacion == 810){
            System.out.println("");
            
           // Eperando la respuesta autmatica de los compañeros
            // Solicitar información para la solicitud de vacaciones
            System.out.println ("---Solicitud de Vacaciones");
            
            System.out.printl (" Fecha de Inicio (DD/MM/AAAA): ");
            String fechaInicio = automatico.nextLine();

            System.out.println ("Fecha de Finalización (DD/MM/AAAA): ");
            String fechaFin = automatico.nextLine();

            System.out.print(" Motivo; ");
            String motivo = automatico.nextLine();

            // Respuesta Automática
            String respuesta = "Su solicitud de vacaciones desde " + fechaInicio + 
                              " hasta " + fechaFin + " ha sido registrada.\n" +
                              "Motivo: " + motivo + "\n" +
                              "Estado: Pendiente de aprobación\n" +
                              "Su solicitud será revisada por Recursos Humanos en las próximas n horas.";

        // Creación y almacenamiento de la solicitud
            SolicitudAdministrativa solicitud = new SolicitudAdministrativa(
                810, "Vacaciones", fechaInicio, fechaFin, motivo, "Pendiente", respuesta
            );
            
            pilaSolicitudes.agregarSolicitud(solicitud);

            // Mostrar la respuesta automática
            System.out.println("\n--- Respuesta Automática ---");
            System.out.println(respuesta);
            System.out.println("\nSolicitudes pendientes en el sistema: " +  pilaSolicitudes.cantidadSolicitudesPendientes());
               
        }else{
            System.out.println("Numero no corresponde al procedimeinto que se desea realizar");
        }
    }

    public void asusencias(){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le porporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();
        System.out.println("");
        if(confirmacion == 2001){
           // Eperando la respuesta autmatica de los compañeros
        }else{
            System.out.println("Numero no corresponde al procedimeinto que se desea realizar");
        }
    }
}
