package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.notificacao.NivelUrgencia;
import com.algaworks.algafood.di.notificacao.Notificador;
import com.algaworks.algafood.di.notificacao.NotificadorEmail;
import com.algaworks.algafood.di.notificacao.TipodoNotificador;

@SuppressWarnings("unused")
@Component
public class AtivacaoClienteService {
	
	@TipodoNotificador(NivelUrgencia.NORMAL)
	//@Qualifier("Opcional")//definindo qual notificador sera usado.
	@Autowired//consegue injetar mesmo sendo um atributo private.
	private Notificador notificador;
	
	
	
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
