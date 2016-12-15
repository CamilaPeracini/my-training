package ExercicioEmiliano;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		Carro fusca = new Carro();
		
		van.Marca = "Fiat";
		van.Modelo = "Ducato";
		van.NumPassageiros = 5;
		van.CapCombustivel = 42.5;
		van.ConsCombustivel = 12.5;

		fusca.Marca = "WV";
		fusca.Modelo = "fusca";
		fusca.NumPassageiros = 4;
		fusca.CapCombustivel = 12.5;
		fusca.ConsCombustivel = 2.5;
		
	van.Exibir();
	fusca.Exibir();	
	
	van.CalcularCapCombustivel();
	fusca.CalcularCapCombustivel();
	
	}

}
