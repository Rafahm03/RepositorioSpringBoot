package com.salesianostriana.dam.ejspringcore3;

import org.springframework.stereotype.Service;

@Service
public class EnglishSaludator implements Saludator{

	@Override
	public void imprimirSaludo() {
		System.out.println("Hey everyone");
	}

	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		return null;
	}

}
