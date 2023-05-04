package com.asifekbal.management.Controller;

import com.asifekbal.management.Service.ManagerServiceImplement;
import com.asifekbal.management.Shema.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ManagerController {
    @Autowired
    private ManagerServiceImplement managerServiceImplement;

    @GetMapping("/getManager")
    public String viewAllDev(Model model) {

        model.addAttribute("allemplist", managerServiceImplement.getManager());

        return "managerTable";
    }

    @GetMapping("/addNewManager")
    public String addNewManager(Model model) {
        Manager manager = new Manager();
        model.addAttribute("manager", manager);
        return "newManager";
    }

    @PostMapping("/saveManager")
    public String saveManager(Manager manager) {

        managerServiceImplement.addManager(manager);
        return "redirect:/";
    }

    @GetMapping("/updateManager/{Id}")
    public String updateDevById(@PathVariable(value = "Id")long Id, Model model) {
        Manager manager = managerServiceImplement.updateManagerById(Id);
        model.addAttribute("employee", manager);
        return "updateManager";
    }

    @GetMapping("/deleteManager/{Id}")
    public String deleteDevById(@PathVariable(value = "Id")long Id) {
        this.managerServiceImplement.deleteManagerById(Id);
        return "redirect:/";
    }

}
