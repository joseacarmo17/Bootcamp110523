package com.nttdata.taller6.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.nttdata.taller6.entities.Person;

import reactor.core.publisher.Flux;

@Service
public class PersonService {

    private WebClient webClient;

    public PersonService() {
        this.webClient = WebClient.create(); // Crea una instancia de WebClient
    }

    public Flux<Person> allPersons() {
        Flux<Person> flux1 = webClient.get()
                .uri("http://localhost:8080/persons/person1") // Endpoint 1
                .retrieve()
                .bodyToFlux(Person.class);

        Flux<Person> flux2 = webClient.get()
                .uri("http://localhost:8080/persons/person2") // Endpoint 2
                .retrieve()
                .bodyToFlux(Person.class);

        Flux<Person> flux3 = webClient.get()
                .uri("http://localhost:8080/persons/person3") // Endpoint 3
                .retrieve()
                .bodyToFlux(Person.class);

        Flux<Person> flux4 = webClient.get()
                .uri("http://localhost:8080/persons/person4") // Endpoint 4
                .retrieve()
                .bodyToFlux(Person.class);

        return Flux.concat(flux1, flux2, flux3, flux4);
    }
}
