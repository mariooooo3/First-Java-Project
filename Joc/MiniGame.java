package Joc;


public class MiniGame {

    public String descriere;
    public String reguli;
    public String[] spectatori;

    public MiniGame(String descriere, String reguli, String[] spectatori) {
        this.descriere = descriere;
        this.reguli = reguli;
        this.spectatori = spectatori;
    }

    @Override
    public String toString() {
        return "\n---Poveste---:\n În acest joc de luptă, trei tipuri de luptători se" +
                " confruntă într-o arenă epică pentru a obține supremația! ⚔\uFE0F\n" + descriere +
                "\n---Reguli---:\n 1.Fiecare luptător are abilități unice\uD83E\uDD3C \n " +
                "2.Confruntările pot fi 1v1 sau toți contra un boss\uD83D\uDCA5\n " +
                "3.Se luptă până când unul rămâne fara viata\uD83E\uDD47" + reguli;
    }
}


