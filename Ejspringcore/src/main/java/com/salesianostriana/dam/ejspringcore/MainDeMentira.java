package com.salesianostriana.dam.ejspringcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class MainDeMentira {
	
	@Autowired //Esta anotacion me inyecta una dependencia que busque un bean que implemente la interfaz
	@Qualifier("englishSaludator") // Esta anotacion nos permite ajustar qué bean, de entre los de un tipo, vamos a inyectar.

	private Saludator saludator;

	@PostConstruct //Esta anotacion hace que las acciones que se realizan después de la inicialización del bean.

	public void init() {
		
		saludator.imprimirSaludo();
	}

	@PostConstruct
	void alComenzar() {
		System.out.println("Método \"alComenzar\" anotado con @PostConstruct ");
	}
	
	@PreCpns
}
