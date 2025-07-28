/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodtrack;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author monyv
 */
public class PeticionesDB {
    /**
     * Método para insertar usuario
     * @param idSexo obtener del radioButton 
     * @param nombre obtener de textField
     * @param apellido obtener de textField
     * @param edad obtener de spinner 
     * @param peso obtener de textField
     * @param altura obtener de textField
     * @param nom_usuario obtener de textField
     * @param correo obtener de textField
     * @param contrasena obtener de textField
     * @return true o false para luego comparar con un if
     */
    public static boolean registrarUsuario(int idSexo, String nombre, String apellido, int edad, double peso, double altura, String nom_usuario, String correo, String contrasena) {

        Connection conn = DataBase.conectar();

        if (conn != null) {

            String query = "INSERT INTO usuarios (idSexo, nombre, apellido, edad, peso, altura, nom_usuario, correo, contrasena) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, idSexo);
                stmt.setString(2, nombre);
                stmt.setString(3, apellido);
                stmt.setInt(4, edad);
                stmt.setDouble(5, peso);
                stmt.setDouble(6, altura);
                stmt.setString(7, nom_usuario);
                stmt.setString(8, correo);
                stmt.setString(9, contrasena);

                int filasAfectadas = stmt.executeUpdate();

                return filasAfectadas > 0;

            } catch (SQLException e) {
                System.err.println("Error al insertar el usuario: " + e.getMessage());
            }
        }

