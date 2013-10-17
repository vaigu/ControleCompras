package ControleCompras.POJO;

public class ListaProduto {
	

	private String nome;
	private double pre�o;
	private int supermercado;
	
	public ListaProduto(String nome, double pre�o, int supermercado) {
	
		this.nome = nome;
		this.pre�o = pre�o;
		this.supermercado = supermercado;
	}
	
	
	
	
	public String getNome() {
		return nome;
	}
	
	
	public double getPre�o() {
		return pre�o;
	}
	
	public int getSupermercado() {
		return supermercado;
	}



	@Override
	public String toString() {
		return "ListaProduto [nome=" + nome + ", pre�o=" + pre�o
				+ ", supermercado=" + supermercado + "]";
	}
	
	
	
	
	
	

}
