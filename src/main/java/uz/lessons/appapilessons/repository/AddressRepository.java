package uz.lessons.appapilessons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.lessons.appapilessons.entity.Address;
import uz.lessons.appapilessons.entity.Department;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
