package exercicio2;

public class NumeroReal {

	protected float a;

	public NumeroReal(float a) {
		this.a = a;
	}
	
	public NumeroReal soma(NumeroReal n){
		return new NumeroReal(this.a + n.a);
	}
	
}
