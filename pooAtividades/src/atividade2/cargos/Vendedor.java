package atividade2.cargos;

import atividade2.ClasseFuncionario;

public class Vendedor extends ClasseFuncionario {

	private int vendas;

	public Vendedor(String nome, int cargo, int telefone, int idade, int identidade, int vendas) {
		super(nome, cargo, telefone, idade, identidade);
		this.vendas = vendas;
	}

	public int getVendas() {
		return vendas;
	}

	public void setVendas(int vendas) {
		this.vendas = vendas;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Vendas: " + this.vendas);
		System.out.println("Salário com comissão: R$" + (this.vendas * 0.01 + 1800));
	}
}
