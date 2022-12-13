package com.algaworks.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;


@Profile("Dev")
@TipodoNotificador(NivelUrgencia.URGENTE)
//@Qualifier("Prioridade")
@Component
public class NotificadorEmailMock implements Notificador{
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK - Notificação seria enviada %s atraves do e-mail %s\n", 
				cliente.getNome(),cliente.getEmail());
		
	}


	@Override
	public void ativar(Cliente borges) {
		// TODO Auto-generated method stub
		
	}

}
