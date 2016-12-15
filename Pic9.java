package treinamento;

public class Pic9  {

	private int[] array;
	private int sizeArray;

	public Pic9(int sizeArray){
		this.sizeArray = sizeArray;
		array = new int[sizeArray];
	}


	public int[] printPic9(int[] value) {

		try{
	        //recebendo os números
	        for(int i=0 ; i < sizeArray ; i++){
	        	this.array[i] = value[i];
	        }

	        //exibindo os números
	        for(int i=0 ; i < sizeArray ; i++){
	            System.out.print(array[i]);
	        }

		} catch(IndexOutOfBoundsException e){
			System.out.println(e);
		}
		  return this.array;
	}

	public static void main(String [] args){
		Pic9 pic9 = new Pic9(10);
		int[] array = new int[]{1,2,3,4};
		int[] resultado = pic9.printPic9(array);
		//exibindo os números
        for(int i=0 ; i < resultado.length ; i++){
            System.out.print(resultado[i]);
        }


	}

} 
