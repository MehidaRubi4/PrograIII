package db;
import java.sql.*;

public class DatabaseConnection {
    
    // Configuración de la base de datos
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=sistema_tickets;encrypt=true;trustServerCertificate=true";
    private static final String USUARIO = "usuario";
    private static final String PASSWORD = "contraseña";
    
    // Método para obtener conexión
    private Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USUARIO, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver MySQL no encontrado", e);
        }
    }
    
    // Método para validar credenciales
    public boolean validar(String correo, String contraseña) {
        String query = "SELECT id, correo FROM usuarios WHERE correo = ? AND contraseña = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, correo);
            stmt.setString(2, contraseña); // En producción, usar hash de la contraseña
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                System.out.println("Usuario encontrado: " + rs.getString("correo"));
                return true;
            } else {
                System.out.println("Credenciales incorrectas");
                return false;
            }
            
        } catch (SQLException e) {
            System.err.println("Error al validar credenciales: " + e.getMessage());
            return false;
        }
    }
    
    // Método para verificar si un correo existe (para recuperación)
    public boolean existeCorreo(String correo) {
        String query = "SELECT id FROM usuarios WHERE correo = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, correo);
            ResultSet rs = stmt.executeQuery();
            
            return rs.next();
            
        } catch (SQLException e) {
            System.err.println("Error al verificar correo: " + e.getMessage());
            return false;
        }
    }
    
    // Método para actualizar contraseña
    public boolean actualizarContraseña(String correo, String nuevaContraseña) {
        String query = "UPDATE usuarios SET contraseña = ? WHERE correo = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, nuevaContraseña); // En producción, usar hash
            stmt.setString(2, correo);
            
            int rowsAffected = stmt.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Contraseña actualizada exitosamente");
                return true;
            } else {
                System.out.println("No se pudo actualizar la contraseña");
                return false;
            }
            
        } catch (SQLException e) {
            System.err.println("Error al actualizar contraseña: " + e.getMessage());
            return false;
        }
    }
    
    // Método para obtener información del usuario
    public String[] obtenerDatosUsuario(String correo) {
        String query = "SELECT id, nombre, correo, rol FROM usuarios WHERE correo = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setString(1, correo);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                return new String[] {
                    rs.getString("id"),
                    rs.getString("nombre"),
                    rs.getString("correo"),
                    rs.getString("rol")
                };
            }
            
        } catch (SQLException e) {
            System.err.println("Error al obtener datos del usuario: " + e.getMessage());
        }
        
        return null;
    }
    
    // Método para cerrar conexión (opcional, para gestión manual)
    public void cerrarConexion(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexión cerrada");
            } catch (SQLException e) {
                System.err.println("Error al cerrar conexión: " + e.getMessage());
            }
        }
    }
}