package com.algaworks.algafood.di.notificacao;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

@Retention(RetentionPolicy.RUNTIME)//define o tempo em que a anotaion vai funcionar
@Qualifier
public @interface TipodoNotificador {
	
	NivelUrgencia value();

}
