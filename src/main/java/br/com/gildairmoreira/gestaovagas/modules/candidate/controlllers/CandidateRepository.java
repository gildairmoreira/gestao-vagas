package br.com.gildairmoreira.gestaovagas.modules.candidate.controlllers;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gildairmoreira.gestaovagas.modules.candidate.CandidateEntity;

public interface CandidateRepository extends JpaRepository<CandidateEntity,UUID>{
    
}
