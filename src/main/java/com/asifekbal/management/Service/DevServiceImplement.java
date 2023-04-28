package com.asifekbal.management.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asifekbal.management.Repo.DevRepository;
import com.asifekbal.management.Shema.Dev;

@Service
public class DevServiceImplement implements DevServices{
    @Autowired private DevRepository devRepo;


    @Override
    public List<Dev> getDev()
    {
        return devRepo.findAll();
    }

    @Override
    public void addDev(Dev dev)
    {
        devRepo.save(dev);
    }


    @Override
    public Dev updateDevById(long Id) {
        Optional<Dev> optional = devRepo.findById(Id);
        Dev dev = null;
        if (optional.isPresent())
            dev = optional.get();
        else
            throw new RuntimeException(
                    "Dev not found for id : " + Id);
        return dev;
    }

    @Override
    public void deleteDevById(long Id) {
        this.devRepo.deleteById(Id);
    }

}
