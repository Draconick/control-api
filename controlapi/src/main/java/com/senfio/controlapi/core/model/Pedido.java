package com.senfio.controlapi.core.model;

import java.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="PEDIDO")
public class Pedido {

	
	@Id
	@SequenceGenerator(name="PEDIDO_SEQUENCE", sequenceName="seq_pedido", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PEDIDO_SEQUENCE")
	@Column(name="CD_PEDIDO")
	private Long codigo;
	
	@NotNull
	@Column(name="TS_PEDIDO")
	private LocalDateTime dataPedido;
	
	@NotNull
	@Column(name="NR_VALOR_TOTAL")
	private Double valorTotal;
	
	@ManyToOne
	@JoinColumn(name="CD_CLIENTE")
	private Cliente cliente;
	
	
}
