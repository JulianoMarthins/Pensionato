package programa;

import java.util.Scanner;

import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa[] pessoa = new Pessoa[10];

		System.out.println("Quantos quartos deseja reservar? ");
		int quant = sc.nextInt();

		System.out.println("\nCadastro de clientes por quarto: ");

		for (int i = 0; i < quant; i++) {
			sc.nextLine();

			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();

			int quarto = 0;
			while (true) {
				System.out.println("Qual o quarto escolhido: ");
				quarto = sc.nextInt();

				if (quarto > 10 || quarto < 0) {
					System.out.println("\nNúmero de quarto inválido. Pro favor, repita o processo");
				} else {
					pessoa[quarto] = new Pessoa(nome, email);
					System.out.println("Quatro reservado com sucesso.");
					break;
				}
			}
		}

		System.out.println("----------------------------------------------------");
		System.out.println("Quartos reservados: ");

		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i] != null) {
				System.out.println("\nQuatro reservado ao cliente: \nNome: " + pessoa[i].getNome() + "\nEmail: "
						+ pessoa[i].getEmail() + "\nQuarto: " + (i + 1));
			}
		}

		sc.close();
	}

}
