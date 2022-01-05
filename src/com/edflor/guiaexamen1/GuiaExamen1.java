package com.edflor.guiaexamen1;

interface Rideable{
    String getGait();
}

public class GuiaExamen1 implements Rideable{

    int weight = 2;

    @Override
    public String getGait() {
        return "mph, lope";
    }

    void go(int speed) {
        ++speed;
        weight++;

        int walkrate = speed * weight;
        System.out.println(walkrate + getGait());
    }

    public static void main(String[] args) {
        new GuiaExamen1().go(8);
    }
}