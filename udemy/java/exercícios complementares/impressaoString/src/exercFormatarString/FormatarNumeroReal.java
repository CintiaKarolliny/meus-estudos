package exercFormatarString;

public class FormatarNumeroReal {

	/* 
	 * Programa printa 5 vezes o número de PI, porém:
	 * 1º print: o valor é apresentado com 1 casa decimal,
	 * 2º print: o valor é apresentado com 2 casas decimais,
	 * 3º print: o valor é apresentado com 3 casas decimais... e assim em diante...
	*/
	
	public static void main(String[] args) {
		
		System.out.printf("Número de PI com 1 casa decimal: %.1f%n", Math.PI);
		System.out.printf("Número de PI com 2 casas decimais: %.2f%n", Math.PI);
		System.out.printf("Número de PI com 3 casas decimais: %.3f%n", Math.PI);
		System.out.printf("Número de PI com 4 casas decimais: %.4f%n", Math.PI);
		System.out.printf("Número de PI com 5 casas decimais: %.5f%n", Math.PI);
		
	}
	
}
