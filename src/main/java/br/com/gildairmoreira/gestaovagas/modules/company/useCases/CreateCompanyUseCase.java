package br.com.gildairmoreira.gestaovagas.modules.company.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.gildairmoreira.gestaovagas.exceptions.UserFoundExeption;
import br.com.gildairmoreira.gestaovagas.modules.company.entities.CompanyEntity;
import br.com.gildairmoreira.gestaovagas.modules.company.repositories.CompanyRepository;

@Service
public class CreateCompanyUseCase {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity execute(CompanyEntity companyEntity) {
        this.companyRepository
                .findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
                .ifPresent((user) -> {
                    throw new UserFoundExeption();
                });

                var password = passwordEncoder.encode(companyEntity.getPassword());
                companyEntity.setPassword(password);
        ;
        return this.companyRepository.save(companyEntity);
    }
}
