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
public class PINTARTANGENTE {
    private JPanel PANEL;
    int ancho;
    int alto;
    private JTable TABLA;
    private JScrollPane DESPLAZAR;
    DefaultTableModel model=new DefaultTableModel();
    String Radianes="";
    String grados="";
    String Tang="";
    public PINTARTANGENTE(JPanel PANEL){
    this.PANEL=PANEL;
    ancho=PANEL.getWidth();
    alto=PANEL.getHeight();
    this.TABLA=TABLA;
    this.DESPLAZAR=DESPLAZAR;
    }
    public void pintar(){
    Graphics2D G=(Graphics2D)PANEL.getGraphics();
    G.setColor(new Color(0,0,0));
    G.fillRect(0, 0, ancho, alto);
    G.setColor(new Color(0,0,255));
    G.drawLine(0,alto/2,ancho,alto/2);
    G.setColor(new Color(255,0,0));


 
    }
public void Tangente(){
        Graphics2D G=(Graphics2D)PANEL.getGraphics();
        G.setColor(new Color(255,0,0));
    for(int i=0;i<=360;i++){
        int x1=i+((ancho/2)-180);
        int Tangente=(int)(Math.tan(Math.toRadians(i))*100);
        Tang+="\n"+Math.tan(Math.toRadians(i));
        grados+="\n"+i;
        Radianes+="\n"+Math.toRadians(i);
        try{
        G.drawLine(x1,(alto/2)+Tangente+5 , x1,(alto/2)+Tangente);
        Thread.sleep(10);
        }catch(Exception E){}
   }
}
public void TablaTangente(){
TABLA=new JTable(model);
DESPLAZAR.setViewportView(TABLA);
model.addColumn("Grados");
model.addColumn("Radianes");
model.addColumn("Tangente");
for(int i=0;i<=360;i++){
    double rads=i*Math.PI/180;
    double TAN=Math.tan(rads);
    Object[]fila=new Object[3];
    fila[0]=i;
    fila[1]=rads;
    fila[2]=TAN;
    model.addRow(fila);
}
}

public void DibujarPunto(int grados12){
Graphics2D G=(Graphics2D)PANEL.getGraphics();
double rad12=Math.tan(grados12*Math.PI/180)*100;
int alto1=PANEL.getHeight();
int tt=(int)rad12;
G.setColor(Color.YELLOW);
G.fillOval(grados12+10,( (alto1/2)+tt+10), 10, 10);
//G.fillOval(c, c, alto, ancho);
}
}