        return false;
    }
    
    /**
     * Método para verificar si el usuario exite en la base de datos
     * @param nombreUsuario se obtiene del textField en el Login
     * @param password se obtiene del textField en el Login
     * @return 
     */
    public static boolean verificarUsuario (String nombreUsuario, String password) {
        Connection conn = DataBase.conectar();
        
        if(conn != null) {
            String query = "SELECT contrasena FROM usuarios WHERE nom_usuario = ?";
            
            try (PreparedStatement pstmt = conn.prepareStatement(query)){
                pstmt.setString(1, nombreUsuario);
                
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        String storedPassword = rs.getString("contrasena");
                        return storedPassword.equals(password); // Retorna true si se encuentra el usuario
                    }
                    return false; // Por si no se encuentra el usuario
                }
            } catch (SQLException e) {
                System.err.println("Error al traer la informacion: " + e.getMessage());
            }
        }
        return false;
    }
    
    public static int obtenerIdUsuario(String nombreUsuario) {
        String query = "SELECT idUsuarios FROM usuarios WHERE nom_usuario = ?";

        try (Connection conn = DataBase.conectar(); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, nombreUsuario);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("idUsuarios"); // Retorna el ID si encuentra el usuario
                }
                return -1; // Mejor usar -1 para indicar que no se encontró
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener ID de usuario: " + e.getMessage());
            return -1; // Retorna -1 en caso de error
        }
    }
    
    public static int obtenerIdAlimento (String nombreAlimento) {
        String query = "SELECT idAlimentos FROM alimentos WHERE nombreAlimento = ?";

        try (Connection conn = DataBase.conectar(); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, nombreAlimento);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("idAlimentos"); // Retorna el ID si encuentra el alimento
                }
                return -1; // Mejor usar -1 para indicar que no se encontró
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener ID del alimento: " + e.getMessage());
            return -1; // Retorna -1 en caso de error
        }
    }
    
    public static String obtenerContrasena (int idUsuario) {
        String query = "SELECT contrasena FROM usuarios WHERE idUsuarios = ?";

        try (Connection conn = DataBase.conectar(); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, idUsuario);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("contrasena"); // Retorna la contraseña
                }
                return null; 
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la contrasena: " + e.getMessage());
            return null; 
        }
    }
    
    public static HashMap<String, Object> traerDatosUsuario(int idUsuario){
        HashMap<String, Object> datosUsuario = new HashMap<>();
        String query = "SELECT nombre, apellido, edad, peso, altura FROM usuarios WHERE idUsuarios = ?";
        
        try (Connection conn = DataBase.conectar(); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, idUsuario);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    datosUsuario.put("nombre",rs.getObject("nombre"));
                    datosUsuario.put("apellido",rs.getObject("apellido"));
                    datosUsuario.put("edad",rs.getObject("edad"));
                    datosUsuario.put("peso",rs.getObject("peso"));
                    datosUsuario.put("altura",rs.getObject("altura"));
                    return datosUsuario;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la informacion del usuario: " + e.getMessage());
        }
        return null;
    }
    
    public static int traerCaloriasAlimento(String nombreAlimento){
        String query = "SELECT caloriasAlimento FROM alimentos WHERE nombreAlimento = ?";

        try (Connection conn = DataBase.conectar(); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, nombreAlimento);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("caloriasAlimento"); // Retorna las calorias si encuentra el alimento
                }
                return -1; // Mejor usar -1 para indicar que no se encontró el alimento
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener ID de usuario: " + e.getMessage());
            return -1; // Retorna -1 en caso de error
        }
    }
    
    public static int traerCaloriasConsumo (int idConsumo){
        String query = "SELECT total_calorias FROM consumoCalorico WHERE idConsumoCalorico = ?";

        try (Connection conn = DataBase.conectar(); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, idConsumo);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("total_calorias"); // Retorna todas las calorias
                }
                return -1; // Mejor usar -1 para indicar que hay un error
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener ID de usuario: " + e.getMessage());
            return -1; // Retorna -1 en caso de error
        }
    }
    
    public static boolean actualizarCaloriasConsumidas (int idConsumo, int calorias){
        Connection conn = DataBase.conectar();

        if (conn != null) {

            String query = "UPDATE consumoCalorico SET total_calorias = ? WHERE idConsumoCalorico = ?";

            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, calorias);
                stmt.setInt(2, idConsumo);

                int filasAfectadas = stmt.executeUpdate();
                System.out.println("Filas actualizadas: " + filasAfectadas);

                return filasAfectadas > 0;

            } catch (SQLException e) {
                System.err.println("Error al insertar el usuario: " + e.getMessage());
            }
        }

        return false;
    }
    
    public static List<AlimentoTabla> buscarAlimentos(String criterio) {
        List<AlimentoTabla> alimentos = new ArrayList<>();
        String query = "SELECT nombreAlimento, caloriasAlimento FROM alimentos WHERE nombreAlimento LIKE ?";

        try (Connection conn = DataBase.conectar(); PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, "%" + criterio + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nombre = rs.getString("nombreAlimento");
                int calorias = rs.getInt("caloriasAlimento");
                alimentos.add(new AlimentoTabla(nombre, calorias));
            }
        } catch (SQLException e) {
            System.err.println("Error al buscar alimentos: " + e.getMessage());
        }

        return alimentos;
    }
    
    public static boolean agregarAlimento (String nombre, int calorias, int porcion, String unidad, String tipo ){
        Connection conn = DataBase.conectar();

        if (conn != null) {

            String query = "INSERT INTO alimentos (nombreAlimento, caloriasAlimento, tamanoPorcion, unidadMedida, tipoAlimento) VALUES (?, ?, ?, ?, ?)";

            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, nombre);
                stmt.setInt(2, calorias);
                stmt.setInt(3, porcion);
                stmt.setString(4, unidad);
                stmt.setString(5, tipo);               

                int filasAfectadas = stmt.executeUpdate();

                return filasAfectadas > 0;

            } catch (SQLException e) {
                System.err.println("Error al agregar el alimento: " + e.getMessage());
            }
        }

        return false;
    }
    
    public static boolean crearMeta (int idUsuario, int idConsumo, String tipo, int metaActual) {
        Connection conn = DataBase.conectar();

        if (conn != null) {

            String query = "INSERT INTO meta (idUsuarios, idConsumoCalorico, tipo_meta, metaActual) VALUES (?, ?, ?, ?)";

            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, idUsuario);
                stmt.setInt(2, idConsumo);
                stmt.setString(3, tipo);
                stmt.setInt(4, metaActual);

                int filasAfectadas = stmt.executeUpdate();
                System.out.println("Filas actualizadas: " + filasAfectadas);

                return filasAfectadas > 0;

            } catch (SQLException e) {
                System.err.println("Error al insertar el usuario: " + e.getMessage());
            }
        }

        return false;
    }
    
    public static int buscarIdMeta (int idUsuario) {
        String query = "SELECT idMeta FROM meta WHERE idUsuarios = ?";

        try (Connection conn = DataBase.conectar(); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, idUsuario);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("idMeta"); // Retorna el ID si encuentra el alimento
                }
                return -1; // Mejor usar -1 para indicar que no se encontró
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener ID del alimento: " + e.getMessage());
            return -1; // Retorna -1 en caso de error
        }
    }
    
    public static int borrarMeta(int idMeta) {
        String query = "DELETE FROM meta WHERE idMeta = ?";

        try (Connection conn = DataBase.conectar(); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, idMeta);

            // Usar executeUpdate() para operaciones DELETE
            int filasAfectadas = pstmt.executeUpdate();

            // Retorna el número de filas eliminadas (0 si no encontró el ID)
            return filasAfectadas;

        } catch (SQLException e) {
            System.err.println("Error al borrar la meta: " + e.getMessage());
            return -1; // Retorna -1 en caso de error
        }
    }
    
    public static HashMap<String, Object> traerDatosMeta (int idMeta) {
        HashMap<String, Object> datosMeta = new HashMap<>();
        String query = "SELECT metaActual, tipo_meta FROM meta WHERE idMeta = ?";

        try (Connection conn = DataBase.conectar(); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setInt(1, idMeta);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    datosMeta.put("metaActual", rs.getObject("metaActual"));
                    datosMeta.put("tipo_meta", rs.getObject("tipo_meta"));
                    return datosMeta;
                }
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener la informacion del usuario: " + e.getMessage());
        }
        return null;
    }
    
    public static boolean actualizarMeta (int idUsuario, int idConsumo, String tipo, int metaActual) {
        Connection conn = DataBase.conectar();

        if (conn != null) {

            String query = "UPDATE meta SET tipo_meta = ?, metaActual = ?, idConsumoCalorico = ? WHERE idUsuarios = ?";

            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, tipo);
                stmt.setInt(2, metaActual);
                stmt.setInt(3, idConsumo);  
                stmt.setInt(4, idUsuario);

                int filasAfectadas = stmt.executeUpdate();
                System.out.println("Filas actualizadas: " + filasAfectadas);

                return filasAfectadas > 0;

            } catch (SQLException e) {
                System.err.println("Error al insertar el usuario: " + e.getMessage());
            }
        }

        return false;
    }
    
    public static boolean actualizarInfo (int idUsuario, String nombreUsuario, double peso, double altura, double imc) {
        String[] nombreCompleto = nombreUsuario.split(" ");
        String nombre = nombreCompleto[0]; 
        String apellido = nombreCompleto[1]; 
        
        Connection conn = DataBase.conectar();

        if (conn != null) {

            String query = "UPDATE usuarios SET nombre = ?, apellido = ?, peso = ?, altura = ?, imc = ? WHERE idUsuarios = ?";

            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, nombre);
                stmt.setString(2, apellido);
                stmt.setDouble(3, peso);
                stmt.setDouble(4, altura);
                stmt.setDouble(5, imc);
                stmt.setInt(6, idUsuario);             

                int filasAfectadas = stmt.executeUpdate();
                System.out.println("Filas actualizadas: " + filasAfectadas);

                return filasAfectadas > 0;

            } catch (SQLException e) {
                System.err.println("Error al insertar el usuario: " + e.getMessage());
            }
        }
        return false;
    }
    
    public static boolean eliminarCuenta (int idUsuario){
        Connection conn = DataBase.conectar();

        if (conn != null) {

            String query = "DELETE FROM usuarios WHERE idUsuarios = ?";

            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, idUsuario);

                int filasAfectadas = stmt.executeUpdate();
                System.out.println("Filas borradas: " + filasAfectadas);

                return filasAfectadas > 0;

            } catch (SQLException e) {
                System.err.println("Error al borrar el usuario: " + e.getMessage());
            }
        }

        return false;
    }
    
    public static int buscarConsumoCalorico (LocalDate fecha, int idUsuario) {
        String query = "SELECT idConsumoCalorico FROM consumoCalorico WHERE fecha_consumo = ? AND idUsuarios = ?";

        try (Connection conn = DataBase.conectar(); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, String.valueOf(fecha));
            pstmt.setInt(2, idUsuario);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("idConsumoCalorico"); // Retorna el ID si encuentra el usuario
                }
                return -1; // -1 para indicar que no se encontró
            }
        } catch (SQLException e) {
            System.err.println("Error al id de Consumo Calorico: " + e.getMessage());
            return -1; // Retorna -1 en caso de error
        }
    }
    
    public static boolean agregarConsumoCalorico (LocalDate fecha, int idUsuario) {
        Connection conn = DataBase.conectar();

        if (conn != null) {

            String query = "INSERT INTO consumoCalorico (idUsuarios, fecha_consumo) VALUES (?, ?)";

            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, idUsuario);
                stmt.setDate(2, Date.valueOf(fecha));

                int filasAfectadas = stmt.executeUpdate();

                return filasAfectadas > 0;

            } catch (SQLException e) {
                System.err.println("Error al agregar el campo: " + e.getMessage());
            }
        }

        return false;
    }
    
    public static boolean agregarRegistroConsumo (int idAlimento, int idConsumo) {
        Connection conn = DataBase.conectar();

        if (conn != null) {

            String query = "INSERT INTO comidasRegistradas (idAlimentos, idConsumoCalorico) VALUES (?, ?)";

            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setInt(1, idAlimento);
                stmt.setInt(2, idConsumo);

                int filasAfectadas = stmt.executeUpdate();

                return filasAfectadas > 0;

            } catch (SQLException e) {
                System.err.println("Error al agregar el campo: " + e.getMessage());
            }
        }

        return false;
    }
    
    public static List<AlimentoTabla> obtenerAlimentosParaTabla() {
        List<AlimentoTabla> alimentos = new ArrayList<>();
        String query = "SELECT nombreAlimento, caloriasAlimento FROM alimentos";

        try (Connection conn = DataBase.conectar(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String nombre = rs.getString("nombreAlimento");
                int calorias = rs.getInt("caloriasAlimento");
                alimentos.add(new AlimentoTabla(nombre, calorias));
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener alimentos: " + e.getMessage());
        }

        return alimentos;
    }
}
