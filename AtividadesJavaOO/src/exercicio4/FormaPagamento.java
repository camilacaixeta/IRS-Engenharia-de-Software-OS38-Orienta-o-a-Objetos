package exercicio4;

public enum FormaPagamento{
	
	CHEQUE("Cheque"),
	DINHEIRO("Dinehiro"),
	CARTAO("Cart�o");
	
	String forma;
	
	private FormaPagamento(String forma) {
		this.forma = forma;
	}
	
	public String toString(){
		return this.forma;
	}

}
