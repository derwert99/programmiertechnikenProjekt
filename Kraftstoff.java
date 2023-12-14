package programmiertechnikenGruppen;

import java.util.ArrayList;

public class Kraftstoff {

    ArrayList<String> kraftstoffListe = new ArrayList<>();

    public void addKraftstoff(){
        kraftstoffListe.add("Diesel");
        kraftstoffListe.add("Benzin");
        kraftstoffListe.add("Hybrid");
        kraftstoffListe.add("Erdgas");
    }
}
