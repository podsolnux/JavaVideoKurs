package klassen;

public class Kunde {
//Implementiere eine Methode in dieser Klasse, mit der sich sowohl der Vorname als auch der
//Nachname eines Kunden ändern lässt.

    private String vorname;
    private String nachname;
    private static int idCounter = 1;
    private final int identifikationsNummer;

    public Kunde(String vorname, String nachname) {
        this.identifikationsNummer = idCounter;
        setVorname(vorname);
        setNachname(nachname);
        idCounter++;
    }

    public void nameAendern(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public int getIdentifikationsNummer() {
        return identifikationsNummer;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
