package treinamento;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int[] nota = new int[10];
        Scanner entrada = new Scanner(System.in);
        
        
        //recebendo os números
        for(int indice=0 ; indice < 3 ; indice++){
            System.out.print("\nEntre com o número " + (indice+1) + ": ");
            nota[indice] = entrada.nextInt();
        }
        
        //exibindo os números
        for(int indice=0 ; indice < 3 ; indice++){
            System.out.print(nota[indice]);

	}

}
}
