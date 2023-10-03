package application;

import entities.Carro;

public class Main {

	public static void main(String[] args) {
		
		Carro carro = new Carro("Ferrari", "vermelho", 2023);
		
		System.out.println(carro.getMarca() + ", " + carro.getCor() + ", " + carro.getAno());

	}

}
