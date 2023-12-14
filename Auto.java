package programmiertechnikenGruppen;

public class Auto extends Vierrad {

    String automarke;
    String kraftstoff;
    String getriebe;
    int ps;

    public Auto(String farbe, String automarke, String kraftstoff, String getriebe, int ps) {
        super(farbe);
        this.automarke = automarke;
        this.kraftstoff = kraftstoff;
        this.getriebe = getriebe;
        this.ps = ps;
    }
}
