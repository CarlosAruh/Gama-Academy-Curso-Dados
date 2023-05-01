package br.com.gama.academy;

import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
		System.out.print("Digite quantidade de produtos: ");
		int quantidade = scanner.nextInt();
		
		if(quantidade<=10)
			System.out.println("Estoque baixo");
		if(quantidade > 10)
			System.out.println("Estoque alto");
    
    
		scanner.close();

	}

}
