package com.nttdata.webflux.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.webflux.models.dao.IMensajeDao;
import com.nttdata.webflux.models.documents.Mensaje;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MensajeServiceImpl implements IMensajeService{
	
	@Autowired
	private IMensajeDao mensajeDao;

	@Override
	public Flux<Mensaje> findAll() {
		// TODO Auto-generated method stub
		return mensajeDao.findAll();
	}

	@Override
	public Mono<Mensaje> save(Mensaje mensaje) {
		// TODO Auto-generated method stub
		return mensajeDao.save(mensaje);
	}

}
