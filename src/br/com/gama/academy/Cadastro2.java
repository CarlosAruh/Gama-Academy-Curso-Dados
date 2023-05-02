package br.com.gama.academy;

import java.util.Scanner;

public class Cadastro2 {
	public static void main(String[] args) {
		int contador = 1;
        String[] marcas = new String[3];
        String[] carros = new String[3];
        Scanner scanner = new Scanner(System.in);

        while (contador <= 3) {
            System.out.print("Digite o nome do " + contador + "* carro: ");
            carros[contador - 1] = scanner.nextLine();
            System.out.print("Digite a marca do " + contador + "* carro: ");
            marcas[contador - 1] = scanner.nextLine();
            contador++;
        }

        System.out.println("==================================");
        System.out.print("Digite o ID do carro que deseja visualizar (1-3): ");
        int pesquisa = scanner.nextInt();

        if (pesquisa >= 1 && pesquisa <= 3) {
            System.out.println("O carro é " + carros[pesquisa - 1] + " e a marca correspondente é " + marcas[pesquisa - 1]);
        } else {
            System.out.println("ID inválido. Por favor, execute o programa novamente.");
        }

        scanner.close();
    }
}