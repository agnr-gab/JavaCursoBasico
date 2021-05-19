import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class SistemaDataHora {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.println("A data e hora atual é " + data.toString());

        Locale loc = Locale.getDefault();
        System.out.println("O seu sistema operacional está em " + loc.getDisplayLanguage() +
                "(" + loc.getLanguage() + ")");

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        System.out.println("Dimensão da tela: " + width + " x " + height);

    }
}