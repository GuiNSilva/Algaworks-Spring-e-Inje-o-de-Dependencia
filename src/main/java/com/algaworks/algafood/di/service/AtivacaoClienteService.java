package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	
	@Autowired//consegue injetar mesmo sendo um atributo private.
	private Notificador notificador;
	
	@Autowired//
	public AtivacaoClienteService(Notificador notificador) { //construtor com parametro injetado
		this.notificador = notificador;
		
	}
	
	/*
	 * A @Autowired pode ser usada para definir
	 * varios pontos de injenção, no construtor,
	 * no metodo setter, e tambem no atributo.
	 * pode ser usado em qualquer um deles.
	 * 
	 * */

	public void ativar(Cliente cliente) {
		/*O metodo de notifica��o e chamado
		 * sempre que o cliente � ativado*/
		cliente.ativar();/*Metodo na classe cliente*/
		
		notificador.notificar(cliente, "Seu cadastro esta ativo !");//Chamando o metodo notificar da instancia notificador, da interface Notificador.
		
		
	}

	
	
}
