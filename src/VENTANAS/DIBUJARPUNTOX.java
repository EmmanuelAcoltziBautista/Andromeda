/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/
package VENTANAS;

import java.awt.Color;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class DIBUJARPUNTOX{
   private int ancho,alto;
   private int escala=10;
   private JPanel panel;
    
   public DIBUJARPUNTOX(JPanel panel,int escala){//recibo los valores que me envian
        this.panel=panel;
        ancho=panel.getWidth();
        alto=panel.getHeight();
        this.escala=escala;
    }
public void limpiarpanel(){
Graphics2D g=(Graphics2D)panel.getGraphics();//limpio el JPanel
g.clearRect(1, 1, alto-2, ancho-2);
}
   public void dibujos1(){//grafico
Graphics2D g=(Graphics2D) panel.getGraphics();
g.clearRect(1, 1, alto-2, ancho-2);//limpio el Panel
g.setColor(new Color(255,0,0));
g.drawLine(ancho/2, 0, ancho/2, alto);//dibujo las lineas X y Y
g.drawLine(0,alto/2,ancho,alto/2);
g.setColor(new Color(0,0,255));


//x


for(int xd=ancho/2;xd<ancho;xd+=escala){
 //   g.drawLine(ancho/2,0,xd,alto);
g.drawLine(xd+escala,0,xd+escala,alto);//dibujo la cuadricula
}
for(int xi=0;xi<ancho/2-escala;xi+=escala){
g.drawLine(xi+escala,0,xi+escala,alto);
}

//y

for(int yar=0;yar<alto/2-escala;yar+=escala){
//g.drawLine(0,ya+10,ancho,alto/2);
    g.drawLine(0,yar+escala,ancho,yar+escala);
}
for(int ya=ancho/2;ya<alto;ya+=escala){
    g.drawLine(0,ya+escala,ancho,ya+escala);
}
}
   public void dibujos(){
Graphics2D g=(Graphics2D) panel.getGraphics();
//g.clearRect(1, 1, alto-2, ancho-2);
g.setColor(new Color(255,0,0));
g.drawLine(ancho/2, 0, ancho/2, alto);
g.drawLine(0,alto/2,ancho,alto/2);
g.setColor(new Color(0,0,255));


//x


for(int xd=ancho/2;xd<ancho;xd+=escala){
 //   g.drawLine(ancho/2,0,xd,alto);
g.drawLine(xd+escala,0,xd+escala,alto);
}
for(int xi=0;xi<ancho/2-escala;xi+=escala){
g.drawLine(xi+escala,0,xi+escala,alto);
}

//y

for(int yar=0;yar<alto/2-escala;yar+=escala){
//g.drawLine(0,ya+10,ancho,alto/2);
    g.drawLine(0,yar+escala,ancho,yar+escala);
}
for(int ya=ancho/2;ya<alto;ya+=escala){
    g.drawLine(0,ya+escala,ancho,ya+escala);
}
}
public void DibujarPunto(int X,int Y){
Graphics2D g=(Graphics2D) panel.getGraphics();
g.setColor(new Color(0,0,0));
int x=ancho/2+X*escala;
int y=alto/2-Y*escala;
g.fillOval(x-3, y-3, 6, 6);
}
}