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
import javax.swing.table.DefaultTableModel;
public class PINTARSENO {
    private JPanel PANEL;
    private JTable TABLA;
    DefaultTableModel model=new DefaultTableModel();
    private JScrollPane DESPLAZAR;
    int ancho;
    int alto;
    public static String x="";
    String Radianes="";
    String grados="";
    String seno="";
    public PINTARSENO(JPanel PANEL){
    this.PANEL=PANEL;
    ancho=PANEL.getWidth();
    alto=PANEL.getHeight();
    this.TABLA=TABLA;
    this.DESPLAZAR=DESPLAZAR;
    }
    public void pintar(){//recibo los valores
    Graphics2D G=(Graphics2D)PANEL.getGraphics();
    G.setColor(new Color(0,0,0));
    G.fillRect(0, 0, ancho, alto);
    G.setColor(new Color(0,0,255));
    G.drawLine(0,alto/2,ancho,alto/2);
    G.drawLine(ancho/2, 0, ancho/2, alto);
    G.setColor(new Color(255,0,0));


 
    }
public void Seno(){
    /*
    IMPORTANTE:
    solo muestro de 0° a 360° grados sexagesimales
    Pi=180°rad
    
    */
        Graphics2D G=(Graphics2D)PANEL.getGraphics();
        G.setColor(new Color(255,0,0));
    for(int i=0;i<=360;i++){//grafico con los siguientes grados
        int x1=i+((ancho/2)-180);
        int Seno=(int)(Math.sin(Math.toRadians(i))*100);//realizo las operaciones y agrego la escala
        seno+="\n"+Math.sin(Math.toRadians(i));
        grados+="\n"+i;
        Radianes+="\n"+Math.toRadians(i);
        try{
              G.drawString("-1/2π  -90°", 100,alto/2+130);//coloco los puntos por los que pasara
              G.drawString("1/2π  90°", ancho/2+100,alto/2-130);
                G.drawString("-π  -180°", 10,alto/2-30);
              G.drawString("π  180°", ancho/2+160,alto/2+30);
            G.drawLine(x1,(alto/2)+Seno+5 , x1,(alto/2)+Seno);
        Thread.sleep(10);
        }catch(Exception E){}
   }
}



public void Seno1(){//AQUI ES LA FUNCION ARCOSENO

  /*
    IMPORTANTE:
    La funcion arcoSeno es solo una pequeña parte de la funcion seno,
    esto con el fin de definir los valores que obtendre
    */
    
    
    int y=Integer.parseInt(x);  
    Graphics2D G=(Graphics2D)PANEL.getGraphics();
        G.setColor(new Color(255,0,0));
    for(int i=0;i<=360;i++){
        int x1=i+((ancho/2)-180);
        int Seno=(int)(Math.sin(Math.toRadians(i))*100);
        seno+="\n"+Math.sin(Math.toRadians(i));
        grados+="\n"+i;
        Radianes+="\n"+Math.toRadians(i);
  //      int fil=fila;
        
        double radi=y*Math.PI/180;
        int rad=(int)radi;
        G.setColor(Color.YELLOW);
        G.drawOval(y, rad, 10, 10);
        
   }
}
public void DibujarPunto(int grados12){//coloco el punto que seleccione el usuario
Graphics2D G=(Graphics2D)PANEL.getGraphics();
double rad12=Math.sin(grados12*Math.PI/180)*100;
int alto1=PANEL.getHeight();
int ss=(int)rad12;
G.setColor(Color.YELLOW);
G.fillOval(grados12+10,( (alto1/2)+ss+10), 10, 10);
//G.fillOval(c, c, alto, ancho);
}
}




