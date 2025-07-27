/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodtrack;

import java.awt.Color;



/**
 *
 * @author monyv
 */
public class ModoOscuro {
    private static ModoOscuro instance;
    private boolean modoOscuroActivo = false;
    
    //Colores modo oscuro
    private Color colorFuerteOscuro = new Color(181, 81, 13);
    private Color fondoOscuro = new Color(28, 27, 23);
    private Color fuenteOscuro = new Color (255,255,255);
    private Color botonesOscuro = new Color(130, 63, 12);
    
    //Colores modo claro
    private Color colorFuerteClaro = new Color(253, 140, 13);
    private Color fondoClaro = new Color(254,244,192);
    private Color fuenteClaro = new Color(38, 38, 38);
    private Color botonesClaro = new Color(246,226,155);

    private ModoOscuro() {
    }

    public static ModoOscuro getInstance() {
        if (instance == null) {
            instance = new ModoOscuro();
        }
        return instance;
    }

    public boolean isModoOscuroActivo() {
        return modoOscuroActivo;
    }

    public void setModoOscuroActivo(boolean modoOscuroActivo) {
        this.modoOscuroActivo = modoOscuroActivo;
    }

    public Color getColorFuerteOscuro() {
        return colorFuerteOscuro;
    }

    public void setColorFuerteOscuro(Color colorFuerteOscuro) {
        this.colorFuerteOscuro = colorFuerteOscuro;
    }

    public Color getFondoOscuro() {
        return fondoOscuro;
    }

    public void setFondoOscuro(Color fondoOscuro) {
        this.fondoOscuro = fondoOscuro;
    }

    public Color getFuenteOscuro() {
        return fuenteOscuro;
    }

    public void setFuenteOscuro(Color fuenteOscuro) {
        this.fuenteOscuro = fuenteOscuro;
    }

    public Color getBotonesOscuro() {
        return botonesOscuro;
    }

    public void setBotonesOscuro(Color botonesOscuro) {
        this.botonesOscuro = botonesOscuro;
    }

    public Color getColorFuerteClaro() {
        return colorFuerteClaro;
    }

    public void setColorFuerteClaro(Color colorFuerteClaro) {
        this.colorFuerteClaro = colorFuerteClaro;
    }

    public Color getFondoClaro() {
        return fondoClaro;
    }

    public void setFondoClaro(Color fondoClaro) {
        this.fondoClaro = fondoClaro;
    }

    public Color getFuenteClaro() {
        return fuenteClaro;
    }

    public void setFuenteClaro(Color fuenteClaro) {
        this.fuenteClaro = fuenteClaro;
    }

    public Color getBotonesClaro() {
        return botonesClaro;
    }

    public void setBotonesClaro(Color botonesClaro) {
        this.botonesClaro = botonesClaro;
    }
    
    
}
