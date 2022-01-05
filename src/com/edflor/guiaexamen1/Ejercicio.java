package com.edflor.guiaexamen1;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio {

    public static void main(String[] args) {
        //Ejercicio Arreglos
        //arreglos();

        //Ejercicio Switch
        //ejercicioSwitch();

        //Ejercicio Herencia
        new Mountain();
    }

    //Ejercicio Arreglo
    public static void arreglos() {
        List p = new ArrayList();

        p.add(7);
        p.add(1);
        p.add(5);
        p.add(1);

        p.remove(1);

        System.out.println(p);
    }

    //Ejercicio Switch
    public static void ejercicioSwitch() {
        String color = "RED";

        switch (color) {

            case "RED":
                System.out.println("Found Red");

            case "Blue":
                System.out.println("Found Blue");

            case "While":
                System.out.println("Found White");
                break;

            default:
                System.out.println("Found default");

        }
    }


}

//Ejercicio Herencia
class Atom {
    Atom() {
        System.out.println("Atom");
    }
}

class Rock extends Atom {
    Rock(String type) {
        System.out.println(type);
    }
}

class Mountain extends Rock {
    Mountain() {
        super("Granite");
        new Rock("Granite");
    }
}
