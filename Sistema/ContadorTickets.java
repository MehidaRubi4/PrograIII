public class ContadorTickets {
    private static int contador = 2000;

    public static int generarNuevoTicket() {
        return ++contador;
    }
}
