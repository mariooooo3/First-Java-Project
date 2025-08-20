package Meci;

import Entitati.Caracter;

import java.util.ArrayList;

public class Meci {
    public int numarMaxSpectatori;
    public double durataLuptei;
    public int numarMaxLuptatori;
    public String[] spectatori;

    public Meci() {

    }

    public Meci(int numarMaxSpectatori, double durataLuptei, int numarMaxLuptatori, String[] spectatori) {
        this.numarMaxSpectatori = numarMaxSpectatori;
        this.durataLuptei = durataLuptei;
        this.numarMaxLuptatori = numarMaxLuptatori;
        this.spectatori = spectatori;
    }

    public void afiseazaDetaliiMeci() {
        System.out.println("Numarul maxim de luptatori pentru acest meci este de:"
                + numarMaxLuptatori + ", \ndurata luptei este de:" + durataLuptei +
                " minute" + " si capacitatea tribunei permite prezenta a maxim:"
                + numarMaxSpectatori + " spectatori");
    }

    public void stareSpectatori() {
        for (int i = 0; i < spectatori.length; i++) {
            System.out.println("Spectatorul " + (i + 1) + ":" + spectatori[i]);
        }
    }

}
