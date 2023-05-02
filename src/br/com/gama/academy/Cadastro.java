package br.com.gama.academy;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        int contador = 1;
        String[] nomes = new String[3];
        Scanner scanner = new Scanner(System.in);

        while (contador <= 3) {
            System.out.print("Digite o nome do " + contador + "* cliente: ");
            nomes[contador - 1] = scanner.nextLine();
            contador++;
        }

        System.out.println("==================================");
        System.out.print("Digite o índice do cliente que deseja visualizar (1-3): ");
        int pesquisa = scanner.nextInt();

        if (pesquisa >= 1 && pesquisa <= 3) {
            System.out.println("O nome do cliente é: " + nomes[pesquisa - 1]);
        } else {
            System.out.println("Índice inválido. Por favor, execute o programa novamente.");
        }

        scanner.close();
    }
}