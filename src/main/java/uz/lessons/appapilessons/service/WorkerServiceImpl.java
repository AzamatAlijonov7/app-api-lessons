package uz.lessons.appapilessons.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.lessons.appapilessons.entity.Worker;
import uz.lessons.appapilessons.repository.WorkerRepository;
import uz.lessons.appapilessons.repository.WorkerService;

import java.util.List;

@Service
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    private WorkerRepository workerRepository;

    @Override
    public List<Worker> getAllWorkers() {
        return workerRepository.findAll();
    }

    @Override
    public Worker getWorkerById(Long id) {
        return workerRepository.findById(id).orElseThrow();
    }
}
