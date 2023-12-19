package exercArraySimples;

import java.util.Scanner;

public class CalcularMedia {

	public static void main(String[] args) {

		/**
		 * Exercício simples para armazenar valores (notas de provas de alunos) 
		 * e realizar soma e média
		 */
		
		System.out.print("Quantas notas você quer adicionar? ");
		Scanner entrada = new Scanner(System.in);
		int qtNotas = entrada.nextInt();

		double[] notas = new double[qtNotas];
		double soma = 0;

		System.out.println();

		for (int i = 0; i < qtNotas; i++) {

			System.out.print("Digite a " + (i+1) + "º nota: ");
			double nota = entrada.nextDouble();

			notas[i] = nota;
			soma += nota;

		}
		entrada.close();

		double media = soma / qtNotas;

		System.out.println("\nSoma: " + soma);
		System.out.println("Média: " + media);

	}

}
