package com.senfio.controlapi.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senfio.controlapi.core.model.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

}
