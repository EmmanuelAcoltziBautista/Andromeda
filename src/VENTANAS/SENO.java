/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/

/*
PARTE VISUAL
*/
package VENTANAS;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
//import static java.awt.Cursor.CUSTOM_CURSOR;
public class SENO extends JFrame implements ActionListener{
    private JPanel PANEL;
    private JButton BOTON1,BOTON2,BOTON3;
    private JLabel label1,label2,label3,label4,label5;
    private JTextArea AREA1,AREA2,AREA3;
    private JScrollPane DESPLAZAR1,DESPLAZAR2,DESPLAZAR3;
    private JTable TABLA;
    private JScrollPane DESPLAZAR;
    DefaultTableModel model=new DefaultTableModel();
    public SENO(){
    setLayout(null);
    setTitle("Función Seno");
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    //DefaultTableModel model=new DefaultTableModel();
    
     setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    
    label1=new JLabel("Función seno");
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
    BOTON2.setBounds(440,530,200,30);
    BOTON2.addActionListener(this);
    add(BOTON2);
    
    BOTON3=new JButton("Arcoseno");
    BOTON3.setBounds(220,530,200,30);
    BOTON3.addActionListener(this);
    add(BOTON3);
    
        
    TABLA=new JTable();
    DESPLAZAR=new JScrollPane(TABLA);
    DESPLAZAR.setBounds(500,130,450,200);
    add(DESPLAZAR);
    
    
      TABLA=new JTable(model);//AQUI AGREHARE COLUMNAS
   DESPLAZAR.setViewportView(TABLA);
   model.addColumn("Grados");//LAS COLUMNAS
   model.addColumn("Radianes");
   model.addColumn("Seno");
   for(int i=0;i<=360;i++){
       double rads=i*Math.PI/180;
       double sin=Math.sin(rads);
       Object[] fila=new Object[3];
       fila[0]=i;//AQUI LE DIGO QUE ES LO QUE TENDRAN LAS FILAS
       fila[1]=rads;
       fila[2]=sin;
       model.addRow(fila);
   
   }
     
    TABLA.addMouseListener(new MouseAdapter(){//SI TOCA UNA CELDA
 @Override
 public void mouseClicked(MouseEvent E1){
     
     int fila=TABLA.rowAtPoint(E1.getPoint());//LOCALIZO LA FILA
 int columna=0;//DEFINO LA COLUMNA QUE EN ESTE CASO ES DE GRADOS SEXAGESIMALES
 if(fila>-1){
     int gradose=(int)model.getValueAt(fila, columna);
     System.out.println(gradose);
    PINTARSENO P=new PINTARSENO(PANEL);
    P.DibujarPunto(gradose);//LLAMO A LA FUNCION DIBUJARPUNTO Y ENVIO EL INT
  }
 }
 });
   
    BOTON1.setFont(new Font("Andale Mono",1,15));
    BOTON2.setFont(new Font("Andale Mono",1,15));
    BOTON3.setFont(new Font("Andale Mono",1,15));
    BOTON1.setForeground(new Color(255,255,255));
    BOTON2.setForeground(new Color(255,255,255));
    BOTON3.setForeground(new Color(255,255,255));
    BOTON1.setBackground(new Color(155,155,255));
    BOTON2.setBackground(new Color(155,155,255));
    BOTON3.setBackground(new Color(155,155,255));
    
    label5=new JLabel();
    label5.setBounds(0,0,1000,600);
    add(label5);
    
    ImageIcon im=new ImageIcon("src/images/wallpaperPrincipal.jpg");
    Icon i=new ImageIcon(im.getImage().getScaledInstance(label5.getWidth(),label5.getHeight(),Image.SCALE_DEFAULT));
    label5.setIcon(i);
    
    label1.setForeground(new Color(255,255,255));
    
    
    }
    @Override
    public void actionPerformed(ActionEvent A){
    if(A.getSource()==BOTON1){//AQUI LLAMO A LA FUNCION SENO
    PINTARSENO P=new PINTARSENO(PANEL);
    P.pintar();
    P.Seno();
   

    }
    if(A.getSource()==BOTON2){
            PRINCIPAL P=new PRINCIPAL();
    P.setBounds(0,0,800,500);
    P.setVisible(true);
    P.setLocationRelativeTo(null);
    P.setResizable(false);
    this.setVisible(false);
    }
    if(A.getSource()==BOTON3){//AQUI LLAMO A LA ARCOSENO
        PINTAR_ARCOSENO PI=new PINTAR_ARCOSENO(PANEL,TABLA,DESPLAZAR);
        PI.pintar();
        PI.Arcoseno();
        PI.TablaArcoSeno();
//  TablaArcoSeno();
    }
    }
    public void TablaArcoSeno(){
TABLA =new JTable(model);
DESPLAZAR.setViewportView(TABLA);
model.addColumn("Grados");
model.addColumn("Radianes");
model.addColumn("Seno");
for(int i=90;i<=270;i++){
    double rad=i*Math.PI/180;
    double sin=Math.sin(rad);
    Object[] fila=new Object[3];
    fila[0]=i;
    fila[1]=rad;
    fila[2]=sin;
    model.addRow(fila);

}
}
    public static void main(String args[]){
        SENO P=new SENO();
        P.setBounds(0,0,1000,600);
        P.setLocationRelativeTo(null);
        P.setVisible(true);
        P.setResizable(false);
    }
}