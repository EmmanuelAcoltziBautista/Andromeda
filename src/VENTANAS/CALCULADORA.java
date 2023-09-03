/*
Creado por Emmanuel Acoltzi Bautista
Corro electronico:basedeemma@gmail.com
Fecha de creacion:28/04/2023


*/
package VENTANAS;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
public class CALCULADORA extends JFrame implements KeyListener,ActionListener{
  private JButton BOTON1,BOTON2,BOTON3,BOTON4,BOTON5,BOTON6,BOTON7,BOTON8,BOTON9,BOTON10,BOTON11,BOTON12,BOTON13,BOTON14,BOTON15,BOTON16,BOTON17,BOTON18,BOTON19;
  private JTextField TEXTO1;
  public Float NUM1,NUM2;
  public int N1,N2;
  private JLabel label1;
  public String OPERADOR;
  private JScrollPane DESPLAZAR;
  public CALCULADORA(){
   setLayout(null);

//ICONO DEL PROGRAMA
   setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());
    
	setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);


     setTitle("CALCULADORA");

//TEXTO

       TEXTO1=new JTextField();
       TEXTO1.setFont(new Font("Andale Mono",1,20));
       TEXTO1.setHorizontalAlignment(JTextField.RIGHT);
       DESPLAZAR=new JScrollPane(TEXTO1);
            DESPLAZAR.setBounds(20,20,500,40);
              add(DESPLAZAR);           

                 //BOTON1

                  BOTON16=new JButton("C");
			BOTON16.setFont(new Font("Ink Free",3,20));
                     BOTON16.setBounds(530,20,50,20);
                         BOTON16.addActionListener(this);
                               add(BOTON16);


                  BOTON1=new JButton("1");
			BOTON1.setFont(new Font("Ink Free",3,20));
                     BOTON1.setBounds(50,70,50,20);
                         BOTON1.addActionListener(this);
                               add(BOTON1);

                  BOTON2=new JButton("2");
			BOTON2.setFont(new Font("Ink Free",3,20));
                     BOTON2.setBounds(120,70,50,20);
                         BOTON2.addActionListener(this);
                               add(BOTON2);


                  BOTON3=new JButton("3");
			BOTON3.setFont(new Font("Ink Free",3,20));
                     BOTON3.setBounds(180,70,50,20);
                         BOTON3.addActionListener(this);
                               add(BOTON3);

                  BOTON4=new JButton("4");
			BOTON4.setFont(new Font("Ink Free",3,20));
                     BOTON4.setBounds(50,100,50,20);
                         BOTON4.addActionListener(this);
                               add(BOTON4);

                  BOTON5=new JButton("5");
			BOTON5.setFont(new Font("Ink Free",3,20));
                     BOTON5.setBounds(120,100,50,20);
                         BOTON5.addActionListener(this);
                               add(BOTON5);

                  BOTON6=new JButton("6");
			BOTON6.setFont(new Font("Ink Free",3,20));
                     BOTON6.setBounds(180,100,50,20);
                         BOTON6.addActionListener(this);
                               add(BOTON6);

                  BOTON7=new JButton("7");
			BOTON7.setFont(new Font("Ink Free",3,20));
                     BOTON7.setBounds(50,140,50,20);
                         BOTON7.addActionListener(this);
                               add(BOTON7);

                  BOTON8=new JButton("8");
			BOTON8.setFont(new Font("Ink Free",3,20));
                     BOTON8.setBounds(120,140,50,20);
                         BOTON8.addActionListener(this);
                               add(BOTON8);

                  BOTON9=new JButton("9");
			BOTON9.setFont(new Font("Ink Free",3,20));
                     BOTON9.setBounds(180,140,50,20);
                         BOTON9.addActionListener(this);
                               add(BOTON9);


                  BOTON10=new JButton("0");
			BOTON10.setFont(new Font("Ink Free",3,20));
                     BOTON10.setBounds(120,180,50,20);
                         BOTON10.addActionListener(this);
                               add(BOTON10);




                  BOTON11=new JButton("+");
			BOTON11.setFont(new Font("Andale Mono",3,20));
                     BOTON11.setBounds(50,220,50,50);
                         BOTON11.addActionListener(this);
                               add(BOTON11);


                  BOTON12=new JButton("-");
			BOTON12.setFont(new Font("Andale Mono",3,20));
                     BOTON12.setBounds(120,220,50,50);
                         BOTON12.addActionListener(this);
                               add(BOTON12);


                  BOTON13=new JButton("*");
			BOTON13.setFont(new Font("Andale Mono",3,20));
                     BOTON13.setBounds(180,220,50,50);
                         BOTON13.addActionListener(this);
                               add(BOTON13);



                  BOTON14=new JButton("/");
			BOTON14.setFont(new Font("Andale Mono",3,20));
                     BOTON14.setBounds(240,220,50,50);
                         BOTON14.addActionListener(this);
                               add(BOTON14);


                  BOTON17=new JButton(".");
			BOTON17.setFont(new Font("Ink Free",3,20));
                     BOTON17.setBounds(310,220,50,50);
                         BOTON17.addActionListener(this);
                               add(BOTON17);

	BOTON18=new JButton("%");
	BOTON18.setBounds(380,220,60,50);
	BOTON18.setFont(new Font("Andale Mono",3,20));
	BOTON18.addActionListener(this);
	add(BOTON18);

	
	BOTON19=new JButton("Regresar");
	BOTON19.setBounds(20,280,200,30);
	BOTON19.setFont(new Font("Andale Mono",1,20));
	BOTON19.addActionListener(this);
	add(BOTON19);


                          BOTON15=new JButton("=");
			BOTON15.setFont(new Font("Andale Mono",3,20));
                             BOTON15.setBounds(280,70,100,100);
                              BOTON15.addActionListener(this);
                               add(BOTON15);                           

             label1=new JLabel();
             label1.setBounds(0,0,600,350);
             add(label1);
             //FONDO DE PANTALLA
             ImageIcon im=new ImageIcon("src/images/wallpaperPrincipal.jpg");
             Icon i=new ImageIcon(im.getImage().getScaledInstance(label1.getWidth(),label1.getHeight(),Image.SCALE_DEFAULT));
             label1.setIcon(i);
                               
  }
