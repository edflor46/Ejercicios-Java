package com.edflor.guiaexamen1;

public class Ejercicio2 {

    public static void main(String[] args) {
        //Arreglo ejercicio
        //arregloEjercicio();

        //ifElseEjercicio
        //ifElseEjercicio();

        //concatEjercicio
        //concatEjercicio();

        //LogicEjercicio
        logicEjercicio();


    }

    static void arregloEjercicio() {
        int[][] array2D = {{0, 1, 2}, {3, 4, 5, 6}};
        System.out.println(array2D[0].length + " ");
        System.out.println(array2D[1].getClass().isArray() + " ");
        System.out.println(array2D[0][1]);
    }

    static void ifElseEjercicio() {
        int value = 33;

        if (value >= 0) {

            if (value != 0) {
                System.out.println("The");
            } else {
                System.out.println("Quick");
            }
            if (value < 10) {
                System.out.println("Brown");
            }
            if (value > 30) {
                System.out.println("Fox");
            } else if (value < 50) {
                System.out.println("Jumps");
            } else if (value < 10) {
                System.out.println("Over");
            } else {
                System.out.println("The");
            }
            if (value > 10) {
                System.out.println("Lazy");
            } else {
                System.out.println("Dog");
            }

        }
    }

    static void concatEjercicio(){
        System.out.println("Result: " + 3 + 5);
        System.out.println("Result: " + (3 + 5));
    }

    static void logicEjercicio() {

        int a = 10;
        int b = 37;
        int z = 0;
        int w = 0;

        if(a == b){
            z = 3;
        } else if(a > b){
            z = 6;
        }

        w = 10 * z;

        System.out.println(w);
    }



}


