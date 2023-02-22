package atividade2;

public class ClasseFuncionario {
	
	private String nome;
	private int cargo;
	private int telefone;
	private int idade;
	private int identidade;
	
	public ClasseFuncionario(String nome, int cargo, int telefone, int idade, int identidade) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.telefone = telefone;
		this.idade = idade;
		this.identidade = identidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getcargo() {
		return cargo;
	}

	public void setcargo(String intcargo) {
		this.cargo = cargo;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdentidade() {
		return identidade;
	}

	public void setIdentidade(int identidade) {
		this.identidade = identidade;
	}

	public void visualizar() {
		System.out.println("\n		DADOS DO FUNCIONARIO				");
		System.out.println("****************************************************]");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.cargo);
		System.out.println("Email: " + this.telefone);
		System.out.println("Numero: " + this.idade);
		System.out.println("Identidade: " + this.identidade);
	}
}
