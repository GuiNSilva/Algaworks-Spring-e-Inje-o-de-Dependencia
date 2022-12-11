package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component
public class NotificadorSms implements Notificador{
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone %s:  %s\n", 
				cliente.getNome(),cliente.getTelefone(), mensagem);
		
	}


	@Override
	public void ativar(Cliente borges) {
		// TODO Auto-generated method stub
		
	}

}