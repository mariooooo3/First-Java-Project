package joc;
import java.util.ArrayList;

public class Meci
{
    public int numarMaxSpectatori;
    public double durataLuptei;
    public int numarMaxLuptatori;
    public String[] spectatori;

    public Meci()
    {

    }

    public Meci(int numarMaxSpectatori, double durataLuptei, int numarMaxLuptatori, String[] spectatori)
    {
        this.numarMaxSpectatori = numarMaxSpectatori;
        this.durataLuptei = durataLuptei;
        this.numarMaxLuptatori = numarMaxLuptatori;
        this.spectatori = spectatori;
    }

    public void afiseazaDetaliiMeci()
    {
        System.out.println("Numarul maxim de luptatori pentru acest meci este de:" + numarMaxLuptatori + ", \ndurata luptei este de:" + durataLuptei +
                " minute" + " si capacitatea tribunei permite prezenta a maxim:" + numarMaxSpectatori + " spectatori");
    }

    public void stareSpectatori()
    {
        for(int i = 0; i < spectatori.length; i++ )
        {
            System.out.println("Spectatorul " + (i+1) + ":" + spectatori[i]);
        }
    }

}

class OneVsOne extends Meci
{
    public Caracter luptator1;
    public Caracter luptator2;

    public OneVsOne(int numarMaxSpectatori, double durataLupteu, int numarMaxLuptatori, String[] spectatori)
    {
        super(numarMaxSpectatori, durataLupteu, numarMaxLuptatori, spectatori);
    }

    public void startMeci()
    {
        afiseazaStatisticiDuel();
        while(luptator1.viata >0 && luptator2.viata > 0)
        {
            luptator1.ataca(luptator2);
            luptator2.ataca(luptator1);
        }
            stopMeci();
    }

    public void stopMeci()
    {
        if(luptator1.viata <= 0)
        {
            System.out.println("Castigatorul luptei este\uD83C\uDF89" + luptator2.name);
            luptator2.adaugaVictorii(luptator2);
            System.out.println("Luptatorul:" + luptator2.name + " are in momentul de fata:" + luptator2.getVictorii(luptator2) + " victorii");

        } else if(luptator2.viata <= 0) {
            System.out.println("Castigatorul luptei este\uD83C\uDF89 " + luptator1.name);
            luptator1.adaugaVictorii(luptator1);
            System.out.println("Luptatorul:" + luptator1.name + " are in momentul de fata:" + luptator1.getVictorii(luptator1) + " victorii");
        }
    }


    public void afiseazaStatisticiDuel()
    {
        System.out.println(luptator1);
        System.out.println(luptator2);
    }

}

class AllForOne extends Meci
{
    public Caracter boss;
    public ArrayList<Caracter> luptatori = new ArrayList<>();

    public AllForOne(int numarMaxSpectatori, double durataLupteu, int numarMaxLuptatori, String[] spectatori)
    {
        super(numarMaxSpectatori, durataLupteu, numarMaxLuptatori, spectatori);
    }

    public void startLupta()
    {
        for(int i = 0; i < luptatori.size(); i++)
        {
            while (luptatori.get(i).viata > 0 && this.boss.viata > 0)
            {
                boss.ataca(luptatori.get(i));
                luptatori.get(i).ataca(boss);
            }
        }
        afiseazaRezultat();
    }

    public boolean verificaStareBoss()
    {
        if(boss.viata > 0)
            return true;

        return false;
    }

    public void afiseazaRezultat()
    {
        if (verificaStareBoss()) {
            System.out.println("Castigatorul luptei este\uD83C\uDF89 " + boss.name);
        } else {
            System.out.print("Castigatorii luptei sunt\uD83C\uDF89: ");
            for (int i=0; i<luptatori.size(); i++) {
                if (luptatori.get(i).esteViu()) {
                    System.out.print(luptatori.get(i).name + " ");
                }
            }
            System.out.println();
        }
    }


}