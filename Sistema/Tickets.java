import java.util.Scanner;

public class Tickets {
    public static void main(String[] args) {
        ObjetoMenuInicioSeccion seleccion = new ObjetoMenuInicioSeccion();
        Scanner Teclado = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("······ Bienvenido a Carmesi DigitalTech ······ ");
            System.out.println("----------------------------------------------- ");
            System.out.println("            Menu de inicio de seccion           ");
            System.out.println("1 --> Por Correo electronico.");
            System.out.println("2 --> Chat de texto");
            System.out.println("3 --> Salir.");
            System.out.println("");
            System.out.print("Por favor ingrese el numero que desee realizar: ");
            opcion = Teclado.nextInt();
        
            switch (opcion) {
                case 1 -> {
                    seleccion.CorreoElectronico();
                    break;
                }
                case 2 -> {
                    System.out.println("5015");
                    System.out.println("");
                    seleccion.ChatTexto();
                    break;
                }
                case 3 -> {
                    System.out.println("Saliendo del programa...");
                    break;
                }
                default ->{
                    System.out.println("La opcion que ingreso es invalida");
                }
            }
        } while (opcion != 3);    
    }
}