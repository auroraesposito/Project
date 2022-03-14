package model.clienti;

public class Cliente {

	private static int counter = 1;
	private int codCliente;
	private String nome;
	
	
	public Cliente(String nome) {
		this.nome = nome;
		this.codCliente = counter++;
	}


	@Override
	public String toString() {
		return this.codCliente + ") " + this.nome;
	}
	
	
	public int getCodCliente() {
		return codCliente;
	}
	
	
	
}
