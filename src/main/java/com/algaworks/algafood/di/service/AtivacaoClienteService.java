package com.algaworks.algafood.di.service;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;// Necessario criar uma instacia da interface 
	
	
	
	public void ativar(Cliente cliente) {
		/*O metodo de notifica��o e chamado
		 * sempre que o cliente � ativado*/
		cliente.ativar();/*Metodo na classe cliente*/
		
		notificador.notificar(cliente, "Seu cadastro esta ativo !");//Chamando o metodo notificar da instancia notificador, da interface Notificador.
		
		
	}

}
