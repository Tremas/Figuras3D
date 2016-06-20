package circumferencia;

import javax.swing.*;
import java.awt.*;

/**
 * Created by professor on 20/06/2016.
 */
public class Screen extends JPanel {

    public  void paintComponent(Graphics g){
        g.fillOval(100,100,300,500);//x,y,width,height
        //x= discancia del borde de la izkierda a la circumferencia
        //y= distancia del arriba kon el borde de la circumferecia
        //witdh= ancho
        //height=altura
    }
}
