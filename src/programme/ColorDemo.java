package programme;

import java.awt.*;

public class ColorDemo {
    public static void main(String[] args) {
/*
        1. In einer Varaiblen auf ein Color-Objekt der Farbe gelb referenziert
        2. Die Farbkanäle dieses Objekts auf der Konsole ausgibt, im Format:
        <R> - <G> - <B>
                3. Anschließend den Farbton etwas dunkler macht
        4. Am Ende nochmals die Farbkanäle auf der Konsole ausgibt
*/

        Color gelb = new Color(250, 250, 0);
        showColor(gelb);
        gelb = gelb.darker();
        showColor(gelb);
    }

    static void showColor(Color color) {
        System.out.println("<" + color.getRed() + "> - <" + color.getGreen() + "> - <" + color.getBlue() + ">");

    }

}
