package com.nttdata.webflux.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.webflux.models.documents.Mensaje;

public interface IMensajeDao extends ReactiveMongoRepository<Mensaje, Long>{

}
