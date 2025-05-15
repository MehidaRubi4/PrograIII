import java.util.Scanner;

public class ObjetoMenuInicioSeccion {
    // PARTE QUE TRANAJA JOEL
    public void CorreoElectronico(){
        System.out.println("Colocar los comandos para el inicio de secion por correo electronico");
          inicioCorreo user = new inicioCorreo();
      Scanner var2 = new Scanner(System.in);
      System.out.println("······ Bienvenido a Carmesi DigitalTech ······ ");
      System.out.println("----------------------------------------------- ");
      System.out.println("        Ingrese correo electronico de usuario       ");
      String user1 = var2.nextLine();
      System.out.println("        Ingrese contrasenia o ingrese 1 si olvido la contrasenia      ");
      String contra = var2.nextLine();  

         switch (contra) {

            case "1":
               user.correoPerdido();
               break;

            case "Hola":
               System.out.println("5023 ");
               //user.ChatTexto(); ingresa el usuario
         }
    }


    // Parte que trabaja Rubi
    public void ChatTexto (){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le proporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();

        if(confirmacion == 5015){
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
                        System.out.println("");
                        break;
                    }
                    default ->{
                        System.out.println("La opcion que ingreso es invalida");
                    }
                }
            } while (menuNuevo != 4);
        }else{
            System.out.println("Numero invalido, intente de nuevo");
        }
    }
}
