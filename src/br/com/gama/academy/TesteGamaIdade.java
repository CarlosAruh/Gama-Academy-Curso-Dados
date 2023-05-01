package br.com.gama.academy;

import java.util.Scanner;
import java.time.LocalDate;

public class TesteGamaIdade {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite seu nome: ");

		String nome = scanner.nextLine();

		System.out.print("Digite o ano de seu nascimento: ");

		int anoNascimento = scanner.nextInt();

		int anoAtual = LocalDate.now().getYear();

		int idade = anoAtual - anoNascimento;

		System.out.println("Olá, " + nome + "! Sua idade é " + idade + " anos.");

		scanner.close();

	}
}


