/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/
package VENTANAS;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
public class COSENO extends JFrame implements ActionListener{
    private JPanel PANEL;
    private JButton BOTON1,BOTON2;
    private JLabel label1,label2,label3,label4,label5;
    private JTextArea AREA1,AREA2,AREA3;
    private JScrollPane DESPLAZAR;
    public static String grados="";
   // DefaultTableModel model=new DefaultTableModel();
    private JTable TABLA;

    public COSENO(){
    setLayout(null);
    setTitle("Función Coseno");
    
    //para cuando cierre el programa no se ejecute en segundo plamo
    
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    //para editar la tabla
    DefaultTableModel model=new DefaultTableModel();
     
    //icono del programa
    setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    
    label1=new JLabel("Función coseno");
    label1.setForeground(new Color(255,255,255));
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
    

    //creo la tabla
    TABLA=new JTable();
    DESPLAZAR=new JScrollPane(TABLA);
    DESPLAZAR.setBounds(500,130,450,200);
    add(DESPLAZAR);
    
    
  
    
    BOTON1.setBackground(new Color(155,155,255));
    BOTON2.setBackground(new Color(155,155,255));
    BOTON1.setForeground(new Color(255,255,255));
    BOTON2.setForeground(new Color(255,255,255));
    BOTON1.setFont(new Font("Andale Mono",1,15));
    BOTON2.setFont(new Font("Andale Mono",1,15));
   
    //creo las columnas de la tabla
    TABLA=new JTable(model);
DESPLAZAR.setViewportView(TABLA);
model.addColumn("Grados");
model.addColumn("Radianes");
model.addColumn("Coseno");
//lleno la tabla con los siguientes valores
for(int i=0;i<=360;i++)
{
double radd=i*Math.PI/180;
double cos=Math.cos(radd);
Object[] fila=new Object[3];
fila[0]=i;
fila[1]=radd;
fila[2]=cos;
model.addRow(fila);
}
//  si le da click en una celda lo localizo

    TABLA.addMouseListener(new MouseAdapter(){
 @Override
 public void mouseClicked(MouseEvent E1){
     //ubico la fila
     int fila=TABLA.rowAtPoint(E1.getPoint());
 int columna=0;//columna cero donde estan los grados
 if(fila>-1){
     int gradose=(int)model.getValueAt(fila, columna);//lo ubico con las siguientes cordenadas
     System.out.println(gradose);//lo imprimo en pantalla
     PINTARCOSENO P=new PINTARCOSENO(PANEL);//envio el JPanel
     P.DibujarPunto(gradose);//llamo la siguiente funcion para ue grafique el funto
  }
 }
 });
  
    
    
    
    label5=new JLabel();
    label5.setBounds(0,0,1000,600);
    add(label5);
    //fondo de pantalla
    ImageIcon im=new ImageIcon("src/images/wallpaperPrincipal.jpg");
    Icon i=new ImageIcon(im.getImage().getScaledInstance(label5.getWidth(),label5.getHeight(),Image.SCALE_DEFAULT));
    label5.setIcon(i);
    
 
 
    
    }
    @Override
    public void actionPerformed(ActionEvent A){
    if(A.getSource()==BOTON1){//llamo a que se grafique la funcion
    PINTARCOSENO P=new PINTARCOSENO(PANEL);
    P.pintar();
    P.COSENO();
 //TablaCOSeno();
 
    }
    if(A.getSource()==BOTON2){
            PRINCIPAL P=new PRINCIPAL();
    P.setBounds(0,0,800,500);
    P.setVisible(true);
    P.setLocationRelativeTo(null);
    P.setResizable(false);
    this.setVisible(false);
    }
    }/*
   public void TablaCOSeno(){
TABLA=new JTable(model);
DESPLAZAR.setViewportView(TABLA);
model.addColumn("Grados");
model.addColumn("Radianes");
model.addColumn("Coseno");
for(int i=0;i<=360;i++)
{
double radd=i*Math.PI/180;
double cos=Math.cos(radd);
Object[] fila=new Object[3];
fila[0]=i;
fila[1]=radd;
fila[2]=cos;
model.addRow(fila);
}
}*/
    public static void main(String args[]){
        COSENO P=new COSENO();
        P.setBounds(0,0,1000,600);
        P.setLocationRelativeTo(null);
        P.setVisible(true);
        P.setResizable(false);
    }
}