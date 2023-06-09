package fiap_tokio.exercicios.aula05;

import java.util.Scanner;

/**
 * Leia 3 valores de entrada, referentes à idade de uma pessoa em: anos, meses e
 * dias. Exemplo: eu tenho 30 anos, 2 meses 3 7 dias. Calcule e exiba o total de
 * dias que essa pessoa já viveu. Obs.: apenas para facilitar o cálculo,
 * considere todo ano com 365 dias e todo mês com 30 dias.
 * 
 * 
 * @author Miguel
 *
 */
public class Exercicio10 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int idade, mes, dia, diasTotais;

		System.out.print("Quantos ANOS voce tem: ");
		idade = scanner.nextInt();
		System.out.print(idade + " anos e quantos MESES: ");
		mes = scanner.nextInt();
		System.out.print(idade + " anos, " + mes + " meses e " + "quantos DIAS voce tem: ");
		dia = scanner.nextInt();

		diasTotais = idade * 365 + mes * 30 + dia; // somando o ano, mes e dias
		
		System.out.println("");
		System.out.println("Voce ja viveu: " + diasTotais);

		scanner.close();
	}
}
