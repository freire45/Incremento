package br.com.erickfreire.incremento;

/**
 * Program em Java que usa o incremento
 * @author Erick Freire
 * @version 1 - Criado em 05-04-2021 as 23:13
 */

public class Incremento {
	public static void main(String[] args) {
		
		int c = 5;
		
		System.out.printf("C antes do incremento: %d%n", c);
		System.out.printf("C posincrementando: %d%n", c++);
		System.out.printf("C depois do pos incremento: %d%n", c);
		
		System.out.println();
		
		c = 5;
		
		System.out.printf("C antes do incremento: %d%n", c);
		System.out.printf("C preincrementando: %d%n", ++c);
		System.out.printf("C depois do pos incremento: %d%n", c);
		
	}

}
