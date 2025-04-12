package arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		List<Persona> lista = new ArrayList<Persona>(); 
		
		
		lista.add(new Persona(1, "Conrado", 30)); 
		lista.add(new Persona(2, "Ben", 130)); 
		lista.add(new Persona(3, "Ba", 350)); 
		lista.add(new Persona(4, "MA", 63)); 
		lista.add(new Persona(5, "Vane", 430)); 
	 	
		//Recorrer por indice con for clasico
		System.out.println("---------For convencional:---------");	
	for (int i=0;  i< lista.size(); i++ ) { // uso .size porque el tamano es variable y este metodo se usa para Listas
		// usamos .size, no .lenght para listas 	
		System.out.println("Prueba: " + lista.get(i).getNombre());
		 
	}
	
	// recorrido foreach 
	System.out.println("---------Foreach loop:---------");
	
	for (Persona perso:lista) { // perso = Variable Auxiliar para cada objeto de lista (objeto de mi lista) 
		
		int index = 0; 
		if (perso.getNombre().equals("Conrado")) {
			System.out.println("En la posicion: " + index + " se encuentra "   + perso.getNombre());
		}
		index ++; 
	}


	}

}
