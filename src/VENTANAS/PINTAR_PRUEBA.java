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
public class PINTAR_PRUEBA {
    private JPanel PANEL;
    int ancho;
    private JScrollPane DESPLAZAR;
    int alto;
    int i;
    private JTable TABLA;
    double rad;
    String Radianes="";
    String grados="";
    String arcocosenos="";
    DefaultTableModel model =new DefaultTableModel();
    public PINTAR_PRUEBA(JPanel PANEL,JTable TABLA,JScrollPane DESPLAZAR){
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
    G.drawLine(ancho/2,0 , ancho/2, alto);
    G.setColor(new Color(255,0,0));


 
    }
    public void TABLA(){
         TABLA=new JTable(model);
   DESPLAZAR.setViewportView(TABLA);
   model.addColumn("Grados");
   model.addColumn("Radianes");
   model.addColumn("Seno"); 
     
   for(int i1=0;i1<=20;i1++){
       double rads=i1*Math.PI/180;
       double tang=Math.tan(rads);
     
       Object []fila=new Object[3];
            fila[0]=i1;
            fila[1]=rads;
            fila[2]=tang;
            model.addRow(fila);
   }
    }
public void Arcoseno(){
        Graphics2D G=(Graphics2D)PANEL.getGraphics();
        G.setColor(new Color(0,255,0));
        
  

        
   
    for(i=-90;i<=90;i++){
        int x1=i+((ancho/2));
        rad=(i*Math.PI/180);
        double tangente=(Math.tan(rad));
        double ARC =(Math.atan(tangente)*100);
        int ARCOTANGENTE=(int)ARC;
        arcocosenos+="\n"+ARC;
        
        grados+="\n"+i;
        Radianes+="\n"+Math.toRadians(i);
     
        try{
            
            G.drawLine(x1,(alto/2)+ARCOTANGENTE+5 , x1,(alto/2)+ARCOTANGENTE);
        Thread.sleep(10);
        }catch(Exception E){}
   }
}

}