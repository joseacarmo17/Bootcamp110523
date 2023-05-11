package com.nttdata.taller6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.taller6.entities.Person;
import com.nttdata.taller6.service.PersonService;

import reactor.core.publisher.Flux;

@RestController
public class ListController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/Personas")
	public String personList(final Model model) {
			final Flux<Person> personList = personService.allPersons();
			model.addAttribute("personList", personList);
			return "personList";
			
		}
	
}
