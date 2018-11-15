package programme;

public class SchaltjahrDemo {
    public static void main(String[] args) {
        int jahr = 2001;
        boolean isSchaltjahr = (jahr%4 == 0 || (jahr%400 == 0 && jahr%100 != 0));
        System.out.println(isSchaltjahr? "Das Jahr "+jahr+" ist ein Schaltjahr" : "Das Jahr "+jahr+" ist kein Schaltjahr");
    }
}
