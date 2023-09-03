/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/
package VENTANAS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Angulos{
    private JScrollPane DESPLAZAR;
    private JPanel PANEL;
    int ancho;
    int alto;
    double ANGULO;

    //OBTENGO LOS DATOS QUE ME ENVIAN

    public Angulos(JPanel PANEL,JScrollPane DESPLAZAR,double ANGULO){
    this.PANEL=PANEL;
    this.DESPLAZAR=DESPLAZAR;
    this.ANGULO=ANGULO;
    ancho=PANEL.getWidth();
    alto=PANEL.getHeight();
    }
    
    
    //AQUI GRAFICO LOS ANGULOS
    
    public void Pintar(){
        int ANg=(int)ANGULO;
        Graphics2D G=(Graphics2D)PANEL.getGraphics();
    G.clearRect(0, 0, ancho, alto);
G.setColor(new Color(155,155,255));
G.fillRect(0, 0, ancho, alto);
    G.setColor(new Color(255,0,0));
    G.fillArc(10,10,100,100,0,360);
    G.setColor(new Color(0,0,0));
        G.fillArc(10, 10, 100, 100, 0, ANg);
    G.setColor(new Color(255,255,255));
    G.fillArc(45, 45, 30, 30, 0, ANg);
      G.drawString(ANg+"°", 80, 50);
    }
    
    //GRAFICO EL OTRO ANGULO
    public void PINTAR2(){
        int ANg=(int)ANGULO;
        Graphics2D G=(Graphics2D)PANEL.getGraphics();
   
        G.clearRect(0, 0, ancho, alto);
        G.setColor(new Color(155,155,255));
        G.fillRect(0, 0, ancho, alto);
        G.setColor(new Color(255,0,0));
        G.fillArc(10, 10,100,100 ,  0, 360);
    G.setColor(new Color(0,0,0));
        G.fillArc(10, 10, 100, 100, 0, ANg);
      G.setColor(new Color(255,255,255));
    G.fillArc(45, 45, 30, 30, 0, ANg);
        G.drawString(ANg+"°", 80, 50);
   
    }
    
}
