package com.nttdata.taller4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class Taller4Application {

	public static void main(String[] args) {
		SpringApplication.run(Taller4Application.class, args);
		
        Flux<String> publisher = Flux.just("Mensaje 1", "Mensaje 2", "Mensaje 3");

        Consumer consumer1 = new Consumer("Consumer 1");
        Consumer consumer2 = new Consumer("Consumer 2");

        publisher.subscribe(consumer1::consume, consumer1::handleError, consumer1::handleComplete);
        publisher.subscribe(consumer2::consume, consumer2::handleError, consumer2::handleComplete);
	}

}

//Clase Consumer personalizada
class Consumer {
 private String name;

 public Consumer(String name) {
     this.name = name;
 }

 public void consume(String message) {
     System.out.println(name + ": " + message);
 }

 public void handleError(Throwable throwable) {
     System.err.println(name + " Error: " + throwable.getMessage());
 }

 public void handleComplete() {
     System.out.println(name + ": Completado");
 }
}
