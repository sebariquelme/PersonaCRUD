package com.example.controller;

import com.example.data.PersonaData;
import com.example.models.*;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Repository in https://github.com/sebariquelme/PersonaCRUD

@RestController
@RequestMapping("/")
public class PersonaController {
	// object to return in errors
	private Persona personaNoAvailable = new Persona(0, "data error", "data error", "data error", 0, "data error");

	@RequestMapping(value = "persona", method = RequestMethod.GET)
	public List<Persona> list() {
		return PersonaData.list();
	}

	@RequestMapping(value = "persona/create", method = RequestMethod.POST)
	public Persona create(@RequestBody Persona persona) {
		// Simple validation to name empty
		if (persona.getName().isEmpty() || persona.getName().equals(null)) {
			return personaNoAvailable;
		} else {
			return PersonaData.create(persona);
		}
	}

	@RequestMapping(value = "persona/get/{id}", method = RequestMethod.GET)
	public Persona get(@PathVariable Integer id) {
		return PersonaData.get(id);
	}

	@RequestMapping(value = "persona/update/{id}", method = RequestMethod.PUT)
	public Persona update(@PathVariable Integer id, @RequestBody Persona persona) {
		// Simple validation to name empty
		if (persona.getName().isEmpty() || persona.getName().equals(null)) {
			return personaNoAvailable;
		} else {
			return PersonaData.update(id, persona);
		}
	}

	@RequestMapping(value = "persona/delete/{id}", method = RequestMethod.DELETE)
	public Persona delete(@PathVariable Integer id) {
		return PersonaData.delete(id);
	}

}
