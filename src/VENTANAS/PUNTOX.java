/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/
package VENTANAS;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.LineBorder;
public class PUNTOX extends JFrame implements ActionListener{
    private JPanel panel;
    private JScrollPane DESPLAZAR;
    private JLabel label1,label2,label34;
    private JTextField TEXTO1,TEXTO2;
    private JButton BOTON1,BOTON2,BOTON3;
    private JTextArea AREA;
    int X=0;
    int Y=0;
    int ancho;
    int alto;
    String valores="";
    int escala=10;
    public PUNTOX(){
    setLayout(null);
    setTitle("Graficas");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    
    panel=new JPanel();
    panel.setBackground(new Color(255,255,255));
    panel.setBorder(new LineBorder(new Color(0,0,0)));
    panel.setBounds(10,10,400,400);
    add(panel);
    
    AREA=new JTextArea();
    AREA.setBorder(new LineBorder(new Color(0,0,0)));
    AREA.setEditable(false);
    DESPLAZAR=new JScrollPane(AREA);
    DESPLAZAR.setBounds(420,10,100,200);
    add(DESPLAZAR);
    
    label1=new JLabel("X=");
    label1.setForeground(new Color(255,255,255));
    label1.setFont(new Font("Andale Mono",1,20));
    label1.setBounds(10,420,200,30);
    add(label1);
    
    TEXTO1=new JTextField("0");
    TEXTO1.setBounds(40,420,100,30);
    add(TEXTO1);
    
    label2=new JLabel("Y=");
    label2.setForeground(new Color(255,255,255));
    label2.setFont(new Font("Andale Mono",1,20));
    label2.setBounds(160,420,200,30);
    add(label2);
    
    TEXTO2=new JTextField("0");
    TEXTO2.setBounds(190,420,100,30);
    add(TEXTO2);
    
    BOTON1=new JButton("Graficar");
    BOTON1.setForeground(new Color(255,255,255));
    BOTON1.setBackground(new Color(155,155,255));
    BOTON1.setFont(new Font("Andale Mono",1,20));
    BOTON1.setBounds(310,420,200,30);
    BOTON1.addActionListener(this);
    add(BOTON1);
    
    BOTON2=new JButton("Regresar");
    BOTON2.setForeground(new Color(255,255,255));
    BOTON2.setBackground(new Color(155,155,255));
    BOTON2.setFont(new Font("Andale Mono",1,20));
    BOTON2.setBounds(230,480,200,30);
    BOTON2.addActionListener(this);
    add(BOTON2);
   
    BOTON3=new JButton("Limpiar grafico");
    BOTON3.setForeground(new Color(255,255,255));
    BOTON3.setBackground(new Color(155,155,255));
    BOTON3.setFont(new Font("Andale Mono",1,20));
    BOTON3.setBounds(10,480,200,30);
    BOTON3.addActionListener(this);
    add(BOTON3);
    
    label34=new JLabel();
    label34.setBounds(0,0,600,600);
    add(label34);
    
    ImageIcon im=new ImageIcon("src/images/wallpaperPrincipal.jpg");
    Icon i=new ImageIcon(im.getImage().getScaledInstance(label34.getWidth(), label34.getHeight(), Image.SCALE_DEFAULT));
    label34.setIcon(i);
    
    panel.addMouseListener(new MouseAdapter(){//SI DA CLICK EN EL PANEL HACE ZOOM
        @Override
        public void mouseClicked(MouseEvent E){
    //        1 izquierdo
      //              3 derecho
        if(E.getButton()==1){
        escala=escala+2;
                DIBUJARPUNTOX d=new DIBUJARPUNTOX(panel,escala);
                d.dibujos1();
                d.DibujarPunto(X, Y);//INVOCO LAS CLASES
        }
        if(E.getButton()==3){//AQUI HAGO UN OUT
        escala=escala-3;
        DIBUJARPUNTOX d=new DIBUJARPUNTOX(panel,escala);
        d.dibujos1();
        d.DibujarPunto(X, Y);
        }
            
        }
    });
    
   
    
    }
    @Override
    public void actionPerformed(ActionEvent A){
    if(A.getSource()==BOTON1){
String A1=TEXTO1.getText();
String B1=TEXTO2.getText();
if(A1.equals("") || B1.equals("")){
JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
}else{
    double x1=Double.parseDouble(TEXTO1.getText().trim());
    double y2=Double.parseDouble(TEXTO2.getText().trim());
    X=(int)x1;
           Y=(int)y2;
        DIBUJARPUNTOX d=new DIBUJARPUNTOX(this.panel,escala);
        d.dibujos();//LAMO A LA FUNCION
         d.DibujarPunto(X, Y);
    valores+="X="+X+",   Y="+Y+"\n";
    AREA.setText(valores);
    TEXTO1.setText("");
    TEXTO2.setText("");
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
    if(A.getSource()==BOTON3){
    DIBUJARPUNTOX D=new DIBUJARPUNTOX(this.panel,escala);
    D.limpiarpanel();
    AREA.setText("");
    valores="";
    }
    }
    public static void main(String args[]){
    PUNTOX GR=new PUNTOX();
    GR.setBounds(0,0,600,600);
    GR.setLocationRelativeTo(null);
    GR.setVisible(true);
    }
}
