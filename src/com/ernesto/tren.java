package com.ernesto;

/**
 * Created by DELL on 11/8/2017.
 */
public class tren {
    int vagones[][] = new int[5][2];
    String maquinista;
    int antiguedad;

    public tren() {
        for (int i = 0; i <= 4; i++) {
            vagones[i][0] = (i + 1) * 10;
            vagones[i][1] = 0;
        }
        maquinista = "anonimo";
        antiguedad = 0;

    }

    public tren(String nombre, int anios) {
        for (int i = 0; i <= 4; i++) {
            vagones[i][0] = (i + 1) * 10;
            vagones[i][1] = 0;
        }
        maquinista = nombre;
        antiguedad = anios;

    }

    public void CompletarVagon(int vagon) {
        vagones[vagon][1] = vagones[vagon][0];
        System.out.println("el vagon" + (vagon + 1) + "ha sido completado");
    }
}

    class Lujo extends tren{
        String camarero;
        boolean bar;

        public Lujo (){
            camarero = "anonimo";
            bar = false;
        }
        public Lujo (String nombre, boolean estado ){
            camarero = nombre;
            bar = estado;
        }

    }



