package herencia;

public class Herencia {
	
	public static void main(String[] args) {
		Empleado emple = new Empleado();
		emple.getNum_lejajo();
		emple.getNombre(); 
		
		emple.setCargp("Programador");
		System.out.println(emple.getCargo());
		
		Consultor consul = new Consultor();
		consul.getDni(); //Viene heredado de Persona
		
		
		

	}
	


}
