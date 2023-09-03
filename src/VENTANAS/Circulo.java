/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/
package VENTANAS;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class Circulo {
    private JPanel PANEL;
    double RADIO;
    int ancho;
    int alto;
   double Area;
    double Perimetro;
    public Circulo(JPanel PANEL,double RADIO){//recibo los valores que me envian
    this.PANEL=PANEL;
    this.RADIO=RADIO;
    this.ancho=PANEL.getWidth();
    this.alto=PANEL.getHeight();
    }
    public void Operaciones(){
     Perimetro=2*Math.PI*RADIO;//operacion para calcular el perimetro
     Area=Math.PI*Math.pow(RADIO,2);
    }
    public void pintar(){//pinto
    Graphics2D G=(Graphics2D)PANEL.getGraphics();
  G.setColor(new Color(0,0,0));
  G.fillRect(0, 0, ancho, alto);
    G.setColor(new Color(255,0,0));
  
        G.drawOval(100, 80, 200, 200);//grafico el circulo
        G.setColor(new Color(0,255,0));
        G.drawLine(200,180, 100, 180);
        G.drawString("Radio="+RADIO, 200,150);
        G.setColor(new Color(0,255,0));
        G.drawString("Formulas:", 10, 350);
        
        G.drawString("Perimetro=2ñ*Radio",10,360+2);//escribo las formulas
        G.drawString("Area=ñ*Radio^2",10,370+2);
        
        G.drawString("Sustitución:", 200, 350);
        G.drawString("Perimetro=2ñ*"+RADIO,200,360+2);//sustituyo
        G.drawString("Area=ñ*"+RADIO+"^2",200,370+2);
        
      Operaciones();
         G.drawString("Resultados:", 350, 350);
        G.drawString("Perimetro="+Perimetro,350,360+2);//respuestas
        G.drawString("Area="+Area,350,370+2);
        
    }
}
