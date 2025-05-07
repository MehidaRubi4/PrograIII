import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        // Inicio de seccion
        ObjetoMenuInicioSeccion seleccion = new ObjetoMenuInicioSeccion();
        Scanner Teclado = new Scanner(System.in);
        int opcion;

        //Menu de los dos tipos de inicio de seccion
        System.out.println("······ Bienvenido a <Nombre de la empresa> ······ ");
        System.out.println("        Menu de inicio de seccion       ");
        System.out.println("1 --> Por Correo electronico");
        System.out.println("2 --> Chatde texto");
        System.out.println("3 --> Salir.");

        System.out.print("Por favor ingrese el numero que desee realizar: ");
        opcion = Teclado.nextInt();
        do {
            switch (opcion) {
                case 1 -> {
                    seleccion.CorreoElectronico();
                    break;
                }
                case 2 -> {
                    seleccion.ChatTexto();
                    break;
                }
                case 3 -> {
                    break;
                }
                default ->{
                    System.out.println("La opcion que ingreso es invalida");
                }
            }
        } while (opcion != 3);    
    }
}
