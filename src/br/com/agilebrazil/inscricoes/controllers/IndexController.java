package br.com.agilebrazil.inscricoes.controllers;

import br.com.agilebrazil.inscricoes.model.Cadastro;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Resource;

@Resource
public class IndexController {

	private final Cadastro cadastro;

	public IndexController(Cadastro cadastro) {
		this.cadastro = cadastro;
	}
	
	@Get
	public Cadastro lalala(){
		cadastro.setNome("x");
		return cadastro;
	}
}
