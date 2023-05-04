package com.asifekbal.management.Service;

import com.asifekbal.management.Shema.Manager;

import java.util.List;

public interface ManagerServices {
    public List<Manager> getManager();
    void addManager(Manager manager);
    Manager updateManagerById(long Id);
    void deleteManagerById(long Id);


}
