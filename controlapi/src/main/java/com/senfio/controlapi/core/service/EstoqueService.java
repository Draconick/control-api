package com.senfio.controlapi.core.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senfio.controlapi.core.controller.dto.EstoqueDTO;
import com.senfio.controlapi.core.model.Estoque;
import com.senfio.controlapi.core.repository.EstoqueRepository;

@Service
public class EstoqueService {

	
	@Autowired
	EstoqueRepository estoqueRepository;
	
	@Transactional
	public EstoqueDTO criar(final EstoqueDTO estoqueDTO) {
		
		
		Estoque estoque = new Estoque();
		estoque.setDescricao(estoqueDTO.getDescricao());
		
		estoqueRepository.save(estoque);
		
		return estoqueDTO;
	}
}
