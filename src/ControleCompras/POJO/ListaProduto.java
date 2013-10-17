package ControleCompras.POJO;

public class ListaProduto {
	

	private String nome;
	private double pre�o;
	private int supermercado;
	
	public ListaProduto(double pre�o, int supermercado,String nome ) {
	
		this.pre�o = pre�o;
		this.supermercado = supermercado;
		this.nome = nome;
		
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
