/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/
/*PARTE VISUAL*/
package VENTANAS;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
public class TANGENTE extends JFrame implements ActionListener{
    private JPanel PANEL;
    private JButton BOTON1,BOTON2;
    private JLabel label1,label2,label3,label4,label5;
    private JTable TABLA;
    private JScrollPane DESPLAZAR;
    DefaultTableModel model=new DefaultTableModel();
    public TANGENTE(){
    setLayout(null);
    setTitle("Función tangente");
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    
     setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    
    label1=new JLabel("Función tangente");
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
    
   
    
    TABLA=new JTable();
    DESPLAZAR=new JScrollPane(TABLA);
    DESPLAZAR.setBounds(500,130,450,200);
    add(DESPLAZAR);
    
    
    
    label1.setForeground(new Color(255,255,255));
   
    
    BOTON1.setBackground(new Color(155,155,255));
    BOTON2.setBackground(new Color(155,155,255));
    BOTON1.setForeground(new Color(255,255,255));
    BOTON2.setForeground(new Color(255,255,255));
    BOTON1.setFont(new Font("Andale Mono",1,15));
    BOTON2.setFont(new Font("Andale Mono",1,15));
    

        
    TABLA=new JTable(model);
DESPLAZAR.setViewportView(TABLA);//DEFINO LAS COLUMNAS
model.addColumn("Grados");
model.addColumn("Radianes");
model.addColumn("Coseno");
for(int i=0;i<=360;i++)
{
double radd=i*Math.PI/180;//REALIZO OPERACIONES MATEMATICAS
double cos=Math.cos(radd);
Object[] fila=new Object[3];
fila[0]=i;//LLENO LAS FILAS DE INFORMACION
fila[1]=radd;
fila[2]=cos;
model.addRow(fila);
}


    TABLA.addMouseListener(new MouseAdapter(){//SI TOCA UNA CELDA
 @Override
 public void mouseClicked(MouseEvent E1){
     
     int fila=TABLA.rowAtPoint(E1.getPoint());//LOCALIZO LA FILA
 int columna=0;
 if(fila>-1){
     int gradose=(int)model.getValueAt(fila, columna);//LOCALIZO EL PUNTO
     System.out.println(gradose);
     PINTARTANGENTE P=new PINTARTANGENTE(PANEL);
     P.DibujarPunto(gradose);//LLAMO LA FUNCION Y ENVIO LA UBICACION
  }
 }
 });
  
    
    
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
    PINTARTANGENTE P=new PINTARTANGENTE(PANEL);
    P.pintar();
    P.Tangente();
//    P.TablaTangente();
 
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
        TANGENTE P=new TANGENTE();
        P.setBounds(0,0,1000,600);
        P.setLocationRelativeTo(null);
        P.setVisible(true);
        P.setResizable(false);
    }
}