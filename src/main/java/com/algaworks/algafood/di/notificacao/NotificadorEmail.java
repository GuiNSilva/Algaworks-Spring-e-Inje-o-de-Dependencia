package com.algaworks.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.di.modelo.Cliente;

public class NotificadorEmail implements Notificador{
	
	public boolean caixaAlta;
	public String hostServidorSmtp;
	
	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("NotificadorEmail");
	}
	
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) {
			mensagem =  mensagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s atraves do e-mail %s usando SMTP %s: %s\n", 
				cliente.getNome(),cliente.getEmail(), this.hostServidorSmtp, mensagem);
		
	}


	@Override
	public void ativar(Cliente borges) {
		// TODO Auto-generated method stub
		
	}


	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
	

}
