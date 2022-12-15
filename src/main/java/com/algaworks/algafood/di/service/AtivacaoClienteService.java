package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.NotificadorEmail;
import com.algaworks.algafood.di.notificacao.TipodoNotificador;

@SuppressWarnings("unused")
@Component
public class AtivacaoClienteService {
	
	@Autowired
	private ApplicationEventPublisher eventPublisher; //Metodo que permite que se publique eventos

	public void ativar(Cliente cliente) {
		/*O metodo de notificacao e chamado
		 * sempre que o cliente e ativado*/
		cliente.ativar();/*Metodo na classe cliente*/
		
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
		
		
		
	}

	
	
}
