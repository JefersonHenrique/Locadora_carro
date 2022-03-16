package carro;

public class Funcionario {
	public String nome;
	public Number id;
	
	public Funcionario (
			String nome,
			Number id
			)
	{
		this.nome = nome;
		this.id = id;
	}
	
	public void negociar() {
		System.out.println("Negociando");
	}
	
	public void vender() {
		System.out.println("Vendendo");
	}
	
	public static void main(String[] args) {
		Funcionario F1 = new Funcionario("Gilberto", 5478652);
		
		F1.negociar();
		F1.vender();
	}
}
