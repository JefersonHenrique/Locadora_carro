package carro;
// modificadores 
public class Cliente {
	public String nome;
	private String cpf;
	
	public Cliente (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	//construtor
	public void negociar() {
		System.out.println("Negociando");
	}
	
	public void comprar() {
	System.out.println("Comprando");
	}
	
	public static void main(String[] args) {
	Cliente C1 = new Cliente ("Giuliano", "123.234.456-32");
		System.out.println("Nome: " + C1.nome +"\n"+ "CPF:" + C1.cpf);
		
		C1.negociar();
		//C1.comprar();
	}
}