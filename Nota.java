package treinamento;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		int nota = scan.nextInt();
		
		if(nota<=10){
			System.out.println("A nota �: " + nota);
		} else{
			System.out.println("Por favor, digite uma nota v�lida entre 0-10");
		}

	}


	
}
