package atividade2.cargos;

import atividade2.ClasseFuncionario;

public class Gerente extends ClasseFuncionario {

	private int setor;

	public Gerente(String nome, int cargo, int telefone, int idade, int identidade, int setor) {
		super(nome, cargo, telefone, idade, identidade);
		this.setor = setor;
	}

	public int getSetor() {
		return setor;
	}

	public void setSetor(int setor) {
		this.setor = setor;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Setor: " + this.setor);
		System.out.println("Salário: R$" + 2200);
	}
}
