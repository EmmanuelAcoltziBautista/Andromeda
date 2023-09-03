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
public class PINTAR_FUNCIONES {
    private JPanel PANEL;
    int ancho;
     int escala=20;
    int alto;
    String Radianes="";
    String grados="";
    String seno="";
    public PINTAR_FUNCIONES(JPanel PANEL){//recibo el valor de JPanel
    this.PANEL=PANEL;
    ancho=PANEL.getWidth();
    alto=PANEL.getHeight();
    }
    public void pintar(){//pinto un plano cartesiano
    Graphics2D G=(Graphics2D)PANEL.getGraphics();
    G.setColor(new Color(0,0,0));
    G.fillRect(0, 0, ancho, alto);
    G.setColor(new Color(0,0,255));
    G.drawLine(0,alto/2,ancho,alto/2);
    G.drawLine(ancho/2, 0, ancho/2, alto);
    G.drawLine(ancho/2, 0, ancho/2, alto);
    G.setColor(new Color(255,0,0));


 
    }
public void X3(){//funcion cubica
    
        Graphics2D G=(Graphics2D)PANEL.getGraphics();
        G.setColor(new Color(255,0,0));
    for(float i=-10;i<=10;i+=.1){
        int x1=(int)(ancho/2+i*escala);
        int potencia=(int)Math.pow(i,3);
        int resultado=(int) alto/2-potencia*escala;
    
    
        try{
G.fillOval(x1, resultado, 10, 10);
        Thread.sleep(10);
        }catch(Exception E){}
   }
}

public void X2(){//funcion cuadrada
Graphics2D G=(Graphics2D)PANEL.getGraphics();
G.setColor(new Color(255,0,0));
for(double i=-10;i<=10;i+=.1){
    int cuad=(int) (i*i);
    int x=(int)(ancho/2+i*escala);
int y=(int)(alto/2-cuad*escala);
try{
G.fillOval(x, y, 10, 10);
Thread.sleep(10);
}catch(Exception E){}
}
}

public void ValorAbs(){//funcion valor absoluto
Graphics2D G=(Graphics2D)PANEL.getGraphics();
G.setColor(new Color(255,0,0));
for(double i=-10;i<=10;i+=.1){



if(i>0){//si ya es mayor a cero
int x2=(int)(ancho/2+i*escala);
int y2=(int)(alto/2-i*escala);

try{
G.fillOval(x2, y2, 10, 10);
Thread.sleep(10);
}catch(Exception E){}
}
else if(i<=0){
int x1=(int)(ancho/2+i*escala);
int y1=(int)(alto/2+i*escala);

try{    
    G.drawString("Si X=-1", ancho/4, ancho/2+20);
     G.drawString("Si X=1", ancho/2+50, ancho/2+20);
G.fillOval(x1, y1, 10, 10);
Thread.sleep(10);
}catch(Exception E){}
}
}
}


public void X4(){
Graphics2D G=(Graphics2D)PANEL.getGraphics();
G.setColor(new Color(255,0,0));

for(double i=-10;i<=10;i+=.1){
    double x4=1/i-0;
    int x=(int)(ancho/2+x4*50);
    int y=(int)(alto/2-x4*50);
    try{
        G.fillOval(x, y,1,1);
    Thread.sleep(10);
    }catch(Exception E){}
}
}
public void Raiz(){//raiz
Graphics2D G=(Graphics2D)PANEL.getGraphics();
G.setColor(new Color(255,0,0));
for(int i=0;i<=40;i++){
    double raiz=Math.sqrt(i);
    int x=(int)(ancho/2+raiz*escala);
    int y=(int)(alto/2-raiz*escala);
    try{
    G.fillOval(x, y, 10, 10);
    Thread.sleep(10);
    }catch(Exception E){}
    
}
}
}