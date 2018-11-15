package klassen;

public class Auto {
    public static final int DEFAULT_TUNE_WERT = 50;
    //Klassenvariablen:
    public static int erstellteAutos = 0;

    static {
        System.out.println("Die Auto-Klasse wurde initialisiert.");
    }

    //Instanz-Variablen
    //<Datentyp> <name> [<Zuweisung>]
    private int leistung; //0
    private final String hersteller; //null

    //Konstruktor2
    //<Klassenname> (<Parameterliste>) {<Logik>}
    public Auto(int leistung, String hersteller) {
        this.hersteller = hersteller;
        setLeistung(leistung);
        erstellteAutos++;
        System.out.println("Es wurde soeben das " + erstellteAutos + ". Autos erstellt");
    }


    public Auto(String hersteller) {
        this(100, hersteller);
    }

    //Instanz-Methoden
    //<Rückgabewert> <name> (<Parameterliste>) {<Logik>}
    public void tunen(int tuneWert) {
        /*
         *TODO:
         * check tunewert, wenn negativ -> reagiere drauf!
         * */
        leistung = leistung + tuneWert;
    }

    public void tunen() {
        tunen(DEFAULT_TUNE_WERT);
    }

    public int getLeistung() {
        return leistung;
    }

    public String getHersteller() {
        return hersteller;
    }

    private void setLeistung(int leistung) {
        /*
         *TODO:
         * check wert leistung, wenn negativ -> reagiere drauf!
         * */
        this.leistung = leistung;
    }

    //Klassenmethode:
    public static void printInfos(Auto auto) {
        System.out.println("Die Leistung ist: " + auto.leistung +
                ", der Hersteller ist: " + auto.hersteller);
    }
}
