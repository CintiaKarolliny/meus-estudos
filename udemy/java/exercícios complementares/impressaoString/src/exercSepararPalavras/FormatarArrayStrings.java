package exercSepararPalavras;

import java.util.Arrays;
import java.util.Scanner;

public class FormatarArrayStrings {

	/*
	 * Programa pede que o usuário entre com uma frase que é salva em um array de Strings 
	 * e seja printado sem nenhum sinal de pontuação ou espaço
	 */
	
	public static void main(String[] args) {
		
		System.out.print("Digite uma frase qualquer: ");
		Scanner entrada = new Scanner(System.in);
		
		String frase = entrada.nextLine(); 
		entrada.close();
		
		String fraseFormatada = Arrays.toString(frase.split("[\\s\\p{Punct}]+"));
		
		System.out.println("\nVocê digitou essas palavras: " + fraseFormatada);
		
	}
	
}
