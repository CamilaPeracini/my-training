package treinamento;

public class Matriz {

	public static void main(String[] args) {
		
		int matriz[][] = new int[3][3]; 
		
		int linha = 3;
		int coluna = 3;
		
		for(linha=0;linha<3;linha++){
			for(coluna=0; coluna<3; coluna++){
				System.out.println("O resultado é: " +linha + coluna);
			}
			System.out.println();
		}

	}

}
