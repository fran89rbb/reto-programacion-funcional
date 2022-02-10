package com.nttdata.webflux;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.webflux.models.dao.IMensajeDao;
import com.nttdata.webflux.models.documents.Mensaje;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class WebfluxApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(WebfluxApplication.class);

	@Autowired
	private IMensajeDao mensajeDao;

	public static void main(String[] args) {
		SpringApplication.run(WebfluxApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Flux.just(new Mensaje("1", "Mensaje de texto1"))
		.flatMap(mensaje -> {
			return mensajeDao.save(mensaje);
		}).subscribe(mensaje -> log.info("Insert: " + mensaje.getId() + " " + mensaje.getTexto()));
		
	}

}
