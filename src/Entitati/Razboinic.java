package Entitati;


public class Razboinic extends Caracter {
    public int critica;
    public static int numarRaz = 0;
    public static int victorii = 0;
    public int energie;


    public Razboinic(String name, int viata, int atac, int critica, int energie) {
        super(name, viata, atac);
        this.critica = critica;
        this.energie = energie;
        numarRaz++;
    }

    public static int getContor() {
        return numarRaz;
    }

    public void verificaEnergie() {
        if (this.energie >= 5)
            System.out.println("Ce bine, mai am energie de "
                    + this.energie / 5 + " lovituri");
        else
            System.out.println("Nu mai am energie de nicio lovitura, nuuu");

    }

    public void activateBonusDamage() {
        this.atac = this.atac * this.critica;
        System.out.println(this.name + " a activat lovitura critica");

    }


    @Override
    public void ataca(Caracter caracter) {
        if (energie >= 5) {
            caracter.primesteLovitura(this.atac);
            this.energie = this.energie - 5;
        } else {
            System.out.println("Energie insuficienta");
        }
    }

}
