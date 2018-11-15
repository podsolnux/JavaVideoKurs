package programme;
import klassen.Kunde;

public class KundenDemo {
    public static void main(String[] args) {
        Kunde kunde = new Kunde("Martin", "Huber");
        System.out.println("Der Kunde heisst: " + kunde.getVorname());
        System.out.println("Sein Nachname ist: " + kunde.getNachname());
        System.out.println("ID ist : " + kunde.getIdentifikationsNummer());
        System.out.println("Der Kunde wird geaendert");
        kunde.nameAendern("Natascha", "Kulyasova");
        System.out.println("Der Kunde heisst: " + kunde.getVorname());
        System.out.println("Sein Nachname ist: " + kunde.getNachname());
        System.out.println("ID ist : " + kunde.getIdentifikationsNummer());
        Kunde kunde2 = new Kunde("Martin", "Hubabuba");
        System.out.println("ID ist : " + kunde2.getIdentifikationsNummer());
        Kunde kunde3 = new Kunde("Martin", "Hubabuba");
        System.out.println("ID ist : " + kunde3.getIdentifikationsNummer());

    }
}
