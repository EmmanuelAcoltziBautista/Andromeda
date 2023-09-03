/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/
package VENTANAS;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class PI extends JFrame implements ActionListener{
    private JLabel label1;
    private JButton BOTON1;
    public PI(){
    setLayout(null);
    getContentPane().setBackground(new Color(255,255,255));
    setTitle("PI");
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    
     setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    
    label1=new JLabel("PI");
    label1.setFont(new Font("Andale Mono",1,20));
    label1.setBounds(200,10,200,30);
    add(label1);
    
    BOTON1=new JButton("Regresar");
    BOTON1.setBounds(100,620,200,30);
    BOTON1.addActionListener(this);
    add(BOTON1);
    
    }
    @Override
    public void actionPerformed(ActionEvent A){
    if(A.getSource()==BOTON1){
        PRINCIPAL P=new PRINCIPAL();
    P.setBounds(0,0,800,500);
    P.setVisible(true);
    P.setResizable(false);
    P.setLocationRelativeTo(null);
this.setVisible(false);
        }
    }
    @Override
    public void paint(Graphics G){
        super.paint(G);
        G.setColor(new Color(255,0,0));
        G.drawOval(100, 80, 200, 200);//printo el circulo
        G.setColor(new Color(0,0,0));
        G.drawLine(200,180, 100, 180);
        G.drawString("Radio=100", 200,150);
        G.drawString("Diametro=Radio*2",100,300);
        G.drawLine(100, 320, 300, 320);
        
        G.setColor(new Color(255,0,0));
        G.drawArc(100, 340, 200, 200, 0, 100);//grafico una parte del circulo
        G.drawString("1",300,400);
        G.setColor(new Color(0,255,0));
        G.drawArc(100, 340, 200, 200, 100, 100);
        G.drawString("2",100,400);
        G.setColor(new Color(0,0,255));
        G.drawArc(100, 340, 200,200, 200, 100);
        G.drawString("3", 100,500);
        G.setColor(new Color(0,0,0));
        G.drawString(".1415",300,500);
        G.drawString("Es 3 veces el diametro a travez del perimetro del circulo",100, 580);
        
    }
    
    
    public static void main(String args[]){
    PI P=new PI();
    P.setBounds(0,0,500,700);
    P.setLocationRelativeTo(null);
    P.setVisible(true);
    P.setResizable(false);
    }
}
