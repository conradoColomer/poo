package logica;


//Declaramos una abstracta para que las hijas hereden
public abstract class Pokemon { 
	
	protected int num_Pokedex; // solo las hijas tienes acceso
	protected String nombre; 
	protected double peso; 
	protected String sexo; 
	protected int temporada; 
	
	
	//Defino metodos abstractos para que despues
	// cada subclase defina. Palabra CLAVE: 'abstract'
	
	
	// ##### Ver alguna manera de implementar un metodo UTIL.
	protected abstract void miNombre();
	
	protected void atacarPlacaje() {
		System.out.println("Hola soy " + nombre + " y este es mi ataque de placaje");
	}; //verbos en infinitivo
	protected void atacarAraniazo() {
		System.out.println("Hola soy " + nombre + " y este es mi ataque de arañazo");
	}; 
	protected void atacarMordisco() {
		System.out.println("Hola soy " + nombre + " y este es mi ataque de mordizco");
	}; 

}
