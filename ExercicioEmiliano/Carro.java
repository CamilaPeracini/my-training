package ExercicioEmiliano;

public class Carro {

	public String Marca;
	public String Modelo;
	public int NumPassageiros;
	public Double CapCombustivel;
	public Double ConsCombustivel;
	
	void Exibir(){
		System.out.println(Marca);
		System.out.println(Modelo);
		System.out.println(NumPassageiros);
		System.out.println(CapCombustivel);
		System.out.println(ConsCombustivel);
	}
	
	void CalcularCapCombustivel(){
		Double resultado = CapCombustivel * ConsCombustivel;
		System.out.println(resultado);
	}
	
	
}
