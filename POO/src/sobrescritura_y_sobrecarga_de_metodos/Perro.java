package sobrescritura_y_sobrecarga_de_metodos;



public class Perro extends Animal {
	private String nombrePerro;
	private double peso;
	private double raza; 
	private double sexo;
	
	// constructores
	
	// getters y setters
	
	
	@Override // sobrescribe, pisa el metodo de la Clase Madre
	public void hacerSonido() {
		System.out.println("Soy un perro y ladro: guau gua ");
	}  
	
}
