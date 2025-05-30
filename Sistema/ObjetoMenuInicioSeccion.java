import java.util.Scanner;
import java.util.Random;

public class ObjetoMenuInicioSeccion {
    public void CorreoElectronico(){
        Scanner scanner =  new Scanner(System.in);
        String correo, contraseña;
        
        System.out.println(" -------- Inicio de seccion por correo electronico --------");
        System.out.println("Ingrese su correo: ");
        correo = scanner.nextLine();
        System.out.println("Ingrese su contraseña: ");
        contraseña = scanner.nextLine();

        if(validar(correo, contraseña)){
            System.out.println("Inicio de seccion exitosa...");
            Scanner menun = new Scanner(System.in);
            int opcion;
            SistemaInstalacion corresponde = new SistemaInstalacion();
            do {
                System.out.println(" -------- Bienvenido a Carmesi DigitalTech ······ ");
                System.out.println("----------------------------------------------- ");
                System.out.println("1 --> Solicitudes de instalación de equipos y software.");
                System.out.println("2 --> Solicitud administrativas.");
                System.out.println("3 --> Salir.");
                System.out.print("Por favor ingrese el numero que desee realizar: ");
                opcion = menun.nextInt();

                switch (opcion) {
                    case 1 ->{
                        corresponde.MenudeCorreoelectronici();
                        break;
                    }
                    case 2 ->{
                        //"2 --> Solicitud administrativas.");
                        System.out.println("podrian colocar la conexio que con tanto me ando confundiendo");
                        break;
                    }
                    case 3 ->{
                        System.out.println("Cerrando sesión...");
                    }
                    default ->{
                        System.out.println("Opcion invalida");
                    }
                }
            } while (opcion != 3);
        } else{
            Scanner olvido = new Scanner(System.in);
            String respueta;
            System.out.println("Contraseña o correo incorrectos, intente de nuevo...");
            System.out.println("¿Olvido la contraseña? (s/n)");
            respueta = olvido.nextLine().toLowerCase().trim();
            if (respueta.equals("s") || respueta.equals("si")) {       
                recuperarContraseña(correo);             
            }
        }    
    }
    
    private void recuperarContraseña(String correo){
        Scanner scanner =  new Scanner(System.in);
        System.out.println(" -/- -/- -/- Recuperacion de contraseña -/- -/ -/- ");
        
        if(correo == null || correo.trim().isEmpty()){
            System.out.println("Ingrese su correo electronico: ");
            correo = scanner.nextLine();
        }

        if(esCorreoValido(correo)){
            int codigorecuperacion  = generarCodigoRe();
            System.out.println("Se ha enviado un codigo de recuperacion al correo: "+ correo);
            System.out.println("Codigo de recuperacion: " + codigorecuperacion);
            System.out.println("Ingrese el codigo de recuperación: ");
            int codigoIngresp = scanner.nextInt();
            scanner.nextLine();

            if(codigoIngresp == codigorecuperacion){
                System.out.println("Ingrese su nueva contraseña: ");
                String nuevaContraseña = scanner.nextLine();

                if(nuevaContraseña.length() >=15){
                    System.out.println("Contraseña actualizada exitosamente.");
                    System.out.println("Puede intentar inicar sesión nuevamente");
                } else{
                    System.out.println("Contraseña no adecuada, debe tener almenos 15 caracteres");
                }
            } else{
                System.out.println("Codigo de recuperacion incorrecto...");
            }
        }else{
            System.out.println("Formato de corre no es valido.");
        }
    }

    private boolean esCorreoValido(String correo){
        return correo != null && 
        correo.contains("@") && correo.contains(".") && 
        correo.indexOf("@") > 0 && correo.indexOf(".") > correo.indexOf("@"); 
    }

    private int generarCodigoRe(){
        return (int)(Math.random() * 9000) + 1000; // Codigo de 4 digitos.
    }

    private boolean validar(String correo, String contraseña){
        if (!esEmailValido(correo)) {
        System.out.println("Correo inválido.");
        return false;
        }

        if(contraseña == null || contraseña.length() <15 ){
            System.out.println("Contraseña invalida");
        }
        return true;
    }

    private boolean esEmailValido(String correo){
        return correo != null  && correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
        
    public void ChatTexto (){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le proporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();

        if(confirmacion == 5015){
            ObjetoMenuTickets seleccion = new ObjetoMenuTickets();
            Scanner opcionMuevoMenu =  new Scanner(System.in); 
            int menuNuevo;
            
            System.out.println("");
            System.out.println("Solo porporcionamos respuetas automaticas en este chat.");
        
            do {        
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