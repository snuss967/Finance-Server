package java.me.snuss.website.repositories;

import org.springframework.data.repository.CrudRepository;

import java.me.snuss.website.domain.Company;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}
