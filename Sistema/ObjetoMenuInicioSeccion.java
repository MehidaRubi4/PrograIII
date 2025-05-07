import java.util.Scanner;

public class ObjetoMenuInicioSeccion {
    // PARTE QUE TRANAJA JOEL
    public void CorreoElectronico(){
        System.out.println("<Colocar los comandos para el inicio de secion por correo electronico");
    }
    // Parte que trabaja Rubi


    public void ChatTexto (){
        Scanner opcionMuevoMenu =  new Scanner(System.in);
        int menuNuevo; 
        System.out.println("Este chat solo poporcionara respuestas automaticas si desea una respuesta hacia un error con su solicitud por favor inice seccion por correo elrctronico");
        System.out.println("        Bienvenido al menu de tickets       ");
        System.out.println("1 --> Recuperacion de credenciales.");
        System.out.println("2 --> Solicitudes de instalación de equipos y software.");
        System.out.println("3 --> Solicitud administrativas ");

        System.out.println("Ingrese el nuemro de la opcion que desea trabajar. ");
        menuNuevo = opcionMuevoMenu.nextInt();
        do {        
        } while (menuNuevo != 3);
    }
}
