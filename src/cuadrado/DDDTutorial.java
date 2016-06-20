package cuadrado;

import javax.swing.*;
import java.awt.*;

/**
 * Created by professor on 20/06/2016.
 */
public class DDDTutorial extends JFrame {
    // Archivo ejecutable
    static JFrame F = new DDDTutorial();
    Screen ScreenObject = new Screen();
    public DDDTutorial() {
        add(ScreenObject);//añade objeto dibujable
        setUndecorated(true);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());//establece tamaño pantalla de atras(marron)
        setVisible(true);//hace que sea visible
    }


    public static void main(String[] args) {

    }
}
