package com.example.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.models.*;

/*Repository in https://github.com/sebariquelme/PersonaCRUD
 * 
 * This Class contains data for testing the API
 * 
 */

public class PersonaData {

	private static Map<Integer, Persona> listaDePersonas = new HashMap<Integer, Persona>();
	private static int idIndex = 4;

	static {
		Persona a = new Persona(1, "Sebastian", "Riquelme", "Tolhuaca 731", 95914062, "red");
		listaDePersonas.put(1, a);
		Persona b = new Persona(2, "Remigio", "Fernandez", "‎Shibuya 1", 98765432, "brown");
		listaDePersonas.put(2, b);
		Persona c = new Persona(3, "Camilo", "Salinas", "742 Evergreen Terrace", 92345678, "black");
		listaDePersonas.put(3, c);
		Persona d = new Persona(4, "Diego", "Palma", "Av. Argentina 554", 55569420, "black");
		listaDePersonas.put(4, d);

	}

	public static List<Persona> list() {
		return new ArrayList<Persona>(listaDePersonas.values());
	}

//Method to insert a object in the Map and save.
	public static Persona create(Persona persona) {
		idIndex += idIndex;
		persona.setId(idIndex);
		listaDePersonas.put(idIndex, persona);
		return persona;
	}

//Method to get a object in the Map and return the persona with the same ID.
	public static Persona get(Integer id) {
		return listaDePersonas.get(id);
	}
	
//Method to update a persona by id and the new persona object
	public static Persona update(Integer id, Persona persona) {
		listaDePersonas.put(id, persona);
		return persona;
	}
	
//Method to delete a persona by id
	public static Persona delete(Integer id) {
		return listaDePersonas.remove(id);
	}

}
