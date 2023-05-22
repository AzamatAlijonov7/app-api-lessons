package uz.lessons.appapilessons.repository;

import uz.lessons.appapilessons.entity.Department;
import uz.lessons.appapilessons.entity.Worker;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();

    Department getDepartmentById(Long id);
}
