package com.leonardosdias.proposta_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardosdias.proposta_app.dto.PropostaRequestDTO;
import com.leonardosdias.proposta_app.dto.PropostaResponseDTO;
import com.leonardosdias.proposta_app.service.PropostaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/proposta")
public class PropostaController {

    @Autowired
    private PropostaService propostaService;

    @PostMapping
    public ResponseEntity<PropostaResponseDTO> criar(@RequestBody PropostaRequestDTO requestDTO) {

        PropostaResponseDTO response = propostaService.criar(requestDTO);
        return ResponseEntity.ok(response);
    }

}