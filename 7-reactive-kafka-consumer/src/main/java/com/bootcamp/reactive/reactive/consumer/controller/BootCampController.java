package com.bootcamp.reactive.reactive.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.kafka.receiver.KafkaReceiver;
import reactor.kafka.receiver.ReceiverRecord;

@RestController
public class BootCampController {

    @Autowired
	KafkaReceiver<String, String> kafkaReceiver;

    @GetMapping(value = "/receive", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> getEventsFlux(){
        return kafkaReceiver.receive().map(consumer -> consumer.value());
    }
}
