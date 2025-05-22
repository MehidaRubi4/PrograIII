public class SolicitudAdministrativa {
    private int ticket;
    private String descripcion;
    private String respuestaAutomatica;
    private String fechaInicio;
    private String fechaFin;
    private String fechaAusencia;
    private String motivo;
    private String estado;

    // Constructor para vacaciones
    public SolicitudAdministrativa(int ticket, String descripcion, String respuestaAutomatica, 
                               String fechaInicio, String fechaFin, String motivo) {
        this.ticket = ticket;
        this.descripcion = descripcion;
        this.respuestaAutomatica = respuestaAutomatica;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.motivo = motivo;
        this.estado = "Pendiente";
    }

    // Constructor para ausencias
    public SolicitudAdministrativa(int ticket, String descripcion, String respuestaAutomatica, 
                               String fechaAusencia, String motivo) {
        this.ticket = ticket;
        this.descripcion = descripcion;
        this.respuestaAutomatica = respuestaAutomatica;
        this.fechaAusencia = fechaAusencia;
        this.motivo = motivo;
        this.estado = "Pendiente";
    }

    // Getters
    public int getTicket() {
        return ticket;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRespuestaAutomatica() {
        return respuestaAutomatica;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public String getFechaAusencia() {
        return fechaAusencia;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Validar ticket
    public boolean validarTicket(int ticketIngresado) {
        return this.ticket == ticketIngresado;
    }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Has seleccionado: " + descripcion);
        
        if (ticket == 810) {
            System.out.println("Fechas: " + fechaInicio + " hasta " + fechaFin);
        } else if (ticket == 812) {
            System.out.println("Fecha de ausencia: " + fechaAusencia);
        }
        
        System.out.println("Motivo: " + motivo);
        System.out.println("Estado: " + estado);
    }

    // Mostrar respuesta automática
    public void mostrarRespuesta() {
        System.out.println("Ticket confirmado: " + ticket);
        System.out.println("Respuesta automatica del equipo:");
        System.out.println(respuestaAutomatica);
    }
}
