import java.io.*;
import java.net.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Tickets {
    public static void main(String[] args) {
        // Inicia el servidor
        new Thread(new Runnable() {
            public void run() {
                try {
                    ServerSocket serverSocket = new ServerSocket(12345);
                    System.out.println("Servidor escuchando en el puerto 12345...");

                    while (true) {
                        Socket clientSocket = serverSocket.accept();
                        System.out.println("Cliente conectado: " + clientSocket.getInetAddress().getHostAddress());

                        // Hilo para manejar la comunicación con cada cliente
                        new Thread(new ClientHandler(clientSocket)).start();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        // Cliente (ejemplo)
        new Thread(new Runnable() {
            public void run() {
                try {
                    Socket clientSocket = new Socket("localhost", 12345);
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

                    while (true) {
                        System.out.print("Escribe el ticket que deseas realizar, en caso que ya no desea relizar el seguimiento escriba exit ");
                        String message = reader.readLine();
                        if (message == null || message.equalsIgnoreCase("exit")) {
                            out.println("exit");
                            break;
                        }
                        out.println(message);
                        System.out.println("Mensaje enviado al servidor: " + message);
                    }
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    // Clase para manejar la comunicación con cada cliente
    static class ClientHandler implements Runnable {
        private Socket clientSocket;
        private static AtomicBoolean recibirMensajes = new AtomicBoolean(true); // Control global

        public ClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                while (true) {
                    if (!recibirMensajes.get()) {
                        Thread.sleep(500); // Espera si está pausado
                        continue;
                    }

                    String message = in.readLine();
                    if (message == null) {
                        break;
                    }

                    if (message.equalsIgnoreCase("exit")) {
                        System.out.println("Cliente desconectado.");
                        break;
                    } else if (message.equalsIgnoreCase("pause")) {
                        recibirMensajes.set(false);
                        System.out.println("Recepción de mensajes pausada.");
                        continue;
                    } else if (message.equalsIgnoreCase("resume")) {
                        recibirMensajes.set(true);
                        System.out.println("Recepción de mensajes reanudada.");
                        continue;
                    }

                    System.out.println("Mensaje recibido del cliente: " + message);
                }

                clientSocket.close();
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
