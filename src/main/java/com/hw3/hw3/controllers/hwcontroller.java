package com.hw3.hw3.controllers;
import com.hw3.hw3.Models.InvtRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class hwcontroller {

    @Autowired
    InvtRepo inventRepo;
    @RequestMapping(value = "/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("productlist", inventRepo.findAll());
        return mv;
    }


}
