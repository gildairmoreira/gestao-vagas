package br.com.gildairmoreira.gestaovagas.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gildairmoreira.gestaovagas.exceptions.CompanyNotFoundException;
import br.com.gildairmoreira.gestaovagas.modules.company.entities.JobEntity;
import br.com.gildairmoreira.gestaovagas.modules.company.repositories.CompanyRepository;
import br.com.gildairmoreira.gestaovagas.modules.company.repositories.JobRepository;

@Service
public class CreateJobUseCase {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private CompanyRepository companyRepository;

    public JobEntity execute(JobEntity jobEntity) {
        companyRepository.findById(jobEntity.getCompanyId()).orElseThrow(() -> {
            throw new CompanyNotFoundException();
        });
        return this.jobRepository.save(jobEntity);
    }
}
