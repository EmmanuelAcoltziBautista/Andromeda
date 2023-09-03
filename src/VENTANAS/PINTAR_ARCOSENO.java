/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/

/*
IMPORTANTE:
lo de la clase Seno ignorar

la funcion ArcoSeno solo es una pequela parte de la funcion seno solo que se reduce
para obtener un solo dato de informacion

*/
package VENTANAS;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
public class PINTAR_ARCOSENO {
    private JPanel PANEL;
    private JTable TABLA;
    private JScrollPane DESPLAZAR;
    DefaultTableModel model =new DefaultTableModel();
    int ancho;
    int alto;
    String Radianes="";
    String grados="";
    String ARCOSENOs="";
    public PINTAR_ARCOSENO(JPanel PANEL,JTable TABLA,JScrollPane DESPLAZAR){
    this.PANEL=PANEL;
    ancho=PANEL.getWidth();
    alto=PANEL.getHeight();
    this.TABLA=TABLA;
    this.DESPLAZAR=DESPLAZAR;
    }
    public void pintar(){//pinto la parte del plano cartesiano
    Graphics2D G=(Graphics2D)PANEL.getGraphics();
    G.setColor(new Color(0,0,0));
    G.fillRect(0, 0, ancho, alto);
    G.setColor(new Color(0,0,255));
    G.drawLine(0,alto/2,ancho,alto/2);
    G.drawLine(ancho/2, 0,ancho/2, alto);
    G.setColor(new Color(255,0,0));


 
    }
    
    
    
public void Arcoseno(){//pinto el arco seno
        Graphics2D G=(Graphics2D)PANEL.getGraphics();
        G.setColor(new Color(0,255,0));
    for(int i=90;i<=270;i++){
        int x1=i+((ancho/2)-180);
        int ARCOSENO=(int)(Math.sin(Math.toRadians(i))*100);//el 100 es una escala
        ARCOSENOs+="\n"+Math.sin(Math.toRadians(i));
        grados+="\n"+i;
        Radianes+="\n"+Math.toRadians(i);
        try{
            G.drawString("-1/2π  -90°", 100,alto/2+130);//parte donde empezara a graficar
              G.drawString("1/2π  90°", ancho/2+100,alto/2-130);//donde terminara
        G.drawLine(x1,(alto/2)+ARCOSENO+5 , x1,(alto/2)+ARCOSENO);
        Thread.sleep(10);
        }catch(Exception E){}
   }
}

public void TablaArcoSeno(){//lleno la tabla que recibi
TABLA =new JTable(model);
DESPLAZAR.setViewportView(TABLA);//coloco las columnas
model.addColumn("Grados");
model.addColumn("Radianes");
model.addColumn("Seno");
for(int i=90;i<=270;i++){
    double rad=i*Math.PI/180;//realizo las operaciones matematicas
    double sin=Math.sin(rad);
    Object[] fila=new Object[3];
    fila[0]=i;//leno las filas
    fila[1]=rad;
    fila[2]=sin;
    model.addRow(fila);

}
}
public void DibujarPunto(int grados12){
Graphics2D G=(Graphics2D)PANEL.getGraphics();
double rad12=Math.sin(grados12*Math.PI/180)*100;
int alto1=PANEL.getHeight();
int ss=(int)rad12;
G.setColor(Color.YELLOW);
G.fillOval(grados12+10,( (alto1/2)+ss+10), 10, 10);
//G.fillOval(c, c, alto, ancho);
}
}