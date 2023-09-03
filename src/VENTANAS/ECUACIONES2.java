/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023

Se realiza ecuaciones de segundo grado

*/
package VENTANAS;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class ECUACIONES2 extends JFrame implements ActionListener{
    private JLabel label1,label2,label3,label4,label5,label6;
    private JTextField TEXTO1,TEXTO2,TEXTO3;
    private JButton BOTON1,BOTON2;
    private JTextArea AREA1;
    private JScrollPane DESPLAZAR1;
    public ECUACIONES2(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Ecuaciones de segundo grado");
    
     setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    
    label1=new JLabel("Ecuaciones de segundo grado");
    label1.setFont(new Font("Andale Mono",1,20));
    label1.setBounds(200,10,300,30);
    add(label1);
     
    label2=new JLabel("A:");
    label2.setBounds(10,80,200,30);
    add(label2);
    
    TEXTO1=new JTextField();
    TEXTO1.setBounds(30,80,200,30);
    add(TEXTO1);
           
    
    label3=new JLabel("B:");
    label3.setBounds(10,130,200,30);
    add(label3);
 
    TEXTO2=new JTextField();
    TEXTO2.setBounds(30,130,200,30);
    add(TEXTO2);
    
    label4=new JLabel("C");
    label4.setBounds(10,180,200,30);
    add(label4);
    
    TEXTO3=new JTextField();
    TEXTO3.setBounds(30,180,200,30);
    add(TEXTO3);
    
    BOTON1=new JButton("Resolver");
    BOTON1.setBounds(15,230,200,30);
    BOTON1.addActionListener(this);
    add(BOTON1);
   
     BOTON2=new JButton("Regresar");
    BOTON2.setBounds(15,280,200,30);
    BOTON2.addActionListener(this);
    add(BOTON2);
    
    AREA1=new JTextArea();
    DESPLAZAR1=new JScrollPane(AREA1);
    DESPLAZAR1.setBounds(280,80,300,300);
    add(DESPLAZAR1);
    AREA1.setEditable(false);
    
    label5=new JLabel();
    label5.setBounds(280,410,400,30);
            add(label5);
            
            label1.setForeground(new Color(255,255,255));
            label2.setForeground(new Color(255,255,255));
            label3.setForeground(new Color(255,255,255));
            label4.setForeground(new Color(255,255,255));
            label5.setForeground(new Color(255,255,255));
            BOTON1.setForeground(new Color(255,255,255));
            BOTON2.setForeground(new Color(255,255,255));
            BOTON1.setBackground(new Color(155,155,255));
            BOTON2.setBackground(new Color(155,155,255));
            
            label6=new JLabel();
            label6.setBounds(0,0,800,500);
            add(label6);
            
            ImageIcon im=new ImageIcon("src/images/wallpaperPrincipal.jpg");
            Icon i=new ImageIcon(im.getImage().getScaledInstance(label6.getWidth(),label6.getHeight(),Image.SCALE_DEFAULT));
            label6.setIcon(i);
            
            
    }
    @Override
    public void actionPerformed(ActionEvent A){
    if(A.getSource()==BOTON1){
        String AAA=TEXTO1.getText();//obtengo los valores
        String BBB=TEXTO2.getText();
        String CCC=TEXTO3.getText();
      
        if(AAA.equals("") || BBB.equals("") || CCC.equals("")){//verifico que llene todos los campos el usuario
        JOptionPane.showMessageDialog(null,"Debes de llenar todos los campos");
        }else{//si los lleno
        int A1=Integer.parseInt(TEXTO1.getText().trim());//los parseo osea cambio el tipo de variable y borro los espacios
        int B1=Integer.parseInt(TEXTO2.getText().trim());
        int C1=Integer.parseInt(TEXTO3.getText().trim()); 
        /*
   
        Formula general
        -bVb^2-4ac
       ---------------
        2a
        */
        //realizo ecuaciones
        int ac=(4*A1*C1);
        int bcua=(int) Math.pow(B1, 2);
        if(bcua>ac && A1!=0){
            int B=-B1;
            double adentro=bcua-ac;
            double raiz=Math.sqrt(adentro);
            int aa=2*A1;
            
            double x1=(B+raiz)/aa;
            double x2=(B-raiz)/aa;
            //imprimo la formula y la sustitucion
            AREA1.setText("********************\n"
                    + "    * Formula      *"
                    + "\n"
                    + "\n  -b+-Vb^2-4ac\n"
                    + "-----------------\n"
                    + "          2a \n"
                    + "********************\n\n"
                    + ""
                    + ""+B+"+/-V"+B1+"^2-4("+A1+")("+C1+")\n"
            + "--------------------------------------------\n"
            + "                     2"+A1+"\n\n"
                    + ""+B+"+/-V"+adentro+"\n----------------------------\n"+aa+"\n\n"
                            + "\n"
                            + "X1=  "+B+"+"+raiz+"\n----------------\n"+aa
            +"\n\n X1=  "+(B+raiz)+"\n--------------\n"+aa+
                    
                    "\n\n X1="+x1+
                    
                     "X2=  "+B+"-"+raiz+"\n----------------\n"+aa
            +"\n\n X2=  "+(B-raiz)+"\n--------------\n"+aa+
                    
                    "\n\n X2="+x2
                    );
                            //imprimo los dos resultados
            label5.setText("X1="+x1+"\t X2="+x2);
            
            
        }else{
        JOptionPane.showMessageDialog(null,"Esta ecuación no se puede resolver");
        }
      
        }
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
    ECUACIONES2 E=new ECUACIONES2();
    E.setBounds(0,0,800,500);
    E.setVisible(true);
    E.setLocationRelativeTo(null);
    E.setResizable(false);
    }
}
