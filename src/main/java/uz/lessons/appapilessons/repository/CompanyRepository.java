package uz.lessons.appapilessons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.lessons.appapilessons.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}


