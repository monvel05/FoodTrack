package com.mycompany.foodtrack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author monyv
 */
public class FoodTrack {

    public static void main(String[] args) {
        DataBase.conectar();
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
}
