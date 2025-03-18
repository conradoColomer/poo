package logica;

public class POO {

	public static void main(String[] args) {
	 
		Alumno alu1 = new Alumno(); 
		Alumno alu2 = new Alumno(5, "Conrado", "Mendez"); 
	
		System.out.println("La id del alumno 2 es: " + alu2.getId());
		System.out.println("El nombre es: " + alu2.getNombre());
		System.out.println("El apellido es: " + alu2.getApellido());
		System.out.println();
		System.out.println();
		
		System.out.println("Previo al uso de los GETTERS y SETTERS los valores eran: ");
		System.out.println("Nombre: " + alu1.nombre);
		System.out.println("Apellido: " + alu1.apellido);
		System.out.println("ID: " + alu1.apellido);
		System.out.println();
		System.out.println();
		
		System.out.println("Posteriormente son: ");
		
		alu1.setId(10);
		alu1.setNombre("Manuela");
		alu1.setApellido("GB");
		System.out.println("Previo al uso de los GETTERS y SETTERS los valores eran: ");
		System.out.println("Nombre: " + alu1.nombre);
		System.out.println("Apellido: " + alu1.apellido);
		System.out.println("ID: " + alu1.id);
		System.out.println();
		System.out.println();
		
		System.out.println("Usando ahora SETTERS");
		alu2.setId(3);
		System.out.println("La id del alumno 2 es: " + alu2.getId());
		System.out.println("El nombre es: " + alu2.getNombre());
		System.out.println("El apellido es: " + alu2.getApellido());
		
		
	}

}
