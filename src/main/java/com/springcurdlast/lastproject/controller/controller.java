package com.springcurdlast.lastproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springcurdlast.lastproject.model.details;
import com.springcurdlast.lastproject.service.service;

@RestController
public class controller {

   @Autowired
   service s;

    @GetMapping("students")
    public List<details> f()
    {
        return s.showdetails();
    }
    @PostMapping("students")
    public String str(@RequestBody details d)
    {
        s.addstudents(d);
        return "sucess";
    }
    @PutMapping("students")
    public String str1(@RequestBody details d)
    {
        s.updatedetails(d);
        return "updated";
    }
    @GetMapping("students/{rno}")
    public details d(@PathVariable("rno")int r)
    {
        return s.finddetials(r);
    }
    @DeleteMapping("students/{rno}")
    public String str(@PathVariable("rno")int r)
    {
        s.deletedetails(r);
        return "deleted";
    }
}
