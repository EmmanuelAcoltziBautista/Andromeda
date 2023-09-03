/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/

package VENTANAS;
import javax.swing.*;
import java.util.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;
public class Cargando extends JFrame implements ActionListener{
private JLabel label1,label2;
int i;
public Cargando(){
    setLayout(null);
    setTitle("Cargando...");
    
     setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
     
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
  
    
    label1=new JLabel("Cargando...");
    label1.setFont(new Font("Andale Mono",1,20));
    label1.setForeground(new Color(255,255,255));
    label1.setBounds(200,20,300,30);
    add(label1);
    
    label2=new JLabel();
    label2.setBounds(0,0,500,200);
add(label2);

    


    ImageIcon Im=new ImageIcon("src/images/wallpaperPrincipal.jpg");
    Icon I=new ImageIcon(Im.getImage().getScaledInstance(label2.getWidth(),label2.getHeight(),Image.SCALE_DEFAULT));
    label2.setIcon(I);

    }
    @Override
    //dibujo la animacion
public void paint(Graphics G){
super.paint(G);
G.setColor(new Color(0,0,0));
G.drawRect(20,100,400,40);
while(i<=399){
    try{
        G.setColor(new Color(0,255,0));
G.fillRect(21,101,i,39);
i++;
//si completo la animacion redirijeme
if(i==399){
      PRINCIPAL P=new PRINCIPAL();
    P.setBounds(0,0,800,500);
    P.setVisible(true);
    P.setLocationRelativeTo(null);
    P.setResizable(false);
    this.setVisible(false);
}
//para darle estilo a ala animacion
Thread.sleep(10);
    }catch(Exception E){}


}
}
@Override
    public void actionPerformed(ActionEvent A){}
    public static void main(String args[]){
    Cargando C=new Cargando();
    C.setBounds(0,0,500,200);
    C.setLocationRelativeTo(null);
    C.setVisible(true);
    C.setResizable(false);
    }
}
