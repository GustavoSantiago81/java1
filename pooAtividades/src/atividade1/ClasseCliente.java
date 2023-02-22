package atividade1;

public class ClasseCliente {
	
	private String nome;
	private String email;
	private int numero;
	private int idade;
	private int identidade;
	
	public ClasseCliente(String nome, String email, int numero, int idade, int identidade) {
		this.nome = nome;
		this.email = email;
		this.numero = numero;
		this.idade = idade;
		this.identidade = identidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getidentidade() {
		return identidade;
	}

	public void setidentidade(int identidade) {
		this.identidade = identidade;
	}
	
	public void visualizar() {

		System.out.println("************************************");
		System.out.println("		DADOS DA CONTA				");
		System.out.println("************************************");
		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("Idade  do Cliente: " + this.idade);
		System.out.println("Email  do Cliente: " + email);
		System.out.println("Numero  do Cliente: " + this.numero);
		System.out.println("Identidade  do Cliente: " + this.identidade);
		
	}

}
