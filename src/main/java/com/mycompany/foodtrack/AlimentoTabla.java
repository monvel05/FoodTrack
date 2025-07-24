/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodtrack;

/**
 *
 * @author monyv
 */
public class AlimentoTabla {
    private boolean seleccionado;
    private String nombre;
    private int calorias;

    public AlimentoTabla(String nombre, int calorias) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.seleccionado = false;
    }

    // Getters y setters
    public boolean isSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalorias() {
        return calorias;
    }
}
