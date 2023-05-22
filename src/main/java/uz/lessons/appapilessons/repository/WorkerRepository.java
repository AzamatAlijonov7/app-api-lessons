package uz.lessons.appapilessons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.lessons.appapilessons.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
