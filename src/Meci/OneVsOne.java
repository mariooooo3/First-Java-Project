package Meci;

import Entitati.Caracter;
import Entitati.Mag;
import Entitati.Razboinic;

import java.util.Scanner;


public class OneVsOne extends Meci {
    public Caracter luptator1;
    public Caracter luptator2;

    Scanner scanner = new Scanner(System.in);

    public OneVsOne(int numarMaxSpectatori, double durataLupteu, int numarMaxLuptatori, String[] spectatori) {
        super(numarMaxSpectatori, durataLupteu, numarMaxLuptatori, spectatori);
    }

    public void startMeci() {

        afiseazaStatisticiDuel();

        if (luptator1 instanceof Mag)
            System.out.println("Alegegi tipul atacului pentru:\n A. Primoridal Burst\n B. Baleful Strike");
        else if (luptator1 instanceof Razboinic)
            System.out.println("Alegegi tipul atacului:\n A. Noxian Guillotine\n B. Crippling Strike");
        else
            System.out.println("Alegegi tipul atacului:\n A. Enchanted Crystal Arrow\n B. Frost Shot");

        String input = scanner.nextLine();
        switch (input.toUpperCase()) {
            case "A":
                if (luptator1 instanceof Mag)
                    System.out.println("Luptatorul " + luptator1.name + " foloseste Primordial Burst!");
                else if (luptator1 instanceof Razboinic)
                    System.out.println("Luptatorul " + luptator1.name + " foloseste Noxian Guillotine!");
                else
                    System.out.println("Luptatorul " + luptator1.name + " foloseste Enchanted Crystal Arrow!");
                break;

            case "B":
                if (luptator1 instanceof Mag)
                    System.out.println("Luptatorul " + luptator1.name + " foloseste Baleful Strike!");
                else if (luptator1 instanceof Razboinic)
                    System.out.println("Luptatorul " + luptator1.name + " foloseste Crippling Strike!");
                else
                    System.out.println("Luptatorul " + luptator1.name + " foloseste Frost Shot!");
                break;

            default:
                System.out.println("Comanda eronata");
                break;
        }

        if (luptator2 instanceof Mag)
            System.out.println("Alegegi tipul atacului:\n A. Primoridal Burst\n B. Baleful Strike");
        else if (luptator2 instanceof Razboinic)
            System.out.println("Alegegi tipul atacului:\n A. Noxian Guillotine\n B. Crippling Strike");
        else
            System.out.println("Alegegi tipul atacului:\n A. Enchanted Crystal Arrow\n B. Frost Shot");

        String input2 = scanner.nextLine();
        switch (input2.toUpperCase()) {
            case "A":
                if (luptator2 instanceof Mag)
                    System.out.println("Luptatorul " + luptator2.name + " foloseste Primordial Burst!");
                else if (luptator2 instanceof Razboinic)
                    System.out.println("Luptatorul " + luptator2.name + " foloseste Noxian Guillotine!");
                else
                    System.out.println("Luptatorul " + luptator2.name + " foloseste Enchanted Crystal Arrow!");
                break;

            case "B":
                if (luptator2 instanceof Mag)
                    System.out.println("Luptatorul " + luptator2.name + " foloseste Baleful Strike!");
                else if (luptator2 instanceof Razboinic)
                    System.out.println("Luptatorul " + luptator2.name + " foloseste Crippling Strike!");
                else
                    System.out.println("Luptatorul " + luptator2.name + " foloseste Frost Shot!");
                break;

            default:
                System.out.println("Comanda eronata");
                break;
        }

        while (luptator1.viata > 0 && luptator2.viata > 0) {
            if (luptator2.viata > 0)
                luptator1.ataca(luptator2);
            if (luptator1.viata > 0)
                luptator2.ataca(luptator1);
        }
        stopMeci();
    }

    public void stopMeci() {
        if (luptator1.viata <= 0) {
            System.out.println("Castigatorul luptei este\uD83C\uDF89" + luptator2.name);
            luptator2.adaugaVictorii(luptator2);
            System.out.println("Luptatorul:" + luptator2.name +
                    " are in momentul de fata:" + luptator2.getVictorii(luptator2) + " victorii");

        } else if (luptator2.viata <= 0) {
            System.out.println("Castigatorul luptei este\uD83C\uDF89 " + luptator1.name);
            luptator1.adaugaVictorii(luptator1);
            System.out.println("Luptatorul:" + luptator1.name +
                    " are in momentul de fata:" + luptator1.getVictorii(luptator1) + " victorii");
        }
    }


    public void afiseazaStatisticiDuel() {
        System.out.println(luptator1);
        System.out.println(luptator2);
    }

}
