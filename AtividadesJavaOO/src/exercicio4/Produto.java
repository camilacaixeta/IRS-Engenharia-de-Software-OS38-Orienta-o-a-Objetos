package exercicio4;

public class Produto {

	protected String nome;
	protected int quantidadeEstoque;
	protected Categoria categoria;
	
	public Produto(String nome, int quantidadeEstoque, Categoria categoria) {
		this.nome = nome;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoria = categoria;
	}
	
	// Este constutor � utilizado quando se cria um novo pedido
	public Produto(Produto referencia){
		this.nome = referencia.nome;
		this.quantidadeEstoque = referencia.quantidadeEstoque;
		this.categoria = referencia.categoria;
	}

	protected enum Categoria{
		
		ALIMENTACAO("Alimenta��o"),
		LIMPEZA("Limpeza"),
		ELETRONICO("Eletr�nico");
		
		String valor;
		
		Categoria(String valor){
			this.valor = valor;
		}
		
		public String toString(){
			return this.valor;
		}
		
	}
	
}
