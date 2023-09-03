/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/
package VENTANAS;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class FUNCIONES extends JFrame implements ActionListener{
    private JPanel PANEL;
    private JButton BOTON1,BOTON2,BOTON3,BOTON4,BOTON5;
    private JLabel label1,label5;
    private JTextArea AREA;
    
    public FUNCIONES(){
    setLayout(null);
    setTitle("Funciones");
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    
     setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    
    label1=new JLabel("Funciones");
    label1.setFont(new Font("Andale Mono",1,20));
    label1.setBounds(200,10,200,30);
    add(label1);
    
    PANEL=new JPanel();
    PANEL.setBounds(10,80,400,400);
    add(PANEL);
    
    BOTON1=new JButton("Funcion cubica");
    BOTON1.setBounds(500,80,200,30);
    BOTON1.addActionListener(this);
    add(BOTON1);
    
    BOTON2=new JButton("Regresar");
    BOTON2.setBounds(220,530,200,30);
    BOTON2.addActionListener(this);
    add(BOTON2);
    
   BOTON3=new JButton("Funcion cuadrada");
   BOTON3.setBounds(500,130,200,30);
   BOTON3.addActionListener(this);
   add(BOTON3);
   
   BOTON4=new JButton("Funcion valor absoluto");
   BOTON4.setBounds(500,180,200,30);
   BOTON4.addActionListener(this);
   add(BOTON4);
    
    
    label1.setForeground(new Color(255,255,255));
   
    BOTON1.setBackground(new Color(155,155,255));
    BOTON2.setBackground(new Color(155,155,255));
    BOTON3.setBackground(new Color(155,155,255));
    BOTON4.setBackground(new Color(155,155,255));
    BOTON1.setForeground(new Color(255,255,255));
    BOTON2.setForeground(new Color(255,255,255));
    BOTON3.setForeground(new Color(255,255,255));
    BOTON4.setForeground(new Color(255,255,255));
    BOTON1.setFont(new Font("Andale Mono",1,15));
    BOTON2.setFont(new Font("Andale Mono",1,15));
    BOTON3.setFont(new Font("Andale Mono",1,15));
    BOTON4.setFont(new Font("Andale Mono",1,15));
    
  
    AREA=new JTextArea();
    AREA.setVisible(false);
    AREA.setBounds(480,250,300,300);
    add(AREA);
    
    label5=new JLabel();
    label5.setBounds(0,0,1000,600);
    add(label5);
    
    ImageIcon im=new ImageIcon("src/images/wallpaperPrincipal.jpg");
    Icon i=new ImageIcon(im.getImage().getScaledInstance(label5.getWidth(),label5.getHeight(),Image.SCALE_DEFAULT));
    label5.setIcon(i);
    
    }
    @Override
    public void actionPerformed(ActionEvent A){
    if(A.getSource()==BOTON1){
    PINTAR_FUNCIONES P=new PINTAR_FUNCIONES(PANEL);//envio el JPanel
    P.pintar();//llamo para que pinte
    P.X3();
    }
    if(A.getSource()==BOTON3){
    PINTAR_FUNCIONES P=new PINTAR_FUNCIONES(PANEL);
    P.pintar();
    P.X2();
    }
    if(A.getSource()==BOTON4){
    PINTAR_FUNCIONES P=new PINTAR_FUNCIONES(PANEL);
    P.pintar();
    P.ValorAbs();
    AREA.setText("");
    }
    if(A.getSource()==BOTON2){
            PRINCIPAL P=new PRINCIPAL();
    P.setBounds(0,0,800,500);
    P.setVisible(true);
    P.setLocationRelativeTo(null);
    P.setResizable(false);
    this.setVisible(false);
    }
    }
    public static void main(String args[]){
        FUNCIONES P=new FUNCIONES();
        P.setBounds(0,0,800,600);
        P.setLocationRelativeTo(null);
        P.setVisible(true);
        P.setResizable(false);
    }
}