package ControleCompras.POJO;

public class ListaProduto {
	

	private String nome;
	private double preço;
	private int supermercado;
	
	public ListaProduto(double preço, int supermercado,String nome ) {
	
		this.preço = preço;
		this.supermercado = supermercado;
		this.nome = nome;
		
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	
	
	public double getPreço() {
		return preço;
	}
	
	public int getSupermercado() {
		return supermercado;
	}




	@Override
	public String toString() {
		return "ListaProduto [nome=" + nome + ", preço=" + preço
				+ ", supermercado=" + supermercado + "]";
	}


	
	
	
	
	
	

}
