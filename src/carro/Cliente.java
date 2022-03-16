package carro;

public class Cliente {
	public String nome;
	private String cpf;
	
	public Cliente(
			String nome,
			String cpf
			)
	{
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void negociar() {
		System.out.println("Negociando");
	}
	
	public void comprar() {
		System.out.println("Comprando");
	}
	
	public static void main(String[] args) {
		Cliente C1 = new Cliente("Osvaldo", "25478954625");
		
		
		C1.negociar();
		C1.comprar();
	}
}
