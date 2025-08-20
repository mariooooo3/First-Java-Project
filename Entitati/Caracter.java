package Entitati;

public abstract class Caracter {
    public String name;
    public int viata;
    public int atac;

    public Caracter(String name, int viata, int atac) {
        this.name = name;
        this.viata = viata;
        this.atac = atac;
    }

    public void afiseazaStatistici() {
        System.out.println("Numele luptatorului esteeee:" + name +
                " avand viata: " + viata + " si atacul: " + atac);
    }

    public boolean esteViu() {
        if (viata > 0)
            return true;
        return false;

    }

    public void primesteLovitura(int damage) {
        this.viata -= damage;
    }


    public String toString() {
        return "Numele luptatorului esteeee:" + name +
                " avand viata: " + viata + " si atacul: " + atac;
    }

    public void adaugaVictorii(Caracter caracter) {
        if (caracter instanceof Mag)
            Mag.victorii++;
        if (caracter instanceof Razboinic)
            Razboinic.victorii++;
        if (caracter instanceof Arcas)
            Arcas.victorii++;
    }

    public int getVictorii(Caracter caracter) {
        if (caracter instanceof Mag)
            return Mag.victorii;
        if (caracter instanceof Razboinic)
            return Razboinic.victorii;
        if (caracter instanceof Arcas)
            return Arcas.victorii;

        return 0;
    }

    public abstract void ataca(Caracter caracter);


}
