import java.util.Scanner;

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
        Scanner instakaciones = new Scanner(System.in);
        int opcionImstalacion;

        System.out.println(" ***** Menu de intalaciones ***** ");
        System.out.println("1 --> Instalacion de una impresora");
        System.out.println("2 --> Instalacion de un router");
        System.out.println("3 --> Instalacion de un sotware");
        System.out.println("4 --> Salir.");
        
    }

}