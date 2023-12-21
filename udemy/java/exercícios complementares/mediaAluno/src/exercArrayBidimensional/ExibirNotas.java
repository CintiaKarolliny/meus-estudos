package exercArrayBidimensional;

import java.util.Scanner;

public class ExibirNotas {

	/*
	 * Matriz bidimensional representando as notas de alunos.
	 */

	public static void main(String[] args) {

		System.out.print("Digite a quantidade de disciplinas a serem cadastradas: ");
		Scanner entrada = new Scanner(System.in);
		int qtDisc = entrada.nextInt();

		String[][] matriz = new String[qtDisc][];

		// d para disciplina
		// n para nota

		for (int d = 0; d < qtDisc; d++) {

			System.out.print("\nDigite o nome da " + (d + 1) + "º disciplina: ");
			String nomeDisc = entrada.next();

			System.out.print("\nDigite a quantidade de notas a serem cadastradas para " + nomeDisc + ": ");
			int qtNotas = entrada.nextInt();

			double[] vetorNotas = new double[qtNotas];

			System.out.println();

			for (int n = 0; n < qtNotas; n++) {

				System.out.print("Digite a " + (n + 1) + "º nota para " + nomeDisc + ": ");				
				double nota = entrada.nextDouble();
				vetorNotas[n] = nota;
				
			}

			matriz[d] = new String[qtNotas + 1];
			matriz[d][0] = nomeDisc;

			for (int n = 0; n < qtNotas; n++) {
				matriz[d][n + 1] = Double.toString(vetorNotas[n]);
			}

		}

		System.out.println("\nTabela de notas: \n");

		System.out.print("Disciplinas:\t");

		for (int d = 0; d < qtDisc; d++) {
			System.out.print(matriz[d][0] + "\t");
		}

		System.out.println();
		
		int maxNotas = 0;
		for (int d = 0; d < qtDisc; d++) {
			maxNotas = Math.max(maxNotas, matriz[d].length - 1);
		}

		for (int n = 1; n <= maxNotas; n++) {

			System.out.print("Notas " + n + ": \t");

			for (int d = 0; d < qtDisc; d++) {

				if (n < matriz[d].length) {
					System.out.print(matriz[d][n] + "\t");
					
					
				} else {
					System.out.print("-\t");
				}
				
			}
			
			System.out.println();
		}

		entrada.close();
	}

}
