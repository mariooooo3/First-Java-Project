package Entitati;


public class Boss extends Caracter {
    public int armura;
    public int precizie;
    public int critica;
    public int viataMaxima;

    public Boss(String name, int viata, int atac, int armura, int precizie, int critica) {
        super(name, viata, atac);
        this.armura = armura;
        this.precizie = precizie;
        this.critica = critica;
        this.viataMaxima = viata;
    }

    public void activatePowers() {
        this.viata = this.viata + this.armura;
        this.atac = this.atac * this.critica;
        this.atac += this.atac * this.precizie / 100;
        System.out.println(this.name + " a activat puterile speciale!");


    }

    public void regenerare() {
        if (this.viata < this.viataMaxima / 2) {
            int viataRegenerata = this.viataMaxima / 2;
            this.viata += viataRegenerata;

            // Asigură-te că nu trece de viataMaxima
            if (this.viata > this.viataMaxima)
                this.viata = this.viataMaxima;

            System.out.println(this.name + " isi regenereaza " + viataRegenerata + " puncte de viata.");
        } else {
            System.out.println(this.name + " are prea multa viata pentru a se regenera.");
        }
    }


    @Override
    public void ataca(Caracter caracter) {
        caracter.primesteLovitura(this.atac);

    }
}
