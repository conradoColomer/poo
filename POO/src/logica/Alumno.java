package logica;

public class Alumno {
	int id;
	String nombre;
	String apellido;

	//Constructor vacio
	public Alumno() {
		
	}
	
	public Alumno(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre; 
		this.apellido = apellido;
		  
	}
	
	//ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id; 
	}
	
	//Nombre
	public String getNombre() {
		return nombre; 
	}
	public void setNombre(String nombre) {
		this.nombre = nombre; 
	}
	
	//Apellido
	public String getApellido(){
		return apellido; 
	}
	public void setApellido(String apellido) {
		this.apellido = apellido; 
	}
	
		
	
	public void decirNombre() {
		System.out.println("Hola, tengo nombre");
	}

	public void aprobar(int calificacion) {
		if (calificacion < 7) {
			System.out.println("Ui no aprobe");
			
		}
		else {
			System.out.println("APROBADO");
		}
	}
}
