package br.com.gama.academy;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class EscolaDeusmeChama {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> notas = new ArrayList<Integer>();
		
		System.out.println("Digite o nome do(a) aluno(a): ");
		String nome = sc.nextLine();
		
		String mais = "S";
		
		while (mais.equalsIgnoreCase("S")) {
			try {
				System.out.println("Digite a nota do aluno: ");
				int nota = sc.nextInt();
				notas.add(nota);
			
				System.out.println("Deseja adicionar outra nota? (S/N) ");
				mais = sc.next();
			}catch (InputMismatchException e) { 
				
				System.out.println("Para computação das notas adicione somente números");
				sc.next();
			}
		}
		
		int soma = 0;
		
		for (int nota : notas) {
			soma += nota;
		}
		
		int media = (int) soma / notas.size();
		
		if (media <= 5) {
			System.out.println("O aluno "+ nome + ", obteve a nota média " + media+ ", infelizmente está reprovado." );
		}else {
			System.out.println("O aluno "+ nome + ", obteve a nota média " + media+ ", parabéns! Aprovado.");
		}
		
		sc.close();

	}

}
