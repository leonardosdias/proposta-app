package com.leonardosdias.proposta_app.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PropostaResponseDTO {

    private Long id;

    private String nome;

    private String sobreNome;

    private String telefone;

    private String cpf;

    private Double renda;

    private Double valorSolicitado;

    private int prazoPagamento;

    private Boolean aprovado;

    private String observacao;

}
