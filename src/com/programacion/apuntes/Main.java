package com.programacion.apuntes;

//Inicio del Programa: 23/11/2020

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Validacion obx =  new Validacion();

        //float res = obx.validarDato();
        float res = obx.validaWhile();

        System.out.println("Dato válido "+ res);
    }
}
