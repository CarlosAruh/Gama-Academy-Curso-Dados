package br.com.gama.academy;

import java.util.Scanner;

public class Cadastro3 {
	public static void main(String[] args) {
		int contador = 0;
		String[] produto = new String[3];
        int[] quantidade = new int[3];
        double[] preco = new double[3];
        Scanner scanner = new Scanner(System.in);

        for (contador = 0; contador < 3; contador++) {
            System.out.print("Digite o produto: ");
            produto[contador] = scanner.nextLine();
            System.out.print("Digite a quantidade: ");
            quantidade[contador] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o preço unitário: R$");
            preco[contador] = scanner.nextDouble();
            scanner.nextLine();
            double total = quantidade[contador] * preco[contador];
            System.out.printf("Valor do estoque de %s: R$%.2f%n", produto[contador], total);
        }

		scanner.close();
    }
}