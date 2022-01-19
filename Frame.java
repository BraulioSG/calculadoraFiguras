import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame implements ActionListener{
    private JComboBox opcionesCB;
    private JLabel opcionesLB, lado1LB, lado2LB, areaLB, perimetroLB;
    private JButton calcularBT;
    private JTextField lado1TF, lado2TF;
    private String[] lista_opciones = {"Cuadrado", "Rectangulo", "Circulo", "Pentagono", "Triangulo", "Semicirculo"};

    public Frame(int width, int height){
	setResizable(false);
	setLayout(null);
	initComponents();
	pack();
	setSize(width, height);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents(){
	//comboboxes
	opcionesCB = new JComboBox(lista_opciones);
	opcionesCB.addActionListener(this);
	opcionesCB.insertItemAt(" ", 0);
	opcionesCB.setSelectedIndex(0);
	opcionesCB.setBounds(10,50,100,30);
	add(opcionesCB);

	//Etiquetas
	opcionesLB =  new JLabel("Figura");
	opcionesLB.setBounds(10,10,100,30);
	add(opcionesLB);
	
	lado1LB = new JLabel("lado a");
	lado1LB.setBounds(150, 10, 100,30);
	add(lado1LB);

	lado2LB = new JLabel("lado b");
	lado2LB.setBounds(150, 100, 100,30);
	add(lado2LB);

	areaLB = new JLabel("Area: ");
	areaLB.setBounds(10, 190, 100, 30);
	add(areaLB);

	perimetroLB = new JLabel("Perimetro: ");
	perimetroLB.setBounds(150, 190, 100, 30);
	add(perimetroLB);

	//Campos de texto
	lado1TF = new JTextField();
	lado1TF.setBounds(150, 50, 100, 30);
	add(lado1TF);

	lado2TF = new JTextField();
	lado2TF.setBounds(150, 140, 100, 30);
	add(lado2TF);

	//Botones
	calcularBT = new JButton("Calcular");
	calcularBT.setBounds(10, 140, 100, 30);
	calcularBT.addActionListener(this);
	add(calcularBT);
    }

    private void inputsCuadrado(){
	lado1LB.setText("lado");
	lado2LB.setText("");
	lado1TF.setVisible(true);
	lado2TF.setVisible(false);
    }

    private void inputsRectangulo(){
	lado1LB.setText("base");
	lado2LB.setText("altura");
	lado1TF.setVisible(true);
	lado2TF.setVisible(true);

    }

    private void inputsCirculo(){
	lado1LB.setText("radio");
	lado2LB.setText("");
	lado1TF.setVisible(true);
	lado2TF.setVisible(false);
    }

    private void inputsPentagono(){
	lado1LB.setText("lado");
	lado2LB.setText("apotema");
	lado1TF.setVisible(true);
	lado2TF.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
	//escuchar al comboBox
	if(e.getSource() == opcionesCB){
	    //getSelectedItem => opcion
	    //getSelectedIndex => indice
	    String seleccion = opcionesCB.getSelectedItem().toString();
	    switch (seleccion){
		case "Cuadrado":
		    inputsCuadrado();
		    break;
		case "Rectangulo":
		    inputsRectangulo();
		    break;
		case "Triangulo":
		    inputsRectangulo();
		    break;
		case "Circulo":
		    inputsCirculo();
		    break;
		case "Semicirculo":
		    inputsCirculo();
		    break;
		case "Pentagono":
		    inputsPentagono();
		    break;
		default:
		    System.out.println("default");
		    break;
	    }
	}
	if(e.getSource() == calcularBT){
	}
    }
}
