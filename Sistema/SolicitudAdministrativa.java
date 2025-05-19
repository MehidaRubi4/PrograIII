//Clase para representar una solicitud Administrativa (vacaciones o ausencias)

public Class SolicitudAdministrativa {
  private int ticket;
  private String tipo;         // Vacaciones o Ausencias
  private String fechaInicio;
  private String fechaFin;     // Solo para las vacaciines
  private String motivo;
  private String estado;       // estados: Pediente, Aprobada, Rechazada
  private String respuestaAutomatica;

  // Método para validad el Ticket
  public boolean validarTicket(int ticketIngresado){
    return this.ticket == ticketIngresado;
  }

  // Método para mostrar la información de la solicitud
  public void mostrarInfo () {
    System.out.println ("Has seleccionado : " + tipo);
  }

  // Método para mostrar la respuesta automática
  public void mostrarRespuesta () {
    System.out.println ("Ticket confirmado: " + ticket);
    System.out.println ("Respuesta automática del equipo: ");
    System.out.println (respuestaAutomatica);
  } 
}

// Clase para gestionar las pilas de solicitudes
public Class PilaSolicitudes {
  private java.util.Stack<SolicitudAdministrativa> solicitudes;

  public PilaSolicitudes () {
    solicitudes = new java.util.Stack<> ();
  }

  // Método para agregar una solicitud a la pila
  public void agregarSolicitud(SolicitudAdministrativa solicitud){
    solicitudes.push(solicitud);
  }

  // Métpdo para procesar la solicitud más reciente
  public SolicitudAdministrativa procesarSolicitudReciente () {
      if (!solicitudes.isEmpty()){
        return solicitudes.pop;
      }
    return null;
  }

  // Método para ver la solicitud más reciente sin eliminarla
  public SolicitudAdministrativa verSolicitudReciente() {
      if (!solicitudes.isEmpty()) {
        return solicitudes.peek();
      }
    return null;
  }

  // Método para verificar si hay solicitudes pendientes
  public boolean haySolicitudesPendientes() {
    return !solicitudes.isEmpty();
  }

  // Método para obtener el número de solicitudes pendientes
  public int cantidadSolicitudesPendientes() {
    return solicitudes.size();
  }
}
