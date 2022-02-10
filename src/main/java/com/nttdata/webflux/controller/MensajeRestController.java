package com.nttdata.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.webflux.models.documents.Mensaje;
import com.nttdata.webflux.models.service.IMensajeService;

import reactor.core.publisher.Flux;

@RestController
public class MensajeRestController {
	
	@Autowired
	private IMensajeService mensajeService;
	
	@GetMapping("/listar")
	public Flux<Mensaje> listar(){
		Flux<Mensaje> mensaje = mensajeService.findAll();
		return mensaje;
	}
	
	@PostMapping("/mensaje")
	@ResponseStatus(HttpStatus.CREATED)
	public void save(){
		mensajeService.save(Mensaje.builder().texto("Mensaje de prueba").build());
	}

}
