package com.Vaccination.Vaccination.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Vaccination.Vaccination.Model.User;
import com.Vaccination.Vaccination.Service.VaccineService;

@Controller
public class VaccinationController {
    @Autowired
    VaccineService ds;


    @GetMapping("/")
    public String home(){
        return "index";
    }

@PostMapping("/list")
   public String welString(@ModelAttribute User u,Model m){
     ds.add(u);
        m.addAttribute("data",ds.show());
     return "registerlist";
   }
}
