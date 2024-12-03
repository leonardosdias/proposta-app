package com.leonardosdias.proposta_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.leonardosdias.proposta_app.dto.PropostaRequestDTO;
import com.leonardosdias.proposta_app.dto.PropostaResponseDTO;
import com.leonardosdias.proposta_app.entity.Proposta;
import com.leonardosdias.proposta_app.mapper.PropostaMapper;
import com.leonardosdias.proposta_app.repository.PropostaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PropostaService {
    private PropostaRepository propostaRepository;

    public PropostaResponseDTO criar(PropostaRequestDTO requestDTO) {
        Proposta proposta = PropostaMapper.INSTANCE.convertDtoProposta(requestDTO);
        propostaRepository.save(proposta);

        return PropostaMapper.INSTANCE.convertEntityToDto(proposta);
    }

    public List<PropostaResponseDTO> obterPropostas() {
        return PropostaMapper.INSTANCE.convertListEntityToListDto(propostaRepository.findAll());
    }

}
