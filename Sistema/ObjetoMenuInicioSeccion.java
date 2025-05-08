import java.util.Scanner;

public class ObjetoMenuInicioSeccion {
    // PARTE QUE TRANAJA JOEL
    public void CorreoElectronico(){
        System.out.println("<Colocar los comandos para el inicio de secion por correo electronico");
    }
    // Parte que trabaja Rubi


    public void ChatTexto (){
        ObjetoMenuTickets seleccion = ObjetoMenuTickets();
        Scanner opcionMuevoMenu =  new Scanner(System.in);
        int confirmacion; 
        
        System.out.println("Ingrese el numero que le porporciono para confimar la opcion que desea realizar");
        confirmacion =  opcionMuevoMenu.nextInt();
        if(confirmacion == 5023){
            int menuNuevo;
            System.out.println("Solo porporcionamos respuetas automaticas en este chat.");
            System.out.println(" -------- Bienvenido al menu de tickets --------");
            System.out.println("1 --> Recuperacion de credenciales.");
            System.out.println("2 --> Solicitudes de instalación de equipos y software.");
            System.out.println("3 --> Solicitud administrativas ");
            System.out.print("Por favor ingrese el numero de la opcion que desea solucinar: ");
            menuNuevo = opcionMuevoMenu.nextInt();
            do {
                switch (menuNuevou) {
                    case 1 ->{
                        System.out.print("5011");
                        seleccion.recuperacion();
                        break;
                    }
                    case 2 ->{
                        break;
                    }
                    case 3 -> {
                        break;
                    }
                    default ->{
                        System.out.println("La opcion que ingreso es invalida");
                    }
                }
            } while (menuNuevo != 3);
        }else{
            System.out.println("Numero no corresponde al procedimeinto que se desea realizar");
        }
    }
}
