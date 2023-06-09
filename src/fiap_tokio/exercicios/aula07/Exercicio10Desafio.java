package fiap_tokio.exercicios.aula07;

import java.util.Scanner;

/**
 * 
 * Determine e mostre todos os números primos no intervalo de 2 a 2000.
 * 
 * Dicas: ▪ Para resolver esse problema, primeiro faça um algoritmo que verifica
 * se um número inteiro qualquer é primo ou não. ▪ A seguir, com esse código em
 * mãos, faça os ajustes necessários para mostrar todos os números primos no
 * intervalo solicitado. ▪ Você precisará colocar uma estrutura de repetição
 * dentro da outra. ▪ Laços aninhados!!!!
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio10Desafio {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		
		
		primosAte2000JeitoProfessor();

		
		
		
		scanner.close();
	}

	/**
	 * 
	 * verifica se apenas um numero digitado é primo
	 * 
	 * @return
	 */
	public static boolean primo() {
		boolean primo = false;
		int qtd = 0;

		System.out.println("Digite um numero primo");
		int num = scanner.nextInt();

		for (int i = 1; i <= num; i++) { // somente resto por 1 e por ele mesmo tem que dar 0
			if (num % i == 0) {
				qtd++;
			}
		}

		if (qtd == 2) {
			primo = true;
		}

		if (primo) {
			System.out.println("O numero " + num + " eh um numero primo");
		}
		
		return primo;
	}

	/**
	 * Minha lógica de como obter todos os numeros primos até 2000
	 */
	public static void primosAte2000MinhaForma() {
		boolean primo = false;
		int qtd = 0;

		for (int i = 1; i <= 2000; i++) { // for = para aumentar o numero que sera dividido (dividendo)
			for (int j = 1; j <= 2000; j++) { // for = aumentar o divisor
				if (i % j == 0) {
					qtd++;
				}
			}

			if (qtd == 2) {
				primo = true;
			}

			if (primo) {
				System.out.println("O numero " + i + " eh um numero primo");
			}

			qtd = 0; // zerando a variavel
			primo = false; // zerando a variavel
		}

	}

	/**
	 * Forma com que o professor fez
	 * 
	 * TODO terminar este metodo
	 */
	public static void primosAte2000JeitoProfessor() {

		int num = 2;

		for (int i = 2; i <= 2000; i++) {
			int divisor = 2;

			while (i % num != 0) {
				divisor++;
			}

			if (divisor == num) {
				System.out.println("O numero " + num + " eh primo");
			}
			
			num++;

		} // for

	} // metodo

}
