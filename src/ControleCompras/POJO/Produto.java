package ControleCompras.POJO;
public class Produto {

	private int produtoID, preco, superID;
	private String nome;

	
	public Produto(int produtoID,String nome, int preco, int superID) {
		super();
		this.produtoID = produtoID;
		this.nome = nome;
		this.preco = preco;
		this.superID = superID;
		
	}

	public Produto(String nome, int preco, int superID ) {
		super();
		this.produtoID = 1;
		this.nome = nome;
		this.preco = preco;
		this.superID = superID;
		
	}

	public int getProdutoID() {
		return produtoID;
	}

	public int getPreco() {
		return preco;
	}

	public int getSuperID() {
		return superID;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Produto [produtoID=" + produtoID + ", preco=" + preco
				+ ", superID=" + superID + ", nome=" + nome + "]";
	}


	
	
}
