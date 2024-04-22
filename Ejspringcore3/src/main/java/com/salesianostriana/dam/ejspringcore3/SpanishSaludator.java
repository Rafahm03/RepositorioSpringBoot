package com.salesianostriana.dam.ejspringcore3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class SpanishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		System.out.println("Hola a todos los programadores de primero dam");		
	}

	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		return null;
	}

}
