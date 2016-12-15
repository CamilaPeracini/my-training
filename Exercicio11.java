package treinamento;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro número inteiro: ");
		int intNumero1 = scan.nextInt();
		
		System.out.println("Digite o Segundo número inteiro: ");
		int intNumero2 = scan.nextInt();
		
		System.out.println("Digite o número real: ");
		Double doubleNumero3 = scan.nextDouble();
		
		double soma = 0;
		soma = (intNumero1*2)*(intNumero2/2);
		System.out.println("O produto do dobro do primeiro mais a metado do segundo é: " + soma);
		
		soma = (intNumero1*3)+(doubleNumero3);
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + soma);
		
		soma = (doubleNumero3*doubleNumero3*doubleNumero3);
		System.out.println("O terceiro número elevado ao cubo é: " + soma);
		

	}

}
