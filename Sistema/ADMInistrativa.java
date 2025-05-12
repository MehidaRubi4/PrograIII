// PARTE QUE PERTENECE A CHAT DE TEXTO
import java.util.Scanner;

public class ADMInistrativa {
    public void vacaciones(){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le porporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();
        if(confirmacion == 810){
           // Eperando la respuesta autmatica de los compañeros
        }else{
            System.out.println("Numero no corresponde al procedimeinto que se desea realizar");
        }
    }

    public void asusencias(){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le porporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();
        if(confirmacion == 2001){
           // Eperando la respuesta autmatica de los compañeros
        }else{
            System.out.println("Numero no corresponde al procedimeinto que se desea realizar");
        }
    }
}
