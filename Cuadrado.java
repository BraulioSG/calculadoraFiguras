public class Cuadrado implements Figura{
    //Atributos
    private double lado;

    //constructor principal
    public Cuadrado(double lado){
	this.lado = lado;
    }

    @Override
    public double calcArea(){
	// A = l * l
	return this.lado * this.lado;
    }

    @Override
    public double calcPeri(){
	// P = l + l + l + l = 4l 
	return 4 * this.lado;
    }
}

