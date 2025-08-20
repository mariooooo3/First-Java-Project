package Entitati;


public class Arcas extends Caracter {
    public int nrSageti;
    public int precizie;
    public static int numarArc = 0;
    public static int victorii = 0;

    public Arcas(String name, int viata, int atac, int nrSageti, int precizie) {
        super(name, viata, atac);
        this.nrSageti = nrSageti;
        this.precizie = precizie;
        numarArc++;
    }

    public void adaugaPrecizie() {
        this.atac += this.atac * this.precizie / 100;
        System.out.println(this.name + " a activat precizia");

    }

    public void verificareSageti() {
        if (this.nrSageti > 0)
            System.out.println("Mai am exact " +
                    this.nrSageti + " sageti pe care le pot folosi");
        else
            System.out.println("Cam asta am fost, am ramas fara sageti");

    }

    public static int getContor() {
        return numarArc;
    }


    @Override
    public void ataca(Caracter caracter) {
        if (this.nrSageti > 0) {
            caracter.primesteLovitura(atac);
            this.nrSageti = this.nrSageti - 1;
        } else {
            System.out.println("Sageti insuficiente");
        }
    }

}
