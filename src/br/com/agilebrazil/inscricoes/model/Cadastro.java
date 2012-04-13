package br.com.agilebrazil.inscricoes.model;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class Cadastro {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
