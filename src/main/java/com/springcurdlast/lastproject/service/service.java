package com.springcurdlast.lastproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcurdlast.lastproject.model.details;
import com.springcurdlast.lastproject.repository.repo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Service
public class service {

    @Autowired
    repo r;
    
    public List<details> showdetails() {
        return r.findAll();
       
    }

    public void addstudents(details d) {
        r.save(d);
        
    }

    public void updatedetails(details d) {
       r.save(d);
    }

    public details finddetials(int r2) {
        return r.findById(r2).orElse(null);


       }

    

    public void deletedetails(int r2) {
       r.deleteById(r2);
    }
    
}
