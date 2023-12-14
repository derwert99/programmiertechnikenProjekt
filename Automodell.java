package programmiertechnikenGruppen;

public class Automodell extends Auto {

    String automodell;

    public Automodell(String farbe, String automarke, String kraftstoff, String getriebe, int ps, String automodell) {
        super(farbe, automarke, kraftstoff, getriebe, ps);
        this.automodell = automodell;
    }
}
