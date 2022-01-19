public class SemiCirculo{
    //atributos
    private double radio;

    //constructor
    public SemiCirculo(double radio){
	this.radio = radio;
    }

    public double calcArea(){
	// A = pi * r^2 / 2
	return (Math.PI * Math.pow(this.radio, 2)) / 2;
    }

    public double calcPeri(){
	// A = (pi * d / 2 ) + d
	return (Math.PI * (2 * this.radio))/2 + (2 * this.radio); 
    }
}
