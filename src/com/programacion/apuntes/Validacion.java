package com.programacion.apuntes;

import javax.swing.JOptionPane;

public class Validacion {

    public float validarDato(){
        float dato;
        do {
            dato = Float.parseFloat(JOptionPane.showInputDialog("Teclea un valor positivo"));
        } while (dato<=0);
        return dato;
    }

    //Validar pero ahora con un do While
    public float validaWhile(){
        float dato2;
        dato2 = Float.parseFloat(JOptionPane.showInputDialog("Teclea un valor positivo"));
        while (dato2 <= 0){
            dato2 = Float.parseFloat(JOptionPane.showInputDialog("Teclea un valor positivo"));
        }
        return dato2;
    }

}
