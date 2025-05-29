import java.util.Scanner;

public class ADMInistrativa {
    public void vacaciones(){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le porporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();
        if(confirmacion == 810){
            System.out.println("");
            System.out.println("Este apartado pertenece a los empleados, donde deben revisar lo siguiente;\n" + //
            " 1 - Consulta cuántos días de vacaciones tienes disponibles.\n" + //
            " 2 - Revisa la política de vacaciones (acumulación, mínimo de días, fechas bloqueadas, etc.).\n" + //
            " 3 - Asegurarse de que no haya restricciones en el área (temporadas altas, turnos clave, etc.)");
        }else{
            System.out.println("Numero no corresponde al procedimeinto que se desea realizar");
        }
    }

    public void asusencias(){
        Scanner automatico = new Scanner(System.in);
        int confirmacion;
        System.out.println("Ingrese el numero que se le porporciono para confimar la opcion que desea realizar");
        confirmacion =  automatico.nextInt();
        System.out.println("");
        if(confirmacion == 812){
           System.out.println("Este apartado pertenece a los empleados, donde deben revisar lo siguiente;\n" + //
            " 1 - Identifica el motivo de la ausencia.\n" + //
            " 2 - Define la fecha y duración de la ausencia.");
        }else{
            System.out.println("Numero no corresponde al procedimeinto que se desea realizar");
        }
    }
}