package programme;
import klassen.Obst;

public class ObstDemo {
    public static void main(String[] args) {
        System.out.println("Bauer baut Obst an");
        Obst apfel = new Obst("Apfel", 1.50, 100);
        showObst(apfel);
        apfel.aufpeppen();
        showObstNachDemAufpeppen(apfel);

        Obst birne = new Obst("Birne", 1.70, 90);
        showObst(birne);
        birne.aufpeppen();
        showObstNachDemAufpeppen(birne);
        System.out.println(new Obst("Granatapfel", 2.50, 100).getNaehrwert() + " ist der Naerwert des dritten Obstes");
    }

    private static void showObst(Obst obst) {
        System.out.println("Sein Obst ist " + obst.getObstBezeichnung());
        System.out.println("Der Einkaufspreis liegt bei " + obst.getEinkaufsPreis() + " Euro");
        System.out.println("Der Verkaufspreis liegt bei " + obst.getVerkaufsPreis() + " Euro");
        System.out.println("Der Naehrwert ist " + obst.getNaehrwert() + " kcal");
    }

    private static void showObstNachDemAufpeppen(Obst obst) {
        System.out.println("Nach dem Aufpeppen:");
        System.out.println("Der Verkaufspreis ist " + obst.getVerkaufsPreis() + " Euro");
        System.out.println("Der Naehrwert ist " + obst.getNaehrwert() + " kcal");
    }
}
