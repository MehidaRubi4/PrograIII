
import java.util.Scanner;

public class inicioCorreo {

    private String correoUser;

    public String getCorreoUser() {
        return correoUser;
    }

    public void setCorreoUser(String correoUser) {
        this.correoUser = correoUser;
    }

    public void correoPerdido () {
    Scanner Scan = new Scanner(System.in);
        String correoUser;
        System.out.println("Ingrese su correo electronico");
        correoUser =  Scan.nextLine();
            System.out.println("");
            System.out.println("usted recibira un link a su correo ");
            int code1 = Scan.nextInt();
            if (code1 == 8080)
            System.out.println("Escriba su nueva contrasenia");

            else{
                System.out.println("codigo invalido");
        }
    }
    
}