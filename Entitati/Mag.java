package Entitati;

import java.util.Scanner;

public class Mag extends Caracter {
    int mana;
    int armura;
    public static int numarMagi = 0;
    public static int victorii = 0;
    public int manaMaxima;

    Scanner scanner = new Scanner(System.in);

    public Mag(String name, int viata, int atac, int mana, int armura) {
        super(name, viata, atac);
        this.mana = mana;
        this.armura = armura;
        numarMagi++;
        manaMaxima = mana;
    }

    public static int getContor() {
        return numarMagi;
    }

    public void activateArmour() {
        this.viata = this.viata + this.armura;
        System.out.println(this.name + " a activat armura");

    }

    public void regenerareMana() {
        if (this.mana < this.manaMaxima / 2) {
            this.mana += 10;

            if (this.mana > this.manaMaxima)
                this.mana = this.manaMaxima;

            System.out.println("Mana regenerata cu succes");
        } else {
            System.out.println("Mana nu poate fi regenerata momentan");
        }
    }


    public void verificaMana() {
        if (mana > 0)
            System.out.println("Mai am " + mana / 10 +
                    " abilitati de folosit\uD83E\uDDD9\u200D♂\uFE0F");
        else
            System.out.println("Ce ma fac, nu mai am mana de nicio abilitate :(");
    }


    @Override
    public void ataca(Caracter caracter) {
        if (this.mana >= 10) {
            caracter.primesteLovitura(atac);
            this.mana = this.mana - 10;

        } else {
            System.out.println("Mana insuficienta");
        }
    }

}

