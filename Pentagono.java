public class Pentagono{
    //atributos
    private double lado;
    private double apotema;
    //constructor
    public Pentagono(double lado, double apotema){
	this.lado = lado;
	this.apotema = apotema; 
    }

    public double calcArea(){
	return ((this.lado * this.apotema)/2) * 5;
    }

    public double calcPeri(){
	return 5 * this.lado;
    }
}
