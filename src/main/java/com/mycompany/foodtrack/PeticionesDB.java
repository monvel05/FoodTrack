/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodtrack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.HashMap;

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
     * @param imc obtener de función calcularIMC
     * @return true o false para luego comparar con un if
     */
    public static boolean registrarUsuario(int idSexo, String nombre, String apellido, int edad, double peso, double altura, String nom_usuario, String correo, String contrasena, double imc) {

        Connection conn = DataBase.conectar();

        if (conn != null) {

            String query = "INSERT INTO usuarios (idSexo, nombre, apellido, edad, peso, altura, nom_usuario, correo, contrasena, imc) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

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
                stmt.setDouble(10, imc);

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
    
    public static double traerCaloriasAlimento(String nombreAlimento){
        String query = "SELECT caloriasAlimento FROM alimentos WHERE nombreAlimento = ?";

        try (Connection conn = DataBase.conectar(); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, nombreAlimento);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("caloriasAlimento"); // Retorna las calorias si encuentra el alimento
                }
                return -1; // Mejor usar -1 para indicar que no se encontró el alimento
            }
        } catch (SQLException e) {
            System.err.println("Error al obtener ID de usuario: " + e.getMessage());
            return -1; // Retorna -1 en caso de error
        }
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
                System.err.println("Error al insertar el usuario: " + e.getMessage());
            }
        }

        return false;
    }
    
    public static boolean actualizarMeta (int idUsuario, String tipo, double metaActual) {
        Connection conn = DataBase.conectar();

        if (conn != null) {

            String query = "UPDATE meta SET tipo_meta = ?, meta_actual = ? WHERE idUsuarios = ?";

            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, tipo);
                stmt.setDouble(2, metaActual);
                stmt.setInt(3, idUsuario);             

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
}
