/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodtrack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;

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
    
    
    
}
