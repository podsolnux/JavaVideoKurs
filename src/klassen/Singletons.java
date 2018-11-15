package klassen;

public class Singletons {
    private Singletons() {
        System.out.println("I am Singleton");
    }

    private static final Singletons instance = new Singletons();

    public static Singletons getInstance() {
        return instance;
    }

}
