package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

@Component
public class NotificadorEmail{
	
	public NotificadorEmail() {
		System.out.println("Oooo fila da puta!!!");
	}
	
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s atraves do e-mail %s: %s\n", 
				cliente.getNome(),cliente.getEmail(), mensagem);
		
	}

}
