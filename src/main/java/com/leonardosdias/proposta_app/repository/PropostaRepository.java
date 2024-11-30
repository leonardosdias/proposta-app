package com.leonardosdias.proposta_app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.leonardosdias.proposta_app.entity.Proposta;

@Repository
public interface PropostaRepository extends CrudRepository<Proposta, Long> {

}
