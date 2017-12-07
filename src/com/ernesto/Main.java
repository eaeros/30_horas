package com.ernesto;

public class Main {
    // la variable de instancia nombre puede ser vista por todos los hijos de la clase
    public String nombre;

    // peso es una variable solo visible por la clase Persona
    private double peso;
    // La variable nombre es asignada en el constructor
    public Main(String nombre) {
        this.nombre = nombre;
    }
    // Este método asigna un peso a la variable peso
    public void setPeso(double peso){
        this.peso = peso;
    }
    // Este metodo imprime los datos de la persona
    public void imprimirPersona() {
        System.out.println("Nombre : " + this.nombre );
        System.out.println("Peso :" + this.peso);
    }

    public static void main(String args[]){
        Main alguien = new Main("Carlos");
        alguien.setPeso(80);
        alguien.imprimirPersona();
    }
}
