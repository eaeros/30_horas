package com.ernesto;

import com.ernesto.tren;

public class Main {

    public static void main(String[] args) {
        // write your code here
        tren primero = new tren();
        tren segundo = new tren("ernesto torres", 32);
        Lujo tercero = new Lujo("felipe", true);
        Lujo cuarto = new Lujo ();
        System.out.println(primero.maquinista);
        System.out.println(primero.antiguedad);
        System.out.println(segundo.antiguedad);
        primero.CompletarVagon(2);
        System.out.println(primero.vagones[2][1]);
        System.out.println(tercero.maquinista);
        System.out.println(tercero.camarero);
        System.out.println(cuarto.camarero);
        System.out.println(cuarto.antiguedad);
    }

}

