package com.nttdata.taller6.entities.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.taller6.entities.Person;

import reactor.core.publisher.Flux;

@RestController
public class PersonController {
	
	 private List<Person> personList1 = Arrays.asList(
	            new Person("Jose Antonio", "Carmona de la Fuente", "23")
	    );

	    private List<Person> personList2 = Arrays.asList(
	    		new Person("Paco", "Pepe", "2")
	    );

	    private List<Person> personList3 = Arrays.asList(
	    		new Person("Aaaaaa", "Bbbbbb", "99")
	    );
	    
	    private List<Person> personList4 = Arrays.asList(
	    		new Person("123123", "123123", "1")
	    );
	    
	    @GetMapping("/person1")
	    public Flux<Person> getPerson1() {
	        return Flux.fromIterable(personList1);
	    }

	    @GetMapping("/person2")
	    public Flux<Person> getPerson2() {
	        return Flux.fromIterable(personList2);
	    }

	    @GetMapping("/person3")
	    public Flux<Person> getPerson3() {
	        return Flux.fromIterable(personList3);
	    }

	    @GetMapping("/person4")
	    public Flux<Person> getPerson4() {
	        return Flux.fromIterable(personList4);
	    }
	
}
