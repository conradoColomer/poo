package encapsulamiento;



public class Encapsulamiento {
	
	public static void main(String[] args) {
		
		Alumno alu = new Alumno();
		Alumno alu2 = new Alumno(15, "Conrado", "Mendez");
		
		
		System.out.println("ID: " + alu2.getId());
		System.out.println("Apellido: " + alu2.getApellido());
		System.out .println("Nombre: " + alu2.getNombre());
		

	}

}
