package treinamento;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double tamanho;
		System.out.println("Digite o tamanho do arquivo em MB");
		tamanho = scan.nextDouble();
		
		double velocidade;
		System.out.println("Digite a velocidade da internet");
		velocidade = scan.nextDouble();
		
		double tempo = tamanho / velocidade;
		System.out.println("O tempo estimado é de : " + tempo);
		

	}

}
