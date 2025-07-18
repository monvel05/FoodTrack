/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodtrack;

/**
 *
 * @author monyv
 */
public class UsuarioId {
    private static UsuarioId instance;
    private int valor;

    private UsuarioId() {
    }

    public static UsuarioId getInstance() {
        if (instance == null) {
            instance = new UsuarioId();
        }
        return instance;
    }

    //Getters and setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    /*Para guardar:
        UsuarioId.getInstance().setValor("Mi valor");
      Para leer:
        int idUsuario = UsuarioId.getInstance().getValor();
    */
}
