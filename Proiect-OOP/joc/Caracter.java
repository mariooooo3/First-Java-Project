package joc;

public abstract class Caracter
{
    public String name;
    public int viata;
    public int atac;

    public Caracter(String name, int viata, int atac)
    {
        this.name = name;
        this.viata = viata;
        this.atac = atac;
    }

    public void afiseazaStatistici()
    {
        System.out.println("Numele luptatorului esteeee:" + name + " avand viata: " + viata + " si atacul: " + atac);
    }

    public boolean esteViu()
    {
        if(viata > 0)
            return true;
        return false;
    }

    public void primesteLovitura(int damage)
    {
        this.viata -= damage;
    }


    public String toString()
    {
        return "Numele luptatorului esteeee:" + name + " avand viata: " + viata + " si atacul: " + atac;
    }

    public void adaugaVictorii(Caracter caracter)
    {
        if(caracter instanceof Mag)
            Mag.victorii++;
        if(caracter instanceof Razboinic)
            Razboinic.victorii++;
        if(caracter instanceof Arcas)
            Arcas.victorii++;
    }

    public int getVictorii(Caracter caracter)
    {
        if(caracter instanceof Mag)
            return Mag.victorii;
        if(caracter instanceof Razboinic)
            return Razboinic.victorii;
        if(caracter instanceof Arcas)
            return Arcas.victorii;

        return 0;
    }

    public abstract void ataca(Caracter caracter);


}

class Mag extends Caracter
{
    int mana;
    int armura;
    public static int numarMagi = 0;
    public static int victorii = 0;
    public int manaMaxima;

    public Mag(String name, int viata,int atac, int mana, int armura)
    {
        super(name, viata, atac);
        this.mana = mana;
        this.armura = armura;
        numarMagi++;
        manaMaxima = mana;
    }

    public static int getContor()
    {
        return numarMagi;
    }

    public void activateArmour()
    {
        this.viata = this.viata + this.armura;
        System.out.println(this.name + " a activat armura");

    }

    public void regenerareMana()
    {
        if(this.mana < this.manaMaxima / 2)
        {
            this.mana += 10;

            if(this.mana > this.manaMaxima)
                this.mana = this.manaMaxima;

            System.out.println("Mana regenerata cu succes");
        }
        else
        {
            System.out.println("Mana nu poate fi regenerata momentan");
        }
    }


    public void verificaMana()
    {
        if(mana > 0)
            System.out.println("Mai am " + mana/10 + " abilitati de folosit\uD83E\uDDD9\u200D♂\uFE0F");
        else
            System.out.println("Ce ma fac, nu mai am mana de nicio abilitate :(");
    }


    @Override
    public void ataca(Caracter caracter)
    {
        if(this.mana>=10)
        {
            caracter.primesteLovitura(atac);
            System.out.println("Wooow ce lovitura din partea lui " + this.name);
            this.mana = this.mana - 10;

        }
        else
        {
            System.out.println("Mana insuficienta");
        }
    }

}

class Razboinic extends Caracter
{
    public int critica;
    public static int numarRaz=0;
    public static int victorii=0;
    public int energie;

    public Razboinic(String name, int viata, int atac, int critica, int energie)
    {
        super(name, viata, atac);
        this.critica = critica;
        this.energie = energie;
        numarRaz++;
    }

    public static int getContor()
    {
        return numarRaz;
    }

    public void verificaEnergie()
    {
        if(this.energie >=5)
            System.out.println("Ce bine, mai am energie de "+ this.energie/5 + " lovituri");
        else
            System.out.println("Nu mai am energie de nicio lovitura, nuuu");

    }

    public void activateBonusDamage()
    {
        this.atac = this.atac * this.critica;
        System.out.println(this.name + " a activat lovitura critica");

    }


    @Override
    public void ataca(Caracter caracter)
    {
        if(energie >= 5)
        {
            caracter.primesteLovitura(this.atac);
            System.out.println("Wooow ce lovitura din partea lui " + this.name );
            this.energie = this.energie - 5;
        }
        else
        {
            System.out.println("Energie insuficienta");
        }
    }

}

class Arcas extends Caracter
{
    public int nrSageti;
    public int precizie;
    public static int numarArc=0;
    public static int victorii=0;

    public Arcas(String name, int viata, int atac, int nrSageti, int precizie)
    {
        super(name, viata, atac);
        this.nrSageti=nrSageti;
        this.precizie=precizie;
        numarArc++;
    }

    public void adaugaPrecizie()
    {
        this.atac += this.atac * this.precizie/100;
        System.out.println(this.name + " a activat precizia");

    }

    public void verificareSageti()
    {
        if(this.nrSageti>0)
            System.out.println("Mai am exact " + this.nrSageti + " sageti pe care le pot folosi");
        else
            System.out.println("Cam asta am fost, am ramas fara sageti");

    }

    public static int getContor()
    {
        return numarArc;
    }


    @Override
    public void ataca(Caracter caracter)
    {
        if(this.nrSageti > 0)
        {
            caracter.primesteLovitura(atac);
            System.out.println("Wooow ce lovitura din partea lui " + this.name);
            this.nrSageti = this.nrSageti - 1;
        }
        else
        {
            System.out.println("Sageti insuficiente");
        }
    }

}

class Boss extends Caracter
{
    public int armura;
    public int precizie;
    public int critica;
    public int viataMaxima;

    public Boss(String name, int viata, int atac, int armura, int precizie, int critica)
    {
        super(name, viata, atac);
        this.armura = armura;
        this.precizie = precizie;
        this.critica = critica;
        this.viataMaxima = viata;
    }

    public void activatePowers()
    {
        this.viata = this.viata + this.armura;
        this.atac = this.atac * this.critica;
        this.atac +=  this.atac * this.precizie/100;
        System.out.println(this.name + " a activat puterile speciale!");


    }

    public void regenerare()
    {
        if (this.viata < this.viataMaxima / 2)
        {
            int viataRegenerata = this.viataMaxima / 2;
            this.viata += viataRegenerata;

            // Asigură-te că nu trece de viataMaxima
            if (this.viata > this.viataMaxima)
                this.viata = this.viataMaxima;

            System.out.println(this.name + " isi regenereaza " + viataRegenerata + " puncte de viata.");
        }
        else
        {
            System.out.println(this.name + " are prea multa viata pentru a se regenera.");
        }
    }


    @Override
    public void ataca(Caracter caracter)
    {
        caracter.primesteLovitura(this.atac);
        System.out.println("Wooow ce lovitura din partea lui " + this.name );

    }
}
