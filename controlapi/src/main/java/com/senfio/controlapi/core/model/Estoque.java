package com.senfio.controlapi.core.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ESTOQUE")
public class Estoque {

	
	@Id
	@SequenceGenerator(name="SEQUENCE_ESTOQUE", sequenceName="SEQ_ESTOQUE", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE_ESTOQUE")
	@Column(name="CD_ESTOQUE")
	private Long codigo;
	
	@NotNull
	@Column(name="DS_ESTOQUE")
	private String descricao;
}
