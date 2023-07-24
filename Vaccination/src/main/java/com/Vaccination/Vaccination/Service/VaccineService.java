package com.Vaccination.Vaccination.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vaccination.Vaccination.Model.User;
import com.Vaccination.Vaccination.Repositary.VaccineRepositary;

@Service
public class VaccineService {
    @Autowired
    VaccineRepositary repositary;
    public Object add;

    public void add(User u) {
        repositary.save(u);
    }

    public List<User> show() {
        return repositary.findAll();
    }

}
