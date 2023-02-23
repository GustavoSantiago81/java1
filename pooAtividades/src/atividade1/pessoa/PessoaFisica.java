package atividade1.pessoa;

import atividade1.ClasseCliente;

public class PessoaFisica extends ClasseCliente{

	private String identidade;

	public PessoaFisica(String nome, String email, int numero, int produto, int id, String identidade) {
		super(nome, email, numero, produto, id);
		this.identidade = identidade;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Identidade: " + this.identidade);
	}
}
