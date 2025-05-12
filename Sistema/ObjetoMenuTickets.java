import java.util.Scanner;
// Menu de chat de texto
public class ObjetoMenuTickets {
    public void recuperacion(){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le porporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();
        if(confirmacion == 5011){
            System.out.println("Para recuperar su contraseña de correo, primero debe iniciar sesión.");
            System.out.println("Luego, seleccione la opción 'Olvidé mi contraseña'.");
            System.out.println("Se le enviará un código de verificación a su correo electrónico.");
            System.out.println("Ingrese ese código en el campo indicado para continuar con la recuperación de su contraseña.");
        }else{
            System.out.println("Numero no corresponde al procedimeinto que se desea realizar");
        }
    }

    public void instalación(){
        Impresora instaña = new Impresora();
        Scanner instakaciones = new Scanner(System.in);
        int opcionImstalacion;

        System.out.println(" ***** Menu de intalaciones ***** ");
        System.out.println("1 --> Instalacion de una impresora");
        System.out.println("2 --> Instalacion de un router");
        System.out.println("3 --> Instalacion de un sotware");
        System.out.println("4 --> Salir.");
        System.out.print("Por favor ingrese el numero de la opcion que desea solucinar: ");
        opcionImstalacion = instakaciones.nextInt();
        do {
            switch (opcionImstalacion) {
                case 1->{
                    System.out.println("2001");
                    instaña.impresoraopcione();
                    break;
                }
                case 2 ->
                {
                    System.out.println("2015");
                    instaña.router();
                    break;
                }
                case 3 ->{
                    System.out.println("2018");
                    instaña.software();
                    break;
                }
                case 4 ->{
                    break;
                }
                default -> {
                    System.out.println("La opcion que ingreso es invalida");
                }
            }
        } while (opcionImstalacion != 4);
    }

    public void administrativa(){
        ADMInistrativa sonywc = new ADMInistrativa();
        Scanner solicitd = new Scanner(System.in);
        int comporba; 
        
            System.out.println(" ++++++++ Menu de solicitudes administrativas ++++++++ ");
            System.out.println("1 --> Solicitud de vacaciones.");
            System.out.println("2 --> Justuficacion de ausencia.");
            System.out.println("3 --> Salir.");
            System.out.print("Por favor ingrese el numero de la opcion que desea solucinar: ");
            comporba = solicitd.nextInt();
            do {
                switch (comporba) {
                    case 1->{
                        System.out.println("810");
                        sonywc.vacaciones();
                        break;
                    }
                    case 2 ->
                    {
                        System.out.println("812");
                        sonywc.asusencias();
                        break;
                    }
                    case 3 ->{
                        break;
                    }
                    default -> {
                        System.out.println("La opcion que ingreso es invalida");
                    }
                }
            } while (comporba != 3);
    }

}