package ControleCompras.POJO;

public class Supermercado {
	
	private int superID;
	private String nome;
	
	public Supermercado(int superID,String nome) {
		super();
		this.superID = superID;
		this.nome = nome;
		
	}

	public int getSuperID() {
		return superID;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Supermercado [superID=" + superID + ", nome=" + nome + "]";
	}
	

}
