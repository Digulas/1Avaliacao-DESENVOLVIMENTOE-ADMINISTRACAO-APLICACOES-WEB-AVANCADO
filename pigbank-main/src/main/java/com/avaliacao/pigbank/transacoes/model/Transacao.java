package com.avaliacao.pigbank.transacoes.model;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.avaliacao.pigbank.conta.model.Conta;

import lombok.Data;

@Data
@Entity
@Table(name = "TRANSACOES")
public class Transacao implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TRANSACOES")
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name="TIPO_TRANASCAO")
    private TipoTransacao tipoTransacao;

    @Column
    private Double valor;

    @Column
    private LocalDateTime dateTime = LocalDateTime.now();


    @ManyToOne
    @JoinColumn(name = "CONTA_ID")
    private Conta conta;



}
