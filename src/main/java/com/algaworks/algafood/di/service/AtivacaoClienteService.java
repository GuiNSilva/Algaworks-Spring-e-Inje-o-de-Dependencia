package com.algaworks.algafood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	
	@Autowired//consegue injetar mesmo sendo um atributo private.
	private  List<Notificador> notificadores;
	
	//@Autowired//
	//public AtivacaoClienteService(Notificador notificador) { //construtor com parametro injetado
		//this.notificadores = (List<Notificador>) notificador;
		
	
	
	/*
	 * A @Autowired pode ser usada para definir
	 * varios pontos de injenção, no construtor,
	 * no metodo setter, e tambem no atributo.
	 * pode ser usado em qualquer um deles.
	 * 
	 * */

	public void ativar(Cliente cliente) {
		cliente.ativar();/*Metodo na classe cliente*/
		for (Notificador notificador:notificadores) {
		notificador.notificar(cliente, "Seu cadastro esta ativo !");//Chamando o metodo notificar da instancia notificador, da interface Notificador.
		}
		/*O metodo de notifica��o e chamado
		 * sempre que o cliente � ativado*/
		
		
	}

	
	
}
