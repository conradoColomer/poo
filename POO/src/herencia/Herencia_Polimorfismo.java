package herencia;

public class Herencia_Polimorfismo {
	
	public static void main(String[] args) {
		
		
		Persona vector[] = new Persona [5];
		vector[0] = new Persona(); //Clase Madre
		vector[1] = new Empleado(); //Formas de representar a Persona
		vector[2] = new Consultor();//Formas de representar a Persona
		vector[3] = new Jefe();//Formas de representar a Persona
								// por lo cual en un vector
							//que pertenece a la Clase Padre yo puedo guardar
					//distintos tipos que pertenezcan a clases hijas
		
		
		Persona pers = new Persona(); 
		Consultor cons = new Consultor();
		
		pers = cons; //Asignacion de ClaseHija a su ClasePadre = OK 
	//	cons = pers; //Asignacion de ClasePadre a ClaseHija == NO OK 
	}

}
