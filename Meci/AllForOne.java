package Meci;

import Entitati.Caracter;

import java.util.ArrayList;

public class AllForOne extends Meci {
    public Caracter boss;
    public ArrayList<Caracter> luptatori = new ArrayList<>();

    public AllForOne(int numarMaxSpectatori, double durataLupteu, int numarMaxLuptatori, String[] spectatori) {
        super(numarMaxSpectatori, durataLupteu, numarMaxLuptatori, spectatori);
    }

    public void startLupta() {
        for (int i = 0; i < luptatori.size(); i++) {
            while (luptatori.get(i).viata > 0 && this.boss.viata > 0) {
                if (luptatori.get(i).viata > 0)
                    boss.ataca(luptatori.get(i));
                if (boss.viata > 0)
                    luptatori.get(i).ataca(boss);
            }
        }
        afiseazaRezultat();
    }

    public boolean verificaStareBoss() {
        return boss.viata > 0;

    }

    public void afiseazaRezultat() {
        if (verificaStareBoss()) {
            System.out.println("Castigatorul luptei este\uD83C\uDF89 " + boss.name);
        } else {
            System.out.print("Castigatorii luptei sunt\uD83C\uDF89: ");
            for (int i = 0; i < luptatori.size(); i++) {
                if (luptatori.get(i).esteViu()) {
                    System.out.print(luptatori.get(i).name + " ");
                }
            }
            System.out.println();
        }
    }


}
