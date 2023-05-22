package uz.lessons.appapilessons.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.lessons.appapilessons.entity.Address;
import uz.lessons.appapilessons.entity.Worker;

import java.util.List;

public interface WorkerService {
    List<Worker> getAllWorkers();

    Worker getWorkerById(Long id);
}
