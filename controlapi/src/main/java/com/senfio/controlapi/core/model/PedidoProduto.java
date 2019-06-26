package com.senfio.controlapi.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="PEDIDO_PRODUTO", uniqueConstraints= {@UniqueConstraint(columnNames= {"CD_PEDIDO", "CD_PRODUTO"})})
public class PedidoProduto {
	
	@Id
	@SequenceGenerator(name="SEQUENCE_PEDIDO_PRODUTO", sequenceName="SEQ_PEDIDO_PRODUTO", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQUENCE_PEDIDO_PRODUTO")
	@Column(name="CD_PEDIDO_PRODUTO")
	private Long codigo;
	
	@ManyToOne
	@JoinColumn(name="CD_PEDIDO")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name="CD_PRODUTO")
	private Produto produto;
	
	@Column(name="QT_PRODUTO")
	private Long quantidadeProduto;
	
}
