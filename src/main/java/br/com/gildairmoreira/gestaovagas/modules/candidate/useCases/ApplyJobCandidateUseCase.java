package br.com.gildairmoreira.gestaovagas.modules.candidate.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gildairmoreira.gestaovagas.exceptions.JobNotFoundException;
import br.com.gildairmoreira.gestaovagas.exceptions.UserNotFoundException;
import br.com.gildairmoreira.gestaovagas.modules.candidate.CandidateRepository;
import br.com.gildairmoreira.gestaovagas.modules.candidate.entity.ApplyJobEntity;
import br.com.gildairmoreira.gestaovagas.modules.candidate.repository.ApplyJobRepository;
import br.com.gildairmoreira.gestaovagas.modules.company.repositories.JobRepository;

@Service
public class ApplyJobCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ApplyJobRepository applyJobRepository;

    // ID do Candidato
    // ID da Vaga
    public ApplyJobEntity execute(UUID idCandidate, UUID idJob) {
        // Validar se Candidato Existe
        this.candidateRepository.findById(idCandidate)
                .orElseThrow(() -> {
                    throw new UserNotFoundException();
                });

        // Validar se a Vaga Existe
        this.jobRepository.findById(idJob)
                .orElseThrow(() -> {
                    throw new JobNotFoundException();
                });
        // Candidato se Inscrever na Vaga
        var applyJob = ApplyJobEntity.builder()
                .candidateId(idCandidate)
                .jobId(idJob).build();

        applyJob = applyJobRepository.save(applyJob);
        return applyJob;
    }
}
