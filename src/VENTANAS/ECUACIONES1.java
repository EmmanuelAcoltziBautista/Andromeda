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
public class ECUACIONES1 extends JFrame implements ActionListener{
    private JLabel label1,label2,label3;
    private JButton BOTON1,BOTON2;
    private JScrollPane DESPLAZAR;
    private JTextField TEXTO1,TEXTO2;
    private JTextArea AREA1;
    private JComboBox COMBO1;
    public ECUACIONES1(){
    setLayout(null);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Haya el valor de X");
    
     setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    
    label1=new JLabel("Halla el valor de X");
    label1.setFont(new Font("Andale Mono",1,20));
    label1.setBounds(200,10,200,30);
    add(label1);
    
    TEXTO1=new JTextField();
    TEXTO1.setBounds(10,80,100,30);
    add(TEXTO1);

//imprimo los operadores para que elija el usuario
    
    COMBO1=new JComboBox();
    COMBO1.addItem("+");
    COMBO1.addItem("-");
    COMBO1.addItem("*");
    COMBO1.addItem("/");
    COMBO1.setBounds(120,80,40,30);
    add(COMBO1);
    label2=new JLabel("X=");
    label2.setBounds(200,80,100,30);
    add(label2);
    
    TEXTO2=new JTextField();
    TEXTO2.setBounds(250,80,100,30);
    add(TEXTO2);
    
    BOTON1=new JButton("Hallar X");
    BOTON1.setBounds(20,130,200,30);
    BOTON1.addActionListener(this);
    add(BOTON1);
    
    BOTON2=new JButton("Regresar");
    BOTON2.setBounds(20,180,200,30);
    BOTON2.addActionListener(this);
    add(BOTON2);
    
    AREA1=new JTextArea();
    DESPLAZAR =new JScrollPane(AREA1);
    DESPLAZAR.setBounds(250,130,200,250);
    add(DESPLAZAR);
    
    label1.setForeground(new Color(255,255,255));
    label2.setForeground(new Color(255,255,255));
    BOTON1.setForeground(new Color(255,255,255));
    BOTON2.setForeground(new Color(255,255,255));
    BOTON1.setBackground(new Color(155,155,255));
    BOTON2.setBackground(new Color(155,155,255));
    
    label3=new JLabel();
    label3.setBounds(0,0,500,500);
    add(label3);
    
    ImageIcon im=new ImageIcon("src/images/wallpaperPrincipal.jpg");
    Icon i=new ImageIcon(im.getImage().getScaledInstance(label3.getWidth(), label3.getHeight(), Image.SCALE_DEFAULT));
    label3.setIcon(i);
    
    }
    @Override
    public void actionPerformed(ActionEvent A){
    if(A.getSource()==BOTON1){
        String T1=TEXTO1.getText();
        String T2=TEXTO2.getText();
        if(T1.equals("") || T2.equals("")){//verifico que llene todos los campos
        JOptionPane.showMessageDialog(null,"Debes de llenar todos los campos");
        }else{//si los lleno
    double N1=Double.parseDouble(TEXTO1.getText());//obtengo los valores
    double N2=Double.parseDouble(TEXTO2.getText());
    double res=0;
    String Decicion=COMBO1.getSelectedItem().toString();//pregunto cual operador eligio
    if(Decicion.equals("+")){
      res=N2-N1;
    AREA1.setText(N1+"+X="+N2+"\n\nX="+N2+"-"+N1+"\n\n X="+res);//realizo la sustitucion y imprimo el resultado
   
    }
    else if(Decicion.equals("-")){
      res=N2-N1;
    AREA1.setText(N1+"-X="+N2+"\n\nX="+N2+"+"+N1+"\n\n X="+res);
   
    }
    else if(Decicion.equals("*")){
   
     res=N2/N1;
    AREA1.setText(N1+"*X="+N2+"\n\nX="+N2+"\n  -----\n   "+N1+"\n\nX="+res);
   
   }else  if(Decicion.equals("/")){
      res=N2*N1;
    AREA1.setText("X\n------\n"+N1+"=     "+N2+"\n\nX="+N1+"*"+N2+"\n\n"+"X="+res);
   
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
    ECUACIONES1 P=new ECUACIONES1();
    P.setBounds(0,0,500,500);
    P.setVisible(true);
    P.setResizable(false);
    P.setLocationRelativeTo(null);
    }
}
