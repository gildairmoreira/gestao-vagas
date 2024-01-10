package br.com.gildairmoreira.gestaovagas.modules.candidate.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gildairmoreira.gestaovagas.exceptions.UserFoundExeption;
import br.com.gildairmoreira.gestaovagas.modules.candidate.CandidateEntity;
import br.com.gildairmoreira.gestaovagas.modules.candidate.controlllers.CandidateRepository;

@Service
public class CreateCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    public CandidateEntity execute(CandidateEntity candidateEntity) {
        this.candidateRepository
                .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundExeption();
                });

        return this.candidateRepository.save(candidateEntity);
    }
}
