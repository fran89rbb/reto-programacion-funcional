package com.nttdata.webflux.models.service;

import com.nttdata.webflux.models.documents.Mensaje;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IMensajeService {
	
	public Flux<Mensaje> findAll();
	
	public Mono<Mensaje> save(Mensaje mensaje);

}
