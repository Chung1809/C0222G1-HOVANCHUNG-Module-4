package codegym.controller;

import codegym.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @GetMapping("/create")
    public String employee(Model model) {
              model.addAttribute("employee",new Employee());
              return "create";
        }
     @PostMapping("/home")
    public String employeeList(Model model ,@ModelAttribute Employee employee){
          model.addAttribute("id",employee.getId());
          model.addAttribute("name",employee.getName());
          model.addAttribute("contactNumber",employee.getContactNumber());
          return "home";
     }

    }
