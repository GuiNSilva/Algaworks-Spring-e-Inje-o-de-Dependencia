package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService; //criar uma estancia de  um component. Injetando um component
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {//construtor da classe passando o component como parametro.
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("Meu primeiro controller: "+ ativacaoClienteService);
	}

	@GetMapping ("/otaku") // caminho da requisição.
	@ResponseBody//Retornar resposta no body
	public String  Hello(){
		Cliente Borges = new Cliente("Borges", "borges@bronha", "6985-7564", false);
		ativacaoClienteService.ativar(Borges);
		return "Hello Otáku jiromba";
		
	}
	
	

}
