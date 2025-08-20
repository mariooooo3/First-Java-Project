package Joc;

import Entitati.Arcas;
import Entitati.Boss;
import Entitati.Mag;
import Entitati.Razboinic;
import Meci.AllForOne;
import Meci.OneVsOne;

public class Main {
    public static void main(String[] args) {
        String[] spectatori = {
                "Woooow abia aștept să înceapă! 🤩",
                "Abia aștept să văd cine câștigă! 🏆",
                "Sper să câștige Arcasul meu preferat 🏹\n",
        };
        MiniGame miniGame = new MiniGame(" ", "", spectatori);
        System.out.println(miniGame);

        Mag mag1 = new Mag("Veigar", 100, 25, 30, 20);
        Mag mag2 = new Mag("Malhazar", 100, 30, 30, 55);
        Mag mag3 = new Mag("Viktor", 100, 75, 10, 25);
        Razboinic raz1 = new Razboinic("Sett", 100, 20, 3, 10);
        Razboinic raz2 = new Razboinic("Darius", 100, 15, 3, 10);
        Razboinic raz3 = new Razboinic("Olaf", 100, 50, 5, 10);
        Razboinic raz4 = new Razboinic("Urgot", 100, 35, 4, 10);
        Arcas arc1 = new Arcas("Ashe", 100, 20, 7, 50);
        Arcas arc2 = new Arcas("Lux", 100, 30, 6, 70);
        Arcas arc3 = new Arcas("Jhin", 100, 30, 3, 70);
        Boss boss = new Boss("Thanos", 350, 50, 50, 20, 2);

        System.out.println("\n1.--Prima batalie de tipul OneVsOne\uD83C\uDFC1\uD83C\uDFC1:--\n");

        OneVsOne oneVsOne1 = new OneVsOne(4, 2.30, 2, miniGame.spectatori);

        oneVsOne1.stareSpectatori();
        mag1.activateArmour();
        raz1.activateBonusDamage();
        oneVsOne1.afiseazaDetaliiMeci();
        oneVsOne1.luptator1 = mag1;
        oneVsOne1.luptator2 = raz1;
        oneVsOne1.startMeci();
        raz1.verificaEnergie();

        System.out.println("\n2.--A doua batalie de tipul OneVsOne\uD83C\uDFC1\uD83C\uDFC1:--\n");

        OneVsOne oneVsOne2 = new OneVsOne(3, 2.30, 2, miniGame.spectatori);
        arc1.adaugaPrecizie();
        raz2.activateBonusDamage();
        oneVsOne2.afiseazaDetaliiMeci();
        oneVsOne2.luptator1 = raz2;
        oneVsOne2.luptator2 = arc1;
        oneVsOne2.startMeci();

        System.out.println("\n3.--A treia batalie de tipul OneVsOne\uD83C\uDFC1\uD83C\uDFC1:--\n");
        OneVsOne oneVsOne3 = new OneVsOne(2, 2.30, 2, miniGame.spectatori);
        mag2.activateArmour();
        arc2.adaugaPrecizie();
        oneVsOne3.afiseazaDetaliiMeci();
        oneVsOne3.luptator1 = mag2;
        oneVsOne3.luptator2 = arc2;
        oneVsOne3.startMeci();
        arc2.verificareSageti();
        arc2.afiseazaStatistici();


        System.out.println("\n1.1.--Prima batalie de tipul AllFornOne\uD83C\uDFC1\uD83C\uDFC1:--\n");

        AllForOne allForOne = new AllForOne(10, 10.00, 20, miniGame.spectatori);
        allForOne.boss = boss;
        boss.activatePowers();
        raz3.activateBonusDamage();
        raz4.activateBonusDamage();
        allForOne.luptatori.add(raz3);
        allForOne.luptatori.add(raz4);
        allForOne.startLupta();

        System.out.println("\n1.2.--A doua batalie de tipul AllFornOne\uD83C\uDFC1\uD83C\uDFC1:--\n");

        AllForOne allForOne2 = new AllForOne(10, 10.00, 20, miniGame.spectatori);
        allForOne2.boss = boss;
        boss.afiseazaStatistici();
        boss.regenerare();
        mag3.activateArmour();
        arc3.adaugaPrecizie();
        System.out.println(boss);
        allForOne2.luptatori.add(arc2);
        allForOne2.luptatori.add(arc1);
        allForOne2.luptatori.add(arc3);
        allForOne2.luptatori.add(mag3);
        allForOne2.startLupta();
        mag3.verificaMana();
        mag3.regenerareMana();

        System.out.println("\n--- Raport final ---");
        System.out.println("Total Magi creați: " + Mag.getContor());
        System.out.println("Total Războinici creați: " + Razboinic.getContor());
        System.out.println("Total Arcași creați: " + Arcas.getContor());

    }


}

