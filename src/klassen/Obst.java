package klassen;

public class Obst {
    private String obstBezeichnung;
    private double einkaufsPreis; //in Euro
    private double verkaufsPreis; // in Euro
    private int naehrwert; //in kcal

    public Obst(String dieObstBezeichnung, double derEinkaufspreis, int derNaehrwert) {
        setObstBezeichnung(dieObstBezeichnung);
        setEinkaufsPreis(derEinkaufspreis);
        setVerkaufsPreis(derEinkaufspreis * 2);
        setNaehrwert(derNaehrwert);
    }

    public void aufpeppen() {
        setVerkaufsPreis(verkaufsPreis * 2);
        setNaehrwert(naehrwert + 50);
    }

    private void setEinkaufsPreis(double einkaufsPreis) {
        this.einkaufsPreis = einkaufsPreis;
    }

    private void setVerkaufsPreis(double derVerkaufspreis) {
        this.verkaufsPreis = derVerkaufspreis;
    }

    private void setNaehrwert(int naehrwert) {
        this.naehrwert = naehrwert;
    }

    private void setObstBezeichnung(String obstBezeichnung) {
        this.obstBezeichnung = obstBezeichnung;
    }

    public String getObstBezeichnung() {
        return obstBezeichnung;
    }

    public double getEinkaufsPreis() {
        return einkaufsPreis;
    }

    public double getVerkaufsPreis() {
        return verkaufsPreis;
    }

    public int getNaehrwert() {
        return naehrwert;
    }
}