import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Principal extends JFrame implements ActionListener{

 
  private JTextField txtInteres, txtPlazo, txtMonto;
  private JLabel lblIcono, label3, label4, label5, label6;
  private JButton btnSemanal, btnQuincenal, btnMensual, btnNuevo, btnSalir;
  private JTextArea txtResultado;
  public static String INTERES, MONTO, PLAZO ;
  public int monto, interes, plazo, total;

  public Principal(){
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("COTIZADOR");
    getContentPane().setBackground(new Color(135,206,250));
    setIconImage(new ImageIcon(getClass().getResource("images/icon3.png")).getImage());
    
    ImageIcon imagen = new ImageIcon("images/logo1.png");
    lblIcono = new JLabel(imagen);
    lblIcono.setBounds(10,10,415,150);
    add(lblIcono);

    label6= new JLabel("INGRESE MONTO A CALCULAR: ");
    label6.setBounds(55,172,225,35);
    label6.setFont(new Font("Andale Mono", 3, 14));
    label6.setForeground(new Color(0,0,255));
    add(label6);

    txtMonto = new JTextField ();
    txtMonto.setBounds(300,175,50,25);
    txtMonto.setBackground(new Color(224,224,224));
    txtMonto.setFont(new Font("Andale Mono", 1, 14));
    txtMonto.setForeground(new Color(0,0,255));
    add(txtMonto);

    label3 = new JLabel("INGRESE INTERES A CALCULAR: ");
    label3.setBounds(55,220,225,35);
    label3.setFont(new Font("Andale Mono", 3, 14));
    label3.setForeground(new Color(0,0,255));
    add(label3);

    txtInteres = new JTextField ();
    txtInteres.setBounds(300,225  ,50,25);
    txtInteres.setBackground(new Color(224,224,224));
    txtInteres.setFont(new Font("Andale Mono", 1, 14));
    txtInteres.setForeground(new Color(0,0,255));
    add(txtInteres);

    label4 = new JLabel("INGRESE PLAZO A CALCULAR: ");
    label4.setBounds(55,262,225,35);
    label4.setFont(new Font("Andale Mono", 3, 14));
    label4.setForeground(new Color(0,0,255));
    add(label4);

    txtPlazo = new JTextField ();
    txtPlazo.setBounds(300,266,50,25);
    txtPlazo.setBackground(new Color(224,224,224));
    txtPlazo.setFont(new Font("Andale Mono", 1, 14));
    txtPlazo.setForeground(new Color(0,0,255));
    add(txtPlazo);
    
    btnSemanal = new JButton("Semanal");
    btnSemanal.setBounds(35,375,100,30);
    btnSemanal.setBackground(new Color(255,255,255));
    btnSemanal.setFont(new Font("Andale Mono", 1, 14));
    btnSemanal.setForeground(new Color(0,0,255));
    btnSemanal.addActionListener(this);
    add(btnSemanal);   

    btnQuincenal = new JButton("Quincenal");
    btnQuincenal.setBounds(153,375,125,30);
    btnQuincenal.setBackground(new Color(255,255,255));
    btnQuincenal.setFont(new Font("Andale Mono", 1, 14));
    btnQuincenal.setForeground(new Color(0,0,255));
    btnQuincenal.addActionListener(this);
    add(btnQuincenal);    
  
    btnMensual = new JButton("Mensual");
    btnMensual.setBounds(295,375,100,30);
    btnMensual.setBackground(new Color(255,255,255));
    btnMensual.setFont(new Font("Andale Mono", 1, 14));
    btnMensual.setForeground(new Color(0,0,255));
    btnMensual.addActionListener(this);
    add(btnMensual);    

    btnNuevo = new JButton("Nuevo");
    btnNuevo.setBounds(100,415,100,30);
    btnNuevo.setBackground(new Color(255,255,255));
    btnNuevo.setFont(new Font("Andale Mono", 1, 14));
    btnNuevo.setForeground(new Color(0,0,255));
    btnNuevo.addActionListener(this);
    add(btnNuevo);    

    btnSalir = new JButton("Salir");
    btnSalir.setBounds(225,415,100,30);
    btnSalir.setBackground(new Color(255,255,255));
    btnSalir.setFont(new Font("Andale Mono", 1, 14));
    btnSalir.setForeground(new Color(0,0,255));
    btnSalir.addActionListener(this);
    add(btnSalir);    

    txtResultado = new JTextArea();
    txtResultado.setEditable(false);
    txtResultado.setBackground(new Color(224, 224, 224));
    txtResultado.setFont(new Font("Andale Mono", 1, 15));
    txtResultado.setForeground(new Color(0, 0, 255));
    txtResultado.setBounds(125,310,200,50);
    add(txtResultado);

    label5 = new JLabel("© 2022 Erac Software");
    label5.setBounds(300,485,300,30);
    label5.setFont(new Font("Andale Mono", 3, 12));
    label5.setForeground(new Color(255,255,255));
    add(label5);
    
  }
    
    public void actionPerformed(ActionEvent e){
      
      if(e.getSource() == btnSemanal){
        MONTO = txtMonto.getText();
        PLAZO = txtPlazo.getText();
        INTERES = txtInteres.getText();
        interes = Integer.parseInt(INTERES);
        monto = Integer.parseInt(MONTO);
        plazo = Integer.parseInt(PLAZO);
        total = ((((monto * interes / 100) / 4 * plazo ) + monto ) / plazo) + 1;   
        txtResultado.setText("Su cuota es: " + "Q" + total + ".00");
      }

      if(e.getSource() == btnQuincenal){
        MONTO = txtMonto.getText();
        PLAZO = txtPlazo.getText();
        INTERES = txtInteres.getText();
        interes = Integer.parseInt(INTERES);
        monto = Integer.parseInt(MONTO);
        plazo = Integer.parseInt(PLAZO);
        total = ((((monto * interes / 100) / 2 * plazo ) + monto ) / plazo) + 1;   
        txtResultado.setText("Su cuota es: " + "Q" + total + ".00");
      }      

      if(e.getSource() == btnMensual){
        MONTO = txtMonto.getText();
        PLAZO = txtPlazo.getText();
        INTERES = txtInteres.getText();
        interes = Integer.parseInt(INTERES);
        monto = Integer.parseInt(MONTO);
        plazo = Integer.parseInt(PLAZO);
        total = ((((monto * interes / 100) / 1 * plazo ) + monto ) / plazo) + 1;   
        txtResultado.setText("Su cuota es: " + "Q" + total + ".00");
      }

      if(e.getSource() == btnNuevo){
        txtInteres.setText("");
        txtMonto.setText("");
        txtPlazo.setText("");
        txtResultado.setText("");
      }
       if(e.getSource() == btnSalir){
        System.exit(0);
       }
    }

    public static void main(String args[]){
      Principal ventanabienvenida = new Principal();
      ventanabienvenida.setBounds(0,0,450,550);	
      ventanabienvenida.setVisible(true);
      ventanabienvenida.setResizable(false);
      ventanabienvenida.setLocationRelativeTo(null);
    }
}