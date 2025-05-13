import java.util.Scanner;

public class ObjetoMenuInicioSeccion {
    // PARTE QUE TRANAJA JOEL
    public void CorreoElectronico(){
        System.out.println("Colocar los comandos para el inicio de secion por correo electronico");
    }
    // Parte que trabaja Rubi


    public void ChatTexto (){
        ObjetoMenuTickets seleccion = new ObjetoMenuTickets();
        Scanner opcionMuevoMenu =  new Scanner(System.in); 
        int menuNuevo;
        
        do {
            System.out.println("");
            System.out.println("Solo porporcionamos respuetas automaticas en este chat.");
            System.out.println("");
            System.out.println(" -------- Bienvenido al menu de tickets --------");
            System.out.println("1 --> Olvide mi contraseña.");
            System.out.println("2 --> Solicitudes de instalación de equipos y software.");
            System.out.println("3 --> Solicitud administrativas.");
            System.out.println("4 --> Salir.");
            System.out.print("Por favor ingrese el numero de la opcion que desea solucinar: ");
            menuNuevo = opcionMuevoMenu.nextInt();
            
            switch (menuNuevo) {
                case 1 ->{
                    System.out.println("5011 ");
                    System.out.println("");
                    seleccion.recuperacion();
                    break;
                }
                case 2 ->{
                    seleccion.instalación();
                    break;
                }
                case 3 -> {
                    seleccion.administrativa();
                    break;
                }
                case 4 ->{
                    System.out.println("Regresando al menu de inicio de seccion...");
                    break;
                }
                default ->{
                    System.out.println("La opcion que ingreso es invalida");
                }
            }
        } while (menuNuevo != 4);
    }
}
