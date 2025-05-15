public class SolicitudInstalacion {

    private int ticket;
    private String descripcion;
    private String respuestaAutomatica;


    public SolicitudInstalacion(int ticket, String descripcion, String respuestaAutomatica) {
        this.ticket = ticket;
        this.descripcion = descripcion;
        this.respuestaAutomatica = respuestaAutomatica;
    }

    public int getTicket() {
        return ticket;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRespuestaAutomatica() {
        return respuestaAutomatica;
    }

    public boolean validarTicket(int ticketIngresado) {
        return this.ticket == ticketIngresado;
    }


    public void mostrarInfo() {
        System.out.println("Has seleccionado: " + descripcion);
    }


    public void mostrarRespuesta() {
        System.out.println(" Ticket confirmado: " + ticket);
        System.out.println("Respuesta automatica del equipo:");
        System.out.println(respuestaAutomatica);
    }
}

