public class Triangulo implements Figura{
    //atributos 
    private double base;
    private double altura;

    //constructor
    public Triangulo(double base, double altura){
	this.base = base;
	this.altura = altura;
    }
    @Override
    public double calcArea(){
	// A = (bh)/2
	return (this.base * this.altura) / 2;
    }

    @Override
    public double calcPeri(){
	double a = this.base;
	double b = this.altura;
	// c = sqrt(a^2 + b^2)
	double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

	// P = a + b + c
	return a + b + c;
    }
}
