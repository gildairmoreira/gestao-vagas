package br.com.gildairmoreira.gestaovagas.modules.company.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gildairmoreira.gestaovagas.modules.company.entities.JobEntity;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {

    // "contains - LIKE "

    // Select * from job where descriptions like %filter%

    List<JobEntity> findByDescriptionContainingIgnoreCase(String filter);
}
