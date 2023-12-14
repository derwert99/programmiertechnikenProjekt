package programmiertechnikenGruppen;

import java.util.ArrayList;

public class Main {

    private static void erstelleKraftstoffListe(ArrayList<String> kraftstoffListe) {
        kraftstoffListe.add("Benzin");
        kraftstoffListe.add("Diesel");
        kraftstoffListe.add("Hybdrid");
        kraftstoffListe.add("Erdgas");
    }



    public static void main(String[] args) {

        ArrayList<String> kraftstoffListe = new ArrayList<>();
        erstelleKraftstoffListe(kraftstoffListe);

        ArrayList<String> farbliste = new ArrayList<>();

    }


}
