package com.senfio.controlapi.core.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="PRODUTO")
public class Produto {

	
	@Id
	@SequenceGenerator(name="SEQUENCE_PRODUTO", sequenceName="SEQ_PRODUTO", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE_PRODUTO")
	@Column(name="CD_PRODUTO")
	private long codigo;
	
	@NotNull
	@Column(name="DS_PRODUTO")
	private String descricao;
	
}
