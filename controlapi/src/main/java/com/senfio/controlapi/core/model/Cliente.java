package com.senfio.controlapi.core.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="CLIENTE")
public class Cliente {
	
	
	@Id
	@SequenceGenerator(name="CLIENTE_SEQUENCE", sequenceName="SEQ_CLIENTE", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_CLIENTE")
	@Column(name="CD_CLIENTE")
	private Long codigo;
	
	@NotNull
	@Column(name="NM_CLIENTE")
	private String nome;
	
	@Column(name="TS_NASCIMENTO")
	private LocalDateTime dataNascimento;
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
//	private List<Endereco> enderecos;

}
