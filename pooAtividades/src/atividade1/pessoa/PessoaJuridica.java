package atividade1.pessoa;

import atividade1.ClasseCliente;

public class PessoaJuridica extends ClasseCliente {
	
	private String cnpj;

	public PessoaJuridica(String nome, String email, int telefone, int produto, int id, String cnpj) {
		super(nome, email, telefone, produto, id);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	

}
