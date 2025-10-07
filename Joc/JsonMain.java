package Joc;

import org.json.*;
import Entitati.Arcas;
import Entitati.Mag;
import Entitati.Razboinic;
import Meci.OneVsOne;

import java.nio.file.*;
import java.util.ArrayList;
import java.io.IOException;

public class JsonMain {
    public static void main(String[] args) {
        System.out.println("---Reguli---:\n" +
                " 1.Fiecare luptător are abilități unice\uD83E\uDD3C \n" +
                " 2.Confruntările pot fi 1v1 sau toți contra un boss\uD83D\uDCA5\n" +
                " 3.Se luptă până când unul rămâne fara viata\uD83E\uDD47\n" +
                "\n");
        String[] spectatori = {
                "Woooow abia aștept să înceapă! 🤩",
                "Abia aștept să văd cine câștigă! 🏆",
                "Sper să câștige Arcasul meu preferat 🏹\n",
        };

        try {

            String content = Files.readString(Path.of("src/Joc/test1.json"));
            JSONObject root = new JSONObject(content);
            JSONArray characters = root.getJSONArray("characters");
            JSONArray matches = root.getJSONArray("matches");

            for (int i = 0; i < characters.length(); i++) {
                JSONObject c = characters.getJSONObject(i);
                System.out.println("Luptatorul numarul " + (i + 1) + " este " +
                        c.getString("name") + " si este de tipul " + c.getString("type"));
            }

            for (int i = 0; i < matches.length(); i++) {
                JSONObject m = matches.getJSONObject(i);
                System.out.println("Meciul numarul " + (i + 1) + " este de tipul " + m.getString("type"));
            }

            ArrayList<Mag> magi = new ArrayList<>();
            ArrayList<Razboinic> razboinici = new ArrayList<>();
            ArrayList<Arcas> arcasi = new ArrayList<>();

            for (int i = 0; i < characters.length(); i++) {
                JSONObject c = characters.getJSONObject(i);
                String type = c.getString("type");

                if (type.equals("Mag")) {
                    int viata = c.getInt("viata");
                    int atac = c.getInt("atac");
                    int mana = c.getInt("mana");
                    int armura = c.getInt("armura");
                    String nume = c.getString("name");

                    Mag mag1 = new Mag(nume, viata, atac, mana, armura);
                    magi.add(mag1);
                } else if (type.equals("Arcas")) {
                    int viata = c.getInt("viata");
                    int atac = c.getInt("atac");
                    int nrSageti = c.getInt("nrSageti");
                    int precizie = c.getInt("precizie");
                    String name = c.getString("name");

                    Arcas arc1 = new Arcas(name, viata, atac, nrSageti, precizie);
                    arcasi.add(arc1);
                } else {
                    int atac = c.getInt("atac");
                    int viata = c.getInt("viata");
                    int energie = c.getInt("energie");
                    int critica = c.getInt("critica");
                    String nume = c.getString("name");

                    Razboinic raz1 = new Razboinic(nume, viata, atac, critica, energie);
                    razboinici.add(raz1);
                }
            }

            OneVsOne oneVsOne1 = new OneVsOne(4, 2.30, 2, spectatori);
            oneVsOne1.stareSpectatori();

            if (!magi.isEmpty() && !razboinici.isEmpty()) {
                Mag mag1 = magi.get(0);
                Razboinic raz1 = razboinici.get(0);

                mag1.activateArmour();
                raz1.activateBonusDamage();

                oneVsOne1.afiseazaDetaliiMeci();
                oneVsOne1.luptator1 = mag1;
                oneVsOne1.luptator2 = raz1;

                oneVsOne1.startMeci();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
