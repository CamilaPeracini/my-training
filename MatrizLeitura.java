package treinamento;

import java.util.Scanner;

public class MatrizLeitura {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int matriz[][][] = new int[2][2][2]; 
		
		int i;
		int j;
		int k;
		
		for(i=0; i<3; i++){
			System.out.println("Digite os valores das linhas: ");
			i = ler.nextInt();
			//coluna = ler.nextInt();
			//comprimento = ler.nextInt();
			//System.out.println(matriz[linha+linha+linha]);
			for(j=0; j<3; j++){
				System.out.println("Digite os valores das Colunas: ");
				//linha = ler.nextInt();
				j = ler.nextInt();
				//comprimento = ler.nextInt();
				//System.out.println(matriz[coluna+coluna+coluna]);
				}
				for (k=0; k<3; k++){
					System.out.println("Digite os valores das comprimento: ");
					//linha = ler.nextInt();
					//coluna = ler.nextInt();
					k = ler.nextInt();
					//System.out.println(matriz[comprimento+comprimento+comprimento]);
					}
				System.out.println(matriz[i] + " " + matriz[i]);  
				System.out.println(matriz[j] + " " + matriz[j]);
				System.out.println(matriz[k] + " " + matriz[k]);
				}
			System.out.println();
		}
		
	}


