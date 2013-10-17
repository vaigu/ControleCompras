package ControleCompras.POJO;

public class ListaProduto {
	

	private String nome;
	private double preço;
	private int supermercado;
	
	public ListaProduto(String nome, double preço, int supermercado) {
	
		this.nome = nome;
		this.preço = preço;
		this.supermercado = supermercado;
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
