/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/
/*
IMPORTANTE 

PROGRAMA EXPERIMENTAL
*/
package VENTANAS;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
public class PRUEBA extends JFrame implements ActionListener{
    private JPanel PANEL;
    private JButton BOTON1,BOTON2;
    private JLabel label1,label2,label3,label4,label5;
    private JTable TABLA;
   
    
    
    private JScrollPane DESPLAZAR;
    //     DefaultTableModel model=new DefaultTableModel();
    public PRUEBA(){
       setLayout(null);
    
 setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
 
         setTitle("Función Coseno");
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    
    label1=new JLabel("Función coseno");
    label1.setFont(new Font("Andale Mono",1,20));
    label1.setBounds(200,10,200,30);
    add(label1);
    
    PANEL=new JPanel();
    PANEL.setBounds(10,80,400,400);
    add(PANEL);
    
    BOTON1=new JButton("Graficar");
    BOTON1.setBounds(10,530,200,30);
    BOTON1.addActionListener(this);
    add(BOTON1);
    
    BOTON2=new JButton("Regresar");
    BOTON2.setBounds(220,530,200,30);
    BOTON2.addActionListener(this);
    add(BOTON2);
    
    label2=new JLabel("");
    label2.setBounds(500,80,200,30);
    add(label2);
    
    
    
    label3=new JLabel("");
    label3.setBounds(640,80,100,30);
    add(label3);
    
   
    
    label4=new JLabel("");
    label4.setBounds(800,80,200,30);
    add(label4);
    
    TABLA=new JTable();
    DESPLAZAR=new JScrollPane(TABLA);
    DESPLAZAR.setBounds(500,130,450,200);
    add(DESPLAZAR);

     
    label1.setForeground(new Color(255,255,255));
    label2.setForeground(new Color(255,255,255));
    label3.setForeground(new Color(255,255,255));
    label4.setForeground(new Color(255,255,255));
    
    BOTON1.setBackground(new Color(155,155,255));
    BOTON2.setBackground(new Color(155,155,255));
    BOTON1.setForeground(new Color(255,255,255));
    BOTON2.setForeground(new Color(255,255,255));
    BOTON1.setFont(new Font("Andale Mono",1,15));
    BOTON2.setFont(new Font("Andale Mono",1,15));
    

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
    PINTAR_PRUEBA P=new PINTAR_PRUEBA(PANEL,TABLA,DESPLAZAR);
    P.TABLA();
    P.pintar();
    P.Arcoseno();

   
   

    
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
        PRUEBA P=new PRUEBA();
        P.setBounds(0,0,1000,600);
        P.setLocationRelativeTo(null);
        P.setVisible(true);
        P.setResizable(false);
    }
}