@Override
public void keyTyped(KeyEvent e){
    if(e.getKeyChar()=='A' || e.getKeyChar()=='a' || e.getExtendedKeyCode()==KeyEvent.VK_ADD){
        System.exit(0);
    }
    }
      @Override
    public void keyPressed(KeyEvent E5) {
 
    if(E5.getExtendedKeyCode()==KeyEvent.VK_DOWN){
        System.out.println("hola");
    }
    }

    @Override
    public void keyReleased(KeyEvent e) {
      }

  @Override
  public void actionPerformed(ActionEvent A){
     if(A.getSource()==BOTON1){//SI TOCA UN NUMERO QUE SE ESCRIBA EN EL JTEXTFIELD
       TEXTO1.setText(TEXTO1.getText()+"1");//RECUPERO EL TEXTO Y LO CONCATENO
             }
     if(A.getSource()==BOTON2){
            TEXTO1.setText(TEXTO1.getText()+"2");
             }

     if(A.getSource()==BOTON3){

            TEXTO1.setText(TEXTO1.getText()+"3");
             }
     if(A.getSource()==BOTON4){

            TEXTO1.setText(TEXTO1.getText()+"4");
             }
     if(A.getSource()==BOTON5){

            TEXTO1.setText(TEXTO1.getText()+"5");
             }
     if(A.getSource()==BOTON6){

            TEXTO1.setText(TEXTO1.getText()+"6");
             }
     if(A.getSource()==BOTON7){

            TEXTO1.setText(TEXTO1.getText()+"7");
             }
     if(A.getSource()==BOTON8){

            TEXTO1.setText(TEXTO1.getText()+"8");
             }
     if(A.getSource()==BOTON9){

            TEXTO1.setText(TEXTO1.getText()+"9");
             }
     if(A.getSource()==BOTON10){

            TEXTO1.setText(TEXTO1.getText()+"0");
             }

     if(A.getSource()==BOTON11){
        
           NUM1=Float.parseFloat(TEXTO1.getText());//RECUPERO LA CANTIDAD QUE ESCRIBIO
		OPERADOR="+";//EL OPERADOR EN ESTE CASO ES SUMA
		TEXTO1.setText("");               //limpio el JTextField

             }
     if(A.getSource()==BOTON12){
		NUM1=Float.parseFloat(TEXTO1.getText());
        	OPERADOR="-";  
	  TEXTO1.setText("");
             }

     if(A.getSource()==BOTON13){
		NUM1=Float.parseFloat(TEXTO1.getText());
		OPERADOR="*";
            TEXTO1.setText("");
             }
     if(A.getSource()==BOTON14){
		NUM1=Float.parseFloat(TEXTO1.getText());
		OPERADOR="/";
            TEXTO1.setText("");
             }
	if(A.getSource()==BOTON18){
	NUM1=Float.parseFloat(TEXTO1.getText());
	OPERADOR="%";
	TEXTO1.setText("");
	}

	if(A.getSource()==BOTON19){
	    PRINCIPAL P=new PRINCIPAL();
    P.setBounds(0,0,800,500);
    P.setVisible(true);
    P.setLocationRelativeTo(null);
    P.setResizable(false);
    this.setVisible(false);
	}

     if(A.getSource()==BOTON15){
         NUM2=Float.parseFloat(TEXTO1.getText());//obtengo el segundo numero
//	N2=Integer.parseInt(TEXTO1.getText());
	switch(OPERADOR){//pregunto cual fue el operador
	case"+": //fue suma
	double RESPUESTA;
	//RESPUESTA=NUM1+NUM2;
	TEXTO1.setText(cero(NUM1+NUM2));//sumo y llamo a la funcion cero
	break;
	case"-": TEXTO1.setText(cero(NUM1-NUM2));
	break;
	case"*": TEXTO1.setText(cero(NUM1*NUM2));
	break;
	case"/": 
	if(NUM2==0){
	TEXTO1.setText("ERROR");
	}
	else{
	TEXTO1.setText(cero(NUM1/NUM2));
	}
	break;
	case"%": TEXTO1.setText(cero(NUM1%NUM2));
	break;
/*
	case"^": TEXTO1.setText(Math.pow(N1,N2));
	break;
*/
	}
	}
	if(A.getSource()==BOTON17){//coloco el punto decimal
	if(!(TEXTO1.getText().contains("."))){
	TEXTO1.setText(TEXTO1.getText()+".");
	}
	}
	if(A.getSource()==BOTON16){
		TEXTO1.setText("");
		}
             

  


	


  
  }
public String cero(float resultado){//funcion
	String retorno="";
	retorno=Float.toString(resultado);
	if(resultado%1==0){
	retorno=retorno.substring(0,retorno.length()-2);//le quito el punto y el cero
	}
	return retorno;//y lo retorno
	}
 public static void main(String args[]){
    CALCULADORA Cal=new CALCULADORA();
    Cal.setBounds(0,0,600,350);
    Cal.setVisible(true);
    Cal.setResizable(false);
    Cal.setLocationRelativeTo(null);

   }  
}
