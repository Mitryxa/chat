package com.mitrofanov.controller;

import forms.Form;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import services.Service;

@Controller
public class BaseController{
    @RequestMapping(value="/")
    public String velcome(Model model){
        return "index";
    }
    @RequestMapping(value="test")
    public String goToTest(Model model){

        return "test";
    }
    @RequestMapping(value="/",method= RequestMethod.POST)
    public String saveForm( Form form, Model model){

        Service.saveName(form.getFirstName());
        return "test";
    }

}