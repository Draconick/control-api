package com.senfio.controlapi.core.controller.dto;

import org.springframework.hateoas.ResourceSupport;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstoqueDTO extends ResourceSupport {

	
	private Long codigo;
	private String descricao;
	
}
