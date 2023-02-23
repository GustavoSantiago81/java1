package atividade1;

public abstract class ClasseCliente {
	
	private String nome;
	private String email;
	private int telefone;
	private int produto;
	private int id;
	
	public ClasseCliente(String nome, String email, int telefone, int produto, int id) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.produto = produto;
		this.id = id;
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

	public int gettelefone() {
		return telefone;
	}

	public void settelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getproduto() {
		return produto;
	}

	public void setproduto(int produto) {
		this.produto = produto;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}
	
	public void visualizar() {

		System.out.println("************************************");
		System.out.println("		DADOS DA CONTA				");
		System.out.println("************************************");
		System.out.println("Nome do Cliente: " + this.nome);
		System.out.println("produto  do Cliente: " + this.produto);
		System.out.println("Email  do Cliente: " + email);
		System.out.println("telefone  do Cliente: " + this.telefone);
		System.out.println("id  do Cliente: " + this.id);
		
	}

}
