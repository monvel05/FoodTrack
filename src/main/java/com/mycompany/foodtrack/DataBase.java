/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodtrack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import io.github.cdimascio.dotenv.Dotenv;

/**
 *
 * @author monyv
 */
public class DataBase {
    Dotenv dotenv = Dotenv.configure().load();
    String URL = dotenv.get("URL");
    String USER = dotenv.get("USER");
    String PASSWORD = dotenv.get("PASSWORD");
    private Connection connection;
        
    public Connection connection (){
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la Base de datos");
        } catch (SQLException e){
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return connection;
    }
    public void disconnect(){
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexion cerrada");
            } 
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion: " + e.getMessage());
        }
    }
}

