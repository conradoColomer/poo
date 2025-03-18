package sobrescritura_y_sobrecarga_de_metodos;

public class Animal {
	private int id_animal; 
	private String descripcion; 
	
	//Constructures
	
	//metodos Getters y Setters
	
	//Otros Metodos
	public void hacerSonido() {
		System.out.println("El animal hace un sonido");
	}
	
	public void hacerSonido(String nombreAnimal) {
		System.out.println("El animal " + nombreAnimal + " hace un sonido");
	}
	
	public void hacerSonido(String nombreAnimal, String tipoSonido) {
		System.out.println("El animal " + nombreAnimal + "hace un sonido de tipo " + tipoSonido	);
		
	}
}
