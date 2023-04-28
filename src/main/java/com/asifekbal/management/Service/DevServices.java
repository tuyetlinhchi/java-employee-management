package com.asifekbal.management.Service;
import com.asifekbal.management.Shema.Employee;

import java.util.List;
import com.asifekbal.management.Shema.Dev;
public interface DevServices {
    public List<Dev> getDev();
    Dev updateDevById(long Id);
    void addDev(Dev dev);
    void deleteDevById(long Id);


}
