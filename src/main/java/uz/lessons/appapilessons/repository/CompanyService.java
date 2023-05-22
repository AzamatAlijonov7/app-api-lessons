package uz.lessons.appapilessons.repository;


import uz.lessons.appapilessons.entity.Address;
import uz.lessons.appapilessons.entity.Company;
import uz.lessons.appapilessons.entity.Department;

import java.util.List;

public interface CompanyService {
    List<Company> getAllCompanies();
    Company getCompanyById(Long id);
}
