public class Circulo implements Figura{
    //atributos
    protected double radio;

    public Circulo(double radio){
	this.radio = radio;
    }

    @Override
    public double calcArea(){
	// A = pi * r^2
	return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double calcPeri(){
	// P = pi * d
	return Math.PI * (2 * this.radio);
    }
}
