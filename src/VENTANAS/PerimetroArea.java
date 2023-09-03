/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/
/*
IMPORTANTE ESTO SOLO ES LA PARTE VISUAL Y UNA PARTE LOGICA
*/

package VENTANAS;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class PerimetroArea extends JFrame implements ActionListener{
    private JLabel label1,label2,label3;
    private JTextField TEXTO1;
    private JPanel PANEL;
    private JButton BOTON1,BOTON2;
    public PerimetroArea(){
    setLayout(null);
    getContentPane().setBackground(new Color(255,255,255));
    setTitle("Perimetro y Area");
    
     setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    
    label1=new JLabel("Perimetro y Area");
    label1.setFont(new Font("Andale Mono",1,20));
    label1.setBounds(200,10,300,30);
    add(label1);
    
    label2=new JLabel("Ingresa el radio:");
    label2.setBounds(10,80,300,30);
    add(label2);
    
    TEXTO1=new JTextField("Toca para escribir...");
    TEXTO1.setFont(new Font("Andale Mono",1,20));
    TEXTO1.setForeground(Color.GRAY);
    TEXTO1.setBounds(100,80,200,30);
    add(TEXTO1);
    
    TEXTO1.addMouseListener(new MouseAdapter(){//SI DA CLICK en el JTextField 
    @Override
        public void mouseClicked(MouseEvent E){
    TEXTO1.setText("");//limpio la caja de texto
    TEXTO1.setForeground(new Color(0,0,0));     //cambio el color de la letra para mejor presentacion   
    }
    });
    
    BOTON2=new JButton("Calcular");
    
    BOTON2.setBounds(320,80,200,30);
    BOTON2.addActionListener(this);
    add(BOTON2);
    
    BOTON1=new JButton("Regresar");
    BOTON1.setBounds(100,620,200,30);
    BOTON1.addActionListener(this);
    add(BOTON1);
    
    PANEL =new JPanel();
    PANEL.setBounds(10,130,600,400);
    add(PANEL);
    
    label3=new JLabel();
    label3.setBounds(0,0,700,700);
    add(label3);
    
    ImageIcon im=new ImageIcon("src/images/wallpaperPrincipal.jpg");
    Icon i=new ImageIcon(im.getImage().getScaledInstance(label3.getWidth(),label3.getHeight(), Image.SCALE_DEFAULT));
    label3.setIcon(i);
    label1.setForeground(Color.WHITE);
    label2.setForeground(Color.white);
    BOTON1.setForeground(Color.WHITE);
    BOTON2.setForeground(Color.WHITE);
    BOTON1.setBackground(new Color(155,155,255));
    BOTON2.setBackground(new Color(155,155,255));
    BOTON2.setFont(new Font("Andale Mono",1,20));
    BOTON1.setFont(new Font("Andale Mono",1,20));
    }
    @Override
    public void actionPerformed(ActionEvent A){
    if(A.getSource()==BOTON1){
        PRINCIPAL P=new PRINCIPAL();
    P.setBounds(0,0,800,500);
    P.setVisible(true);
    P.setLocationRelativeTo(null);
    P.setResizable(false);
this.setVisible(false);
        }
    if(A.getSource()==BOTON2){
    String TEX=TEXTO1.getText();
 if(TEX.equals("")){
 JOptionPane.showMessageDialog(null,"Debes de llenar todos los campos");
 }else{
     double RADIO=Integer.parseInt(TEX);
        Circulo C=new Circulo(PANEL,RADIO);
        C.pintar();
 }  
   
    }
    }
   
    
    
    public static void main(String args[]){
    PerimetroArea P=new PerimetroArea();
    P.setBounds(0,0,700,700);
    P.setLocationRelativeTo(null);
    P.setVisible(true);
    P.setResizable(false);
    }
}
