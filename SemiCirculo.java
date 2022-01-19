public class SemiCirculo extends Circulo{

    public SemiCirculo(double radio){
	this.radio = radio;
    }

    @Override
    public double calcArea(){
	return super.calcArea() / 2;
    }

    @Override
    public double calcPeri(){
	return (super.calcPeri() / 2) + (2 * this.radio); 
    }
}
