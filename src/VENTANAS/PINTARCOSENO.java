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
public class PINTARCOSENO {
    private JPanel PANEL;
    private JScrollPane DESPLAZAR;
    private JTable TABLA;
    DefaultTableModel model=new DefaultTableModel();
    int ancho;
    int alto;
    String Radianes="";
    String grados="";
    String coseno="";
    public PINTARCOSENO(JPanel PANEL){//recibo los valores
    this.PANEL=PANEL;
    ancho=PANEL.getWidth();
    alto=PANEL.getHeight();
    this.DESPLAZAR=DESPLAZAR;
    this.TABLA=TABLA;
    }
    public void pintar(){//pinto el fondo y la linea X
    Graphics2D G=(Graphics2D)PANEL.getGraphics();
    G.setColor(new Color(0,0,0));
    G.fillRect(0, 0, ancho, alto);
    G.setColor(new Color(0,0,255));
    G.drawLine(0,alto/2,ancho,alto/2);
    G.setColor(new Color(255,0,0));


 
    }
public void COSENO(){
        Graphics2D G=(Graphics2D)PANEL.getGraphics();
        G.setColor(new Color(255,0,0));
    for(int i=0;i<=360;i++){//de 0 grados a 360 grados 
        int x1=i+((ancho/2)-180);
        int Seno=(int)(Math.cos(Math.toRadians(i))*100);//realizo las operaciones matematicas necesarias y multiplico por 100 para la escala
        coseno+="\n"+Math.cos(Math.toRadians(i));
        grados+="\n"+i;
        Radianes+="\n"+Math.toRadians(i);
        try{
        G.drawLine(x1,(alto/2)+Seno+5 , x1,(alto/2)+Seno);//grafico el 5 representa el grueso
        Thread.sleep(10);//la animacion para que vaya descansando y le de ese efecto
        }catch(Exception E){}
   }
}
public void TablaCOSeno(){
TABLA=new JTable(model);
DESPLAZAR.setViewportView(TABLA);
model.addColumn("Grados");
model.addColumn("Radianes");
model.addColumn("Coseno");
for(int i=0;i<=360;i++)
{
double radd=i*Math.PI/180;
double cos=Math.cos(radd);
Object[] fila=new Object[3];
fila[0]=i;
fila[1]=radd;
fila[2]=cos;
model.addRow(fila);
}
}
public void DibujarPunto(int grados12){//dibujo el punto con las cordenadas
Graphics2D G=(Graphics2D)PANEL.getGraphics();
double rad12=Math.cos(grados12*Math.PI/180)*100;//lo 
int alto1=PANEL.getHeight();
int cc=(int)rad12;
G.setColor(Color.YELLOW);
G.fillOval(grados12+10,( (alto1/2)+cc+10), 10, 10);
//G.fillOval(c, c, alto, ancho);
}
}