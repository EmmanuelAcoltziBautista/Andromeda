/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/
package VENTANAS;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DegARad extends JFrame implements ActionListener{
private JLabel label1,label2,label3,label4,label5;
private JTextField TEXTO1,TEXTO2;
private JPanel PANEL;

private JScrollPane DESPLAZAR,DESPLAZAR3;
private JButton BOTON1,BOTON2,BOTON3;
    public DegARad(){
        setLayout(null);
     
         setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
        setTitle("Conversor");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        label1=new JLabel("Grados a Radianes");
        label1.setFont(new Font("Andale Mono",1,20));
        label1.setForeground(new Color(255,255,255));
        label1.setBounds(200,30,300,30);
        add(label1);
        
        label2=new JLabel("Ingresa la cantidad a convertir");
        label2.setForeground(new Color(255,255,255));
        label2.setBounds(10,80,300,30);
        add(label2);
        
        label4=new JLabel("π→180°");
        label4.setFont(new Font("Andale Mono",1,15));
        label4.setForeground(new Color(255,255,255));
        label4.setBounds(10,130,200,30);
        add(label4);
        
        TEXTO1=new JTextField("0");
        TEXTO1.setBounds(250,80,200,30);
        add(TEXTO1);
        
        BOTON1=new JButton("A grados sexagesimales");
        BOTON1.setBackground(new Color(155,155,255));
        BOTON1.setForeground(new Color(255,255,255));
        BOTON1.setBounds(470,80,200,30);
        BOTON1.addActionListener(this);
        add(BOTON1);
        
          BOTON2=new JButton("A radianes");
          BOTON2.setBackground(new Color(155,155,255));
          BOTON2.setForeground(new Color(255,255,255));
          BOTON2.setBounds(470,110,200,30);
        BOTON2.addActionListener(this);
        add(BOTON2);
        
        label4=new JLabel("Resultado:");
        label4.setForeground(new Color(255,255,255));
        label4.setBounds(10,180,200,30);
        add(label4);
        
        TEXTO2=new JTextField();
        TEXTO2.setEditable(false);
        DESPLAZAR=new JScrollPane(TEXTO2);
        DESPLAZAR.setBounds(150,180,300,30);
        add(DESPLAZAR);
        
        BOTON3=new JButton("Regresar");
        BOTON3.setFont(new Font("Andale Mono",1,15));
        BOTON3.setBackground(new Color(155,155,255));
        BOTON3.setForeground(new Color(255,255,255));
        BOTON3.setBounds(20,230,200,30);
        BOTON3.addActionListener(this);
        add(BOTON3);
        
        PANEL=new JPanel();
        DESPLAZAR3=new JScrollPane(PANEL);
        DESPLAZAR3.setBounds(480,150,130,130);
        add(DESPLAZAR3);
        
        label3=new JLabel();
        label3.setBounds(0,0,700,400);
        add(label3);
        
        ImageIcon im=new ImageIcon("src/images/wallpaperPrincipal.jpg");
        Icon i=new ImageIcon(im.getImage().getScaledInstance(label3.getWidth(),label3.getHeight(), Image.SCALE_DEFAULT));
        label3.setIcon(i);
        
    }
@Override
public void actionPerformed(ActionEvent A){
if(A.getSource()==BOTON1){

    //llamo los valores y realizo las conversiones

    double can=Double.parseDouble(TEXTO1.getText());
    double res;
            res=can/Math.PI*180;//rad a Deg
    TEXTO2.setText(""+res);
  // envio los valores y llamo a la funcion
Angulos An=new Angulos(PANEL,DESPLAZAR,res);
An.Pintar();
}
if(A.getSource()==BOTON2){//realizo las conversiones 
double can=Double.parseDouble(TEXTO1.getText());
double res=can*Math.PI/180;//Deg a Rad
TEXTO2.setText(""+res);

Angulos An=new Angulos(PANEL,DESPLAZAR,can);
An.PINTAR2();
}
if(A.getSource()==BOTON3){
     PRINCIPAL P=new PRINCIPAL();
    P.setBounds(0,0,800,500);
    P.setVisible(true);
    P.setLocationRelativeTo(null);
    P.setResizable(false);
this.setVisible(false);
}
}
    public static void main(String args[]){
 DegARad D=new DegARad();
 D.setBounds(0,0,700,400);
 D.setVisible(true);
 D.setResizable(false);
 D.setLocationRelativeTo(null);
 }   
}