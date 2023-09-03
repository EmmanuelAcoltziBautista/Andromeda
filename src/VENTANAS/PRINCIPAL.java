/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/

/*
IMPORTANTE ESTO SOLO ES UN DIRECTORIO ES LO QUE ME DIRIJE A LAS DEMAS CLASES PARA 
SU INTERACCION
*/

package VENTANAS;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class PRINCIPAL extends JFrame implements ActionListener{
    private JLabel label1,label2,label3,label4,PANEL,label5;
    private JMenuBar BAR;
    private JMenu MENU1;
//    private JPanel PANEL;
    private JMenuItem item1,item2;
    private JButton BOTON1,BOTON2,BOTON3,BOTON4,BOTON5,BOTON6,BOTON7,BOTON8,BOTON9,BOTON10,BOTON11,BOTON12;
    public PRINCIPAL(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Andromeda");
    
     setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    
    BAR=new JMenuBar();
    BAR.setBackground(new Color(0,104,185));
    setJMenuBar(BAR);
    
    MENU1=new JMenu("Acerca de");
    MENU1.setForeground(new Color(255,255,255));
    BAR.add(MENU1);
    
    item1=new JMenuItem("El desarrollador");
    item1.addActionListener(this);
    MENU1.add(item1);
    
    item2=new JMenuItem("El programa");
    item2.addActionListener(this);
    MENU1.add(item2);
    
    
    
    label1=new JLabel("Andromeda");
    label1.setForeground(new Color(255,255,255));
    label1.setFont(new Font("Andale Mono",1,20));
    label1.setBounds(300,10,300,30);
    add(label1);
    
    BOTON1=new JButton("Calculadora basica");
    BOTON1.setBounds(20,80,200,30);
    BOTON1.addActionListener(this);
    add(BOTON1);
    
    BOTON9=new JButton("Dibujar punto");
    BOTON9.setBounds(20,130,200,30);
    BOTON9.addActionListener(this);
    add(BOTON9);
    
    label2=new JLabel("Ecuaciones");
    label2.setForeground(new Color(255,255,255));
    label2.setBounds(320,80,200,30);
    add(label2);
    
    BOTON2=new JButton("Primer grado");
    BOTON2.setBounds(230,130,200,30);
    BOTON2.addActionListener(this);
    add(BOTON2);
    
    BOTON3=new JButton("Segundo grado");
    BOTON3.setBounds(230,180,200,30);
    BOTON3.addActionListener(this);
    add(BOTON3);
    
    BOTON4=new JButton("Deg a Rad");
    BOTON4.setBounds(20,180,200,30);
    BOTON4.addActionListener(this);
    add(BOTON4);
    
    label3=new JLabel("Graficas");
    label3.setForeground(new Color(255,255,255));
    label3.setBounds(530,80,200,30);
    add(label3);
    
    BOTON5=new JButton("Función seno");
    BOTON5.setBounds(530,130,200,30);
    BOTON5.addActionListener(this);
    add(BOTON5);
    
    BOTON6=new JButton("Función coseno");
    BOTON6.setBounds(530,180,200,30);
    BOTON6.addActionListener(this);
    add(BOTON6);
   
     BOTON11=new JButton("Funcion tangente");
    BOTON11.setBounds(530,230,200,30);
    BOTON11.addActionListener(this);
    add(BOTON11);
    
    BOTON12=new JButton("Funciones");
    BOTON12.setBounds(530,280,200,30);
    BOTON12.addActionListener(this);
    add(BOTON12);
    
    BOTON7=new JButton("Calcular PI");
    BOTON7.setBounds(530,330,200,30);
    BOTON7.addActionListener(this);
    add(BOTON7);
    
     BOTON10=new JButton("Area y Perimetro de un circulo");
    BOTON10.setBounds(530,380,250,30);
    BOTON10.addActionListener(this);
    add(BOTON10);
    
   
    
    
    label5=new JLabel("Creado por Emmanuel Acoltzi Bautista ©");
    label5.setForeground(new Color(255,255,255));
    label5.setBounds(200,400,300,30);
    add(label5);
    
     PANEL =new JLabel();
    PANEL.setBounds(0,0,800,500);
    add(PANEL);
    
    ImageIcon Im=new ImageIcon("src/images/wallpaperPrincipal.jpg");
    Icon i=new ImageIcon(Im.getImage().getScaledInstance(PANEL.getWidth(), PANEL.getHeight(), Image.SCALE_DEFAULT));
    PANEL.setIcon(i);
    
    BOTON1.setBackground(new Color(155,155,255));
     BOTON2.setBackground(new Color(155,155,255));
     BOTON3.setBackground(new Color(155,155,255));
     BOTON4.setBackground(new Color(155,155,255));
     BOTON5.setBackground(new Color(155,155,255));
     BOTON6.setBackground(new Color(155,155,255));
     BOTON7.setBackground(new Color(155,155,255));
      BOTON9.setBackground(new Color(155,155,255));
    BOTON10.setBackground(new Color(155,155,255));
    BOTON11.setBackground(new Color(155,155,255));  
    BOTON12.setBackground(new Color(155,155,255));  
    
     BOTON1.setForeground(new Color(255,255,255));
      BOTON2.setForeground(new Color(255,255,255));
      BOTON3.setForeground(new Color(255,255,255));
      BOTON4.setForeground(new Color(255,255,255));
      BOTON5.setForeground(new Color(255,255,255));
      BOTON6.setForeground(new Color(255,255,255));
      BOTON7.setForeground(new Color(255,255,255));
      BOTON9.setForeground(new Color(255,255,255));
    BOTON10.setForeground(new Color(255,255,255));
    BOTON11.setForeground(new Color(255,255,255));
     BOTON12.setForeground(new Color(255,255,255));
    
    }
    @Override
    public void actionPerformed(ActionEvent A){
    if(A.getSource()==item1){
    JOptionPane.showMessageDialog(null,"El desarrollador del programa es Emmanuel Acoltzi Bautista \n Todos los derechos reservados ©");
    }
    if(A.getSource()==item2){
    JOptionPane.showMessageDialog(null,"El programa denominado Andromeda se realizo con \n fines educativos \n Todos los derechos reservados ©");
    }
    if(A.getSource()==BOTON1){
    CALCULADORA Cal=new CALCULADORA();
    Cal.setBounds(0,0,600,350);
    Cal.setVisible(true);
    Cal.setResizable(false);
    Cal.setLocationRelativeTo(null);
    this.setVisible(false);
    }
    if(A.getSource()==BOTON2){
          ECUACIONES1 P=new ECUACIONES1();
    P.setBounds(0,0,500,500);
    P.setVisible(true);
    P.setResizable(false);
    P.setLocationRelativeTo(null);
    this.setVisible(false);
    }
    if(A.getSource()==BOTON3){
            ECUACIONES2 E=new ECUACIONES2();
    E.setBounds(0,0,800,500);
    E.setVisible(true);
    E.setLocationRelativeTo(null);
    E.setResizable(false);
    this.setVisible(false);
    }
    if(A.getSource()==BOTON4){
     DegARad D=new DegARad();
 D.setBounds(0,0,700,400);
 D.setVisible(true);
 D.setResizable(false);
 D.setLocationRelativeTo(null);
 this.setVisible(false);
    }
    if(A.getSource()==BOTON5){
     SENO P=new SENO();
        P.setBounds(0,0,1000,600);
        P.setLocationRelativeTo(null);
        P.setVisible(true);
        P.setResizable(false);
        this.setVisible(false);
    }
    if(A.getSource()==BOTON6){
        COSENO P=new COSENO();
        P.setBounds(0,0,1000,600);
        P.setLocationRelativeTo(null);
        P.setVisible(true);
        P.setResizable(false);
        this.setVisible(false);
    }
    if(A.getSource()==BOTON7){
       PI P=new PI();
    P.setBounds(0,0,500,700);
    P.setLocationRelativeTo(null);
    P.setVisible(true);
    P.setResizable(false);
    this.setVisible(false);
    }
    if(A.getSource()==BOTON9){
          PUNTOX P=new PUNTOX();
    P.setBounds(0,0,600,600);
    P.setVisible(true);
    P.setResizable(false);
    P.setLocationRelativeTo(null);
    this.setVisible(false);
    }
    if(A.getSource()==BOTON10){
    PerimetroArea P=new PerimetroArea();
    P.setBounds(0,0,700,700);
    P.setLocationRelativeTo(null);
    P.setVisible(true);
    P.setResizable(false);
    this.setVisible(false);
    }
    if(A.getSource()==BOTON11){
                TANGENTE P=new TANGENTE();
        P.setBounds(0,0,1000,600);
        P.setLocationRelativeTo(null);
        P.setVisible(true);
        P.setResizable(false);
        this.setVisible(false);
    }
    if(A.getSource()==BOTON12){
       FUNCIONES P=new FUNCIONES();
        P.setBounds(0,0,800,600);
        P.setLocationRelativeTo(null);
        P.setVisible(true);
        P.setResizable(false);
        this.setVisible(false);
    }
    }
    public static void main(String args[]){
    PRINCIPAL P=new PRINCIPAL();
    P.setBounds(0,0,800,500);
    P.setVisible(true);
    P.setLocationRelativeTo(null);
    P.setResizable(false);
    }
}
