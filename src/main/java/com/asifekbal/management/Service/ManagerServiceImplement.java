package com.asifekbal.management.Service;

import com.asifekbal.management.Repo.ManagerRepository;
import com.asifekbal.management.Shema.Dev;
import com.asifekbal.management.Shema.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class ManagerServiceImplement implements ManagerServices{

    @Autowired
    private ManagerRepository managerRepo;
    @Override
    public List<Manager> getManager() {
        return managerRepo.findAll();
    }

    @Override
    public void addManager(Manager manager) {
        managerRepo.save(manager);
    }
    @Override
    public Manager updateManagerById(long Id) {
        Optional<Manager> optional = managerRepo.findById(Id);
        Manager manager = null;
        if (optional.isPresent())
            manager = optional.get();
        else
            throw new RuntimeException(
                    "manager not found for id : " + Id);
        return manager;
    }


    @Override
    public void deleteManagerById(long Id) {
        this.managerRepo.deleteById(Id);
    }
}
