package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.modelo.Cliente;

public class ClienteAtivadoEvent {//Classe que vai fazer a ativação do cliente
	
	private Cliente cliente;

public ClienteAtivadoEvent(Cliente cliente) {
	super();
	this.cliente = cliente;
}

public Cliente getCliente() {
	return cliente;
}
	





}
