package com.nttdata.webflux.models.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "mensajes")
@Getter
@Setter
@Builder
public class Mensaje {

	@Id
	private String id;
	private String texto;

	public Mensaje(String id, String texto) {
		super();
		this.id = id;
		this.texto = texto;
	}

}
