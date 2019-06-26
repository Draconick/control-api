package com.senfio.controlapi.core.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="ESTOQUE_PRODUTO", uniqueConstraints= {@UniqueConstraint(columnNames= {"CD_PRODUTO", "CD_ESTOQUE"})})
public class EstoqueProduto {
	
	
	@Id
	@SequenceGenerator(name="SEQUENCE_ESTOQUE_PRODUTO", sequenceName="SEQ_ESTOQUE_PRODUTO", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE_ESTOQUE_PRODUTO")
	@Column(name="CD_ESTOQUE_PRODUTO")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name="CD_PRODUTO")
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name="CD_ESTOQUE")
	private Estoque estoque;
	
	@NotNull
	@Column(name="QT_ESTOQUE")
	private Long quantidadeEstoque;
}
