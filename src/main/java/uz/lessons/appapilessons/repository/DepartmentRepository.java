package uz.lessons.appapilessons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.lessons.appapilessons.entity.Department;
import uz.lessons.appapilessons.entity.Worker;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
