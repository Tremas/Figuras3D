package cuadrado;

import javax.swing.*;
import java.awt.*;

/**
 * Created by professor on 20/06/2016.
 */
public class Screen extends JPanel {


    double[] ViewFrom = new double[]{10,10,10};
    double[] ViewTo = new double[]{0,0,0};


    PolygonObject Poly1;


    public Screen(){
        Poly1 = new PolygonObject(new int[]{5,20,20,5}, new int[]{5,5,20,20},Color.blue);
        //            Puntos  sentido del reloj(x1,x2,x3,x4)                 (y1,y2,y3,y4) ,color borde
    }

    public  void paintComponent(Graphics g){

        Poly1.drawPolygon(g);
    }
}
