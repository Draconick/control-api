package com.senfio.controlapi.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senfio.controlapi.core.controller.dto.EstoqueDTO;
import com.senfio.controlapi.core.service.EstoqueService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "estoques", description="Serviço para operações do recurso de Estoque")
@RestController
@RequestMapping(value="api/estoques", produces = MediaType.APPLICATION_JSON_VALUE)
public class EstoqueController {
	
	@Autowired
	EstoqueService estoqueService;

	@ApiOperation(value= "Cria um estoque", notes = "", response = Void.class)
	@PostMapping
	public ResponseEntity<EstoqueDTO> criar(@RequestBody final EstoqueDTO estoqueDTO){
		final EstoqueDTO estoqueSalvo = estoqueService.criar(estoqueDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(estoqueSalvo);
	}
	
	@ApiOperation(value= "Cria um estoque", notes = "", response = Void.class)
	@GetMapping
	public ResponseEntity<EstoqueDTO> listar(@RequestBody final EstoqueDTO estoqueDTO){
		return new ResponseEntity<>(estoqueDTO,HttpStatus.OK);
	}
}
