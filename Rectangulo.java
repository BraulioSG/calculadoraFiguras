public class Rectangulo implements Figura{
    //Atributos
    private double base;
    private double altura;

    //constructor
    public Rectangulo(double base, double altura){
	this.base = base;
	this.altura = altura;
    }

    @Override
    public double calcArea(){
	// A = b * a
	return this.base * this.altura;
    }

    @Override
    public double calcPeri(){
	// P = b + a + b + a = 2b+2a
	return ((2 * this.base) + (2 * this.altura));
    }
}
